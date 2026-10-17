package zrd;

import amd.c0;
import amd.l0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TotalWealthController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TotalWealthController totalWealthController, Continuation continuation) {
        super(2, continuation);
        this.v = totalWealthController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.v, continuation);
        oVar.u = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        xi0.b bVar2;
        xi0.b bVar3;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f53228a, "ADD_NEW_BUTTON_ID");
        TotalWealthController totalWealthController = this.v;
        if (zF) {
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) totalWealthController.R2();
            c cVar = (c) ((a) ((j2) aVar2.f88028y.f22677a).getValue()).f324678a.getContent();
            if (cVar != null && (bVar3 = cVar.f324683b) != null) {
                aVar2.l1().M0(new TotalWealthContract$Events.ShowAddNewOptions(bVar3));
            }
        } else {
            com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a aVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.a) totalWealthController.R2();
            cli.y yVar = aVar3.f88028y;
            Intrinsics.checkNotNullParameter(model, "model");
            Object obj3 = model.u;
            l0 l0Var = obj3 instanceof l0 ? (l0) obj3 : null;
            if (l0Var != null) {
                if (l0Var instanceof amd.r) {
                    c cVar2 = (c) ((a) ((j2) yVar.f22677a).getValue()).f324678a.getContent();
                    if (cVar2 != null && (bVar2 = cVar2.f324683b) != null) {
                        amd.r rVar = (amd.r) l0Var;
                        aVar3.l1().M0(new TotalWealthContract$Events.NavigateToCustomAssetDetails(rVar.f6343a, rVar.f6344b, bVar2));
                    }
                } else if ((l0Var instanceof c0) && ((c0) l0Var).f6310a == amd.b.OTHER_ASSETS) {
                    c cVar3 = (c) ((a) ((j2) yVar.f22677a).getValue()).f324678a.getContent();
                    if (cVar3 != null && (bVar = cVar3.f324683b) != null) {
                        aVar3.l1().M0(new TotalWealthContract$Events.NavigateToAddOtherAsset(bVar));
                    }
                } else if (l0Var instanceof amd.s) {
                    aVar3.B.setValue(((amd.s) l0Var).f6345a);
                    Unit unit = Unit.f186387a;
                } else {
                    aVar3.n2(new u(aVar3, l0Var, model, null), new whi.b(6));
                }
            }
        }
        return Unit.f186387a;
    }
}
