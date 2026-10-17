package zsc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class l {
    private l() {
    }

    public static m a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        List<String> listJ = jli.g.j(query);
        ArrayList arrayList = new ArrayList(w.t(listJ, 10));
        for (String str : listJ) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean zIsLetterOrDigit = Character.isLetterOrDigit(str.charAt(!z ? i : length));
                if (z) {
                    if (zIsLetterOrDigit) {
                        break;
                    }
                    length--;
                } else if (zIsLetterOrDigit) {
                    z = true;
                } else {
                    i++;
                }
            }
            arrayList.add(str.subSequence(i, length + 1).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return new m(arrayList2);
    }
}
