package yu9;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.payments.messaging.data.api.model.DonationItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.messaging.data.api.model.MoneyRequestItem;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.messaging.data.api.model.TransactionItem;
import com.revolut.feature.payments.messaging.data.api.model.TransferLinkItem;
import com.revolut.feature.transfer.core.models.CountryProfile;
import dv9.n;
import gw0.u;
import hk5.a;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import tof.a3;
import tof.p3;
import tof.t5;
import tof.v6;
import tof.y6;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f316922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f316923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final su9.c f316924c;

    public c(l80.e dateProvider, e paymentBubbleTagFactory, su9.c cryptoRemittanceBubbleMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(paymentBubbleTagFactory, "paymentBubbleTagFactory");
        Intrinsics.checkNotNullParameter(cryptoRemittanceBubbleMapper, "cryptoRemittanceBubbleMapper");
        this.f316922a = dateProvider;
        this.f316923b = paymentBubbleTagFactory;
        this.f316924c = cryptoRemittanceBubbleMapper;
    }

    public final u a(P2PChatItem chatItem) {
        int i;
        Object cryptoRemittanceTransaction;
        String str;
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        boolean z = chatItem instanceof MoneyRequestItem;
        e eVar = this.f316923b;
        if (z) {
            MoneyRequestItem moneyRequestItem = (MoneyRequestItem) chatItem;
            CountryProfile countryProfile = moneyRequestItem.i;
            boolean z3 = moneyRequestItem.f79566j;
            MoneyRequest moneyRequest = moneyRequestItem.f79564g;
            if (z3) {
                return eVar.b(R$drawable.uikit_icn_16_canceled, R$string.chat_bubble_tag_transaction_cancelled_facelifted, countryProfile);
            }
            int i2 = b.f316921a[moneyRequestItem.f79563c.ordinal()];
            if (i2 == 1) {
                String str2 = moneyRequest.o;
                return (str2 == null || str2.length() == 0) ? eVar.b(R$drawable.uikit_icn_24_coins, R$string.bubble_tag_money_request_you_requested, countryProfile) : eVar.b(R$drawable.uikit_icn_24_split, R$string.bubble_tag_spliit_bill_you_split, countryProfile);
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = moneyRequest.o;
            MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60320l;
            if (str3 == null || str3.length() == 0) {
                int i3 = R$drawable.uikit_icn_24_coins;
                int i5 = R$string.bubble_tag_money_request_party_requested;
                String strE = com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty);
                return e.c(eVar, i3, new TextLocalisedClause(i5, zhm.u.c(new TextClause(strE == null ? "" : strE, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), countryProfile, 8);
            }
            int i6 = R$drawable.uikit_icn_24_split;
            int i21 = R$string.bubble_tag_spliit_bill_party_split;
            String strE2 = com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty);
            return e.c(eVar, i6, new TextLocalisedClause(i21, zhm.u.c(new TextClause(strE2 == null ? "" : strE2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), countryProfile, 8);
        }
        if (!(chatItem instanceof TransactionItem)) {
            if (chatItem instanceof TransferLinkItem) {
                TransferLinkItem transferLinkItem = (TransferLinkItem) chatItem;
                boolean z4 = transferLinkItem.f79583j;
                CountryProfile countryProfile2 = transferLinkItem.i;
                if (z4) {
                    return eVar.b(R$drawable.uikit_icn_16_canceled, R$string.chat_bubble_tag_transaction_cancelled_facelifted, countryProfile2);
                }
                int i22 = b.f316921a[transferLinkItem.f79580c.ordinal()];
                if (i22 == 1) {
                    return eVar.b(R$drawable.uikit_icn_24_arrow_send, R$string.chat_bubble_tag_sent, countryProfile2);
                }
                if (i22 == 2) {
                    return eVar.b(R$drawable.uikit_icn_24_arrow_request, R$string.chat_bubble_tag_received, countryProfile2);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(chatItem instanceof MessageItem)) {
                if (chatItem instanceof DonationItem) {
                    return eVar.b(R$drawable.uikit_icn_24_heart, R$string.chat_bubble_tag_donated, ((DonationItem) chatItem).e);
                }
                throw new NoWhenBranchMatchedException();
            }
            MessageItem messageItem = (MessageItem) chatItem;
            if (!(messageItem.f79535h instanceof MessageType.SalaryReferral)) {
                return null;
            }
            int i32 = b.f316921a[messageItem.f79533c.ordinal()];
            if (i32 == 1) {
                i = R$string.chat_bubble_tag_salary_referral_sent;
            } else {
                if (i32 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.chat_bubble_tag_salary_referral_invited;
            }
            return e.c(eVar, R$drawable.uikit_icn_24_envelope, new TextLocalisedClause(i, null, null, 14), null, 4);
        }
        TransactionItem transactionItem = (TransactionItem) chatItem;
        CountryProfile countryProfile3 = transactionItem.f79577h;
        a3 transaction = transactionItem.f79576g;
        n nVar = transactionItem.f79575c;
        su9.c cVar = this.f316924c;
        e eVar2 = (e) cVar.f265693a;
        sj5.a aVar = (sj5.a) cVar.f265694b;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        boolean z6 = transaction.e == y6.CRYPTO_WITHDRAWAL;
        v6 v6Var = transaction.f;
        String str4 = transaction.f272611s;
        if (z6) {
            cryptoRemittanceTransaction = new su9.b(transaction);
        } else {
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            a.C0878a c0878a = hk5.a.Companion;
            cryptoRemittanceTransaction = (k.y0(transaction) ? transaction.W : null) != null ? new su9.a(transaction) : null;
        }
        if (v6Var == v6.CANCELLED) {
            return eVar.b(R$drawable.uikit_icn_16_canceled, R$string.chat_bubble_tag_transaction_cancelled_facelifted, countryProfile3);
        }
        if (v6Var == v6.DECLINED) {
            t5 t5Var = transaction.X;
            return (t5Var == null || (str = t5Var.f273087a) == null || str.length() <= 0 || nVar != n.INCOMING) ? eVar.a(R$drawable.uikit_icn_16_canceled, R$string.chat_bubble_tag_transaction_declined_facelfited, countryProfile3) : eVar.a(R$drawable.uikit_icn_16_cross, R$string.chat_bubble_tag_rejected_facelifted, countryProfile3);
        }
        v6 v6Var2 = v6.FAILED;
        if (v6Var == v6Var2) {
            return eVar.a(R$drawable.uikit_icn_16_cross, R$string.chat_bubble_tag_transaction_failed_facelifted, countryProfile3);
        }
        if (k.o(transaction)) {
            return eVar.e(R$drawable.uikit_icn_24_bell, R$string.chat_bubble_tag_transaction_confirmation_required_facelifted, countryProfile3);
        }
        if (k.d0(transaction)) {
            return eVar.e(R$drawable.uikit_icn_24_bell, R$string.chat_bubble_tag_transaction_security_delay_required, countryProfile3);
        }
        if (Intrinsics.f(str4, "suspicious_transaction_counterparty_action_required")) {
            return eVar.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_transaction_counterparty_action_required_facelifted, countryProfile3);
        }
        if (Intrinsics.f(str4, "suspicious_transaction_pending_confirmation")) {
            return eVar.b(R$drawable.uikit_icn_24_exclamation_triangle, R$string.chat_bubble_tag_transaction_pending_confirmation_facelifted, countryProfile3);
        }
        if (Intrinsics.f(str4, "suspicious_transaction_pending_review")) {
            return eVar.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_transaction_suspicious_transaction_pending_review_facelifted, countryProfile3);
        }
        if (Intrinsics.f(str4, "suspicious_transaction_no_user_action_required")) {
            return eVar.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_transaction_suspicious_transaction_pending_facelifted, countryProfile3);
        }
        if (k.Q0(transaction)) {
            return eVar.b(R$drawable.uikit_icn_24_arrow_request, R$string.chat_bubble_tag_you_withdrew_facelifted, countryProfile3);
        }
        if (cryptoRemittanceTransaction == null) {
            if (nVar == n.INCOMING) {
                return eVar.b(R$drawable.uikit_icn_24_arrow_request, R$string.chat_bubble_tag_received, countryProfile3);
            }
            if (v6Var != v6.PENDING || !k.k0(transaction)) {
                return eVar.b(R$drawable.uikit_icn_24_arrow_send, R$string.chat_bubble_tag_sent, countryProfile3);
            }
            LocalDate localDate = transaction.X0;
            return e.c(eVar, R$drawable.uikit_icn_24_arrow_send, (localDate == null || localDate.compareTo((ChronoLocalDate) ((f) this.f316922a).e()) < 0) ? new TextLocalisedClause(R$string.chat_bubble_tag_in_progress_facelifted, null, null, 14) : new TextLocalisedClause(R$string.chat_bubble_tag_edt_in_progress_facelifted, zhm.u.c(new TimeClause(ebm.a.P(localDate), TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12)), null, 12), countryProfile3, 8);
        }
        Intrinsics.checkNotNullParameter(cryptoRemittanceTransaction, "cryptoRemittanceTransaction");
        if (cryptoRemittanceTransaction instanceof su9.b) {
            a3 a3Var = ((su9.b) cryptoRemittanceTransaction).f265692a;
            if (hk5.c.a(a3Var)) {
                return eVar2.e(R$drawable.uikit_icn_24_bell, R$string.chat_bubble_tag_transaction_action_required_facelifted, countryProfile3);
            }
            v6 v6Var3 = a3Var.f;
            return v6Var3 == v6.PENDING ? eVar2.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_in_progress_facelifted, countryProfile3) : v6Var3 == v6.COMPLETED ? eVar2.b(R$drawable.uikit_icn_24_arrow_send, R$string.chat_bubble_tag_sent, countryProfile3) : eVar2.a(R$drawable.uikit_icn_16_cross, R$string.chat_bubble_tag_transaction_failed_facelifted, countryProfile3);
        }
        if (!(cryptoRemittanceTransaction instanceof su9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        a3 transaction2 = ((su9.a) cryptoRemittanceTransaction).f265691a;
        p3 p3Var = transaction2.W;
        v6 v6Var4 = transaction2.f;
        if (((hk5.a) aVar).a(transaction2, p3Var != null ? p3Var.f : null)) {
            return eVar2.e(R$drawable.uikit_icn_24_bell, R$string.chat_bubble_tag_transaction_action_required_facelifted, countryProfile3);
        }
        if (v6Var4 == v6.PENDING) {
            return eVar2.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_in_progress_facelifted, countryProfile3);
        }
        if (v6Var4 == v6Var2) {
            return eVar2.a(R$drawable.uikit_icn_16_cross, R$string.chat_bubble_tag_transaction_failed_facelifted, countryProfile3);
        }
        Intrinsics.checkNotNullParameter(transaction2, "transaction");
        v6 v6Var5 = v6.REVERTED;
        if (v6Var4 == v6Var5) {
            p3 p3Var2 = k.y0(transaction2) ? p3Var : null;
            if ((p3Var2 != null ? p3Var2.e : null) == yk5.e.RETURNING) {
                return eVar2.b(R$drawable.uikit_icn_24_time, R$string.chat_bubble_tag_transaction_return_in_progress_facelifted, countryProfile3);
            }
        }
        Intrinsics.checkNotNullParameter(transaction2, "transaction");
        if (v6Var4 == v6Var5) {
            if (!k.y0(transaction2)) {
                p3Var = null;
            }
            if ((p3Var != null ? p3Var.e : null) == yk5.e.RETURNED) {
                return eVar2.b(R$drawable.uikit_icn_24_revert_left, R$string.chat_bubble_tag_transaction_returned_facelifted, countryProfile3);
            }
        }
        return eVar2.b(R$drawable.uikit_icn_24_arrow_request, R$string.chat_bubble_tag_received, countryProfile3);
    }
}
