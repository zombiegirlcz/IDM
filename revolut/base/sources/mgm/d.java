package mgm;

import ce9.m;
import fgm.p;
import igm.q;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collection;
import java.util.stream.Collector;
import q75.t;
import sgm.m3;
import sgm.t1;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f205315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f205316c;

    public /* synthetic */ d(Observable observable, Object obj2, int i) {
        this.f205314a = i;
        this.f205315b = observable;
        this.f205316c = obj2;
    }

    @Override // lgm.d
    public final Observable a() {
        switch (this.f205314a) {
            case 0:
                return new b(this.f205315b, (Collector) this.f205316c, 0);
            default:
                return new t1(this.f205315b, (q) this.f205316c, 4);
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        int i = this.f205314a;
        Observable observable = this.f205315b;
        Object obj2 = this.f205316c;
        switch (i) {
            case 0:
                Collector collector = (Collector) obj2;
                try {
                    observable.subscribe(new c(pVar, collector.supplier().get(), collector.accumulator(), collector.finisher()));
                    return;
                } catch (Throwable th10) {
                    m.F(th10);
                    pVar.onSubscribe(jgm.c.INSTANCE);
                    pVar.onError(th10);
                    return;
                }
            default:
                try {
                    Object obj3 = ((q) obj2).get();
                    if (obj3 == null) {
                        throw ygm.g.b("The collectionSupplier returned a null Collection.");
                    }
                    t tVar = ygm.g.f313672a;
                    observable.subscribe(new m3(pVar, (Collection) obj3, 4));
                    return;
                } catch (Throwable th11) {
                    m.F(th11);
                    pVar.onSubscribe(jgm.c.INSTANCE);
                    pVar.onError(th11);
                    return;
                }
        }
    }

    public d(Observable observable, int i) {
        this.f205314a = 1;
        this.f205315b = observable;
        this.f205316c = new kgm.a(i);
    }
}
