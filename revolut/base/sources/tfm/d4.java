package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class d4 extends AtomicReference implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270409a;

    public d4(efm.y yVar, e4 e4Var) {
        this.f270409a = yVar;
        lazySet(e4Var);
    }

    @Override // ifm.c
    public final void dispose() {
        e4 e4Var = (e4) getAndSet(null);
        if (e4Var != null) {
            e4Var.a(this);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == null;
    }
}
