package xnj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jli.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static boolean a(String sourceText, String query) {
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(query, "query");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = query.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List listJ = g.j(g.e(d0.F0(lowerCase).toString()));
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj2 : listJ) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return true;
        }
        Locale ROOT2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT2, "ROOT");
        String lowerCase2 = sourceText.toLowerCase(ROOT2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        List listJ2 = g.j(g.e(d0.F0(lowerCase2).toString()));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : listJ2) {
            if (!d0.W((String) obj3)) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (String str : arrayList) {
            if (!arrayList2.isEmpty()) {
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    if (d0.J((String) it8.next(), str, false)) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
