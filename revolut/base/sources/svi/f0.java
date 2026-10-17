package svi;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265905c;

    public f0(dj0.d monetaryAmount, String token, String points) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(monetaryAmount, "monetaryAmount");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f265903a = token;
        this.f265904b = monetaryAmount;
        this.f265905c = points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f265903a, f0Var.f265903a) && Intrinsics.f(this.f265904b, f0Var.f265904b) && Intrinsics.f(this.f265905c, f0Var.f265905c);
    }

    public final int hashCode() {
        return this.f265905c.hashCode() + v7.c(this.f265903a.hashCode() * 31, 31, this.f265904b);
    }
}
