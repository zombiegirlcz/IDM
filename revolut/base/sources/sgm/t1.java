package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class t1 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(Observable observable, Object obj2, int i) {
        super(observable);
        this.f263173b = i;
        this.f263174c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int i = this.f263173b;
        ObservableSource observableSource = this.f262688a;
        Object obj2 = this.f263174c;
        switch (i) {
            case 0:
                observableSource.subscribe(new s1(lVar, (igm.g) obj2, 0));
                return;
            case 1:
                observableSource.subscribe(new u1(lVar, (igm.a) obj2));
                return;
            case 2:
                ggm.b bVar = new ggm.b();
                lVar.onSubscribe(bVar);
                new x4(lVar, (igm.d) obj2, bVar, observableSource).a();
                return;
            case 3:
                observableSource.subscribe(new i5(lVar, (igm.c) obj2));
                return;
            default:
                try {
                    Object obj3 = ((igm.q) obj2).get();
                    if (obj3 == null) {
                        throw ygm.g.b("The collectionSupplier returned a null Collection.");
                    }
                    q75.t tVar = ygm.g.f313672a;
                    observableSource.subscribe(new m3(lVar, (Collection) obj3, 3));
                    return;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jgm.c.c(th10, lVar);
                    return;
                }
        }
    }
}
