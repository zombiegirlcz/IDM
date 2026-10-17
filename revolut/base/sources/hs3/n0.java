package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154918b;

    public n0(String planDashboardSource, String title) {
        Intrinsics.checkNotNullParameter(planDashboardSource, "planDashboardSource");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154917a = planDashboardSource;
        this.f154918b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f154917a, n0Var.f154917a) && Intrinsics.f(this.f154918b, n0Var.f154918b);
    }

    public final int hashCode() {
        return this.f154918b.hashCode() + (this.f154917a.hashCode() * 31);
    }
}
