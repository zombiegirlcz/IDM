package l54;

import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.AutopayFlowContract$State;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ek4.c f192150b;

    public /* synthetic */ c(ek4.c cVar, int i) {
        this.f192149a = i;
        this.f192150b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192149a) {
            case 0:
                CreditCardApplicationAutopayFlowContract$State update = (CreditCardApplicationAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CreditCardApplicationAutopayFlowContract$State.a(update, null, null, null, null, ((ek4.b) this.f192150b).f126955a, null, 47);
            default:
                AutopayFlowContract$State update2 = (AutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AccountDetails.LinkedAccount linkedAccount = ((ek4.b) this.f192150b).f126955a;
                update2.getClass();
                return new AutopayFlowContract$State(linkedAccount);
        }
    }
}
