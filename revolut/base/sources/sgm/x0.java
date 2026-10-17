package sgm;

import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class x0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MaybeSource f263268c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Observable observable, MaybeSource maybeSource, int i) {
        super(observable);
        this.f263267b = i;
        this.f263268c = maybeSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263267b) {
            case 0:
                this.f262688a.subscribe(new v0(lVar, this.f263268c, 1));
                break;
            default:
                r3 r3Var = new r3(lVar, 0);
                lVar.onSubscribe(r3Var);
                this.f262688a.subscribe(r3Var);
                this.f263268c.c((rgm.d) r3Var.f263125j);
                break;
        }
    }
}
