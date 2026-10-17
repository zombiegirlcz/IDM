package t61;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements Serializable {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final j f268157r = new j((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (m5l.b) null, (String) null, (String) null, false, BitmapDescriptorFactory.HUE_RED, (Long) null, false, (String) null, (String) null, (String) null, 125951);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f268158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f268159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f268160c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m5l.b f268161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f268162h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f268163j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f268164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f268165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f268166n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f268167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f268168q;

    public /* synthetic */ j(String str, String str2, String str3, String str4, String str5, String str6, m5l.b bVar, String str7, String str8, boolean z, float f, Long l2, boolean z3, String str9, String str10, String str11, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bVar, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? true : z, f, (i & 2048) != 0 ? null : l2, z3, (i & 8192) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, (i & 32768) != 0 ? null : str11, (i) null);
    }

    public static j a(j jVar) {
        String bin = jVar.f268158a;
        String str = jVar.f268159b;
        String str2 = jVar.f268160c;
        String str3 = jVar.d;
        String str4 = jVar.e;
        String str5 = jVar.f;
        m5l.b bVar = jVar.f268161g;
        String currency = jVar.f268162h;
        String country = jVar.i;
        boolean z = jVar.f268163j;
        float f = jVar.k;
        Long l2 = jVar.f268164l;
        boolean z3 = jVar.f268165m;
        String str6 = jVar.f268166n;
        String str7 = jVar.o;
        String str8 = jVar.f268167p;
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        return new j(bin, str, str2, str3, str4, str5, bVar, currency, country, z, f, l2, z3, str6, str7, str8, (i) null);
    }

    public final String b() {
        return this.f268167p;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f268158a, jVar.f268158a) && Intrinsics.f(this.f268159b, jVar.f268159b) && Intrinsics.f(this.f268160c, jVar.f268160c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f268161g == jVar.f268161g && Intrinsics.f(this.f268162h, jVar.f268162h) && Intrinsics.f(this.i, jVar.i) && this.f268163j == jVar.f268163j && Float.compare(this.k, jVar.k) == 0 && Intrinsics.f(this.f268164l, jVar.f268164l) && this.f268165m == jVar.f268165m && Intrinsics.f(this.f268166n, jVar.f268166n) && Intrinsics.f(this.o, jVar.o) && Intrinsics.f(this.f268167p, jVar.f268167p) && Intrinsics.f(this.f268168q, jVar.f268168q);
    }

    public final int hashCode() {
        int iHashCode = this.f268158a.hashCode() * 31;
        String str = this.f268159b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f268160c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        m5l.b bVar = this.f268161g;
        int iB = m72.b.b(this.k, j6.a.c(p.a.c(p.a.c((iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f268162h), 31, this.i), 31, this.f268163j), 31);
        Long l2 = this.f268164l;
        int iC = j6.a.c((iB + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f268165m);
        String str6 = this.f268166n;
        int iHashCode7 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.o;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f268167p;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        i iVar = this.f268168q;
        return iHashCode9 + (iVar != null ? iVar.hashCode() : 0);
    }

    public j(String bin, String str, String str2, String str3, String str4, String str5, m5l.b bVar, String currency, String country, boolean z, float f, Long l2, boolean z3, String str6, String str7, String str8, i iVar) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f268158a = bin;
        this.f268159b = str;
        this.f268160c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f268161g = bVar;
        this.f268162h = currency;
        this.i = country;
        this.f268163j = z;
        this.k = f;
        this.f268164l = l2;
        this.f268165m = z3;
        this.f268166n = str6;
        this.o = str7;
        this.f268167p = str8;
        this.f268168q = iVar;
    }
}
