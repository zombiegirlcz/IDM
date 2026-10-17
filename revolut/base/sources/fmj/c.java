package fmj;

import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentMethod.Pocket f136461b;

    public /* synthetic */ c(Object obj2, PaymentMethod.Pocket pocket, int i) {
        this.f136460a = i;
        this.f136461b = pocket;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f136460a) {
            case 0:
                EsimCheckoutPrice checkoutPrice = (EsimCheckoutPrice) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
                return new CellDetailsDelegate.Model("ID_EXCHANGE_AMOUNT_ITEM", new t0((Clause) new TextLocalisedClause(R$string.esim_checkout_summary_exchanged_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(checkoutPrice.f100197b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, new EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData(this.f136461b.f84379g, checkoutPrice), null, null, 0, null, false, false, null, null, 32696);
            default:
                EsimCheckoutPrice checkoutPrice2 = (EsimCheckoutPrice) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(checkoutPrice2, "checkoutPrice");
                return new CellDetailsDelegate.Model("ID_EXCHANGE_AMOUNT_ITEM", new t0((Clause) new TextLocalisedClause(R$string.esim_checkout_summary_exchanged_amount, null, null, 14), (Image) new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), new MoneyClause(checkoutPrice2.f100197b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, new EsimMobilePlanCheckoutScreenContract$ExchangeBreakdownData(this.f136461b.f84379g, checkoutPrice2), null, null, 0, null, false, false, null, null, 32696);
        }
    }
}
