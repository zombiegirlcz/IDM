package uae;

import com.revolut.data.model.Data;
import com.revolut.feature.subscriptions.impl.payment_balance_picker.PaymentBalancePickerScreenContract$SelectedBalanceInfo;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public static PaymentBalancePickerScreenContract$SelectedBalanceInfo a(Data domainContentData, String str) {
        Object next;
        Intrinsics.checkNotNullParameter(domainContentData, "domainContentData");
        sae.h hVar = (sae.h) domainContentData.getContent();
        if (hVar == null) {
            return PaymentBalancePickerScreenContract$SelectedBalanceInfo.Undefined.f89227a;
        }
        ArrayList arrayList = hVar.f261387b;
        if (str != null) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                Iterator it9 = ((k1j.b) it8.next()).f180284c.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (Intrinsics.f(((BalanceWrapper) next).f99404a, str)) {
                        break;
                    }
                }
                BalanceWrapper balanceWrapper = (BalanceWrapper) next;
                if (balanceWrapper != null) {
                    Pair pair = balanceWrapper instanceof BalanceWrapper.PocketBalanceWrapper ? new Pair(((BalanceWrapper.PocketBalanceWrapper) balanceWrapper).f99406c.f306286a, Boolean.FALSE) : new Pair(balanceWrapper.getE(), Boolean.TRUE);
                    return new PaymentBalancePickerScreenContract$SelectedBalanceInfo.Balance(str, (String) pair.f186385a, balanceWrapper.getF99406c().f306286a, ((Boolean) pair.f186386b).booleanValue());
                }
            }
        }
        return PaymentBalancePickerScreenContract$SelectedBalanceInfo.AllCashAccounts.f89223a;
    }
}
