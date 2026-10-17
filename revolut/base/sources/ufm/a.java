package ufm;

import efm.e0;
import efm.f0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicReference implements e0, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f279870a;

    public a(f0 f0Var) {
        this.f279870a = f0Var;
    }

    public final void a(Throwable th10) {
        if (c(th10)) {
            return;
        }
        mo3.a.m(th10);
    }

    public final void b(Object obj2) {
        ifm.c cVar;
        Object obj3 = get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (obj3 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
            return;
        }
        f0 f0Var = this.f279870a;
        try {
            if (obj2 == null) {
                f0Var.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                f0Var.onSuccess(obj2);
            }
            if (cVar != null) {
                cVar.dispose();
            }
        } catch (Throwable th10) {
            if (cVar != null) {
                cVar.dispose();
            }
            throw th10;
        }
    }

    public final boolean c(Throwable th10) {
        ifm.c cVar;
        if (th10 == null) {
            th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Object obj2 = get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (obj2 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
            return false;
        }
        try {
            this.f279870a.onError(th10);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) get());
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return j6.a.r(a.class.getSimpleName(), "{", super.toString(), "}");
    }
}
