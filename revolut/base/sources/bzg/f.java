package bzg;

import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WidgetisedAnalyticsPnLScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = widgetisedAnalyticsPnLScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object selectedItemId;
        int i = this.u;
        WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) widgetisedAnalyticsPnLScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar3 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) widgetisedAnalyticsPnLScreen.d();
                l0 l0Var = aVar3.f95119q;
                ViewIdTarget viewIdTarget = new ViewIdTarget(R$id.headerLayout_secondDescriptionText);
                ezg.b bVar = aVar3.f95118p;
                int i2 = p.f20013b[((k) ((j2) aVar3.f95123w.f22677a).getValue()).f19991b.ordinal()];
                if (i2 == 1) {
                    selectedItemId = "TOTAL_PNL_MENU_ITEM_ID";
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    selectedItemId = "REALISED_PNL_MENU_ITEM_ID";
                }
                bVar.getClass();
                Intrinsics.checkNotNullParameter(selectedItemId, "selectedItemId");
                PopupMenuItem.Companion companion = PopupMenuItem.INSTANCE;
                l0.d(l0Var, viewIdTarget, zi0.c.d(zhm.v.k(PopupMenuItem.Companion.a(companion, "TOTAL_PNL_MENU_ITEM_ID", new TextLocalisedClause(R$string.wealth_analytics_profit_and_loss_header_total, null, null, 14), selectedItemId.equals("TOTAL_PNL_MENU_ITEM_ID"), null, vyg.f.TOTAL, new ResourceImage(R$drawable.uikit_icn_24_credit_bag, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200), PopupMenuItem.Companion.a(companion, "REALISED_PNL_MENU_ITEM_ID", new TextLocalisedClause(R$string.wealth_analytics_profit_and_loss_header_realised, null, null, 14), selectedItemId.equals("REALISED_PNL_MENU_ITEM_ID"), null, vyg.f.REALISED, new ResourceImage(R$drawable.uikit_icn_24_credit_part, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200))), null, 12);
                return Unit.f186387a;
        }
    }
}
