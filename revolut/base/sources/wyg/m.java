package wyg;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$ModalStep;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WidgetisedAnalyticsPerformanceScreen f301292w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f301292w = widgetisedAnalyticsPerformanceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f301292w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            case 1:
                m mVar2 = new m(this.f301292w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
            default:
                m mVar3 = new m(this.f301292w, continuation, 2);
                mVar3.v = obj2;
                return mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((m) create((TagViewData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((oxg.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        WidgetisedAnalyticsPerformanceScreen widgetisedAnalyticsPerformanceScreen = this.f301292w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE3 = widgetisedAnalyticsPerformanceScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) cVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                vyg.h hVar = obj3 instanceof vyg.h ? (vyg.h) obj3 : null;
                if (hVar != null) {
                    oki.h.v2(aVar2.f95111x, new WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection(hVar.f293321c, hVar.f293319a), bottom_dialog);
                }
                break;
            case 1:
                TagViewData tagViewData = (TagViewData) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVarE32 = widgetisedAnalyticsPerformanceScreen.d();
                Intrinsics.h(tagViewData);
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar4 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) cVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
                Object obj4 = tagViewData.k;
                if (obj4 instanceof d) {
                    vyg.h hVar2 = ((d) obj4).f301285a;
                    oki.h.v2(aVar4.f95111x, new WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection(hVar2.f293321c, hVar2.f293319a), bottom_dialog);
                }
                break;
            default:
                oxg.l assetRequest = (oxg.l) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar6 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) widgetisedAnalyticsPerformanceScreen.d();
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(assetRequest, "assetRequest");
                aVar6.n2(new wtj.f(aVar6, assetRequest, null, 7), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
