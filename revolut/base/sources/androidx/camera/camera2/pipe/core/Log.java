package androidx.camera.camera2.pipe.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/core/Log;", "", "<init>", "()V", "", "DEBUG_LOGGABLE", "Z", "getDEBUG_LOGGABLE", "()Z", "INFO_LOGGABLE", "getINFO_LOGGABLE", "WARN_LOGGABLE", "getWARN_LOGGABLE", "ERROR_LOGGABLE", "getERROR_LOGGABLE", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Log {

    @NotNull
    public static final Log INSTANCE = new Log();
    private static final boolean DEBUG_LOGGABLE = true;
    private static final boolean INFO_LOGGABLE = true;
    private static final boolean WARN_LOGGABLE = true;
    private static final boolean ERROR_LOGGABLE = true;

    private Log() {
    }

    public final boolean getDEBUG_LOGGABLE() {
        return DEBUG_LOGGABLE;
    }

    public final boolean getERROR_LOGGABLE() {
        return ERROR_LOGGABLE;
    }

    public final boolean getINFO_LOGGABLE() {
        return INFO_LOGGABLE;
    }

    public final boolean getWARN_LOGGABLE() {
        return WARN_LOGGABLE;
    }
}
