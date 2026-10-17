package r9c;

import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final odc.p f252561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevolutPaySummaryScreenContract$InputData f252562b;

    public d(odc.p checkoutButtonMapper, RevolutPaySummaryScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(checkoutButtonMapper, "checkoutButtonMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f252561a = checkoutButtonMapper;
        this.f252562b = inputData;
    }

    public static s6c.g b(s6c.l lVar) {
        s6c.i iVar = lVar instanceof s6c.i ? (s6c.i) lVar : null;
        if (iVar == null) {
            return null;
        }
        dj0.d dVar = iVar.f260222a;
        PayLaterOffer payLaterOffer = iVar.f260226h;
        return payLaterOffer == null ? new s6c.f(dVar) : payLaterOffer.f84355c ? new s6c.f(payLaterOffer.a()) : new s6c.e(dVar);
    }

    public final TextLocalisedClause a(do3.n nVar, PaymentMethod paymentMethod) {
        if (this.f252562b.getF84527h() != null) {
            int i = R$string.revolut_pay_order_summary_tips_ramp_disclaimer_title;
            int i2 = R$string.revolut_pay_order_summary_tips_ramp_disclaimer_terms_link;
            Intrinsics.checkNotNullParameter("https://www.revolut.com/legal/revramp/", "url");
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) new x6c.a("https://www.revolut.com/legal/revramp/"), "ID_RAMP_TERMS_AND_CONDITIONS_LINK", false), 10);
            int i3 = R$string.revolut_pay_order_summary_tips_ramp_disclaimer_privacy_notice_link;
            Intrinsics.checkNotNullParameter("https://www.revolut.com/legal/revramp-privacy-notice/", "url");
            return new TextLocalisedClause(i, v.k(textLocalisedClause, new TextLocalisedClause(i3, null, new Click(28, (Integer) null, (Object) new x6c.a("https://www.revolut.com/legal/revramp-privacy-notice/"), "ID_RAMP_PRIVACY_NOTES_LINK", false), 10)), null, 12);
        }
        wi0.b.Companion.getClass();
        if (!w.S(nVar, wi0.b.t2)) {
            if (w.S(nVar, wi0.b.f297756l) && (paymentMethod instanceof PaymentMethod.Card)) {
                return new TextLocalisedClause(R$string.revolut_pay_order_summary_disclaimer_surcharge_fees, null, null, 14);
            }
            return null;
        }
        int i5 = R$string.revolut_pay_order_summary_disclaimer_buyer_protection;
        int i6 = R$string.revolut_pay_order_summary_disclaimer_buyer_protection_link;
        int i21 = R$attr.uikit_colorAccent;
        Intrinsics.checkNotNullParameter("https://www.revolut.com/legal/buyer-protection-policy/", "url");
        return new TextLocalisedClause(i5, u.c(new TextLocalisedClause(i6, null, new Click(12, Integer.valueOf(i21), (Object) new x6c.a("https://www.revolut.com/legal/buyer-protection-policy/"), "BUYER_PROTECTION_DISCLAIMER_ID", false), 10)), null, 12);
    }
}
