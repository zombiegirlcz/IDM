package cnf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.p6;
import tof.v6;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f25407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f25408b;

    public a(k staticNoticeDetailsMapper, e stringsProvider) {
        Intrinsics.checkNotNullParameter(staticNoticeDetailsMapper, "staticNoticeDetailsMapper");
        Intrinsics.checkNotNullParameter(stringsProvider, "stringsProvider");
        this.f25407a = staticNoticeDetailsMapper;
        this.f25408b = stringsProvider;
    }

    public final Clause a(a3 transaction, boolean z) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String str = transaction.f272611s;
        p6 p6Var = transaction.A.f272780b;
        CharSequence charSequenceB = null;
        String cardId = p6Var != null ? p6Var.f272991a : null;
        if (cardId == null) {
            cardId = "";
        }
        String str2 = transaction.f272584c;
        String walletId = str2 != null ? str2 : "";
        e eVar = this.f25408b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        CharSequence charSequenceC = z ? Intrinsics.f(str, "pin_tries_exceeded") ? eVar.c(new TextLocalisedClause(p.a.p("transaction.reason.card_id.", str, ".wallet_id"), v.k(cardId, walletId, "junior"), (Clause) null, false, 28)) : Intrinsics.f(str, "sca_counters_exceed") ? eVar.a(cardId, str) : null : eVar.a(cardId, str);
        if (charSequenceC != null) {
            return new HtmlClause(0, 30, (Integer) null, (Object) null, charSequenceC.toString());
        }
        String statusReasonCode = transaction.f272611s;
        if (!Intrinsics.f(statusReasonCode, "auth_request") || transaction.f == v6.PENDING) {
            if (k71.k.p(transaction) && Intrinsics.f(statusReasonCode, "insufficient_balance")) {
                String pocketId = transaction.f272624y.f273143a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                charSequenceB = eVar.c(new TextLocalisedClause(j6.a.q("transaction.reason.credit.", statusReasonCode), u.c(pocketId), (Clause) null, false, 28));
            } else if (Intrinsics.f(statusReasonCode, "insufficient_balance_crypto")) {
                String currency = transaction.k.f115083b.f306286a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(statusReasonCode, "statusReasonCode");
                Intrinsics.checkNotNullParameter(currency, "currency");
                charSequenceB = eVar.c(new TextLocalisedClause(j6.a.q("transaction.reason.", statusReasonCode), u.c(currency), (Clause) null, false, 28));
            } else {
                charSequenceB = eVar.b(statusReasonCode);
            }
        }
        return charSequenceB != null ? new HtmlClause(0, 30, (Integer) null, (Object) null, charSequenceB.toString()) : ((l) this.f25407a).a(transaction);
    }
}
