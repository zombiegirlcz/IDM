package pgm;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class s0 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236139c;
    public final igm.o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Flowable flowable, igm.o oVar, int i) {
        super(flowable);
        this.f236139c = i;
        this.d = oVar;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        switch (this.f236139c) {
            case 0:
                boolean z = aVar instanceof bhm.a;
                igm.o oVar = this.d;
                Flowable flowable = this.f236000b;
                if (!z) {
                    flowable.j(new r0(aVar, oVar));
                } else {
                    flowable.j(new z((bhm.a) aVar, oVar, 1));
                }
                break;
            default:
                ghm.a aVar2 = new ghm.a(aVar);
                kgm.j.a(8, "capacityHint");
                dhm.b bVar = new dhm.b(new dhm.d());
                try {
                    Object objApply = this.d.apply(bVar);
                    Objects.requireNonNull(objApply, "handler returned a null Publisher");
                    Publisher publisher = (Publisher) objApply;
                    g1 g1Var = new g1(this.f236000b);
                    j1 j1Var = new j1(aVar2, bVar, g1Var);
                    g1Var.d = j1Var;
                    aVar.e(j1Var);
                    publisher.a(g1Var);
                    g1Var.onNext(0);
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    xgm.c.c(th10, aVar);
                }
                break;
        }
    }
}
