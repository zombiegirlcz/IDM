package vad;

import java.time.LocalDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f287272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f287274c;
    public final LocalDateTime d;
    public final LocalDateTime e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f287275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f287276h;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f287272a == gVar.f287272a && Intrinsics.f(this.f287273b, gVar.f287273b) && Intrinsics.f(this.f287274c, gVar.f287274c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f287275g, gVar.f287275g) && Intrinsics.f(this.f287276h, gVar.f287276h);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f287272a.hashCode() * 31, 31, this.f287273b), 31, this.f287274c);
        LocalDateTime localDateTime = this.d;
        int iHashCode = (iD + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.e;
        int iHashCode2 = (iHashCode + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f287275g;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.f287276h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public g(e product, List states, List currencies, LocalDateTime localDateTime, LocalDateTime localDateTime2, Long l2, Long l3, String str) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f287272a = product;
        this.f287273b = states;
        this.f287274c = currencies;
        this.d = localDateTime;
        this.e = localDateTime2;
        this.f = l2;
        this.f287275g = l3;
        this.f287276h = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(int i) {
        e eVar = e.PAYMENT_LINK;
        f0 f0Var = f0.f322471a;
        this(eVar, f0Var, f0Var, null, null, null, null, null);
    }
}
