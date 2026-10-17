package vp4;

import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import org.jetbrains.annotations.NotNull;
import rp0.m;
import rp0.y;
import xi0.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    public static final C1613a Companion = new C1613a();

    /* JADX INFO: renamed from: vp4.a$a, reason: collision with other inner class name */
    public static final class C1613a {
        private C1613a() {
        }
    }

    public final y a(String facilityId, String paymentId, String str, b currency) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(paymentId, "paymentId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return dy4.b.a(m.Companion, str == null ? new TextLocalisedClause(R$string.credit_card_autopay_direct_debit_dialog_fail_title_common, null, null, 14) : new TextLocalisedClause(R$string.credit_card_autopay_direct_debit_dialog_fail_title, u.c(str), null, 12), new TextLocalisedClause(R$string.credit_card_autopay_direct_debit_dialog_fail_description, u.c(new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, null, 4)), null, 12), new p("id_credit_card_autopay_dialog_set_up", new TextLocalisedClause(R$string.credit_card_autopay_direct_debit_dialog_fail_action_setup, null, null, 14), new bl4.b(facilityId)), new p("id_credit_card_autopay_dialog_account_details", new TextLocalisedClause(R$string.credit_card_autopay_direct_debit_dialog_fail_action_account_details, null, null, 14), new bl4.a(facilityId, paymentId)), null, Constants.TAG_E4_CUSTOMER_DATA);
    }
}
