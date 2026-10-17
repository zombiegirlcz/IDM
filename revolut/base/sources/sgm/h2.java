package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class h2 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262877c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Observable observable, Object obj2, boolean z, int i) {
        super(observable);
        this.f262876b = i;
        this.f262877c = obj2;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262876b) {
            case 0:
                this.f262688a.subscribe(new g2(lVar, (igm.o) this.f262877c, this.d));
                break;
            case 1:
                this.f262688a.subscribe(new k2(0, lVar, (igm.o) this.f262877c, this.d));
                break;
            case 2:
                this.f262688a.subscribe(new k2(1, lVar, (igm.o) this.f262877c, this.d));
                break;
            default:
                ObservableSource observableSource = (ObservableSource) this.f262877c;
                ahm.c cVar = new ahm.c(lVar);
                boolean z = this.d;
                ObservableSource observableSource2 = this.f262688a;
                if (!z) {
                    observableSource2.subscribe(new f5(cVar, observableSource));
                } else {
                    observableSource2.subscribe(new e5(cVar, observableSource));
                }
                break;
        }
    }
}
