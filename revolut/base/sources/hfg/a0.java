package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151805c;

    public a0(String departureIataCode, String arrivalIataCode, String provider) {
        Intrinsics.checkNotNullParameter(departureIataCode, "departureIataCode");
        Intrinsics.checkNotNullParameter(arrivalIataCode, "arrivalIataCode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f151803a = departureIataCode;
        this.f151804b = arrivalIataCode;
        this.f151805c = provider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f151803a, a0Var.f151803a) && Intrinsics.f(this.f151804b, a0Var.f151804b) && Intrinsics.f(this.f151805c, a0Var.f151805c);
    }

    public final int hashCode() {
        return this.f151805c.hashCode() + p.a.c(this.f151803a.hashCode() * 31, 31, this.f151804b);
    }
}
