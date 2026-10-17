package lrf;

import a0.d;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f199511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f199512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199513c;
    public final long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f199514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f199515h;
    public final Double i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f199516j;

    public a(double d, String currencyFrom, String currencyTo, long j2, long j3, long j5, long j16, String str, Double d5, Boolean bool, int i) {
        long j22 = (i & 16) != 0 ? 0L : j3;
        long j42 = (i & 32) != 0 ? 0L : j5;
        long j46 = (i & 64) == 0 ? j16 : 0L;
        String str2 = (i & 128) != 0 ? null : str;
        Double d6 = (i & 256) != 0 ? null : d5;
        Boolean bool2 = (i & 512) == 0 ? bool : null;
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        this.f199511a = d;
        this.f199512b = currencyFrom;
        this.f199513c = currencyTo;
        this.d = j2;
        this.e = j22;
        this.f = j42;
        this.f199514g = j46;
        this.f199515h = str2;
        this.i = d6;
        this.f199516j = bool2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f199511a, aVar.f199511a) == 0 && Intrinsics.f(this.f199512b, aVar.f199512b) && Intrinsics.f(this.f199513c, aVar.f199513c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f199514g == aVar.f199514g && Intrinsics.f(this.f199515h, aVar.f199515h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f199516j, aVar.f199516j);
    }

    public final int hashCode() {
        int iC = d.c(d.c(d.c(d.c(p.a.c(p.a.c(Double.hashCode(this.f199511a) * 31, 31, this.f199512b), 31, this.f199513c), 31, this.d), 31, this.e), 31, this.f), 31, this.f199514g);
        String str = this.f199515h;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.i;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.f199516j;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
