package androidx.camera.video.internal.utils;

import android.os.StatFs;
import java.io.File;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/camera/video/internal/utils/StorageUtil;", "", "<init>", "()V", "Ljava/io/File;", "file", "", "getAvailableBytes", "(Ljava/io/File;)J", "", "path", "(Ljava/lang/String;)J", "bytes", "formatSize", "(J)Ljava/lang/String;", "", "throwable", "", "isStorageFullException", "(Ljava/lang/Throwable;)Z", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StorageUtil {

    @NotNull
    public static final StorageUtil INSTANCE = new StorageUtil();

    private StorageUtil() {
    }

    @NotNull
    public static final String formatSize(long bytes) {
        if (bytes < 0) {
            throw new IllegalArgumentException("Bytes cannot be negative");
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = bytes;
        int i = 0;
        double d5 = d;
        while (d5 >= 1024.0d && i < 4) {
            d5 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            return decimalFormat.format(d5) + p.SPACE_CHAR + strArr[i];
        }
        StringBuilder sb6 = new StringBuilder();
        while (-1 < i) {
            double dPow = Math.pow(1024.0d, i);
            double dFloor = Math.floor(d / dPow);
            if (dFloor > 0.0d) {
                sb6.append(decimalFormat.format(dFloor));
                sb6.append(" ");
                sb6.append(strArr[i]);
                sb6.append(" ");
                d -= dFloor * dPow;
            }
            i--;
        }
        return d0.F0(sb6).toString();
    }

    public static final long getAvailableBytes(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return getAvailableBytes(path);
    }

    public static final boolean isStorageFullException(Throwable throwable) {
        if (throwable == null) {
            return false;
        }
        String message = throwable.getMessage();
        if (message == null || !d0.J(message, "No space left on device", false)) {
            return isStorageFullException(throwable.getCause());
        }
        return true;
    }

    public static final long getAvailableBytes(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new StatFs(path).getAvailableBytes();
    }
}
