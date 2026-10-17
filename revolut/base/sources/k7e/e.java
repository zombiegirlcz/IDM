package k7e;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.subaccount.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f182045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f182046x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, f fVar, Continuation continuation) {
        super(3, continuation);
        this.f182045w = fVar;
        this.f182046x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        f fVar = this.f182045w;
        e eVar = new e(this.f182046x, fVar, (Continuation) obj4);
        eVar.v = (FlowCollector) obj2;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String id10 = this.f182046x;
            Intrinsics.checkNotNullParameter(id10, "id");
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(R$string.linked_card_widget_error_message, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
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
