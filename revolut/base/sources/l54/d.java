package l54;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$State;
import com.revolut.feature.credit.card.impl.ui.autopay.flow.setup.CreditCardSetupAutopayFlowContract$State;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wk4.b f192152b;

    public /* synthetic */ d(wk4.b bVar, int i) {
        this.f192151a = i;
        this.f192152b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f192151a) {
            case 0:
                CreditCardApplicationAutopayFlowContract$State update = (CreditCardApplicationAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CreditCardApplicationAutopayFlowContract$State.a(update, null, null, Integer.valueOf(((wk4.c) this.f192152b).f298237a), null, null, null, 59);
            default:
                CreditCardSetupAutopayFlowContract$State.Content updateContent = (CreditCardSetupAutopayFlowContract$State.Content) obj2;
                Intrinsics.checkNotNullParameter(updateContent, "$this$updateContent");
                return CreditCardSetupAutopayFlowContract$State.Content.a(updateContent, null, null, new CreditCardAutopayPayment.PaymentDay(nb5.b.FIXED, ((wk4.c) this.f192152b).f298237a, true), null, null, YearClass.CLASS_2015);
        }
    }
}
