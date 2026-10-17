package z28;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f319023w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f319024x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f319023w = qVar;
        this.f319024x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        p pVar = new p(this.f319023w, this.f319024x, (Continuation) obj4);
        pVar.v = (FlowCollector) obj2;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            String id10 = this.f319024x;
            Intrinsics.checkNotNullParameter(id10, "id");
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(R$string.wealth_invest_widget_products_error_title, null, null, 14), new TextLocalisedClause(R$string.wealth_invest_widget_common_error_action, null, null, 14), op0.q.DYNAMIC, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(model, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
