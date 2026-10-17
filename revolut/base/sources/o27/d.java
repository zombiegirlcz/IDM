package o27;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.refund.screen.FreelancerRefundScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FreelancerRefundScreen f221507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f221508b;

    public d(FreelancerRefundScreen freelancerRefundScreen, AmountEditDelegate.Model model) {
        this.f221507a = freelancerRefundScreen;
        this.f221508b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        p pVarR2 = this.f221507a.R2();
        AmountEditDelegate.Model model = this.f221508b;
        nqi.a amountData = new nqi.a(formattedValue, z, model);
        Object obj2 = model.f51629j;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
        xi0.b currency = (xi0.b) obj2;
        com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b bVar = (com.revolut.feature.freelancer.impl.ui.sales.refund.screen.b) pVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        bVar.H2(bVar.z, new neg.q(bVar, 17, amountData, currency));
    }
}
