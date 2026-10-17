package zy9;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardPaymentOption;
import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        String strM;
        Iterator it8 = ((SendFromClipboardPaymentOption) obj2).f79688a.iterator();
        String strM2 = null;
        if (it8.hasNext()) {
            strM = ((SendFromClipboardType) it8.next()).m();
            while (it8.hasNext()) {
                String strM3 = ((SendFromClipboardType) it8.next()).m();
                if (strM.compareTo(strM3) > 0) {
                    strM = strM3;
                }
            }
        } else {
            strM = null;
        }
        if (strM == null) {
            strM = "";
        }
        Iterator it9 = ((SendFromClipboardPaymentOption) obj3).f79688a.iterator();
        if (it9.hasNext()) {
            strM2 = ((SendFromClipboardType) it9.next()).m();
            while (it9.hasNext()) {
                String strM4 = ((SendFromClipboardType) it9.next()).m();
                if (strM2.compareTo(strM4) > 0) {
                    strM2 = strM4;
                }
            }
        }
        return cim.b.b(strM, strM2 != null ? strM2 : "");
    }
}
