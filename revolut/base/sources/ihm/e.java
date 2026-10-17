package ihm;

import efm.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends AtomicBoolean implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f161446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f161447b;

    public e(y yVar, f fVar) {
        this.f161446a = yVar;
        this.f161447b = fVar;
    }

    @Override // ifm.c
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f161447b.f(this);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get();
    }
}
