package rfm;

import java.util.concurrent.atomic.AtomicReference;
import tfm.k2;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends AtomicReference implements ifm.c, efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253921a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253922b;

    public c(efm.l lVar) {
        this.f253922b = lVar;
    }

    public void a(Object obj2) {
        ifm.c cVar;
        efm.l lVar = (efm.l) this.f253922b;
        Object obj3 = get();
        lfm.d dVar = lfm.d.DISPOSED;
        if (obj3 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
            return;
        }
        try {
            if (obj2 == null) {
                lVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                lVar.onSuccess(obj2);
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

    public boolean b(Throwable th10) {
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
            ((efm.l) this.f253922b).onError(th10);
        } finally {
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253921a) {
            case 0:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253921a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.d
    public final void onComplete() {
        ifm.c cVar;
        switch (this.f253921a) {
            case 0:
                Object obj2 = get();
                lfm.d dVar = lfm.d.DISPOSED;
                if (obj2 == dVar || (cVar = (ifm.c) getAndSet(dVar)) == dVar) {
                    return;
                }
                try {
                    ((efm.l) this.f253922b).onComplete();
                    if (cVar != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            default:
                k2 k2Var = (k2) this.f253922b;
                k2Var.e.b(this);
                k2Var.onComplete();
                return;
        }
    }

    @Override // efm.d
    public void onError(Throwable th10) {
        k2 k2Var = (k2) this.f253922b;
        k2Var.e.b(this);
        k2Var.onError(th10);
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f253921a) {
            case 0:
                return j6.a.r(c.class.getSimpleName(), "{", super.toString(), "}");
            default:
                return super.toString();
        }
    }

    public c(k2 k2Var) {
        this.f253922b = k2Var;
    }
}
