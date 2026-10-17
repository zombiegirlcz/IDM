package bzg;

import com.revolut.core.ui_kit.delegates.ai;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import ip0.wi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WidgetisedAnalyticsPnLScreen f19989w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f19989w = widgetisedAnalyticsPnLScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f19989w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f19989w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f19989w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f19989w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((wi) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ai) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 16;
        WidgetisedAnalyticsPnLScreen widgetisedAnalyticsPnLScreen = this.f19989w;
        switch (i) {
            case 0:
                wi data = (wi) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = widgetisedAnalyticsPnLScreen.d();
                Intrinsics.h(data);
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar2 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                aVar2.H2(aVar2.f95123w, new o(data, 0));
                break;
            case 1:
                String id10 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = widgetisedAnalyticsPnLScreen.d();
                Intrinsics.h(id10);
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar4 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar4.H2(aVar4.f95123w, new bd2.b(id10, 17));
                break;
            case 2:
                g6 g6Var = (g6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = widgetisedAnalyticsPnLScreen.d();
                String selectedId = g6Var.f54199a;
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar6 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                aVar6.H2(aVar6.f95123w, new bd2.b(selectedId, i2));
                break;
            default:
                ai aiVar = (ai) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE34 = widgetisedAnalyticsPnLScreen.d();
                String selectedId2 = aiVar.f53687a;
                com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a aVar8 = (com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a) mVarE34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(selectedId2, "selectedId");
                aVar8.H2(aVar8.f95123w, new bd2.b(selectedId2, i2));
                break;
        }
        return Unit.f186387a;
    }
}
