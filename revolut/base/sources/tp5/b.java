package tp5;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import do3.n;
import ec5.g;
import hx7.l;
import ip0.y10;
import java.util.List;
import ko5.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import op5.e;
import org.jetbrains.annotations.NotNull;
import qp5.f;
import te0.w;
import wk5.i;
import xo5.d;
import yhm.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj5.a f273287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io5.b f273288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f273289c;

    public b(uj5.a blockchainUiMapper, e recipientDetailsTitleResolver, io5.b cryptoAddressItemMapper, ic5.a cryptoEntityNameMapper, d fiatFundedWithdrawLegalDisclaimerFooterMapper) {
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(recipientDetailsTitleResolver, "recipientDetailsTitleResolver");
        Intrinsics.checkNotNullParameter(cryptoAddressItemMapper, "cryptoAddressItemMapper");
        Intrinsics.checkNotNullParameter(cryptoEntityNameMapper, "cryptoEntityNameMapper");
        Intrinsics.checkNotNullParameter(fiatFundedWithdrawLegalDisclaimerFooterMapper, "fiatFundedWithdrawLegalDisclaimerFooterMapper");
        this.f273287a = blockchainUiMapper;
        this.f273288b = cryptoAddressItemMapper;
        this.f273289c = j.b(new tl7.a(11));
    }

    public final CompositeClause a() {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_details_price_dialog_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "PRICE_LEARN_MORE_ID", false), 10)));
    }

    public final CompositeClause b(CryptoWithdrawLimits limits) {
        TextLocalisedClause textLocalisedClause;
        Long l2;
        Intrinsics.checkNotNullParameter(limits, "limits");
        limits.getClass();
        if (o.POTENTIAL_FRAUD != limits.e || (l2 = limits.f) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_limits_address_current_subtitle, null, null, 14);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_limits_risk_limit_description, v.l(l2 != null ? oo5.b.b(l2.longValue()) : null), null, 12);
        }
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LIMIT_DIALOG_LEARN_MORE", false), 10)));
    }

    public final List c(CryptoWithdrawLimits limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_limits_dialog_daily_title, null, null, 14), (Image) null, 0, false, 30);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_limits_address_remaining_format, v.k(oo5.b.c(l.t(limits.f71092a, limits.f71093b), false), oo5.b.c(limits.f71092a, false)), null, 12);
        u0 u0Var = u0.LARGE;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LIMIT_DIALOG_DAILY_LIMIT", t0Var, textLocalisedClause, null, null, null, u0Var, 0, null, false, false, null, null, 30456);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_limits_dialog_monthly_title, null, null, 14), (Image) null, 0, false, 30);
        int i = R$string.crypto_withdrawals_screen_limits_address_remaining_format;
        dj0.d dVar = limits.f71094c;
        List listK = v.k(model, new CellDetailsDelegate.Model("LIMIT_DIALOG_MONTHLY_LIMIT", t0Var2, new TextLocalisedClause(i, v.k(oo5.b.c(l.t(dVar, limits.d), false), oo5.b.c(dVar, false)), null, 12), null, null, null, u0Var, 0, null, false, false, null, null, 30456));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final CompositeClause d(CryptoAddress targetAddress, n nVar, CryptoAddressCounterparty cryptoAddressCounterparty, xi0.b sourceCurrency, String companyName, ec5.b cryptoAccount) {
        TextLocalisedClause textLocalisedClause;
        int i;
        char c2;
        char c3;
        Intrinsics.checkNotNullParameter(targetAddress, "targetAddress");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        TextLocalisedClause textLocalisedClause2 = null;
        if ((cryptoAddressCounterparty != null ? cryptoAddressCounterparty.i : null) != wk5.e.SELF_ATTESTATION || nVar == null) {
            textLocalisedClause = null;
        } else {
            CryptoAddressRecipientDetails cryptoAddressRecipientDetails = targetAddress.f71065l;
            TextClause textClause = new TextClause(w.I(nVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            textLocalisedClause = (cryptoAddressRecipientDetails == null || cryptoAddressRecipientDetails.f70985b == i.USER) ? new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_transfer_footer_tfr_disclaimer_my_wallet, u.c(textClause), null, 12) : new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_transfer_footer_tfr_disclaimer_third_wallet, v.k(textClause, new TextClause(cryptoAddressRecipientDetails.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_text, null, null, 14);
        xi0.b bVar = targetAddress.f71060b;
        xi0.b.Companion.getClass();
        TextLocalisedClause textLocalisedClause4 = !Intrinsics.f(bVar, xi0.b.R) ? null : new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_eurr_ext_testing, null, null, 14);
        if (!cp5.d.A(sourceCurrency) || companyName == null || cryptoAccount == null) {
            i = 4;
            c2 = 3;
            c3 = 2;
        } else {
            Intrinsics.checkNotNullParameter(cryptoAccount, "cryptoAccount");
            TextLocalisedClause cryptoEntityName = new TextLocalisedClause(cryptoAccount.f124429a == g.RDAEL ? com.revolut.feature.profile.api.R$string.profile_revolut_x_disclaimer_revolut_digital_assets_europe : com.revolut.feature.profile.api.R$string.profile_revolut_x_disclaimer_revolut_ltd, null, null, 14);
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            Intrinsics.checkNotNullParameter(cryptoEntityName, "cryptoEntityName");
            i = 4;
            c2 = 3;
            c3 = 2;
            textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_fiat_funded_full_text, v.k(cryptoEntityName, new TextClause(companyName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_fiat_funded_personal_terms, null, new Click(30, (Integer) null, (Object) null, "PERSONAL_TERMS_CLICK_ID", false), 10), new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_fiat_funded_cryptocurrency_terms, null, new Click(30, (Integer) null, (Object) null, "CRYPTOCURRENCY_TERMS_CLICK_ID", false), 10)), null, 12);
        }
        Clause[] elements = new Clause[i];
        elements[0] = textLocalisedClause;
        elements[1] = textLocalisedClause3;
        elements[c3] = textLocalisedClause4;
        elements[c2] = textLocalisedClause2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final sa e(CryptoAddress address) {
        Intrinsics.checkNotNullParameter(address, "address");
        xi0.b bVar = address.f71060b;
        xi0.b.Companion.getClass();
        if (!Intrinsics.f(bVar, xi0.b.R)) {
            return null;
        }
        sa saVar = new sa("EURR_CENTRALISED_EXCHANGE_BANNER_ID", (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_eurr_cex_unsupported_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_disclaimer_eurr_cex_unsupported_subtitle, null, null, 14), (List) null, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_exclamation_triangle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4056);
        yp0.b.l(saVar, 0, 0, 0, 0, null, false, 63);
        return saVar;
    }
}
