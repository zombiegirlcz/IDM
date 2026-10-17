package dyg;

import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.feature.wealth.analytics.ui.widgetised.allocation.WidgetisedAnalyticsAllocationScreen;
import ip0.wi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WidgetisedAnalyticsAllocationScreen f121108w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f121108w = widgetisedAnalyticsAllocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f121108w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f121108w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((wi) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WidgetisedAnalyticsAllocationScreen widgetisedAnalyticsAllocationScreen = this.f121108w;
        switch (i) {
            case 0:
                wi selectedData = (wi) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = widgetisedAnalyticsAllocationScreen.R2();
                Intrinsics.h(selectedData);
                com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) jVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedData, "selectedData");
                aVar2.H2(aVar2.v, new bzg.o(selectedData, 1));
                break;
            default:
                ai aiVar = (ai) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = widgetisedAnalyticsAllocationScreen.R2();
                String selectedId = aiVar.f53687a;
                com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a aVar4 = (com.revolut.feature.wealth.analytics.ui.widgetised.allocation.a) jVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                aVar4.H2(aVar4.v, new d7a.p(selectedId, 26));
                break;
        }
        return Unit.f186387a;
    }
}
