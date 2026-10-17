package t73;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.enter_email.VerifyEmailScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreen;
import com.revolut.feature.subscriptions.impl.block_future_payments.screen.BlockFuturePaymentsScreen;
import com.revolut.feature.transaction_list.impl.ui.list.screen.filter.TransactionsFilterScreen;
import com.revolut.retail.common.ui.R$string;
import ip0.pb0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kotlinx.serialization.json.Json;
import tck.g;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268470a;

    public /* synthetic */ h(int i) {
        this.f268470a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f268470a) {
            case 0:
                CardsCarouselScreen.a aVar = CardsCarouselScreen.Companion;
                return new ActionWidgetDelegate();
            case 1:
                CardsCarouselScreen.a aVar2 = CardsCarouselScreen.Companion;
                return new BannerDelegate();
            case 2:
                CardsCarouselScreen.a aVar3 = CardsCarouselScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 3:
                CardsCarouselScreen.a aVar4 = CardsCarouselScreen.Companion;
                return new TextDelegate();
            case 4:
                CardsCarouselScreen.a aVar5 = CardsCarouselScreen.Companion;
                return new ListCellDelegate();
            case 5:
                CardsCarouselScreen.a aVar6 = CardsCarouselScreen.Companion;
                return new TwinHorizontalButtonDelegate();
            case 6:
                CardsCarouselScreen.a aVar7 = CardsCarouselScreen.Companion;
                return new LargeActionButtonDelegate();
            case 7:
                return Unit.f186387a;
            case 8:
                return new qlm.e(t7g.p.f268685a);
            case 9:
                return new qlm.e(t7g.j.f268678a);
            case 10:
                return qlm.j1.a("com.revolut.feature.wealth.impl.data.network.margin_borrowing.dto.WealthMarginBorrowingLimitUnavailableReasonDto", t7h.f.values(), new String[]{"KILLSWITCH", "NON_MARGINABLE_INSTRUMENT"}, new Annotation[][]{null, null});
            case 11:
                return t7h.k.Companion.serializer();
            case 12:
                return qlm.j1.a("com.revolut.feature.wealth.impl.data.network.margin_borrowing.dto.WealthMarginBorrowingStatusTypeDto", t7h.k.values(), new String[]{"GOOD", "MARGIN_CALL", "FINAL_CALL", "LIQUIDATION", null}, new Annotation[][]{null, null, null, null, null});
            case 13:
                return t7h.f.Companion.serializer();
            case 14:
                return t7h.f.Companion.serializer();
            case 15:
                return new Regex("[0-9A-Z]+[a-z]*");
            case 16:
                return zhm.r0.k(new Pair("Amex", "payment_scheme_amex"), new Pair("AmexPay", "ICON_SIZE_PREFIX_PLACEHOLDER_amexpay"), new Pair("BottomMenu", "ICON_SIZE_PREFIX_PLACEHOLDER_bottom_tab"), new Pair("ClickUp", "ICON_SIZE_PREFIX_PLACEHOLDER_clickup"), new Pair("DoXGetY", "ICON_SIZE_PREFIX_PLACEHOLDER_doxgety"), new Pair("GooglePayReduced", "payment_scheme_google_pay_reduced"), new Pair("HiBob", "ICON_SIZE_PREFIX_PLACEHOLDER_hibob"), new Pair("JackOLantern", "ICON_SIZE_PREFIX_PLACEHOLDER_jack_o_lantern"), new Pair("Jcb", "ICON_SIZE_PREFIX_PLACEHOLDER_logo_jcb"), new Pair("LogoLinkedIn", "ICON_SIZE_PREFIX_PLACEHOLDER_logo_linkedin"), new Pair("LogoRevolutNew", "ICON_SIZE_PREFIX_PLACEHOLDER_logo_revolut"), new Pair("LogoTikTok", "ICON_SIZE_PREFIX_PLACEHOLDER_logo_tiktok"), new Pair("LogoWhatsApp", "ICON_SIZE_PREFIX_PLACEHOLDER_logo_whatsapp"), new Pair("Mastercard", "payment_scheme_mastercard"), new Pair("PnL", "ICON_SIZE_PREFIX_PLACEHOLDER_pnl"), new Pair("RevolutDark", "payment_scheme_revolut_dark"), new Pair("RevolutLight", "payment_scheme_revolut_light"), new Pair("RevolutPayDark", "payment_scheme_revolut_pay_dark"), new Pair("RevolutPayLight", "payment_scheme_revolut_pay_light"), new Pair("RPoint", "ICON_SIZE_PREFIX_PLACEHOLDER_r_point"), new Pair("RevPoints", "ICON_SIZE_PREFIX_PLACEHOLDER_revpoints"), new Pair("Visa", "payment_scheme_visa"));
            case 17:
                KProperty[] kPropertyArr = BlockFuturePaymentsScreen.f89179d0;
                return new LargeActionButtonDelegate();
            case 18:
                KProperty[] kPropertyArr2 = VerifyEmailScreen.R;
                return new InputTextDelegate(null);
            case 19:
                KProperty[] kPropertyArr3 = MyAliasesScreen.R;
                return new RowDelegate(null, null, 7);
            case 20:
                ArrayList arrayList = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    arrayList.add(new pb0(a0.d.n("NEW_INVESTMENT_LOADING_PREFIX_LIST_ID_", i)));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 21:
                Lazy lazy = tbf.a.f269523a;
                kg.p pVarA = ged.a.a();
                he0.m mVar = new he0.m("type", qbf.p.class, false, true);
                mVar.c(qbf.a.class, qbf.q.TRADE.getId());
                mVar.c(qbf.u.class, "FALLBACK_SUBTYPE_LABEL");
                pVarA.e.add(mVar);
                return pVarA.b();
            case 22:
                return new nii.z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            case 23:
                g.c.Companion bVar = g.c.INSTANCE;
                return new qlm.e(tck.h.f269870a);
            case 24:
                return new qlm.e(qlm.v1.f247718a);
            case 25:
                KProperty[] kPropertyArr4 = UpiIntentPaymentReviewScreen.S;
                return new CellDetailsDelegate();
            case 26:
                KProperty[] kPropertyArr5 = UpiIntentPaymentReviewScreen.S;
                return new LargeActionButtonDelegate();
            case 27:
                Lazy lazy2 = tf5.c.f270226a;
                return ue0.e.b(Json.d, new tcg.a0(26));
            case 28:
                KProperty[] kPropertyArr6 = TransactionsFilterScreen.R;
                return new ListSubheaderDelegate();
            default:
                KProperty[] kPropertyArr7 = TransactionsFilterScreen.R;
                return new InputChecklistDelegate();
        }
    }
}
