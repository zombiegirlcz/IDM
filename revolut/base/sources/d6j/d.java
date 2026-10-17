package d6j;

import aw0.p0;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CommodityAssetDetailsScreen f111555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CommodityAssetDetailsScreen commodityAssetDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111555w = commodityAssetDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f111555w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f111555w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f111555w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((p0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        CommodityAssetDetailsScreen commodityAssetDetailsScreen = this.f111555w;
        switch (i) {
            case 0:
                String chartPeriodId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarR2 = commodityAssetDetailsScreen.R2();
                Intrinsics.h(chartPeriodId);
                n0 n0Var = (n0) rVarR2;
                n0Var.getClass();
                Intrinsics.checkNotNullParameter(chartPeriodId, "chartPeriodId");
                y5j.g gVar = n0Var.C;
                qta.f plotDuration = qta.f.valueOf(chartPeriodId);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(plotDuration, "plotDuration");
                z9h.n.l(String.class, gVar.f311097a, "CHART_PERIOD_KEY", plotDuration.name());
                break;
            case 1:
                p0 p0Var = (p0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = p0Var.f10454a;
                int iHashCode = str.hashCode();
                if (iHashCode != -1332827398) {
                    if (iHashCode != -1026381907) {
                        if (iHashCode == 1883132888 && str.equals("ACTION_SELL_LIST_ID")) {
                            n0 n0Var2 = (n0) commodityAssetDetailsScreen.R2();
                            n0Var2.M.Z2(wd6.e.SELL, n0Var2.o.f99788a);
                        }
                    } else if (str.equals("ACTION_CONTINUE_LIST_ID")) {
                        n0 n0Var3 = (n0) commodityAssetDetailsScreen.R2();
                        n0Var3.getClass();
                        n0Var3.l2(new d0(0, n0Var3, continuation), new yi5.b(26));
                    }
                } else if (str.equals("ACTION_BUY_LIST_ID")) {
                    n0 n0Var4 = (n0) commodityAssetDetailsScreen.R2();
                    n0Var4.M.Z2(wd6.e.BUY, n0Var4.o.f99788a);
                }
                break;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarR22 = commodityAssetDetailsScreen.R2();
                Intrinsics.h(menuItemId);
                n0 n0Var5 = (n0) rVarR22;
                n0Var5.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                n0Var5.l2(new d3i.g(n0Var5, menuItemId, continuation, 3), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
