package uk2;

import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.AtmBoundBox;
import com.revolut.feature.atm.api.model.AtmLocation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ud3.a0;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f280662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f280662w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t tVar = new t(this.f280662w, continuation, 0);
                tVar.v = obj2;
                return tVar;
            default:
                t tVar2 = new t(this.f280662w, continuation, 1);
                tVar2.v = obj2;
                return tVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t) create((tk2.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tk2.n jVar;
        int i = this.u;
        v vVar = this.f280662w;
        switch (i) {
            case 0:
                tk2.p pVar = vVar.o;
                ukm.q qVar = vVar.f280665q;
                ukm.q qVar2 = vVar.f280666r;
                tk2.f fVar = (tk2.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (fVar instanceof tk2.c) {
                    vVar.f280667s = r.USER_LOCATION;
                    co3.a aVar2 = ((tk2.c) fVar).f271836a;
                    double d = aVar2.f25486a;
                    double dCos = 0.0064d / Math.cos((3.141592653589793d * d) / 180.0d);
                    double d5 = aVar2.f25487b;
                    qVar.mo3647trySendJP2dKIU(new p(new AtmBoundBox(new AtmLocation(d + 0.0064d, d5 + dCos), new AtmLocation(d - 0.0064d, d5 - dCos), new AtmLocation(d, d5)), sj2.c.AUTO_EXPANSION));
                    Object value = pVar.f271851l.f290128a.getValue();
                    zv0.b bVar = zv0.b.HALF_EXPANDED;
                    if (value == bVar) {
                        pVar.b(tk2.k.f271842a);
                        Unit unit = Unit.f186387a;
                    } else {
                        vVar.u = true;
                        qVar2.mo3647trySendJP2dKIU(bVar);
                    }
                } else if (fVar instanceof tk2.d) {
                    vVar.f280667s = r.SEARCH_IN_AREA;
                    ah0.b bVar2 = ((tk2.d) fVar).f271837a;
                    vVar.f280668t = bVar2;
                    vVar.u = false;
                    qVar.mo3647trySendJP2dKIU(new p(v.J2(bVar2), null));
                    qVar2.mo3647trySendJP2dKIU(zv0.b.HALF_EXPANDED);
                } else {
                    if (!(fVar instanceof tk2.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar2.mo3647trySendJP2dKIU(((tk2.e) fVar).f271838a);
                }
                return Unit.f186387a;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar2 = (p) pair.f186385a;
                Data data = (Data) pair.f186386b;
                tk2.p pVar3 = vVar.o;
                pVar3.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                pVar3.f271848g.setValue(data);
                vVar.H2(vVar.v, new a0(data, 16));
                if (!data.getLoading()) {
                    if (pVar2.f280660b != null) {
                        jVar = new tk2.j(vVar.f280667s == r.USER_LOCATION);
                    } else {
                        jVar = tk2.i.f271840a;
                    }
                    pVar3.b(jVar);
                }
                return Unit.f186387a;
        }
    }
}
