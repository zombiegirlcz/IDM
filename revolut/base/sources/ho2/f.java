package ho2;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f154207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154209c;

    public f(String prefix, String number, wi0.b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f154207a = country;
        this.f154208b = prefix;
        this.f154209c = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f154207a, fVar.f154207a) && Intrinsics.f(this.f154208b, fVar.f154208b) && Intrinsics.f(this.f154209c, fVar.f154209c);
    }

    public final int hashCode() {
        return this.f154209c.hashCode() + p.a.c(this.f154207a.f297794a.hashCode() * 31, 31, this.f154208b);
    }
}
