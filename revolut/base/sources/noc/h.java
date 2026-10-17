package noc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.portfolio_allocations_details.PortfolioAllocationsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f217984w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217984w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f217984w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f217984w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        q qVar = (q) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(qVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dnc.f fVar;
        int i = this.u;
        j jVar = this.f217984w;
        switch (i) {
            case 0:
                q qVar = (q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = jVar.d;
                Template template = qVar.f217993a;
                xdh.b rebalanceStatus = qVar.f217994b;
                List assetAllocations = qVar.f217995c;
                p allocationType = qVar.d;
                Intrinsics.checkNotNullParameter(template, "template");
                Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
                Intrinsics.checkNotNullParameter(assetAllocations, "assetAllocations");
                Intrinsics.checkNotNullParameter(allocationType, "allocationType");
                int i2 = k.f217986a[allocationType.ordinal()];
                if (i2 == 1) {
                    fVar = dnc.f.ACTUAL;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fVar = dnc.f.TARGET;
                }
                yji.n.O2(lVar, new PortfolioAllocationsDetailsScreen(new PortfolioAllocationsDetailsScreenContract$InputData(template, rebalanceStatus, assetAllocations, fVar)), null, 3);
                return Unit.f186387a;
            default:
                q parcel = (q) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar2 = jVar.d;
                Intrinsics.h(parcel);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                j60.a aVar3 = lVar2.f217988m;
                m mVar = lVar2.f217987l;
                int i3 = parcel.e;
                mVar.getClass();
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("portfolio-allocations-widget-info-listId", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, r.f217996a, null, 744);
                int i5 = R$attr.uikit_dp24;
                int i6 = R$attr.uikit_dp16;
                yp0.b.l(model, i5, i5, i6, i6, null, false, 48);
                aVar3.x(new y(zhm.u.c(model), new rp0.t(new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_portfolio_portfolio_allocation_dialog_description, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
        }
    }
}
