package fi6;

import com.revolut.feature.subaccount.api.models.Subaccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final i a(List list) {
        ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("<this>", list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Subaccount subaccount = (Subaccount) it8.next();
            if ((subaccount instanceof Subaccount.Personal) || (subaccount instanceof Subaccount.Group)) {
                arrayListY.add(subaccount);
            } else if ((subaccount instanceof Subaccount.Pro) || (subaccount instanceof Subaccount.ProTax)) {
                arrayList.add(subaccount);
            } else if (subaccount instanceof Subaccount.Joint) {
                arrayList2.add(subaccount);
            } else if (!(subaccount instanceof Subaccount.Junior) && !(subaccount instanceof Subaccount.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new i(arrayListY, arrayList, arrayList2);
    }
}
