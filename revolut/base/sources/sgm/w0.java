package sgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class w0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompletableSource f263231c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(Observable observable, CompletableSource completableSource, int i) {
        super(observable);
        this.f263230b = i;
        this.f263231c = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263230b) {
            case 0:
                this.f262688a.subscribe(new v0(lVar, this.f263231c, 0));
                break;
            default:
                q3 q3Var = new q3(lVar);
                lVar.onSubscribe(q3Var);
                this.f262688a.subscribe(q3Var);
                this.f263231c.c(q3Var.f263101c);
                break;
        }
    }
}
