package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.SingleSource;

/* JADX INFO: loaded from: classes14.dex */
public final class y0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SingleSource f263290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Observable observable, SingleSource singleSource, int i) {
        super(observable);
        this.f263289b = i;
        this.f263290c = singleSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263289b) {
            case 0:
                this.f262688a.subscribe(new v0(lVar, this.f263290c, 2));
                break;
            default:
                r3 r3Var = new r3(lVar, 1);
                lVar.onSubscribe(r3Var);
                this.f262688a.subscribe(r3Var);
                this.f263290c.c((rgm.d) r3Var.f263125j);
                break;
        }
    }
}
