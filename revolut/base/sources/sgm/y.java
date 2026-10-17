package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class y extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263288c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Observable observable, Object obj2, Object obj3, int i) {
        super(observable);
        this.f263287b = i;
        this.d = obj2;
        this.f263288c = obj3;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int i = this.f263287b;
        ObservableSource observableSource = this.f262688a;
        Object obj2 = this.d;
        Object obj3 = this.f263288c;
        switch (i) {
            case 0:
                observableSource.subscribe(new x(new ahm.c(lVar), (igm.q) obj3, (ObservableSource) obj2));
                return;
            case 1:
                try {
                    Object obj4 = ((igm.q) obj3).get();
                    Objects.requireNonNull(obj4, "The initialSupplier returned a null value");
                    observableSource.subscribe(new h0(lVar, obj4, (igm.b) obj2, 0));
                    return;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jgm.c.c(th10, lVar);
                    return;
                }
            case 2:
                try {
                    Object obj5 = ((igm.q) obj3).get();
                    if (obj5 == null) {
                        throw ygm.g.b("The collectionSupplier returned a null Collection.");
                    }
                    q75.t tVar = ygm.g.f313672a;
                    observableSource.subscribe(new q1(lVar, (igm.o) obj2, (Collection) obj5));
                    return;
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    jgm.c.c(th11, lVar);
                    return;
                }
            case 3:
                observableSource.subscribe(new r1(lVar, (igm.o) obj2, (igm.d) obj3));
                return;
            case 4:
                observableSource.subscribe(new ngm.j(lVar, 0, (igm.g) obj2, (igm.a) obj3));
                return;
            case 5:
                try {
                    Object obj6 = ((igm.q) obj3).get();
                    Objects.requireNonNull(obj6, "The seed supplied is null");
                    observableSource.subscribe(new i5(lVar, (igm.c) obj2, obj6));
                    return;
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    jgm.c.c(th12, lVar);
                    return;
                }
            case 6:
                observableSource.subscribe(new e6(lVar, (TimeUnit) obj3, (Scheduler) obj2));
                return;
            default:
                ahm.c cVar = new ahm.c(lVar);
                ngm.i iVar = new ngm.i(cVar, (igm.c) obj3);
                cVar.onSubscribe(iVar);
                ((ObservableSource) obj2).subscribe(new m1(iVar, 2));
                observableSource.subscribe(iVar);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Observable observable, Object obj2, Object obj3, int i, boolean z) {
        super(observable);
        this.f263287b = i;
        this.f263288c = obj2;
        this.d = obj3;
    }
}
