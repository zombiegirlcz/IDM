package m7i;

import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyRecurringPayment;
import h7i.o;
import h7i.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    public static h7i.k a(i input) {
        MoveMoneyRecurringPayment moveMoneyRecurringPayment;
        WalletAutomation walletAutomation;
        boolean z;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(input, "input");
        p pVar = input.f203413h;
        long j5 = input.f203411c;
        c7i.f fVar = input.e;
        if (!(pVar instanceof o) || (walletAutomation = (moveMoneyRecurringPayment = ((o) pVar).f149897a).f104808h) == null) {
            return null;
        }
        boolean z3 = walletAutomation instanceof WalletAutomation.DropsBelow;
        if ((z3 && fVar == c7i.f.DropsBelow) || (((z = walletAutomation instanceof WalletAutomation.Exceeds)) && fVar == c7i.f.Exceeds)) {
            return new h7i.e(moveMoneyRecurringPayment);
        }
        if (z3) {
            WalletAutomation.DropsBelow dropsBelow = (WalletAutomation.DropsBelow) walletAutomation;
            long j16 = dropsBelow.f86444b.f115082a;
            j2 = dropsBelow.f86443a.f115082a;
            j3 = j5;
            j5 = j16;
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = input.d;
            j3 = ((WalletAutomation.Exceeds) walletAutomation).f86446a.f115082a;
        }
        long j22 = j5 + j2;
        if (j22 < j3) {
            return null;
        }
        xi0.b bVar = walletAutomation.getF86446a().f115083b;
        int i = j.f203414a[fVar.ordinal()];
        if (i == 1) {
            return new h7i.b(new dj0.d(j22, bVar));
        }
        if (i == 2) {
            return new h7i.c(new dj0.d(j3, bVar));
        }
        throw new NoWhenBranchMatchedException();
    }
}
