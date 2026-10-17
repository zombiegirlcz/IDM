package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f265917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f265918c;

    public h0(String planId, y passType, dj0.d passPrice) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(passPrice, "passPrice");
        this.f265916a = planId;
        this.f265917b = passType;
        this.f265918c = passPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f265916a, h0Var.f265916a) && this.f265917b == h0Var.f265917b && Intrinsics.f(this.f265918c, h0Var.f265918c);
    }

    public final int hashCode() {
        return this.f265918c.hashCode() + ((this.f265917b.hashCode() + (this.f265916a.hashCode() * 31)) * 31);
    }
}
