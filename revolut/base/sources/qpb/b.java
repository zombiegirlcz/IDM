package qpb;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Throwable f248327w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f248328x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f248329y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f248328x = cVar;
        this.f248329y = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f248328x, this.f248329y, (Continuation) obj4);
        bVar.v = (FlowCollector) obj2;
        bVar.f248327w = (Throwable) obj3;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        FlowCollector flowCollector = this.v;
        Throwable th10 = this.f248327w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            if (th10 instanceof WidgetNotAvailableException) {
                throw th10;
            }
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(this.f248329y, null, new TextLocalisedClause(R$string.savings_widget_automations_error_message, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            this.v = null;
            this.f248327w = null;
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
