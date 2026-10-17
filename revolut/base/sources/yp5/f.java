package yp5;

import aw0.o9;
import bw0.h;
import bw0.l;
import bw0.m;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewContract$BlockchainWithFee;
import com.revolut.revolut.feature_fourthline_impl.R;
import eq5.n;
import eq5.p;
import ip0.s7;
import ip0.zj;
import ix0.d0;
import java.util.ArrayList;
import java.util.List;
import koi.j;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import u80.o;
import wp5.g;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp5.a f315790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io5.b f315791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uj5.a f315792c;

    public f(o moneyPrefixFormatter, mp5.a blockchainDialogProvider, op5.c recipientDetailsDialogProvider, io5.b cryptoAddressItemMapper, uj5.a blockchainUiMapper) {
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(blockchainDialogProvider, "blockchainDialogProvider");
        Intrinsics.checkNotNullParameter(recipientDetailsDialogProvider, "recipientDetailsDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoAddressItemMapper, "cryptoAddressItemMapper");
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        this.f315790a = blockchainDialogProvider;
        this.f315791b = cryptoAddressItemMapper;
        this.f315792c = blockchainUiMapper;
    }

    public static boolean l(p pVar) {
        if (!(pVar instanceof n)) {
            return false;
        }
        wp5.b bVar = ((n) pVar).f128293a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar == wp5.b.MonthlyLimitExceeded || bVar == wp5.b.DailyLimitExceeded || bVar == wp5.b.MonthlyAddressLimitExceeded || bVar == wp5.b.DailyAddressLimitExceeded;
    }

    public final TextLocalisedClause a(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        CurrencyClause currencyClauseA = d0.a(currency, null);
        return new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_activate_pocket_subtitle, v.k(currencyClauseA, currencyClauseA), null, 12);
    }

    public final List b(wk5.a aVar) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_overview_list_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        j[] elements = {model, aVar != null ? k(aVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final List c() {
        Boolean bool = Boolean.TRUE;
        m70.a.t(t0.f186434a);
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("AMOUNT_INPUT_LOADING_ITEM_LIST_ID", null, new h("", null, null, true, null, bool, false, true, null, null, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28374), null, new m(null, l.LOADING, null, false, null, 24), null, null, false, false, null, null, 1898);
        s7 s7Var = new s7("NETWORK_PICKER_CELL_DETAILS_LIST_ID", 0, 0, 0, 0, false, null, 126);
        yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
        j[] elements = {model, s7Var};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final CompositeClause d() {
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_withdrawals_change_network_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "SELECT_NETWORK_LEARN_MORE_ID", false), 10)));
    }

    public final ArrayList e(List blockchains, wk5.a selectedBlockchain) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(selectedBlockchain, "selectedBlockchain");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        List<CryptoWithdrawToAddressReviewContract$BlockchainWithFee> list = blockchains;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (CryptoWithdrawToAddressReviewContract$BlockchainWithFee cryptoWithdrawToAddressReviewContract$BlockchainWithFee : list) {
            wk5.a aVar = cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71180a;
            boolean z = aVar == selectedBlockchain;
            FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown = cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71181b;
            AccentCircleBadge accentCircleBadge = null;
            FiatCryptoMoney fiatCryptoMoney = fiatCryptoFeesBreakdown != null ? fiatCryptoFeesBreakdown.e : null;
            if (fiatCryptoMoney == null || fiatCryptoMoney.f71113b.f115082a <= 0) {
                textLocalisedClause = null;
            } else {
                dj0.d dVar = fiatCryptoMoney.f71112a;
                Pair pair = dVar.f115082a != 0 ? new Pair(dVar, Integer.valueOf(R$string.crypto_withdrawals_screen_blockchain_fee_v2_value)) : new Pair(dj0.d.c(dVar, 1L, null, 2), Integer.valueOf(R$string.crypto_withdrawals_screen_blockchain_fee_v2_zero_value));
                dj0.d dVar2 = (dj0.d) pair.f186385a;
                textLocalisedClause = new TextLocalisedClause(((Number) pair.f186386b).intValue(), u.c(cp5.d.A(dVar2.f115083b) ? u5l.a.d(pyd.c.Y(dVar2), dVar2.f115083b, null, null, null, 30) : u5l.a.b(dVar2, null, null, null, 15)), null, 12);
            }
            String strQ = j6.a.q("SELECT_NETWORK_ITEM_ID", aVar.name());
            wk5.a aVar2 = cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71180a;
            uj5.a aVar3 = this.f315792c;
            Clause clauseB = ((ik5.a) aVar3).b(aVar2, false, null);
            GlyphImage glyphImage = new GlyphImage(((ik5.a) aVar3).c(aVar), null, null, 6);
            if (z) {
                accentCircleBadge = new AccentCircleBadge(dw0.a.Checked);
            }
            arrayList.add(new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(glyphImage, accentCircleBadge, null, false, null, false, 60), clauseB, null, 0, textLocalisedClause, null, null, 0, null, false, null, z, null, null, null, null, null, null, cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71180a, null, 0, 0, 0, 0, 532668376));
        }
        return arrayList;
    }

    public final CompositeClause f() {
        List listK = v.k(new TextLocalisedClause(R$string.crypto_withdrawals_dialog_regulatory_exceed_limit_description, null, null, 14), new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_overview_dialog_address_limt_reached_button_title, null, new Click(30, (Integer) null, (Object) null, "ONE_THOUSAND_EURO_LIMIT_LEARN_MORE_ID", false), 10));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public final Image g(CryptoAddress cryptoAddress, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        return z ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10) : new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, CryptoAddress.e(cryptoAddress, 0, 3).a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0286  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v2, types: [bw0.m] */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h(xi0.b r42, nqi.c r43, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney r44, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney r45, eq5.p r46, com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r47, com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits r48, od0.i r49, boolean r50, boolean r51, wk5.a r52, com.revolut.feature.payments.api.mapper.PaymentPocketInfo r53) {
        /*
            Method dump skipped, instruction units count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yp5.f.h(xi0.b, nqi.c, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney, com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney, eq5.p, com.revolut.feature.crypto.withdraw.api.models.CryptoAddress, com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits, od0.i, boolean, boolean, wk5.a, com.revolut.feature.payments.api.mapper.PaymentPocketInfo):java.util.List");
    }

    public final TextClause i(CryptoAddress cryptoAddress) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        String str = CryptoAddress.e(cryptoAddress, 0, 3).f186224b;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    public final TextClause j(CryptoAddress address, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        return z ? new TextClause(address.z(6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(CryptoAddress.e(address, 0, 3).f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final CellDetailsDelegate.Model k(wk5.a aVar) {
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("NETWORK_PICKER_CELL_DETAILS_LIST_ID", new TextLocalisedClause(R$string.crypto_withdrawals_network_title, null, null, 14), ((ik5.a) this.f315792c).b(aVar, true, Integer.valueOf(R$attr.uikit_colorAccent)), null, null, false, 0, null, null, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true, null, 0, 0, 0, 0, 1023976);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
