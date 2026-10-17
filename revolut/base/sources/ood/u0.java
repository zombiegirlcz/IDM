package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f227085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f227086c;

    public u0(String tripId, List allTrips, wi0.b code) {
        Intrinsics.checkNotNullParameter(tripId, "tripId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
        this.f227084a = tripId;
        this.f227085b = code;
        this.f227086c = allTrips;
    }

    @Override // ood.w0
    public final List a() {
        return this.f227086c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f227084a, u0Var.f227084a) && Intrinsics.f(this.f227085b, u0Var.f227085b) && Intrinsics.f(this.f227086c, u0Var.f227086c);
    }

    public final int hashCode() {
        return this.f227086c.hashCode() + p.a.c(this.f227084a.hashCode() * 31, 31, this.f227085b.f297794a);
    }
}
