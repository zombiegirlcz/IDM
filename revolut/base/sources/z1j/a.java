package z1j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlow;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlowContract$InputData;
import j1j.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static SavingsDisclaimersFlow a(c parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ArrayList arrayList = parcel.f170616a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof BalanceWrapper.SavingsBalanceWrapper) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            BalanceWrapper.SavingsBalanceWrapper savingsBalanceWrapper = (BalanceWrapper.SavingsBalanceWrapper) it8.next();
            Clause clause = savingsBalanceWrapper.i.f99441a;
            SavingWithDisclaimer savingWithDisclaimer = clause != null ? new SavingWithDisclaimer(savingsBalanceWrapper.f99439h, clause) : null;
            if (savingWithDisclaimer != null) {
                arrayList3.add(savingWithDisclaimer);
            }
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        return new SavingsDisclaimersFlow(new SavingsDisclaimersFlowContract$InputData(arrayList3));
    }
}
