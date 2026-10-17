package pgm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f236006c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f236005b = i;
        this.f236006c = obj2;
        this.d = obj3;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236005b) {
            case 0:
                d1 d1Var = (d1) this.f236006c;
                d1Var.a(aVar);
                if (((AtomicInteger) this.d).incrementAndGet() == 1) {
                    d1Var.n(kgm.j.d);
                }
                break;
            case 1:
                try {
                    Object objApply = ((igm.o) this.d).apply(this.f236006c);
                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                    Publisher publisher = (Publisher) objApply;
                    if (!(publisher instanceof igm.q)) {
                        publisher.a(aVar);
                    } else {
                        try {
                            Object obj2 = ((igm.q) publisher).get();
                            if (obj2 != null) {
                                aVar.e(new xgm.d(aVar, obj2));
                            } else {
                                aVar.e(xgm.c.INSTANCE);
                                aVar.onComplete();
                            }
                        } catch (Throwable th10) {
                            ce9.m.F(th10);
                            xgm.c.c(th10, aVar);
                            return;
                        }
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    xgm.c.c(th11, aVar);
                    return;
                }
                break;
            default:
                ((Completable) this.f236006c).c(new rgm.b(aVar, (Publisher) this.d));
                break;
        }
    }

    public b(d1 d1Var) {
        this.f236005b = 0;
        this.f236006c = d1Var;
        this.d = new AtomicInteger();
    }
}
