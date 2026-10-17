package androidx.camera.camera2.pipe.compat;

import hlm.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ConcurrentSessionSequencer;", "", "<init>", "()V", "Lhlm/a;", "sharedMutex", "Lhlm/a;", "getSharedMutex", "()Lhlm/a;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConcurrentSessionSequencer {

    @NotNull
    private final hlm.a sharedMutex = d.a();

    @NotNull
    public final hlm.a getSharedMutex() {
        return this.sharedMutex;
    }
}
