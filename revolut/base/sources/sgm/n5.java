package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class n5 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Observable observable, int i, int i2) {
        super(observable);
        this.f263026b = i2;
        this.f263027c = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263026b) {
            case 0:
                this.f262688a.subscribe(new m5(lVar, this.f263027c));
                break;
            default:
                this.f262688a.subscribe(new y5(lVar, this.f263027c));
                break;
        }
    }
}
