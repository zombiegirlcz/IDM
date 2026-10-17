package nj5;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto.receive_widget.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import op0.q;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f216373w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f216374x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, String str, Continuation continuation) {
        super(3, continuation);
        this.f216373w = hVar;
        this.f216374x = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        g gVar = new g(this.f216373w, this.f216374x, (Continuation) obj4);
        gVar.v = (FlowCollector) obj2;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowCollector flowCollector = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            ErrorWidgetDelegate.Model model = new ErrorWidgetDelegate.Model(this.f216374x, null, new TextLocalisedClause(R$string.crypto_home_feed_widget_receive_error_title, null, null, 14), new TextLocalisedClause(R$string.crypto_home_feed_widget_receive_error_action, null, null, 14), q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
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
