package yed;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f312907w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f312908x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b f312909y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f312909y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f312909y, continuation);
                zVar.f312907w = flowCollector;
                zVar.f312908x = obj3;
                return zVar.invokeSuspend(Unit.f186387a);
            case 1:
                z zVar2 = new z(1, this.f312909y, continuation);
                zVar2.f312907w = flowCollector;
                zVar2.f312908x = obj3;
                return zVar2.invokeSuspend(Unit.f186387a);
            case 2:
                z zVar3 = new z(2, this.f312909y, continuation);
                zVar3.f312907w = flowCollector;
                zVar3.f312908x = obj3;
                return zVar3.invokeSuspend(Unit.f186387a);
            default:
                z zVar4 = new z(3, this.f312909y, continuation);
                zVar4.f312907w = flowCollector;
                zVar4.f312908x = obj3;
                return zVar4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowY2;
        AlertItem alertItem;
        BigDecimal d;
        Flow flowQ;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f312907w;
                    yhm.r rVar = (yhm.r) this.f312908x;
                    BigDecimal bigDecimal = (BigDecimal) rVar.f314201a;
                    FavouritesAssetDetails favouritesAssetDetails = (FavouritesAssetDetails) rVar.f314202b;
                    String str = (String) rVar.f314203c;
                    com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = this.f312909y;
                    if (bigDecimal != null) {
                        u80.t tVar = bVar.f86750w;
                        int iScale = tVar.c(bigDecimal).scale();
                        SharedCreateAlertScreenContract$InputData sharedCreateAlertScreenContract$InputData = bVar.f86745p;
                        SharedCreateAlertScreenContract$InputData.Edit edit = sharedCreateAlertScreenContract$InputData instanceof SharedCreateAlertScreenContract$InputData.Edit ? (SharedCreateAlertScreenContract$InputData.Edit) sharedCreateAlertScreenContract$InputData : null;
                        flowY2 = new go.g(new Data(Integer.valueOf(Math.max(iScale, (edit == null || (alertItem = edit.f86742a) == null || (d = alertItem.getD()) == null) ? 0 : tVar.c(d).scale())), null, false, 6, null), 2);
                    } else {
                        flowY2 = com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b.y2(bVar, favouritesAssetDetails, str);
                    }
                    this.f312907w = null;
                    this.f312908x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowY2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f312907w;
                    Pair pair = (Pair) this.f312908x;
                    akg.n nVarY2 = com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b.y2(this.f312909y, (FavouritesAssetDetails) pair.f186385a, (String) pair.f186386b);
                    this.f312907w = null;
                    this.f312908x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, nVarY2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f312907w;
                    yhm.r rVar2 = (yhm.r) this.f312908x;
                    FavouritesAssetDetails favouritesAssetDetails2 = (FavouritesAssetDetails) rVar2.f314201a;
                    String str2 = (String) rVar2.f314202b;
                    mgd.f fVar = (mgd.f) rVar2.f314203c;
                    Flow c0Var = str2 == null ? vkm.i.f290039a : new ard.c0(rd0.e.b(((l2d.n) this.f312909y.f86746q).c(new mgd.g(zhm.u.c(favouritesAssetDetails2.d), zhm.u.c(mgd.d.ACTIVE), zhm.u.c(favouritesAssetDetails2.f86863a), (List) null, (Integer) null, false, zhm.u.c(fVar), SyslogConstants.LOG_CLOCK), false)), favouritesAssetDetails2, fVar, str2, 28);
                    this.f312907w = null;
                    this.f312908x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, c0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f312907w;
                    int i6 = y.f312906a[((mgd.f) this.f312908x).ordinal()];
                    Continuation continuation = null;
                    if (i6 == 1) {
                        com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar2 = this.f312909y;
                        flowQ = bVar2.B2() ? vkm.q.Q(vkm.q.q(new y5j.e(bVar2.q2(), 10)), new z(0, bVar2, continuation)) : vkm.q.Q(vkm.q.q(new y5j.e(bVar2.q2(), 11)), new z(1, bVar2, continuation));
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowQ = new go.g(new Data(new Integer(2), null, false, 6, null), 2);
                    }
                    this.f312907w = null;
                    this.f312908x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, flowQ, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
