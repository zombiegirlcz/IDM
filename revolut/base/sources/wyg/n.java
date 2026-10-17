package wyg;

import cli.y;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.utils.ViewIdTarget;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            default:
                return new n(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) widgetisedAnalyticsPerformanceScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar3 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) widgetisedAnalyticsPerformanceScreen.d();
                l0 l0Var = aVar3.f95107r;
                ViewIdTarget viewIdTarget = new ViewIdTarget(R$id.headerLayout_secondDescriptionText);
                yyg.b bVar = aVar3.f95106q;
                y yVar = aVar3.f95110w;
                List availableCalculationMethods = ((a) ((j2) yVar.f22677a).getValue()).f301276h;
                iwg.c selectedCalculationMethod = ((a) ((j2) yVar.f22677a).getValue()).f301275g;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(availableCalculationMethods, "availableCalculationMethods");
                Intrinsics.checkNotNullParameter(selectedCalculationMethod, "selectedCalculationMethod");
                List<iwg.c> list = availableCalculationMethods;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                for (iwg.c cVar : list) {
                    arrayList.add(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, j6.a.q("CALCULATION_METHOD_MENU_ITEM_ID_", cVar.name()), azg.b.b(cVar), cVar == selectedCalculationMethod, null, cVar, azg.b.a(cVar), null, 200));
                }
                l0.d(l0Var, viewIdTarget, zi0.c.d(d0.F0(PopupMenuItem.Companion.a(PopupMenuItem.INSTANCE, "LEARN_MORE_MENU_ITEM_ID", new TextLocalisedClause(R$string.wealth_analytics_widgetised_performance_learn_more, null, null, 14), false, null, yyg.a.f317938a, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 200), arrayList)), null, 12);
                break;
        }
        return Unit.f186387a;
    }
}
