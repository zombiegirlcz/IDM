package sgm;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.p f262969c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Observable observable, igm.p pVar, int i) {
        super(observable);
        this.f262968b = i;
        this.f262969c = pVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262968b) {
            case 0:
                this.f262688a.subscribe(new k(lVar, this.f262969c, 0));
                break;
            case 1:
                this.f262688a.subscribe(new k(lVar, this.f262969c, 1));
                break;
            case 2:
                this.f262688a.subscribe(new s1(lVar, this.f262969c, 1));
                break;
            case 3:
                this.f262688a.subscribe(new m3(lVar, this.f262969c, 1));
                break;
            case 4:
                this.f262688a.subscribe(new k(lVar, this.f262969c, 2));
                break;
            case 5:
                this.f262688a.subscribe(new k(lVar, this.f262969c, 3));
                break;
            default:
                this.f262688a.subscribe(new k(lVar, this.f262969c, 4));
                break;
        }
    }
}
