package sgm;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes14.dex */
public final class n3 extends Maybe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f263024b;

    public /* synthetic */ n3(Observable observable, int i) {
        this.f263023a = i;
        this.f263024b = observable;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        switch (this.f263023a) {
            case 0:
                this.f263024b.subscribe(new m3(eVar, 0));
                break;
            default:
                this.f263024b.subscribe(new o1(eVar));
                break;
        }
    }
}
