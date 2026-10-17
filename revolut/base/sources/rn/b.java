package rn;

import a0.d;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f255373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f255374c;
    public final AnalyticsContext d;
    public final String e;
    public final AnalyticsProduct f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f255375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f255376h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f255377j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f255378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f255379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f255380n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f255381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f255382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f255383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f255384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f255385t;
    public Long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String identifier, Integer num, boolean z, AnalyticsContext analyticsContext, String str, AnalyticsProduct analyticsProduct, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, int i, int i2, int i3, int i5, int i6, long j2, long j3, Long l2) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f255372a = identifier;
        this.f255373b = num;
        this.f255374c = z;
        this.d = analyticsContext;
        this.e = str;
        this.f = analyticsProduct;
        this.f255375g = str2;
        this.f255376h = num2;
        this.i = str3;
        this.f255377j = str4;
        this.k = str5;
        this.f255378l = num3;
        this.f255379m = str6;
        this.f255380n = i;
        this.o = i2;
        this.f255381p = i3;
        this.f255382q = i5;
        this.f255383r = i6;
        this.f255384s = j2;
        this.f255385t = j3;
        this.u = l2;
    }

    @Override // rn.c
    public final String a() {
        return this.f255372a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f255372a, bVar.f255372a) && Intrinsics.f(this.f255373b, bVar.f255373b) && this.f255374c == bVar.f255374c && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f255375g, bVar.f255375g) && Intrinsics.f(this.f255376h, bVar.f255376h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f255377j, bVar.f255377j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f255378l, bVar.f255378l) && Intrinsics.f(this.f255379m, bVar.f255379m) && this.f255380n == bVar.f255380n && this.o == bVar.o && this.f255381p == bVar.f255381p && this.f255382q == bVar.f255382q && this.f255383r == bVar.f255383r && this.f255384s == bVar.f255384s && this.f255385t == bVar.f255385t && Intrinsics.f(this.u, bVar.u);
    }

    public final int hashCode() {
        int iHashCode = this.f255372a.hashCode() * 31;
        Integer num = this.f255373b;
        int iC = j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f255374c);
        AnalyticsContext analyticsContext = this.d;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        String str = this.e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.f;
        int iHashCode3 = (iHashCode2 + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
        String str2 = this.f255375g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f255376h;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f255377j;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f255378l;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.f255379m;
        int iC2 = d.c(d.c(j6.a.b(this.f255383r, j6.a.b(this.f255382q, j6.a.b(this.f255381p, j6.a.b(this.o, j6.a.b(this.f255380n, (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31, 31), 31), 31), 31), 31), 31, this.f255384s), 31, this.f255385t);
        Long l2 = this.u;
        return iC2 + (l2 != null ? l2.hashCode() : 0);
    }
}
