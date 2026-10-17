package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class n extends Single implements lgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f263008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.p f263009c;

    public /* synthetic */ n(Observable observable, igm.p pVar, int i) {
        this.f263007a = i;
        this.f263008b = observable;
        this.f263009c = pVar;
    }

    @Override // lgm.d
    public final Observable a() {
        switch (this.f263007a) {
            case 0:
                return new l(this.f263008b, this.f263009c, 0);
            default:
                return new l(this.f263008b, this.f263009c, 1);
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        switch (this.f263007a) {
            case 0:
                this.f263008b.subscribe(new m(pVar, this.f263009c, 0));
                break;
            default:
                this.f263008b.subscribe(new m(pVar, this.f263009c, 1));
                break;
        }
    }
}
