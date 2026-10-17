package snh;

import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$TransferAccount;
import ijh.e;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        e.a aVar = ijh.e.Companion;
        String e = ((WealthTransferPickerControllerContract$TransferAccount) obj2).getE();
        aVar.getClass();
        Integer numValueOf = Integer.valueOf(e.a.a(e));
        String e2 = ((WealthTransferPickerControllerContract$TransferAccount) obj3).getE();
        aVar.getClass();
        return cim.b.b(numValueOf, Integer.valueOf(e.a.a(e2)));
    }
}
