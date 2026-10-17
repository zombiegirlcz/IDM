package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class ProfileVerifier {
    private static final ResolvableFuture<CompilationStatus> sFuture = ResolvableFuture.create();
    private static final Object SYNC_OBJ = new Object();
    private static CompilationStatus sCompilationStatus = null;

    public static class Api33Impl {
        public static PackageInfo getPackageInfo(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class Cache {
        final long mInstalledCurrentProfileSize;
        final long mPackageLastUpdateTime;
        final int mResultCode;
        final int mSchema;

        public Cache(int i, int i2, long j2, long j3) {
            this.mSchema = i;
            this.mResultCode = i2;
            this.mPackageLastUpdateTime = j2;
            this.mInstalledCurrentProfileSize = j3;
        }

        public static Cache readFromFile(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                Cache cache = new Cache(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return cache;
            } finally {
            }
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 != null && (obj2 instanceof Cache)) {
                Cache cache = (Cache) obj2;
                if (this.mResultCode == cache.mResultCode && this.mPackageLastUpdateTime == cache.mPackageLastUpdateTime && this.mSchema == cache.mSchema && this.mInstalledCurrentProfileSize == cache.mInstalledCurrentProfileSize) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.mResultCode), Long.valueOf(this.mPackageLastUpdateTime), Integer.valueOf(this.mSchema), Long.valueOf(this.mInstalledCurrentProfileSize));
        }

        public void writeOnFile(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.mSchema);
                dataOutputStream.writeInt(this.mResultCode);
                dataOutputStream.writeLong(this.mPackageLastUpdateTime);
                dataOutputStream.writeLong(this.mInstalledCurrentProfileSize);
                dataOutputStream.close();
            } catch (Throwable th10) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th11) {
                    th10.addSuppressed(th11);
                }
                throw th10;
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class CompilationStatus {
        private final boolean mHasCurrentProfile;
        private final boolean mHasEmbeddedProfile;
        private final boolean mHasReferenceProfile;
        final int mResultCode;

        public CompilationStatus(int i, boolean z, boolean z3, boolean z4) {
            this.mResultCode = i;
            this.mHasCurrentProfile = z3;
            this.mHasReferenceProfile = z;
            this.mHasEmbeddedProfile = z4;
        }
    }

    private static long getPackageLastUpdateTime(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.getPackageInfo(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static CompilationStatus setCompilationStatus(int i, boolean z, boolean z3, boolean z4) {
        CompilationStatus compilationStatus = new CompilationStatus(i, z, z3, z4);
        sCompilationStatus = compilationStatus;
        sFuture.set(compilationStatus);
        return sCompilationStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0072, B:50:0x0096, B:51:0x009a, B:53:0x00ac, B:62:0x00bd, B:64:0x00c3, B:79:0x00df, B:82:0x00e5, B:85:0x00ec, B:87:0x00f5, B:92:0x0101, B:93:0x0105, B:89:0x00fb, B:56:0x00b3, B:57:0x00b7, B:95:0x0107, B:96:0x010d, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:11:0x0010, B:16:0x0019, B:22:0x002e, B:33:0x0040, B:35:0x0046, B:36:0x004c, B:38:0x004e, B:44:0x0072, B:50:0x0096, B:51:0x009a, B:53:0x00ac, B:62:0x00bd, B:64:0x00c3, B:79:0x00df, B:82:0x00e5, B:85:0x00ec, B:87:0x00f5, B:92:0x0101, B:93:0x0105, B:89:0x00fb, B:56:0x00b3, B:57:0x00b7, B:95:0x0107, B:96:0x010d, B:31:0x003e, B:30:0x003b), top: B:102:0x000c, inners: #2, #3 }] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.profileinstaller.ProfileVerifier.CompilationStatus writeProfileVerification(@androidx.annotation.NonNull android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileVerifier.writeProfileVerification(android.content.Context, boolean):androidx.profileinstaller.ProfileVerifier$CompilationStatus");
    }
}
