package w7a;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import java.util.ArrayList;
import yp0.b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final void a(ArrayList arrayList, ArrayList arrayList2, ListSubheaderDelegate.Model model) {
        if (model != null) {
            arrayList.addAll(b.g(arrayList2, model, null, 0, 0, 126));
        } else {
            b.k(arrayList2, 0, 0, 0, 0, 31);
            arrayList.addAll(arrayList2);
        }
    }
}
