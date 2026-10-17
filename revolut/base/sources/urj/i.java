package urj;

import com.revolut.core.model.account.AccountId;
import h6i.z;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import le3.b0;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import te0.w;
import up5.d0;
import urd.y;
import vkm.j2;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f282330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f282331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ n f282332y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i, Continuation continuation, n nVar) {
        super(3, continuation);
        this.u = i;
        this.f282332y = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(0, continuation, this.f282332y);
                iVar.f282330w = flowCollector;
                iVar.f282331x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i(1, continuation, this.f282332y);
                iVar2.f282330w = flowCollector;
                iVar2.f282331x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
            default:
                i iVar3 = new i(2, continuation, this.f282332y);
                iVar3.f282330w = flowCollector;
                iVar3.f282331x = obj3;
                return iVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String id10;
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f282330w;
                    AccountId accountId = (AccountId) this.f282331x;
                    if (accountId instanceof AccountId.Personal) {
                        id10 = null;
                    } else {
                        if (!(accountId instanceof AccountId.Joint)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        id10 = ((AccountId.Joint) accountId).f51413b;
                        Intrinsics.checkNotNullParameter(id10, "id");
                    }
                    n nVar = this.f282332y;
                    sfm.b bVarA = tzi.a.a(nVar.u, id10);
                    efm.r rVarD = ((grj.i) nVar.f282338q).d(accountId);
                    efm.r rVarA = ((grj.f) nVar.f282337p).a(accountId);
                    wsg.n nVar2 = nVar.f282341t;
                    nVar2.getClass();
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    efm.r rVarG = m70.a.g(nVar2.J(accountId, w4l.h.f294642c), null, j.f282333a, 1);
                    efm.r rVarJust = efm.r.just(accountId);
                    Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                    vkm.d dVarB = rd0.e.b(w.o(bVarA, rVarD, rVarA, rVarG, rVarJust));
                    this.f282330w = null;
                    this.f282331x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f282330w;
                    vf0.k kVar = (vf0.k) this.f282331x;
                    uzi.b bVar = (uzi.b) kVar.f288454a;
                    List list = (List) kVar.f288455b;
                    od0.i iVar = (od0.i) kVar.f288456c;
                    xi0.b bVar2 = (xi0.b) kVar.d;
                    AccountId accountId2 = (AccountId) kVar.e;
                    qzi.h hVar = (qzi.h) iVar.f224257a;
                    qzi.a aVar3 = hVar != null ? hVar.f250654a : null;
                    n nVar3 = this.f282332y;
                    if (aVar3 != null) {
                        LocalDate localDate = aVar3.e;
                        Interval interval = new Interval(localDate.toDateTimeAtStartOfDay(), aVar3.f.toDateTimeAtStartOfDay().plusDays(1).minusMillis(1));
                        mrj.a aVar4 = nVar3.v;
                        DateTime start = interval.getStart();
                        Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
                        DateTime end2 = interval.getEnd();
                        Intrinsics.checkNotNullExpressionValue(end2, "getEnd(...)");
                        Intrinsics.h(accountId2);
                        efm.r rVarX = ((mrj.c) aVar4).a(start, end2, accountId2).x();
                        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                        sfm.b bVarD = ((b0) nVar3.f282340s).d(accountId2, true);
                        DateTime dateTimeNow = DateTime.now();
                        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
                        Intrinsics.h(dateTimeAtStartOfDay);
                        Intrinsics.h(dateTimeNow);
                        Interval interval2 = new Interval(dateTimeAtStartOfDay, (DateTime) cim.c.k(dateTimeAtStartOfDay, dateTimeNow));
                        efm.r rVarG2 = m70.a.g(rd0.e.c(((le3.f) nVar3.B).e(y0.b(com.revolut.retail.feature.api.a.b(accountId2))), kotlin.coroutines.g.f186406a), null, new up5.k(21), 1);
                        efm.r rVarN = nVar3.z.d.c().n();
                        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
                        efm.r rVarSwitchMap = w.l(rVarG2, rVarN).switchMap(new d0(11, new toh.h(nVar3, 27, interval2, accountId2)));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        efm.r map = m70.a.g(rVarSwitchMap, null, new up5.k(22), 1).map(new d0(12, new y(2)));
                        od0.h hVar2 = od0.i.Companion;
                        ie3.a aVar5 = ((a) ((j2) nVar3.E.f22677a).getValue()).f282314b;
                        hVar2.getClass();
                        efm.r rVarStartWith = map.startWith(od0.h.a(aVar5));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        gVar = new z(rd0.e.b(w.m(rVarX, bVarD, rVarStartWith)), nVar3, bVar, bVar2, iVar, list, accountId2, 3);
                    } else {
                        f0 f0Var = f0.f322471a;
                        Map mapG = r0.g();
                        Intrinsics.h(accountId2);
                        n.J2(nVar3, bVar, bVar2, null, f0Var, mapG, f0Var, null, accountId2);
                        gVar = new go.g(Unit.f186387a, 2);
                    }
                    this.f282330w = null;
                    this.f282331x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f282330w;
                    n nVar4 = this.f282332y;
                    Continuation continuation = null;
                    vkm.y yVarE = rd0.e.e(vkm.q.Q(vkm.q.Q(nVar4.L2(), new i(0, continuation, nVar4)), new i(1, continuation, nVar4)), h0.f322473a, new ska.c(nVar4, continuation, 19));
                    this.f282330w = null;
                    this.f282331x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarE, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
