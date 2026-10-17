package androidx.camera.camera2.pipe.core;

import hlm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rkm.b;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\b¨\u0006\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/core/MutexToken;", "Landroidx/camera/camera2/pipe/core/Token;", "Lhlm/a;", "mutex", "<init>", "(Lhlm/a;)V", "", "release", "()Z", "Lhlm/a;", "Lrkm/b;", "_released", "Lrkm/b;", "getReleased", "released", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MutexToken implements Token {

    @NotNull
    private final b _released;

    @NotNull
    private final a mutex;

    public MutexToken(@NotNull a mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.mutex = mutex;
        this._released = hx7.b.g(false);
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public boolean getReleased() {
        return this._released.b();
    }

    @Override // androidx.camera.camera2.pipe.core.Token
    public boolean release() {
        if (!this._released.a()) {
            return false;
        }
        this.mutex.unlock(null);
        return true;
    }
}
