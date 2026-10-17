package kotlin.text;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class t extends s {
    public static String b(String str, String indent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indent, "indent");
        return nkm.y.u(nkm.y.x(d0.Z(str), new k7c.n(indent, 16)), "\n", null, 62);
    }

    public static final String d(String str) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (d0.W("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listJ = nkm.y.J(d0.Z(str));
        int length = str.length();
        listJ.size();
        int iJ = zhm.v.j(listJ);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : listJ) {
            int i2 = i + 1;
            String line = null;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            String str2 = (String) obj2;
            if ((i != 0 && i != iJ) || !d0.W(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!CharsKt.e(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && a0.G(i3, str2, false, "|")) {
                    line = str2.substring(1 + i3);
                    Intrinsics.checkNotNullExpressionValue(line, "substring(...)");
                }
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str2;
                }
            }
            if (line != null) {
                arrayList.add(line);
            }
            i = i2;
        }
        StringBuilder sb6 = new StringBuilder(length);
        zhm.d0.j0(arrayList, sb6, "\n", null, null, null, 124);
        return sb6.toString();
    }

    public static String e(String str) throws IOException {
        int length;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("", "newIndent");
        Intrinsics.checkNotNullParameter(str, "<this>");
        List listJ = nkm.y.J(d0.Z(str));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listJ) {
            if (!d0.W((String) obj2)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it8.hasNext()) {
                break;
            }
            String str2 = (String) it8.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!CharsKt.e(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) zhm.d0.u0(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listJ.size();
        int iJ = zhm.v.j(listJ);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : listJ) {
            int i = length + 1;
            String line = null;
            if (length < 0) {
                zhm.v.s();
                throw null;
            }
            String str3 = (String) obj3;
            if ((length != 0 && length != iJ) || !d0.W(str3)) {
                line = f0.N0(iIntValue, str3);
                if (line != null) {
                    Intrinsics.checkNotNullParameter(line, "line");
                } else {
                    line = str3;
                }
            }
            if (line != null) {
                arrayList3.add(line);
            }
            length = i;
        }
        StringBuilder sb6 = new StringBuilder(length3);
        zhm.d0.j0(arrayList3, sb6, "\n", null, null, null, 124);
        return sb6.toString();
    }

    public static String f(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        return d(str);
    }
}
