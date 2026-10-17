package n7i;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;

/* JADX INFO: loaded from: classes10.dex */
public final class p {
    public static String a(SavingsAccountDetails savingsAccountDetails) {
        String str;
        pcd.a aVarA = opg.c.a(savingsAccountDetails.f86460a);
        return (aVarA == null || (str = aVarA.f234843c) == null) ? savingsAccountDetails.f86460a.f() : str;
    }
}
