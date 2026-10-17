package vbc;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f287492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f287493x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f287492w = eVar;
        this.f287493x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f287492w, this.f287493x, (Continuation) obj4);
        dVar.v = (FlowCollector) obj2;
        return dVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String widgetId = this.f287493x;
            Intrinsics.checkNotNullParameter(widgetId, "widgetId");
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(widgetId, null, new TextLocalisedClause(R$string.revolut_pay_home_widget_order_tracking_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_home_widget_order_tracking_error_retry, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            this.v = null;
            this.u = 1;
            if (flowCollector.emit(model, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
