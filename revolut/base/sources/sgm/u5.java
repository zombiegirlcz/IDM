package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes14.dex */
public final class u5 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f263205c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5(Observable observable, Scheduler scheduler, int i) {
        super(observable);
        this.f263204b = i;
        this.f263205c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263204b) {
            case 0:
                t5 t5Var = new t5(lVar, 0);
                lVar.onSubscribe(t5Var);
                jgm.b.e(t5Var, this.f263205c.c(new r8.d(this, t5Var, 6)));
                break;
            default:
                this.f262688a.subscribe(new l6(lVar, this.f263205c));
                break;
        }
    }
}
