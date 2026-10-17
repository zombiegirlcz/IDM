package svi;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f265962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f265963c;
    public final String d;
    public final boolean e;

    public p0(int i, int i2, Instant renewalDate, String planName, boolean z) {
        Intrinsics.checkNotNullParameter(renewalDate, "renewalDate");
        Intrinsics.checkNotNullParameter(planName, "planName");
        this.f265961a = i;
        this.f265962b = i2;
        this.f265963c = renewalDate;
        this.d = planName;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f265961a == p0Var.f265961a && this.f265962b == p0Var.f265962b && Intrinsics.f(this.f265963c, p0Var.f265963c) && Intrinsics.f(this.d, p0Var.d) && this.e == p0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(r6.b.c(j6.a.b(this.f265962b, Integer.hashCode(this.f265961a) * 31, 31), 31, this.f265963c), 31, this.d);
    }
}
