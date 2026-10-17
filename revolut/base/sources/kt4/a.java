package kt4;

import com.revolut.feature.credit.card.api.models.presentation.CreditCardCellModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class a {
    public static final List a(String str, List list) {
        List listA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<CreditCardCellModel> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        boolean z = false;
        for (CreditCardCellModel creditCardCellModelA : list2) {
            List list3 = creditCardCellModelA.f;
            if (str == null || !Intrinsics.f(creditCardCellModelA.f68828a, str)) {
                List list4 = list3;
                if (list4 == null || list4.isEmpty() || (listA = a(str, list3)) == list3) {
                    arrayList.add(creditCardCellModelA);
                } else {
                    creditCardCellModelA = CreditCardCellModel.a(creditCardCellModelA, listA, false, 95);
                }
            } else {
                creditCardCellModelA = CreditCardCellModel.a(creditCardCellModelA, null, !creditCardCellModelA.f68831g, 63);
            }
            z = true;
            arrayList.add(creditCardCellModelA);
        }
        return z ? arrayList : list;
    }
}
