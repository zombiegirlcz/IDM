package u71;

import efm.b;
import efm.d0;
import efm.r;
import java.util.List;
import k71.i;
import kotlin.coroutines.Continuation;
import v61.j;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    b cancelSplitBill(String str);

    b deleteSplitBillReceipt(String str, String str2, List list);

    Object fetchSplitBillForTransaction(String str, Continuation continuation);

    r getSplitBillDetailsForPayer(String str);

    r getSplitBillDetailsForRequestor(String str, String str2);

    r observeSplitBillForTransaction(i iVar);

    r observeSplitBills(boolean z);

    d0 splitBill(j jVar);
}
