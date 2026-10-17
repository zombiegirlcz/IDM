package ihm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends AtomicReference implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f161442a;

    public c(efm.d dVar, d dVar2) {
        this.f161442a = dVar;
        lazySet(dVar2);
    }

    @Override // ifm.c
    public final void dispose() {
        d dVar = (d) getAndSet(null);
        if (dVar != null) {
            dVar.G(this);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
