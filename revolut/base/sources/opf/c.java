package opf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.SourceAccount;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.w5;
import tof.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public final SourceAccount.Pocket a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        AccountId joint = null;
        if (k71.k.M0(transaction)) {
            z0 z0Var = transaction.C0;
            String str = z0Var != null ? z0Var.f273188c : null;
            String str2 = transaction.f272584c;
            if (str != null && str2 != null) {
                joint = new AccountId.Joint(str, str2);
            }
        }
        if (joint == null) {
            joint = AccountId.Personal.f51414a;
        }
        w5 w5Var = transaction.f272624y;
        return new SourceAccount.Pocket(joint, w5Var.f273144b, w5Var.f273143a);
    }
}
