package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes14.dex */
public final class o3 extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Observable f263047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263048c;

    public /* synthetic */ o3(Observable observable, Object obj2, int i) {
        this.f263046a = i;
        this.f263047b = observable;
        this.f263048c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(fgm.p pVar) {
        switch (this.f263046a) {
            case 0:
                this.f263047b.subscribe(new ngm.j(pVar, this.f263048c));
                break;
            default:
                this.f263047b.subscribe(new h0(pVar, this.f263048c));
                break;
        }
    }
}
