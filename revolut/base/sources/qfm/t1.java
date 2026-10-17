package qfm;

import io.reactivex.exceptions.CompositeException;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class t1 extends yfm.f implements efm.j {
    public final dom.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kfm.o f245546j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f245547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f245548m;

    public t1(dom.a aVar, kfm.o oVar) {
        super(false);
        this.i = aVar;
        this.f245546j = oVar;
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245547l) {
            return;
        }
        this.f245547l = true;
        this.k = true;
        this.i.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        boolean z = this.k;
        dom.a aVar = this.i;
        if (z) {
            if (this.f245547l) {
                mo3.a.m(th10);
                return;
            } else {
                aVar.onError(th10);
                return;
            }
        }
        this.k = true;
        try {
            Object objApply = this.f245546j.apply(th10);
            mfm.f.b(objApply, "The nextSupplier returned a null Publisher");
            Publisher publisher = (Publisher) objApply;
            long j2 = this.f245548m;
            if (j2 != 0) {
                c(j2);
            }
            publisher.a(this);
        } catch (Throwable th11) {
            m70.a.u(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245547l) {
            return;
        }
        if (!this.k) {
            this.f245548m++;
        }
        this.i.onNext(obj2);
    }
}
