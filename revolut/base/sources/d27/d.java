package d27;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OrderInitPageCreateScreen f110737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f110738b;

    public d(OrderInitPageCreateScreen orderInitPageCreateScreen, AmountEditDelegate.Model model) {
        this.f110737a = orderInitPageCreateScreen;
        this.f110738b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        z zVarD = this.f110737a.d();
        AmountEditDelegate.Model model = this.f110738b;
        nqi.a amountData = new nqi.a(formattedValue, z, model);
        Object obj2 = model.f51629j;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.model.currency.Currency");
        xi0.b currency = (xi0.b) obj2;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(currency, "currency");
        aVar.H2(aVar.E, new g0(aVar, 0, amountData, currency));
    }
}
