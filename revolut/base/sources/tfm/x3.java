package tfm;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes13.dex */
public final class x3 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270933c;
    public final lfm.b d = new lfm.b(1);
    public boolean e;
    public boolean f;

    public x3(efm.y yVar, kfm.o oVar, boolean z) {
        this.f270931a = yVar;
        this.f270932b = oVar;
        this.f270933c = z;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e = true;
        this.f270931a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        boolean z = this.e;
        efm.y yVar = this.f270931a;
        if (z) {
            if (this.f) {
                mo3.a.m(th10);
                return;
            } else {
                yVar.onError(th10);
                return;
            }
        }
        this.e = true;
        if (this.f270933c && !(th10 instanceof Exception)) {
            yVar.onError(th10);
            return;
        }
        try {
            efm.w wVar = (efm.w) this.f270932b.apply(th10);
            if (wVar != null) {
                wVar.subscribe(this);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Observable is null");
            nullPointerException.initCause(th10);
            yVar.onError(nullPointerException);
        } catch (Throwable th11) {
            m70.a.u(th11);
            yVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        this.f270931a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.d;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }
}
