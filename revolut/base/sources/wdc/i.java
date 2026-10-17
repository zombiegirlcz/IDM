package wdc;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        wdc.a domainState = (wdc.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PayWithAnyFundingOptions payWithAnyFundingOptions = domainState.f296542a;
        aim.e eVarB = u.b();
        int i = 6;
        boolean z = false;
        if (!(payWithAnyFundingOptions.f84365a instanceof CardPaymentAvailability.NotAvailable)) {
            eVarB.add(new RowDelegate.Model("ADD_CARD_OPTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_cards, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_pay_insufficient_funds_widget_action_add_card, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        if (payWithAnyFundingOptions.f84367c) {
            eVarB.add(new RowDelegate.Model("ADD_MONEY_OPTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_pay_insufficient_funds_widget_action_add_money, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        if (payWithAnyFundingOptions.f84366b) {
            eVarB.add(new RowDelegate.Model("MOVE_MONEY_OPTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.revolut_pay_insufficient_funds_widget_action_move_money, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, R$attr.uikit_dp32, R$attr.uikit_dp24, 0, 0, 28);
        return new f(eVarA);
    }
}
