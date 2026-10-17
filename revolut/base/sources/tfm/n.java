package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f270664c;
    public Collection d;
    public int e;
    public ifm.c f;

    public n(efm.y yVar, int i, Callable callable) {
        this.f270662a = yVar;
        this.f270663b = i;
        this.f270664c = callable;
    }

    public final boolean a() {
        try {
            Object objCall = this.f270664c.call();
            mfm.f.b(objCall, "Empty buffer supplied");
            this.d = (Collection) objCall;
            return true;
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.d = null;
            ifm.c cVar = this.f;
            efm.y yVar = this.f270662a;
            if (cVar == null) {
                lfm.e.d(th10, yVar);
                return false;
            }
            cVar.dispose();
            yVar.onError(th10);
            return false;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.f.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        Collection collection = this.d;
        if (collection != null) {
            this.d = null;
            boolean zIsEmpty = collection.isEmpty();
            efm.y yVar = this.f270662a;
            if (!zIsEmpty) {
                yVar.onNext(collection);
            }
            yVar.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.d = null;
        this.f270662a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        Collection collection = this.d;
        if (collection != null) {
            collection.add(obj2);
            int i = this.e + 1;
            this.e = i;
            if (i >= this.f270663b) {
                this.f270662a.onNext(collection);
                this.e = 0;
                a();
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f270662a.onSubscribe(this);
        }
    }
}
