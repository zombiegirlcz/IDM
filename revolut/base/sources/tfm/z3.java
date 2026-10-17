package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 extends AtomicReference implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270987a;

    public z3(efm.y yVar) {
        this.f270987a = yVar;
    }

    public final void a(a4 a4Var) {
        if (compareAndSet(null, a4Var)) {
            return;
        }
        a4Var.b(this);
    }

    @Override // ifm.c
    public final void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((a4) andSet).b(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == this;
    }
}
