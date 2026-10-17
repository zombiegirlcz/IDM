package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v0 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f227088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f227089b;

    public v0(List allTrips, wi0.b code) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
        this.f227088a = code;
        this.f227089b = allTrips;
    }

    @Override // ood.w0
    public final List a() {
        return this.f227089b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f227088a, v0Var.f227088a) && Intrinsics.f(this.f227089b, v0Var.f227089b);
    }

    public final int hashCode() {
        return this.f227089b.hashCode() + (this.f227088a.f297794a.hashCode() * 31);
    }
}
