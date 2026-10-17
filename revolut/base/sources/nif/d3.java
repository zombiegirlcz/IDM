package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f215756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215757b;

    public d3(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215756a = j2;
        this.f215757b = currency;
    }

    public final long a() {
        return this.f215756a;
    }

    public final String b() {
        return this.f215757b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return this.f215756a == d3Var.f215756a && Intrinsics.f(this.f215757b, d3Var.f215757b);
    }

    public final int hashCode() {
        return this.f215757b.hashCode() + (Long.hashCode(this.f215756a) * 31);
    }
}
