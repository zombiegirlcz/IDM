package qgm;

import au0.x5;
import igm.o;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f246381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f246382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Maybe maybe, Object obj2, int i) {
        super(maybe);
        this.f246381b = i;
        this.f246382c = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        switch (this.f246381b) {
            case 0:
                this.f246363a.c(new i(eVar, (Scheduler) this.f246382c, 0));
                break;
            case 1:
                ngm.g gVar = new ngm.g(eVar);
                eVar.onSubscribe(gVar);
                ggm.b bVar = (ggm.b) gVar.f215242b;
                Disposable disposableC = ((Scheduler) this.f246382c).c(new x5(gVar, this.f246363a, 29));
                bVar.getClass();
                jgm.b.c(bVar, disposableC);
                break;
            default:
                this.f246363a.c(new b(eVar, (o) this.f246382c));
                break;
        }
    }
}
