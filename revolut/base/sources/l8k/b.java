package l8k;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksBridgeFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import com.revolut.retail.feature.payments.payment_links.impl.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request.PaymentLinksRequestSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PaymentLinksRequestSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PaymentLinksRequestSelectionScreen paymentLinksRequestSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = paymentLinksRequestSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PaymentLinksRequestSelectionScreen paymentLinksRequestSelectionScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                paymentLinksRequestSelectionScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) paymentLinksRequestSelectionScreen.f102233a0.getValue();
                tqi.g gVar = iVar.f193008q;
                String string = iVar.f193010s.b(new TextLocalisedClause(R$string.payments_payment_link_share_title, null, null, 14)).toString();
                e eVar = (e) ((d) iVar.t2()).f193002a.getContent();
                String str = eVar != null ? eVar.f193004b : null;
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iVar.C1(u0.b(gVar.f(0, string, str)));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) paymentLinksRequestSelectionScreen.f102233a0.getValue();
                iVar2.getClass();
                iVar2.C1(u0.b(new FeatureCommand(new PaymentLinksBridgeFeatureConfig(new PaymentLinksFeatureInputData(hrf.f.INCOMING)))));
                return Unit.f186387a;
        }
    }
}
