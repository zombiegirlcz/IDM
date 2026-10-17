package com.fourthline.orca.internal;

import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.internal.m71;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class b9 {
    static b9 d;
    static b9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static b9 f27051g;
    static b9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static b9 f27053j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f27054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b9 f27049b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b9 f27050c = new b9((HashMap) null);
    private static b9 e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static b9 f27052h = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f27055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f27056b;

        public a(String str, int i) {
            this.f27055a = str;
            this.f27056b = i;
        }
    }

    static {
        d = null;
        f = null;
        f27051g = null;
        i = null;
        f27053j = null;
        b9 b9Var = new b9();
        d = b9Var;
        b9Var.f27054a.put("liga", 1);
        d.f27054a.put("clig", 1);
        d.f27054a.put("dlig", 0);
        d.f27054a.put("hlig", 0);
        d.f27054a.put("calt", 1);
        b9 b9Var2 = new b9();
        f = b9Var2;
        b9Var2.f27054a.put("subs", 0);
        f.f27054a.put("sups", 0);
        b9 b9Var3 = new b9();
        f27051g = b9Var3;
        b9Var3.f27054a.put("smcp", 0);
        f27051g.f27054a.put("c2sc", 0);
        f27051g.f27054a.put("pcap", 0);
        f27051g.f27054a.put("c2pc", 0);
        f27051g.f27054a.put("unic", 0);
        f27051g.f27054a.put("titl", 0);
        b9 b9Var4 = new b9();
        i = b9Var4;
        b9Var4.f27054a.put("lnum", 0);
        i.f27054a.put("onum", 0);
        i.f27054a.put("pnum", 0);
        i.f27054a.put("tnum", 0);
        i.f27054a.put("frac", 0);
        i.f27054a.put("afrc", 0);
        i.f27054a.put("ordn", 0);
        i.f27054a.put("zero", 0);
        b9 b9Var5 = new b9();
        f27053j = b9Var5;
        b9Var5.f27054a.put("jp78", 0);
        f27053j.f27054a.put("jp83", 0);
        f27053j.f27054a.put("jp90", 0);
        f27053j.f27054a.put("jp04", 0);
        f27053j.f27054a.put("smpl", 0);
        f27053j.f27054a.put("trad", 0);
        f27053j.f27054a.put("fwid", 0);
        f27053j.f27054a.put("pwid", 0);
        f27053j.f27054a.put("ruby", 0);
    }

    public b9() {
        this.f27054a = new HashMap();
    }

    public static b9 b(String str) {
        b9 b9VarB;
        if (str.equals("normal")) {
            return f27053j;
        }
        List listA = a(str);
        if (listA == null || (b9VarB = b(listA)) == null || b9VarB == f27050c || listA.size() > 0) {
            return null;
        }
        return b9VarB;
    }

    public static b9 c(String str) {
        b9 b9Var = new b9();
        e81 e81Var = new e81(str);
        e81Var.q();
        while (!e81Var.c()) {
            a aVarA = a(e81Var);
            if (aVarA == null) {
                return null;
            }
            b9Var.f27054a.put(aVarA.f27055a, Integer.valueOf(aVarA.f27056b));
            e81Var.p();
        }
        return b9Var;
    }

    public static m71.d d(String str) {
        str.getClass();
        switch (str) {
            case "normal":
                return m71.d.normal;
            case "auto":
                return m71.d.auto;
            case "none":
                return m71.d.none;
            default:
                return null;
        }
    }

    private static b9 e(List list) {
        b9 b9Var = new b9(f);
        int iA = a(list, "sub", "super");
        if (iA == 1) {
            b9Var.f27054a.put("subs", 1);
            return b9Var;
        }
        if (iA == 2) {
            b9Var.f27054a.put("sups", 1);
            return b9Var;
        }
        if (iA != 3) {
            return null;
        }
        return f27050c;
    }

    public static b9 f(String str) {
        if (str.equals("normal")) {
            return d;
        }
        if (str.equals("none")) {
            a();
            return e;
        }
        List listA = a(str);
        if (listA == null) {
            return null;
        }
        a();
        b9 b9VarC = c(listA);
        if (b9VarC == null || b9VarC == f27050c || listA.size() > 0) {
            return null;
        }
        return b9VarC;
    }

    public static b9 g(String str) {
        b9 b9VarD;
        if (str.equals("normal")) {
            return i;
        }
        List listA = a(str);
        if (listA == null || (b9VarD = d(listA)) == null || b9VarD == f27050c || listA.size() > 0) {
            return null;
        }
        return b9VarD;
    }

    public static b9 h(String str) {
        if (str.equals("normal")) {
            return f;
        }
        b9 b9Var = new b9(f);
        if (str.equals("sub")) {
            b9Var.f27054a.put("subs", 1);
            return b9Var;
        }
        if (!str.equals("super")) {
            return null;
        }
        b9Var.f27054a.put("sups", 1);
        return b9Var;
    }

    public void a(b9 b9Var) {
        if (b9Var == null) {
            return;
        }
        this.f27054a.putAll(b9Var.f27054a);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        for (Map.Entry entry : this.f27054a.entrySet()) {
            if (sb6.length() > 0) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
            sb6.append("'");
            sb6.append((String) entry.getKey());
            sb6.append("' ");
            sb6.append(entry.getValue());
        }
        return sb6.toString();
    }

    public void a(m71.d dVar) {
        if (dVar == m71.d.none) {
            this.f27054a.put("kern", 0);
        } else {
            this.f27054a.put("kern", 1);
        }
    }

    private b9(HashMap map) {
        this.f27054a = map;
    }

    public b9(b9 b9Var) {
        this.f27054a = new HashMap(b9Var.f27054a);
    }

    private static a a(e81 e81Var) {
        int iIntValue;
        e81Var.q();
        String strJ = e81Var.j();
        if (strJ == null || strJ.length() != 4) {
            return null;
        }
        e81Var.q();
        if (e81Var.c()) {
            iIntValue = 1;
        } else {
            iIntValue = 0;
            Integer numA = e81Var.a(false);
            if (numA == null) {
                if (!e81Var.a("off")) {
                    e81Var.a("on");
                    iIntValue = 1;
                }
            } else {
                iIntValue = numA.intValue();
            }
        }
        return new a(strJ, iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fourthline.orca.internal.b9 d(java.util.List r8) {
        /*
            com.fourthline.orca.internal.b9 r0 = new com.fourthline.orca.internal.b9
            com.fourthline.orca.internal.b9 r1 = com.fourthline.orca.internal.b9.i
            r0.<init>(r1)
            java.lang.String r1 = "lining-nums"
            java.lang.String r2 = "oldstyle-nums"
            int r1 = a(r8, r1, r2)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 3
            r5 = 2
            if (r1 == r2) goto L2a
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1e
            r1 = 0
            goto L32
        L1e:
            com.fourthline.orca.internal.b9 r8 = com.fourthline.orca.internal.b9.f27050c
            return r8
        L21:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r6 = "onum"
            r1.put(r6, r3)
        L28:
            r1 = r2
            goto L32
        L2a:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r6 = "lnum"
            r1.put(r6, r3)
            goto L28
        L32:
            java.lang.String r6 = "proportional-nums"
            java.lang.String r7 = "tabular-nums"
            int r6 = a(r8, r6, r7)
            if (r6 == r2) goto L4d
            if (r6 == r5) goto L44
            if (r6 == r4) goto L41
            goto L55
        L41:
            com.fourthline.orca.internal.b9 r8 = com.fourthline.orca.internal.b9.f27050c
            return r8
        L44:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r6 = "tnum"
            r1.put(r6, r3)
        L4b:
            r1 = r2
            goto L55
        L4d:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r6 = "pnum"
            r1.put(r6, r3)
            goto L4b
        L55:
            java.lang.String r6 = "diagonal-fractions"
            java.lang.String r7 = "stacked-fractions"
            int r6 = a(r8, r6, r7)
            if (r6 == r2) goto L70
            if (r6 == r5) goto L67
            if (r6 == r4) goto L64
            goto L78
        L64:
            com.fourthline.orca.internal.b9 r8 = com.fourthline.orca.internal.b9.f27050c
            return r8
        L67:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r4 = "afrc"
            r1.put(r4, r3)
        L6e:
            r1 = r2
            goto L78
        L70:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r4 = "frac"
            r1.put(r4, r3)
            goto L6e
        L78:
            java.lang.String r4 = "ordinal"
            int r4 = a(r8, r4)
            if (r4 == r2) goto L86
            if (r4 == r5) goto L83
            goto L8e
        L83:
            com.fourthline.orca.internal.b9 r8 = com.fourthline.orca.internal.b9.f27050c
            return r8
        L86:
            java.util.HashMap r1 = r0.f27054a
            java.lang.String r4 = "ordn"
            r1.put(r4, r3)
            r1 = r2
        L8e:
            java.lang.String r4 = "slashed-zero"
            int r8 = a(r8, r4)
            if (r8 == r2) goto L9d
            if (r8 == r5) goto L9a
            r2 = r1
            goto La4
        L9a:
            com.fourthline.orca.internal.b9 r8 = com.fourthline.orca.internal.b9.f27050c
            return r8
        L9d:
            java.util.HashMap r8 = r0.f27054a
            java.lang.String r1 = "zero"
            r8.put(r1, r3)
        La4:
            if (r2 == 0) goto La7
            return r0
        La7:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.b9.d(java.util.List):com.fourthline.orca.internal.b9");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00eb A[ADDED_TO_REGION, REMOVE, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fourthline.orca.internal.b9 b(java.util.List r10) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.b9.b(java.util.List):com.fourthline.orca.internal.b9");
    }

    public static b9 e(String str) {
        if (str.equals("normal")) {
            return f27051g;
        }
        b9 b9Var = new b9(f27051g);
        if (a(b9Var, str)) {
            return b9Var;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.fourthline.orca.internal.b9 c(java.util.List r10) {
        /*
            a()
            com.fourthline.orca.internal.b9 r0 = new com.fourthline.orca.internal.b9
            com.fourthline.orca.internal.b9 r1 = com.fourthline.orca.internal.b9.e
            r0.<init>(r1)
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "common-ligatures"
            java.lang.String r4 = "no-common-ligatures"
            int r3 = a(r10, r3, r4)
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "liga"
            java.lang.String r7 = "clig"
            r8 = 3
            r9 = 2
            if (r3 == r4) goto L31
            if (r3 == r9) goto L2c
            if (r3 == r8) goto L29
            goto L35
        L29:
            com.fourthline.orca.internal.b9 r10 = com.fourthline.orca.internal.b9.f27050c
            return r10
        L2c:
            r0.a(r7, r6, r1)
        L2f:
            r1 = r4
            goto L35
        L31:
            r0.a(r7, r6, r4)
            goto L2f
        L35:
            java.lang.String r3 = "discretionary-ligatures"
            java.lang.String r6 = "no-discretionary-ligatures"
            int r3 = a(r10, r3, r6)
            java.lang.String r6 = "dlig"
            if (r3 == r4) goto L50
            if (r3 == r9) goto L49
            if (r3 == r8) goto L46
            goto L56
        L46:
            com.fourthline.orca.internal.b9 r10 = com.fourthline.orca.internal.b9.f27050c
            return r10
        L49:
            java.util.HashMap r1 = r0.f27054a
            r1.put(r6, r2)
        L4e:
            r1 = r4
            goto L56
        L50:
            java.util.HashMap r1 = r0.f27054a
            r1.put(r6, r5)
            goto L4e
        L56:
            java.lang.String r3 = "historical-ligatures"
            java.lang.String r6 = "no-historical-ligatures"
            int r3 = a(r10, r3, r6)
            java.lang.String r6 = "hlig"
            if (r3 == r4) goto L71
            if (r3 == r9) goto L6a
            if (r3 == r8) goto L67
            goto L77
        L67:
            com.fourthline.orca.internal.b9 r10 = com.fourthline.orca.internal.b9.f27050c
            return r10
        L6a:
            java.util.HashMap r1 = r0.f27054a
            r1.put(r6, r2)
        L6f:
            r1 = r4
            goto L77
        L71:
            java.util.HashMap r1 = r0.f27054a
            r1.put(r6, r5)
            goto L6f
        L77:
            java.lang.String r3 = "contextual"
            java.lang.String r6 = "no-contextual"
            int r10 = a(r10, r3, r6)
            java.lang.String r3 = "calt"
            if (r10 == r4) goto L92
            if (r10 == r9) goto L8c
            if (r10 == r8) goto L89
            r4 = r1
            goto L97
        L89:
            com.fourthline.orca.internal.b9 r10 = com.fourthline.orca.internal.b9.f27050c
            return r10
        L8c:
            java.util.HashMap r10 = r0.f27054a
            r10.put(r3, r2)
            goto L97
        L92:
            java.util.HashMap r10 = r0.f27054a
            r10.put(r3, r5)
        L97:
            if (r4 == 0) goto L9a
            return r0
        L9a:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.b9.c(java.util.List):com.fourthline.orca.internal.b9");
    }

    private static List a(String str) {
        e81 e81Var = new e81(str);
        e81Var.q();
        if (e81Var.c()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (!e81Var.c()) {
            arrayList.add(e81Var.k());
            e81Var.q();
        }
        return arrayList;
    }

    private static int a(List list, String str, String str2) {
        if (list.remove(str)) {
            return (list.contains(str) || list.contains(str2)) ? 3 : 1;
        }
        if (list.remove(str2)) {
            return list.contains(str2) ? 3 : 2;
        }
        return 0;
    }

    private static final b9 b() {
        b9 b9Var = new b9();
        b9Var.f27054a.put("rlig", 1);
        b9Var.f27054a.put("liga", 1);
        b9Var.f27054a.put("clig", 1);
        b9Var.f27054a.put("calt", 1);
        b9Var.f27054a.put("locl", 1);
        b9Var.f27054a.put("ccmp", 1);
        b9Var.f27054a.put("mark", 1);
        b9Var.f27054a.put("mkmk", 1);
        return b9Var;
    }

    private static int a(List list, String str) {
        if (list.remove(str)) {
            return list.contains(str) ? 2 : 1;
        }
        return 0;
    }

    private static String a(List list, String... strArr) {
        String str = null;
        for (String str2 : strArr) {
            if (str == null && list.remove(str2)) {
                str = str2;
            }
            if (list.contains(str2)) {
                return "ERR";
            }
        }
        return str;
    }

    public static b9 c() {
        if (f27052h == null) {
            b9 b9Var = new b9();
            f27052h = b9Var;
            b9Var.f27054a.put("smcp", 1);
            f27052h.f27054a.put("c2sc", 0);
            f27052h.f27054a.put("pcap", 0);
            f27052h.f27054a.put("c2pc", 0);
            f27052h.f27054a.put("unic", 0);
            f27052h.f27054a.put("titl", 0);
        }
        return f27052h;
    }

    private void a(String str, String str2, int i2) {
        this.f27054a.put(str, Integer.valueOf(i2));
        this.f27054a.put(str2, Integer.valueOf(i2));
    }

    private static boolean a(b9 b9Var, String str) {
        str.getClass();
        switch (str) {
            case "titling-caps":
                b9Var.f27054a.put("titl", 1);
                return true;
            case "all-small-caps":
                b9Var.a("smcp", "c2sc", 1);
                return true;
            case "unicase":
                b9Var.f27054a.put("unic", 1);
                return true;
            case "petite-caps":
                b9Var.f27054a.put("pcap", 1);
                return true;
            case "all-petite-caps":
                b9Var.a("pcap", "c2pc", 1);
                return true;
            case "small-caps":
                b9Var.f27054a.put("smcp", 1);
                return true;
            default:
                return false;
        }
    }

    private static b9 a(List list) {
        b9 b9Var = new b9(f27051g);
        String strA = a(list, "small-caps", "all-small-caps", "petite-caps", "all-petite-caps", "unicase", "titling-caps");
        if (strA == "ERR") {
            return f27050c;
        }
        if (strA == null) {
            return null;
        }
        a(b9Var, strA);
        return b9Var;
    }

    public static void a(m71 m71Var, String str) {
        b9 b9VarC;
        b9 b9Var;
        b9 b9VarE;
        b9 b9VarA;
        b9 b9VarD;
        if (str.equals("normal")) {
            m71Var.R = d;
            m71Var.S = f;
            m71Var.T = f27051g;
            m71Var.U = i;
            m71Var.V = f27053j;
            m71Var.f31021a |= 34084860461056L;
            return;
        }
        if (str.equals("none")) {
            a();
            m71Var.R = e;
            m71Var.S = f;
            m71Var.T = f27051g;
            m71Var.U = i;
            m71Var.V = f27053j;
            m71Var.f31021a |= 34084860461056L;
            return;
        }
        List listA = a(str);
        if (listA == null || (b9VarC = c(listA)) == (b9Var = f27050c)) {
            return;
        }
        b9 b9VarB = null;
        if (listA.size() > 0) {
            b9VarE = e(listA);
            if (b9VarE == b9Var) {
                return;
            }
        } else {
            b9VarE = null;
        }
        if (listA.size() > 0) {
            b9VarA = a(listA);
            if (b9VarA == b9Var) {
                return;
            }
        } else {
            b9VarA = null;
        }
        if (listA.size() > 0) {
            b9VarD = d(listA);
            if (b9VarD == b9Var) {
                return;
            }
        } else {
            b9VarD = null;
        }
        if (listA.size() <= 0 || (b9VarB = b(listA)) != b9Var) {
            if (b9VarC != null) {
                m71Var.R = b9VarC;
                m71Var.f31021a |= 1099511627776L;
            }
            if (b9VarE != null) {
                m71Var.S = b9VarE;
                m71Var.f31021a |= 2199023255552L;
            }
            if (b9VarA != null) {
                m71Var.T = b9VarA;
                m71Var.f31021a |= 4398046511104L;
            }
            if (b9VarD != null) {
                m71Var.U = b9VarD;
                m71Var.f31021a |= 8796093022208L;
            }
            if (b9VarB != null) {
                m71Var.V = b9VarB;
                m71Var.f31021a |= 17592186044416L;
            }
        }
    }

    private static void a() {
        if (e != null) {
            return;
        }
        b9 b9Var = new b9();
        b9Var.f27054a.put("liga", 0);
        b9Var.f27054a.put("clig", 0);
        b9Var.f27054a.put("dlig", 0);
        b9Var.f27054a.put("hlig", 0);
        b9Var.f27054a.put("calt", 0);
        e = b9Var;
    }
}
