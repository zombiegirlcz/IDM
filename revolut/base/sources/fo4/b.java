package fo4;

import fo4.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final ArrayList a(List list) {
        sl4.b bVar;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<a> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (a aVar : list2) {
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            String title = aVar.getTitle();
            String logoUrl = aVar.getLogoUrl();
            String backgroundImageUrl = aVar.getBackgroundImageUrl();
            a.C0799a badge = aVar.getBadge();
            String type = badge.getType();
            sl4.b[] bVarArrValues = sl4.b.values();
            int length = bVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = null;
                    break;
                }
                bVar = bVarArrValues[i];
                if (a0.z(bVar.name(), type, true)) {
                    break;
                }
                i++;
            }
            if (bVar == null) {
                bVar = sl4.b.UNKNOWN;
            }
            arrayList.add(new sl4.c(title, logoUrl, backgroundImageUrl, new sl4.a(bVar, badge.getText()), aVar.getDeeplink(), aVar.getAnalyticsRef()));
        }
        return arrayList;
    }
}
