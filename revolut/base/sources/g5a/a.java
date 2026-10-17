package g5a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import com.revolut.domain.models.moneyrequest.MoneyRequestDirection;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import oq9.b0;
import oq9.c0;
import tof.a3;
import tof.o3;
import tof.t5;
import tof.v6;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e3a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f140697a;

    public a(c subtitleMapper) {
        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
        this.f140697a = subtitleMapper;
    }

    public final Clause a(jq9.k recipient, e3a.a aVar, n38.a aVar2) {
        dj0.d dVar;
        Clause clauseC;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        jq9.b bVarC = recipient.c();
        if (bVarC instanceof jq9.f) {
            MessageItem messageItem = ((jq9.f) bVarC).f177500a;
            boolean z = messageItem.f79534g;
            dv9.n nVar = messageItem.f79533c;
            c cVar = this.f140697a;
            if (!z) {
                return nVar == dv9.n.OUTGOING ? c.c(messageItem) : cVar.b(messageItem);
            }
            int i = b.f140698a[nVar.ordinal()];
            if (i == 1) {
                clauseC = c.c(messageItem);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                clauseC = cVar.b(messageItem);
            }
            if (clauseC == null) {
                return null;
            }
            return c.f(clauseC, messageItem.e.f79530b, nVar == dv9.n.OUTGOING);
        }
        if (bVarC instanceof jq9.g) {
            MoneyRequest moneyRequest = ((jq9.g) bVarC).f177501a;
            MoneyRequestDirection moneyRequestDirection = moneyRequest.f60322n;
            MoneyRequestCounterParty moneyRequestCounterParty = moneyRequest.f60320l;
            dj0.d dVar2 = moneyRequest.d;
            boolean z3 = moneyRequestDirection == MoneyRequestDirection.INCOMING;
            String str = moneyRequest.o;
            if (str == null || str.length() == 0) {
                return z3 ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_requested_facelifted, zhm.u.c(c.e(dVar2.a())), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_requested_facelifted, zhm.u.c(c.e(dVar2.a())), null, 12);
            }
            if (z3) {
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_split_facelifted, null, null, 14);
            }
            if (!moneyRequest.j(aVar != null ? aVar.f122245a : null, aVar2 != null ? aVar2.f211923a : null)) {
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_split_facelifted, null, null, 14);
            }
            int i2 = R$string.payments_chat_home_subtitle_someone_split_facelifted;
            String strE = com.revolut.domain.models.moneyrequest.a.e(moneyRequestCounterParty);
            if (strE == null) {
                strE = com.revolut.domain.models.moneyrequest.a.c(moneyRequestCounterParty);
            }
            return new TextLocalisedClause(i2, zhm.u.c(strE), null, 12);
        }
        if (bVarC instanceof jq9.i) {
            TransferLinkDetails.Active active = ((jq9.i) bVarC).f177503a;
            if (active == null) {
                throw new NoWhenBranchMatchedException();
            }
            dj0.d dVar3 = active.k;
            int i3 = b.f140699b[active.f60356g.ordinal()];
            if (i3 == 1) {
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_you_pending_facelifted, zhm.u.c(c.e(dVar3.a())), null, 12);
            }
            if (i3 == 2) {
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_sent_facelifted, zhm.u.c(c.e(dVar3.a())), null, 12);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(bVarC instanceof jq9.j)) {
            if (bVarC instanceof jq9.h) {
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_joined_revolut, null, null, 14);
            }
            if (bVarC instanceof jq9.d) {
                oq9.i iVar = ((jq9.d) bVarC).f177498a;
                return c.f(new TextLocalisedClause(R$string.payments_chat_home_subtitle_group_bills_added_bill, zhm.v.k(new MoneyClause(iVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextClause(iVar.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), oi0.d.r(iVar.c()), c.d(iVar.c(), aVar));
            }
            if (!(bVarC instanceof jq9.e)) {
                if (bVarC instanceof jq9.c) {
                    return new TextLocalisedClause(com.revolut.feature.payments.groups.api.R$string.payments_groups_details_transactions_empty_state_title_messages, null, null, 14);
                }
                throw new NoWhenBranchMatchedException();
            }
            c0 c0Var = ((jq9.e) bVarC).f177499a;
            if (c0Var.k() == b0.MARK_AS_PAID) {
                return c.f(new TextLocalisedClause(R$string.payments_chat_home_subtitle_group_bills_settlement_marked_as_paid_facelifted, null, null, 14), oi0.d.r(c0Var.b()), c.d(c0Var.b(), aVar));
            }
            MoneyClause moneyClause = new MoneyClause(c0Var.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            return c.f(c.d(c0Var.f(), aVar) ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_you_facelifted, zhm.u.c(moneyClause), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_to_member_facelifted, zhm.v.k(moneyClause, new TextClause(oi0.d.r(c0Var.f()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), oi0.d.r(c0Var.b()), c.d(c0Var.b(), aVar));
        }
        a3 transaction = ((jq9.j) bVarC).f177504a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        dj0.d dVar4 = transaction.N1;
        dj0.d dVar5 = transaction.k;
        if (dVar4.f(dj0.d.e)) {
            dVar = transaction.N1;
        } else {
            o3 o3Var = transaction.J;
            if (o3Var == null || (dVar = o3Var.f272965a) == null) {
                dVar = dVar5;
            }
        }
        t5 t5Var = transaction.X;
        String str2 = transaction.f272581b;
        String str3 = transaction.f272611s;
        v6 v6Var = transaction.f;
        if (recipient instanceof jq9.o) {
            return new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_donated_facelifted, zhm.u.c(c.e(dVar.a())), null, 12);
        }
        if (dVar5.f115082a >= 0) {
            MoneyClause moneyClauseE = c.e(dVar);
            switch (b.f140700c[v6Var.ordinal()]) {
                case 1:
                    if (!k71.k.G(transaction)) {
                        return k71.k.Q0(transaction) ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_withdrew_facelifted, zhm.u.c(moneyClauseE), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_you_facelifted, zhm.u.c(moneyClauseE), null, 12);
                    }
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_a_gift, zhm.u.c(moneyClauseE), null, 12);
                    m70.a.t(t0.f186434a);
                    return new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_rewards, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
                case 2:
                case 3:
                case 4:
                    return Intrinsics.f(str3, "suspicious_transaction_pending_confirmation") ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_pending_confirmation_facelifted, null, null, 14) : Intrinsics.f(str3, "suspicious_transaction_pending_review") ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_suspicious_transaction_pending_review_facelifted, null, null, 14) : k71.k.G(transaction) ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_a_gift, zhm.u.c(moneyClauseE), null, 12) : k71.k.Q0(transaction) ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_withdrew_facelifted, zhm.u.c(moneyClauseE), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_you_pending_facelifted, zhm.u.c(moneyClauseE), null, 12);
                case 5:
                case 6:
                case 7:
                    return (t5Var != null ? t5Var.f273087a : null) != null ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_rejected_facelifted, zhm.u.c(moneyClauseE), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_declined_facelifted, zhm.u.c(moneyClauseE), null, 12);
                case 8:
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_failed_facelifted, zhm.u.c(moneyClauseE), null, 12);
                case 9:
                    c.a("Transaction (Incoming) with Unknown state: " + str2);
                    return null;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        MoneyClause moneyClauseE2 = c.e(dVar.a());
        switch (b.f140700c[v6Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (v6Var == v6.PENDING && k71.k.o(transaction)) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_confirmation_required_facelifted, null, null, 14);
                }
                if (k71.k.d0(transaction)) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_security_delay_required, null, null, 14);
                }
                if (Intrinsics.f(str3, "suspicious_transaction_pending_confirmation")) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_pending_confirmation_facelifted, null, null, 14);
                }
                if (Intrinsics.f(str3, "suspicious_transaction_pending_review")) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_suspicious_transaction_pending_review_facelifted, null, null, 14);
                }
                if (Intrinsics.f(str3, "suspicious_transaction_counterparty_action_required")) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_counterparty_action_required_facelifted, null, null, 14);
                }
                if (Intrinsics.f(str3, "suspicious_transaction_no_user_action_required")) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_suspicious_transaction_pending_amount_facelifted, zhm.u.c(moneyClauseE2), null, 12);
                }
                if (!k71.k.G(transaction)) {
                    return new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_sent_facelifted, zhm.u.c(moneyClauseE2), null, 12);
                }
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_sent_a_gift, zhm.u.c(moneyClauseE2), null, 12);
                m70.a.t(t0.f186434a);
                return new CompositeClause(zhm.v.k(textLocalisedClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_rewards, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
            case 5:
            case 6:
            case 7:
                return (t5Var != null ? t5Var.f273087a : null) != null ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_rejected_facelifted, zhm.u.c(moneyClauseE2), null, 12) : new TextLocalisedClause(R$string.payments_chat_home_subtitle_declined_facelifted, zhm.u.c(moneyClauseE2), null, 12);
            case 8:
                return new TextLocalisedClause(R$string.payments_chat_home_subtitle_failed_facelifted, zhm.u.c(moneyClauseE2), null, 12);
            case 9:
                c.a("Transaction (Outgoing) with Unknown state: " + str2);
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model.c.a b(jq9.k r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5a.a.b(jq9.k, boolean):com.revolut.core.ui_kit.delegates.RowDelegate$Model$c$a");
    }
}
