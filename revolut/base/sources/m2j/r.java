package m2j;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        BalanceWrapper balanceWrapper = (BalanceWrapper) obj3;
        boolean z = false;
        Boolean boolValueOf = Boolean.valueOf(cp5.d.A(balanceWrapper.getF99406c()) && balanceWrapper.getF99407g() != k1j.a.REVOLUT_X_FIAT);
        BalanceWrapper balanceWrapper2 = (BalanceWrapper) obj2;
        if (cp5.d.A(balanceWrapper2.getF99406c()) && balanceWrapper2.getF99407g() != k1j.a.REVOLUT_X_FIAT) {
            z = true;
        }
        return cim.b.b(boolValueOf, Boolean.valueOf(z));
    }
}
