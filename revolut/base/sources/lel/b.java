package lel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f194591c;
    public final String d;
    public final xi0.b e;
    public final wi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f194592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f194593h;

    public b(String symbol, String ref2, String str, String str2, xi0.b bVar, wi0.b bVar2, Double d, Double d5) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f194589a = symbol;
        this.f194590b = ref2;
        this.f194591c = str;
        this.d = str2;
        this.e = bVar;
        this.f = bVar2;
        this.f194592g = d;
        this.f194593h = d5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f194589a, bVar.f194589a) && Intrinsics.f(this.f194590b, bVar.f194590b) && Intrinsics.f(this.f194591c, bVar.f194591c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f194592g, bVar.f194592g) && Intrinsics.f(this.f194593h, bVar.f194593h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f194589a.hashCode() * 31, 31, this.f194590b);
        String str = this.f194591c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        xi0.b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        wi0.b bVar2 = this.f;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.f297794a.hashCode())) * 31;
        Double d = this.f194592g;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f194593h;
        return iHashCode5 + (d5 != null ? d5.hashCode() : 0);
    }
}
