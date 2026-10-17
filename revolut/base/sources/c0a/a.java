package c0a;

import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static List a(List list, P2PChatItem chatItem) {
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        if (list == null) {
            return u.c(chatItem);
        }
        for (int iJ = v.j(list); -1 < iJ; iJ--) {
            if (Intrinsics.f(((P2PChatItem) list.get(iJ)).getF79531a(), chatItem.getF79531a())) {
                return list;
            }
            if (((P2PChatItem) list.get(iJ)).getF79532b().getMillis() <= chatItem.getF79532b().getMillis()) {
                ArrayList arrayListF1 = d0.f1(list);
                arrayListF1.add(iJ + 1, chatItem);
                return arrayListF1;
            }
        }
        ArrayList arrayListF12 = d0.f1(list);
        arrayListF12.add(0, chatItem);
        return arrayListF12;
    }
}
