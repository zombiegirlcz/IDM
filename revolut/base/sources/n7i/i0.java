package n7i;

import com.revolut.feature_move_money.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 {
    public static int a(hd.e expense) {
        Intrinsics.checkNotNullParameter(expense, "expense");
        s6i.d dVar = (s6i.d) expense.f151344b;
        if (dVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = h0.f213115a[dVar.ordinal()];
        if (i == 1) {
            if (expense instanceof s6i.a) {
                return R$string.move_money_amount_screen_fee_after;
            }
            if (expense instanceof s6i.c) {
                return R$string.move_money_amount_screen_tax_after;
            }
            if (expense instanceof s6i.b) {
                return R$string.move_money_amount_screen_fees_and_taxes_after;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (expense instanceof s6i.a) {
            return R$string.move_money_amount_screen_fee_included;
        }
        if (expense instanceof s6i.c) {
            return R$string.move_money_amount_screen_tax_included;
        }
        if (expense instanceof s6i.b) {
            return R$string.move_money_amount_screen_fees_and_taxes_included;
        }
        throw new NoWhenBranchMatchedException();
    }
}
