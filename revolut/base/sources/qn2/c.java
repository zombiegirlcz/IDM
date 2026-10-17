package qn2;

import com.revolut.feature.bank_account_switching.impl.domain.DetailsSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rn2.c;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c {
    public static final DetailsSection a(rn2.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String title = cVar.getTitle();
        List<c.a> items = cVar.getItems();
        ArrayList arrayList = new ArrayList(w.t(items, 10));
        for (c.a aVar : items) {
            String title2 = aVar.getTitle();
            String subtitle = aVar.getSubtitle();
            String footer = aVar.getFooter();
            String footerAction = aVar.getFooterAction();
            wn2.b bVar = null;
            if (footerAction != null) {
                wn2.b[] bVarArrValues = wn2.b.values();
                int length = bVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        wn2.b bVar2 = bVarArrValues[i];
                        if (a0.z(bVar2.name(), footerAction, true)) {
                            bVar = bVar2;
                            break;
                        }
                        i++;
                    }
                }
            }
            arrayList.add(new DetailsSection.Item(title2, subtitle, footer, bVar, aVar.getIcon(), aVar.getIconColor()));
        }
        return new DetailsSection(title, arrayList);
    }
}
