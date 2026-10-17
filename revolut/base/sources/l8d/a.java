package l8d;

import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.feature.shared.help_centre.api.faq.model.DisplayableFaqItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<FaqNodeBase> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (FaqNodeBase faqNodeBase : list2) {
            Intrinsics.checkNotNullParameter(faqNodeBase, "<this>");
            arrayList.add(new DisplayableFaqItem.Node(faqNodeBase));
        }
        return arrayList;
    }
}
