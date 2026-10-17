package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private static Boolean f38416zzc = null;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static String f38417zzd = null;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static boolean f38418zze = false;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static int f38419zzf = -1;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static Boolean f38420zzg;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private static zzp f38424zzl;
    private static zzq zzm;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final Context f38425zzk;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final ThreadLocal f38421zzh = new ThreadLocal();

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final ThreadLocal f38422zzi = new zze();

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static final VersionPolicy.IVersions f38423zzj = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzk();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    public static final VersionPolicy f38414zza = new zzm();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    public static final VersionPolicy f38415zzb = new zzc();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @NonNull
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, Throwable th10, byte[] bArr) {
            super(str, th10);
        }

        public /* synthetic */ LoadingException(String str, byte[] bArr) {
            super(str);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;

            int zzb(@NonNull Context context, @NonNull String str);
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.f38425zzk = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 61);
            sb6.append("com.google.android.gms.dynamite.descriptors.");
            sb6.append(str);
            sb6.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb6.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb9 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb9.append("Module descriptor id '");
            sb9.append(strValueOf);
            sb9.append("' didn't match expected id '");
            sb9.append(str);
            sb9.append("'");
            sb9.toString();
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb10 = new StringBuilder(String.valueOf(str).length() + 45);
            sb10.append("Local module descriptor class for ");
            sb10.append(str);
            sb10.append(" not found.");
            sb10.toString();
            return 0;
        } catch (Exception e) {
            "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage()));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d6 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:5:0x0045, B:9:0x00ba, B:16:0x00c6, B:19:0x00cc, B:32:0x00ea, B:109:0x026f, B:110:0x027a, B:118:0x028a, B:120:0x02b0, B:122:0x02bf, B:132:0x02df, B:133:0x02e7, B:113:0x027d, B:114:0x027e, B:115:0x0286, B:134:0x02e8, B:135:0x0309, B:136:0x030a, B:137:0x035c), top: B:149:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.google.android.gms.dynamite.DynamiteModule$VersionPolicy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule load(@androidx.annotation.NonNull android.content.Context r30, @androidx.annotation.NonNull com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r31, @androidx.annotation.NonNull java.lang.String r32) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188 A[Catch: all -> 0x00f1, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00f1, blocks: (B:4:0x0006, B:65:0x00e6, B:67:0x00ec, B:75:0x0118, B:103:0x017c, B:107:0x0188, B:125:0x01df, B:126:0x01e2, B:120:0x01d6, B:73:0x00f7, B:128:0x01e4, B:5:0x0007, B:8:0x000d, B:9:0x002a, B:63:0x00e3, B:22:0x004e, B:46:0x00a4, B:49:0x00a7, B:56:0x00bf, B:64:0x00e5, B:62:0x00c5), top: B:138:0x0006, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: all -> 0x003b, TryCatch #10 {, blocks: (B:10:0x002b, B:12:0x0037, B:53:0x00bc, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:32:0x0062, B:34:0x006a, B:37:0x0071, B:44:0x009b, B:45:0x00a3, B:40:0x0078, B:42:0x007e, B:43:0x008d, B:48:0x00a6, B:51:0x00a9, B:52:0x00b3, B:18:0x0043), top: B:142:0x002b, inners: #11 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.NonNull java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    private static boolean zzb(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f38420zzg)) {
            return true;
        }
        boolean z = false;
        if (f38420zzg == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != PlatformVersion.isAtLeastQ() ? 0 : 268435456);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            f38420zzg = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                f38418zze = true;
            }
        }
        if (!z) {
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0148: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:92:0x0148 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int zzc(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static boolean zzd(Cursor cursor) {
        zzn zznVar = (zzn) f38421zzh.get();
        if (zznVar == null || zznVar.f38428zza != null) {
            return false;
        }
        zznVar.f38428zza = cursor;
        return true;
    }

    private static DynamiteModule zze(Context context, String str) {
        "Selected local version of ".concat(String.valueOf(str));
        return new DynamiteModule(context);
    }

    private static void zzf(ClassLoader classLoader) throws LoadingException {
        zzq zzqVar;
        byte[] bArr = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzqVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
            }
            zzm = zzqVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InstantiationException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (NoSuchMethodException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        } catch (InvocationTargetException e6) {
            e = e6;
            throw new LoadingException("Failed to instantiate dynamite loader", e, bArr);
        }
    }

    private static zzp zzg(Context context) {
        zzp zzpVar;
        synchronized (DynamiteModule.class) {
            zzp zzpVar2 = f38424zzl;
            if (zzpVar2 != null) {
                return zzpVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzpVar = iInterfaceQueryLocalInterface instanceof zzp ? (zzp) iInterfaceQueryLocalInterface : new zzp(iBinder);
                }
                if (zzpVar != null) {
                    f38424zzl = zzpVar;
                    return zzpVar;
                }
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 45);
                sb6.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb6.append(message);
                sb6.toString();
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.f38425zzk;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.f38425zzk.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
