package d9;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f112313h = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f112315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Locale f112316c;
    public final String d;
    public final Boolean e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient TimeZone f112317g;

    public p() {
        this("", o.ANY, "", "", n.f112310c, null);
    }

    public static boolean a(Object obj2, Serializable serializable) {
        if (obj2 == null) {
            return serializable == null;
        }
        if (serializable == null) {
            return false;
        }
        return obj2.equals(serializable);
    }

    public final Boolean b(m mVar) {
        n nVar = this.f;
        nVar.getClass();
        int iOrdinal = 1 << mVar.ordinal();
        if ((nVar.f112312b & iOrdinal) != 0) {
            return Boolean.FALSE;
        }
        if ((iOrdinal & nVar.f112311a) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final boolean c() {
        if (this.f112317g != null) {
            return true;
        }
        String str = this.d;
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[PHI: r1
      0x0054: PHI (r1v9 d9.n) = (r1v8 d9.n), (r1v10 d9.n), (r1v8 d9.n), (r1v8 d9.n) binds: [B:26:0x0037, B:40:0x0056, B:38:0x0052, B:30:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final d9.p d(d9.p r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L7e
            d9.n r0 = r11.f
            d9.p r1 = d9.p.f112313h
            if (r11 == r1) goto L7e
            if (r11 != r10) goto Lc
            goto L7e
        Lc:
            if (r10 != r1) goto Lf
            return r11
        Lf:
            java.lang.String r1 = r11.f112314a
            if (r1 == 0) goto L1c
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r3 = r1
            goto L1f
        L1c:
            java.lang.String r1 = r10.f112314a
            goto L1a
        L1f:
            d9.o r1 = r11.f112315b
            d9.o r2 = d9.o.ANY
            if (r1 != r2) goto L27
            d9.o r1 = r10.f112315b
        L27:
            r4 = r1
            java.util.Locale r1 = r11.f112316c
            if (r1 != 0) goto L2e
            java.util.Locale r1 = r10.f112316c
        L2e:
            r5 = r1
            d9.n r1 = r10.f
            if (r1 != 0) goto L35
        L33:
            r8 = r0
            goto L5c
        L35:
            int r2 = r1.f112312b
            if (r0 != 0) goto L3a
            goto L54
        L3a:
            int r6 = r0.f112312b
            int r7 = r0.f112311a
            if (r6 != 0) goto L43
            if (r7 != 0) goto L43
            goto L54
        L43:
            int r8 = r1.f112311a
            if (r8 != 0) goto L4a
            if (r2 != 0) goto L4a
            goto L33
        L4a:
            int r0 = ~r6
            r0 = r0 & r8
            r0 = r0 | r7
            int r7 = ~r7
            r7 = r7 & r2
            r6 = r6 | r7
            if (r0 != r8) goto L56
            if (r6 != r2) goto L56
        L54:
            r0 = r1
            goto L33
        L56:
            d9.n r1 = new d9.n
            r1.<init>(r0, r6)
            goto L54
        L5c:
            java.lang.Boolean r0 = r11.e
            if (r0 != 0) goto L62
            java.lang.Boolean r0 = r10.e
        L62:
            r9 = r0
            java.lang.String r0 = r11.d
            if (r0 == 0) goto L73
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L6e
            goto L73
        L6e:
            java.util.TimeZone r11 = r11.f112317g
        L70:
            r7 = r11
            r6 = r0
            goto L78
        L73:
            java.util.TimeZone r11 = r10.f112317g
            java.lang.String r0 = r10.d
            goto L70
        L78:
            d9.p r2 = new d9.p
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.p.d(d9.p):d9.p");
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != p.class) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f112315b == pVar.f112315b && this.f.equals(pVar.f) && a(this.e, pVar.e) && a(this.d, pVar.d) && a(this.f112314a, pVar.f112314a) && a(this.f112317g, pVar.f112317g) && a(this.f112316c, pVar.f112316c);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this.f112314a;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iHashCode2 = this.f112315b.hashCode() + iHashCode;
        Boolean bool = this.e;
        if (bool != null) {
            iHashCode2 ^= bool.hashCode();
        }
        Locale locale = this.f112316c;
        if (locale != null) {
            iHashCode2 += locale.hashCode();
        }
        return this.f.hashCode() ^ iHashCode2;
    }

    public final String toString() {
        return "JsonFormat.Value(pattern=" + this.f112314a + ",shape=" + this.f112315b + ",lenient=" + this.e + ",locale=" + this.f112316c + ",timezone=" + this.d + ",features=" + this.f + ")";
    }

    public p(String str, o oVar, String str2, String str3, n nVar, Boolean bool) {
        this(str, oVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, nVar, bool);
    }

    public p(String str, o oVar, Locale locale, String str2, TimeZone timeZone, n nVar, Boolean bool) {
        this.f112314a = str == null ? "" : str;
        this.f112315b = oVar == null ? o.ANY : oVar;
        this.f112316c = locale;
        this.f112317g = timeZone;
        this.d = str2;
        this.f = nVar == null ? n.f112310c : nVar;
        this.e = bool;
    }
}
