package n61;

import com.revolut.domain.models.banktransfer.AccountFieldType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f212688a = {"LAST_NAME", "FIRST_NAME", "COMPANY_NAME"};

    public static final ArrayList a(String searchQuery, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (d0.W(searchQuery) ? true : g((f5j.a) obj2, searchQuery)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final String b(AccountFieldType accountFieldType, String value) {
        Intrinsics.checkNotNullParameter(accountFieldType, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (g.f212684a[accountFieldType.ordinal()]) {
            case 1:
                return new Regex(".{2}(?!$)").replace(value, "$0-");
            case 2:
                return d0.F0(new Regex("(.{4})").replace(value, "$1 ")).toString();
            case 3:
                return new Regex(".{3}(?!$)").replace(value, "$0-");
            case 4:
                return new Regex("(\\d{3})(\\d{3})(\\d{11})(\\d)").replace(value, "$1-$2-$3-$4");
            case 5:
                return new Regex("(\\d{3})(\\d{3})(\\d{3})(\\d{2})").replace(value, "***.$2.$3-**");
            case 6:
                return new Regex("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d)").replace(value, "$1.$2.$3/$4-$5");
            case 7:
                return j6.a.q("•• ", value);
            case 8:
            case 9:
                String lowerCase = d0.F0(a0.D(value, "_", " ", false)).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return jli.g.b(lowerCase);
            default:
                return value;
        }
    }

    public static final String c(f5j.a aVar) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str4 = aVar.e;
        Map map = aVar.u;
        if (str4 != null && (str3 = aVar.f) != null) {
            return a0.d.v(new Object[]{str4, str3}, 2, "%s %s", "format(...)");
        }
        String str5 = aVar.f132332g;
        if (str5 != null) {
            return str5;
        }
        if (f(aVar) && (str2 = aVar.f132333h) != null) {
            return str2;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (map == null || (str = (String) map.get("ALIAS_NAME")) == null || str.length() <= 0) {
            return "";
        }
        String str6 = map != null ? (String) map.get("ALIAS_NAME") : null;
        if (str6 != null) {
            return str6;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String d(f5j.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.A;
        return str == null ? c(aVar) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String e(f5j.a r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = r4.A
            java.util.Map r2 = r4.u
            if (r1 != 0) goto L74
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = r4.e
            if (r1 == 0) goto L1c
            java.lang.String r3 = r4.f
            if (r3 == 0) goto L1c
            if (r1 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r1 = r4.f132332g
            if (r1 == 0) goto L21
            return r1
        L21:
            boolean r1 = f(r4)
            if (r1 == 0) goto L2c
            java.lang.String r1 = r4.f132333h
            if (r1 == 0) goto L2c
            return r1
        L2c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r2 == 0) goto L71
            java.lang.String r4 = "ALIAS_NAME"
            java.lang.Object r0 = r2.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L71
            int r0 = r0.length()
            if (r0 <= 0) goto L71
            if (r2 == 0) goto L65
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L65
            kotlin.jvm.internal.t0 r0 = kotlin.jvm.internal.t0.f186434a
            m70.a.t(r0)
            java.lang.String r0 = " "
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 0
            r2 = 6
            java.util.List r4 = kotlin.text.d0.n0(r4, r0, r1, r2)
            if (r4 == 0) goto L65
            java.lang.Object r4 = zhm.d0.b0(r4)
            java.lang.String r4 = (java.lang.String) r4
            goto L66
        L65:
            r4 = 0
        L66:
            if (r4 == 0) goto L69
            return r4
        L69:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r4.<init>(r0)
            throw r4
        L71:
            java.lang.String r4 = ""
            return r4
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n61.j.e(f5j.a):java.lang.String");
    }

    public static final boolean f(f5j.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String str = aVar.f132333h;
        return str != null && str.length() > 0;
    }

    public static final boolean g(f5j.a aVar, String searchQuery) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        if (!jli.g.d(c(aVar), searchQuery) && (((str = aVar.A) == null || !jli.g.d(str, searchQuery)) && (((str2 = aVar.f132333h) == null || !jli.g.d(str2, searchQuery)) && (((str3 = aVar.C) == null || !jli.g.d(str3, searchQuery)) && (((str4 = aVar.i) == null || !jli.g.d(str4, searchQuery)) && ((str5 = aVar.f132334j) == null || !jli.g.d(str5, searchQuery))))))) {
            Map map = aVar.u;
            if (map == null || map.isEmpty()) {
                return false;
            }
            Iterator it8 = map.entrySet().iterator();
            while (it8.hasNext()) {
                if (jli.g.d((String) ((Map.Entry) it8.next()).getValue(), searchQuery)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final List h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        a0.A(t0.f186434a);
        return zhm.d0.P0(list, new gu1.q());
    }
}
