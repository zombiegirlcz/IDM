package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class s5 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f263153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s5(Observable observable, ObservableSource observableSource, int i) {
        super(observable);
        this.f263152b = i;
        this.f263153c = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263152b) {
            case 0:
                ahm.c cVar = new ahm.c(lVar);
                jgm.a aVar = new jgm.a(2);
                cVar.onSubscribe(aVar);
                r5 r5Var = new r5(cVar, aVar);
                this.f263153c.subscribe(new q5(aVar, r5Var, cVar));
                this.f262688a.subscribe(r5Var);
                break;
            case 1:
                n1 n1Var = new n1(lVar, this.f263153c);
                lVar.onSubscribe(n1Var.f263019c);
                this.f262688a.subscribe(n1Var);
                break;
            default:
                b6 b6Var = new b6(lVar);
                lVar.onSubscribe(b6Var);
                this.f263153c.subscribe(b6Var.f262724c);
                this.f262688a.subscribe(b6Var);
                break;
        }
    }
}
