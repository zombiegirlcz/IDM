package bgm;

import efm.y;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f15217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15218c;

    public c(y yVar) {
        this.f15216a = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f15217b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f15217b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f15218c) {
            return;
        }
        this.f15218c = true;
        ifm.c cVar = this.f15217b;
        y yVar = this.f15216a;
        if (cVar != null) {
            try {
                yVar.onComplete();
                return;
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            yVar.onSubscribe(lfm.e.INSTANCE);
            try {
                yVar.onError(nullPointerException);
            } catch (Throwable th11) {
                m70.a.u(th11);
                mo3.a.m(new CompositeException(nullPointerException, th11));
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            mo3.a.m(new CompositeException(nullPointerException, th12));
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f15218c) {
            mo3.a.m(th10);
            return;
        }
        this.f15218c = true;
        ifm.c cVar = this.f15217b;
        y yVar = this.f15216a;
        if (cVar != null) {
            if (th10 == null) {
                th10 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                yVar.onError(th10);
                return;
            } catch (Throwable th11) {
                m70.a.u(th11);
                mo3.a.m(new CompositeException(th10, th11));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            yVar.onSubscribe(lfm.e.INSTANCE);
            try {
                yVar.onError(new CompositeException(th10, nullPointerException));
            } catch (Throwable th12) {
                m70.a.u(th12);
                mo3.a.m(new CompositeException(th10, nullPointerException, th12));
            }
        } catch (Throwable th13) {
            m70.a.u(th13);
            mo3.a.m(new CompositeException(th10, nullPointerException, th13));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f15218c) {
            return;
        }
        ifm.c cVar = this.f15217b;
        y yVar = this.f15216a;
        if (cVar == null) {
            this.f15218c = true;
            NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
            try {
                yVar.onSubscribe(lfm.e.INSTANCE);
                try {
                    yVar.onError(nullPointerException);
                    return;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(new CompositeException(nullPointerException, th10));
                    return;
                }
            } catch (Throwable th11) {
                m70.a.u(th11);
                mo3.a.m(new CompositeException(nullPointerException, th11));
                return;
            }
        }
        if (obj2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f15217b.dispose();
                onError(nullPointerException2);
                return;
            } catch (Throwable th12) {
                m70.a.u(th12);
                onError(new CompositeException(nullPointerException2, th12));
                return;
            }
        }
        try {
            yVar.onNext(obj2);
        } catch (Throwable th13) {
            m70.a.u(th13);
            try {
                this.f15217b.dispose();
                onError(th13);
            } catch (Throwable th14) {
                m70.a.u(th14);
                onError(new CompositeException(th13, th14));
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f15217b, cVar)) {
            this.f15217b = cVar;
            try {
                this.f15216a.onSubscribe(this);
            } catch (Throwable th10) {
                m70.a.u(th10);
                this.f15218c = true;
                try {
                    cVar.dispose();
                    mo3.a.m(th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    mo3.a.m(new CompositeException(th10, th11));
                }
            }
        }
    }
}
