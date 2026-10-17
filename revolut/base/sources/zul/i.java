package zul;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreen;
import com.revolut.trading.orders.ui.screens.investment_plan.projection.InvestmentProjectionsScreenContract$ModalStep;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvestmentProjectionsScreen f325528w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(InvestmentProjectionsScreen investmentProjectionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325528w = investmentProjectionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f325528w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f325528w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object obj3 = null;
        InvestmentProjectionsScreen investmentProjectionsScreen = this.f325528w;
        switch (i) {
            case 0:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR2 = investmentProjectionsScreen.R2();
                Intrinsics.h(data);
                com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar2 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) qVarR2;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                Object obj4 = data.d;
                m mVar = obj4 instanceof m ? (m) obj4 : null;
                if (mVar != null) {
                    oki.h.v2(aVar2.A, new InvestmentProjectionsScreenContract$ModalStep.ShowAnnualReturnDisclaimer(mVar.f325538a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (mVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                g6 selectedData = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarR22 = investmentProjectionsScreen.R2();
                Intrinsics.h(selectedData);
                com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar4 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) qVarR22;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                FixedTabsDelegate.Model model = selectedData.f54200b;
                String tabId = selectedData.f54199a;
                if (Intrinsics.f(model.f52345g, t.f325552a)) {
                    s.Companion.getClass();
                    Intrinsics.checkNotNullParameter(tabId, "tabId");
                    Iterator<E> it8 = s.a().iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next = it8.next();
                            if (Intrinsics.f(((s) next).getId(), tabId)) {
                                obj3 = next;
                            }
                        }
                    }
                    s sVar = (s) obj3;
                    int i2 = sVar == null ? -1 : y.f325561a[sVar.ordinal()];
                    if (i2 == -1) {
                        hx7.e.h(new IllegalArgumentException(j6.a.q("Unknown selectedId: ", tabId)));
                    } else {
                        if (i2 != 1 && i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4.H2(aVar4.C, new zrd.q(sVar, 9));
                    }
                }
                return Unit.f186387a;
        }
    }
}
