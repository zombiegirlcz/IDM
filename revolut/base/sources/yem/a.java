package yem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zsc.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final j f313037s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f313038t;
    public static final Pattern u;
    public static final Pattern v;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f313044j;
    public k k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f313039a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f313040b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f313041c = new StringBuilder();
    public final StringBuilder d = new StringBuilder();
    public boolean e = true;
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f313042g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f313043h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f313045l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f313046m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f313047n = false;
    public String o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StringBuilder f313048p = new StringBuilder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f313049q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vc.j f313050r = new vc.j(64);

    static {
        j jVar = new j();
        jVar.I = "<ignored>";
        jVar.K = "NA";
        f313037s = jVar;
        f313038t = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        u = Pattern.compile("[- ]");
        v = Pattern.compile("\u2008");
    }

    public a(h hVar, String str) {
        this.i = hVar;
        this.f313044j = str;
        k kVarH = hVar.h(hVar.l(hVar.f(str)));
        this.k = kVarH == null ? f313037s : kVarH;
    }

    public final String a(String str) {
        StringBuilder sb6 = this.f313046m;
        int length = sb6.length();
        if (!this.f313047n || length <= 0 || sb6.charAt(length - 1) == ' ') {
            return ((Object) sb6) + str;
        }
        return new String(sb6) + p.SPACE_CHAR + str;
    }

    public final String b() {
        StringBuilder sb6 = this.f313048p;
        if (sb6.length() < 3) {
            return a(sb6.toString());
        }
        String string = sb6.toString();
        for (i iVar : (this.f313042g && this.o.length() == 0 && this.k.X.size() > 0) ? this.k.X : this.k.W) {
            if (this.o.length() > 0) {
                String str = iVar.e;
                if ((str.length() == 0 || h.z.matcher(str).matches()) && !iVar.f && !iVar.f313074g) {
                }
            }
            if (this.o.length() == 0 && !this.f313042g) {
                String str2 = iVar.e;
                if (str2.length() == 0 || h.z.matcher(str2).matches() || iVar.f) {
                }
            }
            if (f313038t.matcher(iVar.f313072b).matches()) {
                this.f313049q.add(iVar);
            }
        }
        j(string);
        String strE = e();
        return strE.length() > 0 ? strE : i() ? f() : this.f313041c.toString();
    }

    public final boolean c() {
        StringBuilder sb6;
        h hVar;
        int iD;
        StringBuilder sb9 = this.f313048p;
        if (sb9.length() == 0 || (iD = (hVar = this.i).d(sb9, (sb6 = new StringBuilder()))) == 0) {
            return false;
        }
        sb9.setLength(0);
        sb9.append((CharSequence) sb6);
        String strL = hVar.l(iD);
        if ("001".equals(strL)) {
            this.k = hVar.g(iD);
        } else if (!strL.equals(this.f313044j)) {
            k kVarH = hVar.h(hVar.l(hVar.f(strL)));
            if (kVarH == null) {
                kVarH = f313037s;
            }
            this.k = kVarH;
        }
        String string = Integer.toString(iD);
        StringBuilder sb10 = this.f313046m;
        sb10.append(string);
        sb10.append(p.SPACE_CHAR);
        this.o = "";
        return true;
    }

    public final boolean d() {
        Pattern patternA = this.f313050r.a("\\+|" + this.k.K);
        StringBuilder sb6 = this.d;
        Matcher matcher = patternA.matcher(sb6);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.f313042g = true;
        int iEnd = matcher.end();
        StringBuilder sb9 = this.f313048p;
        sb9.setLength(0);
        sb9.append(sb6.substring(iEnd));
        StringBuilder sb10 = this.f313046m;
        sb10.setLength(0);
        sb10.append(sb6.substring(0, iEnd));
        if (sb6.charAt(0) != '+') {
            sb10.append(p.SPACE_CHAR);
        }
        return true;
    }

    public final String e() {
        for (i iVar : this.f313049q) {
            Matcher matcher = this.f313050r.a(iVar.f313071a).matcher(this.f313048p);
            if (matcher.matches()) {
                this.f313047n = u.matcher(iVar.e).find();
                String strA = a(matcher.replaceAll(iVar.f313072b));
                if (h.s(strA, h.f313055j).contentEquals(this.d)) {
                    return strA;
                }
            }
        }
        return "";
    }

    public final String f() {
        StringBuilder sb6 = this.f313048p;
        int length = sb6.length();
        if (length <= 0) {
            return this.f313046m.toString();
        }
        String strH = "";
        for (int i = 0; i < length; i++) {
            strH = h(sb6.charAt(i));
        }
        return this.e ? a(strH) : this.f313041c.toString();
    }

    public final String g(char c2) {
        StringBuilder sb6 = this.f313041c;
        sb6.append(c2);
        boolean zIsDigit = Character.isDigit(c2);
        StringBuilder sb9 = this.d;
        StringBuilder sb10 = this.f313048p;
        if (!zIsDigit && (sb6.length() != 1 || !h.f313058n.matcher(Character.toString(c2)).matches())) {
            this.e = false;
            this.f = true;
        } else if (c2 == '+') {
            sb9.append(c2);
        } else {
            c2 = Character.forDigit(Character.digit(c2, 10), 10);
            sb9.append(c2);
            sb10.append(c2);
        }
        boolean z = this.e;
        ArrayList arrayList = this.f313049q;
        StringBuilder sb11 = this.f313046m;
        if (z) {
            int length = sb9.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb6.toString();
            }
            if (length == 3) {
                if (!d()) {
                    this.o = k();
                    return b();
                }
                this.f313043h = true;
            }
            if (this.f313043h) {
                if (c()) {
                    this.f313043h = false;
                }
                return ((Object) sb11) + sb10.toString();
            }
            if (arrayList.size() <= 0) {
                return b();
            }
            String strH = h(c2);
            String strE = e();
            if (strE.length() > 0) {
                return strE;
            }
            j(sb10.toString());
            return i() ? f() : this.e ? a(strH) : sb6.toString();
        }
        if (this.f) {
            return sb6.toString();
        }
        boolean zD = d();
        StringBuilder sb12 = this.f313039a;
        if (!zD) {
            if (this.o.length() > 0) {
                sb10.insert(0, this.o);
                sb11.setLength(sb11.lastIndexOf(this.o));
            }
            if (!this.o.equals(k())) {
                sb11.append(p.SPACE_CHAR);
                this.e = true;
                this.f313043h = false;
                arrayList.clear();
                this.f313045l = 0;
                sb12.setLength(0);
                this.f313040b = "";
                return b();
            }
        } else if (c()) {
            this.e = true;
            this.f313043h = false;
            arrayList.clear();
            this.f313045l = 0;
            sb12.setLength(0);
            this.f313040b = "";
            return b();
        }
        return sb6.toString();
    }

    public final String h(char c2) {
        Pattern pattern = v;
        StringBuilder sb6 = this.f313039a;
        Matcher matcher = pattern.matcher(sb6);
        if (!matcher.find(this.f313045l)) {
            if (this.f313049q.size() == 1) {
                this.e = false;
            }
            this.f313040b = "";
            return this.f313041c.toString();
        }
        String strReplaceFirst = matcher.replaceFirst(Character.toString(c2));
        sb6.replace(0, strReplaceFirst.length(), strReplaceFirst);
        int iStart = matcher.start();
        this.f313045l = iStart;
        return sb6.substring(0, iStart + 1);
    }

    public final boolean i() {
        Iterator it8 = this.f313049q.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            String str = iVar.f313071a;
            if (this.f313040b.equals(str)) {
                return false;
            }
            String str2 = iVar.f313071a;
            StringBuilder sb6 = this.f313039a;
            sb6.setLength(0);
            String str3 = iVar.f313072b;
            Matcher matcher = this.f313050r.a(str2).matcher("999999999999999");
            matcher.find();
            String strGroup = matcher.group();
            String strReplaceAll = strGroup.length() < this.f313048p.length() ? "" : strGroup.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (strReplaceAll.length() > 0) {
                sb6.append(strReplaceAll);
                this.f313040b = str;
                this.f313047n = u.matcher(iVar.e).find();
                this.f313045l = 0;
                return true;
            }
            it8.remove();
        }
        this.e = false;
        return false;
    }

    public final void j(String str) {
        int length = str.length() - 3;
        Iterator it8 = this.f313049q.iterator();
        while (it8.hasNext()) {
            i iVar = (i) it8.next();
            if (iVar.f313073c.size() != 0) {
                if (!this.f313050r.a(iVar.a(Math.min(length, iVar.f313073c.size() - 1))).matcher(str).lookingAt()) {
                    it8.remove();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k() {
        /*
            r7 = this;
            yem.k r0 = r7.k
            int r0 = r0.J
            java.lang.StringBuilder r1 = r7.f313046m
            r2 = 0
            java.lang.StringBuilder r3 = r7.f313048p
            r4 = 1
            if (r0 != r4) goto L2d
            char r0 = r3.charAt(r2)
            r5 = 49
            if (r0 != r5) goto L2d
            char r0 = r3.charAt(r4)
            r6 = 48
            if (r0 == r6) goto L2d
            char r0 = r3.charAt(r4)
            if (r0 == r5) goto L2d
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r7.f313042g = r4
            goto L5a
        L2d:
            yem.k r0 = r7.k
            boolean r5 = r0.R
            if (r5 == 0) goto L59
            vc.j r5 = r7.f313050r
            java.lang.String r0 = r0.S
            java.util.regex.Pattern r0 = r5.a(r0)
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r5 = r0.lookingAt()
            if (r5 == 0) goto L59
            int r5 = r0.end()
            if (r5 <= 0) goto L59
            r7.f313042g = r4
            int r4 = r0.end()
            java.lang.String r0 = r3.substring(r2, r4)
            r1.append(r0)
            goto L5a
        L59:
            r4 = r2
        L5a:
            java.lang.String r0 = r3.substring(r2, r4)
            r3.delete(r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yem.a.k():java.lang.String");
    }
}
