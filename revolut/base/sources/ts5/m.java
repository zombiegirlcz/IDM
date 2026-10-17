package ts5;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f273975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f273976x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f273975w = nVar;
        this.f273976x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        m mVar = new m(this.f273975w, this.f273976x, (Continuation) obj4);
        mVar.v = (FlowCollector) obj2;
        return mVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(this.f273976x, null, new TextLocalisedClause(R$string.crypto_home_widget_features_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_feed_widget_common_error_action, null, null, 14), q.LARGE, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
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
