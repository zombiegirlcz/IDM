package tfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class e7 extends AtomicBoolean implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f270438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.g f270439c;
    public final boolean d;
    public ifm.c e;

    public e7(efm.y yVar, Object obj2, kfm.g gVar, boolean z) {
        this.f270437a = yVar;
        this.f270438b = obj2;
        this.f270439c = gVar;
        this.d = z;
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            try {
                this.f270439c.accept(this.f270438b);
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        a();
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get();
    }

    @Override // efm.y
    public final void onComplete() {
        boolean z = this.d;
        efm.y yVar = this.f270437a;
        if (!z) {
            yVar.onComplete();
            this.e.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f270439c.accept(this.f270438b);
            } catch (Throwable th10) {
                m70.a.u(th10);
                yVar.onError(th10);
                return;
            }
        }
        this.e.dispose();
        yVar.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        boolean z = this.d;
        efm.y yVar = this.f270437a;
        if (!z) {
            yVar.onError(th10);
            this.e.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f270439c.accept(this.f270438b);
            } catch (Throwable th11) {
                m70.a.u(th11);
                th10 = new CompositeException(th10, th11);
            }
        }
        this.e.dispose();
        yVar.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270437a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270437a.onSubscribe(this);
        }
    }
}
