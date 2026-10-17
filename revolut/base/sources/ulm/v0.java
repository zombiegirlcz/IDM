package ulm;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f281156a;
    public String d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f281159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f281160h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f281157b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f281158c = "";
    public int e = -1;
    public final ArrayList f = zhm.v.n("");

    public static ArrayList i(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iS = kotlin.text.d0.S(str, '&', i, 4);
            if (iS == -1) {
                iS = str.length();
            }
            int iS2 = kotlin.text.d0.S(str, '=', i, 4);
            if (iS2 == -1 || iS2 > iS) {
                String strSubstring = str.substring(i, iS);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iS2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iS2 + 1, iS);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i = iS + 1;
        }
        return arrayList;
    }

    public final void a(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f281159g == null) {
            this.f281159g = new ArrayList();
        }
        ArrayList arrayList = this.f281159g;
        Intrinsics.h(arrayList);
        arrayList.add(jmm.a.a(name, 0, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91));
        ArrayList arrayList2 = this.f281159g;
        Intrinsics.h(arrayList2);
        arrayList2.add(str != null ? jmm.a.a(str, 0, false, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91) : null);
    }

    public final x0 b() {
        ArrayList arrayList;
        String str = this.f281156a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strD = jmm.a.d(0, 0, 7, this.f281157b);
        String strD2 = jmm.a.d(0, 0, 7, this.f281158c);
        String str2 = this.d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iB = this.e;
        if (iB == -1) {
            w0 w0Var = x0.Companion;
            String str3 = this.f281156a;
            Intrinsics.h(str3);
            w0Var.getClass();
            iB = w0.b(str3);
        }
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(jmm.a.d(0, 0, 7, (String) it8.next()));
        }
        ArrayList<String> arrayList4 = this.f281159g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(zhm.w.t(arrayList4, 10));
            for (String str4 : arrayList4) {
                arrayList.add(str4 != null ? jmm.a.d(0, 0, 3, str4) : null);
            }
        } else {
            arrayList = null;
        }
        String str5 = this.f281160h;
        return new x0(str, strD, strD2, str2, iB, arrayList3, arrayList, str5 != null ? jmm.a.d(0, 0, 7, str5) : null, toString());
    }

    public final void c(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        String strC = vlm.g.c(jmm.a.d(0, 0, 7, host));
        if (strC == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(host));
        }
        this.d = strC;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ulm.x0 r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulm.v0.d(ulm.x0, java.lang.String):void");
    }

    public final void e(int i) {
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(a0.d.n("unexpected port: ", i).toString());
        }
        this.e = i;
    }

    public final void f(int i, int i2, boolean z, boolean z3, String str) {
        String strA = jmm.a.a(str, i, z3, " \"<>^`{}|/\\?#", i2, 112);
        if (Intrinsics.f(strA, ".") || kotlin.text.a0.z(strA, "%2e", true)) {
            return;
        }
        boolean zF = Intrinsics.f(strA, "..");
        ArrayList arrayList = this.f;
        if (zF || kotlin.text.a0.z(strA, "%2e.", true) || kotlin.text.a0.z(strA, ".%2e", true) || kotlin.text.a0.z(strA, "%2e%2e", true)) {
            if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                arrayList.add("");
                return;
            } else {
                arrayList.set(arrayList.size() - 1, "");
                return;
            }
        }
        if (((CharSequence) p.a.i(1, arrayList)).length() == 0) {
            arrayList.set(arrayList.size() - 1, strA);
        } else {
            arrayList.add(strA);
        }
        if (z) {
            arrayList.add("");
        }
    }

    public final void g(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        char cCharAt = str.charAt(i);
        ArrayList arrayList = this.f;
        if (cCharAt == '/' || cCharAt == '\\') {
            arrayList.clear();
            arrayList.add("");
            i++;
        } else {
            arrayList.set(arrayList.size() - 1, "");
        }
        int i3 = i;
        while (i3 < i2) {
            int iJ = vlm.h.j(i3, i2, str, "/\\");
            boolean z = iJ < i2;
            String str2 = str;
            f(i3, iJ, z, true, str2);
            i3 = z ? iJ + 1 : iJ;
            str = str2;
        }
    }

    public final void h(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (kotlin.text.a0.z(scheme, "http", true)) {
            this.f281156a = "http";
        } else {
            if (!kotlin.text.a0.z(scheme, "https", true)) {
                throw new IllegalArgumentException(j6.a.q("unexpected scheme: ", scheme));
            }
            this.f281156a = "https";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulm.v0.toString():java.lang.String");
    }
}
