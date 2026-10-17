package sgm;

import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: classes14.dex */
public final class g4 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f262857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262858c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(ObservableSource observableSource, long j2, int i) {
        super(observableSource);
        this.f262857b = i;
        this.f262858c = j2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262857b) {
            case 0:
                ggm.b bVar = new ggm.b();
                lVar.onSubscribe(bVar);
                long j2 = this.f262858c;
                new f4(lVar, j2 != Long.MAX_VALUE ? j2 - 1 : Long.MAX_VALUE, bVar, this.f262688a).a();
                break;
            case 1:
                this.f262688a.subscribe(new z0(lVar, this.f262858c));
                break;
            default:
                this.f262688a.subscribe(new x5(lVar, this.f262858c));
                break;
        }
    }
}
