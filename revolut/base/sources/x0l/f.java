package x0l;

import aii.q;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.trading_onboarding.impl.ui.riskwarning.RiskWarningController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RiskWarningController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(RiskWarningController riskWarningController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = riskWarningController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            case 2:
                return new f(this.v, continuation, 2);
            default:
                return new f(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RiskWarningController riskWarningController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr = RiskWarningController.W;
                if (riskWarningController.e3().getVisibility() != 0) {
                    riskWarningController.e3().setVisibility(0);
                    riskWarningController.e3().setCollapsed(true, false);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                KProperty[] kPropertyArr2 = RiskWarningController.W;
                ((NavBarWithToolbar) riskWarningController.O.getValue()).setExpanded(false, true);
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) riskWarningController.P.getValue();
                screenContentRecyclerView.smoothScrollBy(0, screenContentRecyclerView.computeVerticalScrollExtent() + screenContentRecyclerView.getScrollY());
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) riskWarningController.S.getValue()).C2(q.f5292a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) riskWarningController.S.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
