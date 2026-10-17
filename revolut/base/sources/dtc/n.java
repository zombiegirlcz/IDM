package dtc;

import android.content.Context;
import androidx.collection.SparseArrayCompat;
import com.revolut.feature.transactions.api.R$string;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends atc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f117425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArrayCompat f117426b;

    public n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f117425a = context;
        this.f117426b = new SparseArrayCompat(0, 1, null);
    }

    @Override // atc.b
    public final void a(Object obj2, Collection targetCollection) {
        a3 instance = (a3) obj2;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(targetCollection, "targetCollection");
        switch (m.f117424a[instance.e.ordinal()]) {
            case 1:
            case 2:
            case 3:
                targetCollection.add(b(R$string.search_block_transactions_keywords_transfers));
                return;
            case 4:
            case 5:
                targetCollection.add(b(R$string.search_block_transactions_keywords_topups));
                targetCollection.add(b(R$string.search_block_transactions_keywords_crypto_deposits));
                return;
            case 6:
            case 7:
                targetCollection.add(b(R$string.search_block_transactions_keywords_cashback));
                return;
            case 8:
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_payments));
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_transactions));
                targetCollection.add(b(R$string.search_block_transactions_keywords_debit_card));
                return;
            case 9:
            case 10:
            case 11:
            case 12:
                targetCollection.add(b(R$string.search_block_transactions_keywords_exchange));
                return;
            case 13:
                targetCollection.add(b(R$string.search_block_transactions_keywords_fees));
                return;
            case 14:
                targetCollection.add(b(R$string.search_block_transactions_keywords_refunds));
                targetCollection.add(b(R$string.search_block_transactions_keywords_credits));
                targetCollection.add(b(R$string.search_block_transactions_keywords_received));
                return;
            case 15:
                targetCollection.add(b(R$string.search_block_transactions_keywords_revolut_payment));
                return;
            case 16:
                targetCollection.add(b(R$string.search_block_transactions_keywords_crypto_withdrawals));
                return;
            case 17:
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_refunds));
                return;
            case 18:
                targetCollection.add(b(R$string.search_block_transactions_keywords_trades));
                return;
            case 19:
                targetCollection.add(b(R$string.search_block_transactions_keywords_atm));
                return;
            case 20:
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_credit));
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_transactions));
                targetCollection.add(b(R$string.search_block_transactions_keywords_debit_card));
                return;
            case 21:
                targetCollection.add(b(R$string.search_block_transactions_keywords_chargeback_reversal));
                return;
            case 22:
                targetCollection.add(b(R$string.search_block_transactions_keywords_loan));
                return;
            case 23:
                targetCollection.add(b(R$string.search_block_transactions_keywords_reward));
                return;
            case 24:
                targetCollection.add(b(R$string.search_block_transactions_keywords_topup_chargeback));
                return;
            case 25:
                targetCollection.add(b(R$string.search_block_transactions_keywords_topup_return));
                return;
            case 26:
                targetCollection.add(b(R$string.search_block_transactions_keywords_tax));
                return;
            case 27:
                targetCollection.add(b(R$string.search_block_transactions_keywords_tax_refund));
                return;
            case 28:
                targetCollection.add(b(R$string.search_block_transactions_keywords_loan_payoff));
                return;
            case 29:
                targetCollection.add(b(R$string.search_block_transactions_keywords_loan_payment));
                return;
            case 30:
                targetCollection.add(b(R$string.search_block_transactions_keywords_credit_interest));
                return;
            case 31:
                targetCollection.add(b(R$string.search_block_transactions_keywords_card_refunds));
                return;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String b(int i) {
        SparseArrayCompat sparseArrayCompat = this.f117426b;
        String str = (String) sparseArrayCompat.get(i);
        if (str != null) {
            return str;
        }
        String string = this.f117425a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        sparseArrayCompat.put(i, string);
        return string;
    }

    @Override // atc.b
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f117425a, ((n) obj2).f117425a);
    }

    @Override // atc.b
    public final int hashCode() {
        return this.f117425a.hashCode();
    }
}
