package nha;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f215395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f215396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f215397c;
    public final Instant d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f215398g;

    public d(dj0.d minimumBalance, dj0.d dVar, Instant startDate, Instant endDate, String pricingPlanId, String str, String str2) {
        Intrinsics.checkNotNullParameter(minimumBalance, "minimumBalance");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        this.f215395a = minimumBalance;
        this.f215396b = dVar;
        this.f215397c = startDate;
        this.d = endDate;
        this.e = pricingPlanId;
        this.f = str;
        this.f215398g = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f215395a, dVar.f215395a) && Intrinsics.f(this.f215396b, dVar.f215396b) && Intrinsics.f(this.f215397c, dVar.f215397c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f215398g, dVar.f215398g);
    }

    public final int hashCode() {
        int iHashCode = this.f215395a.hashCode() * 31;
        dj0.d dVar = this.f215396b;
        int iC = p.a.c(r6.b.c(r6.b.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f215397c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215398g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
