package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113673c;
    public final Boolean d;

    public v3(String newSubscription, String topUpSubscription, String esimNotInstalled, Boolean bool) {
        Intrinsics.checkNotNullParameter(newSubscription, "newSubscription");
        Intrinsics.checkNotNullParameter(topUpSubscription, "topUpSubscription");
        Intrinsics.checkNotNullParameter(esimNotInstalled, "esimNotInstalled");
        this.f113671a = newSubscription;
        this.f113672b = topUpSubscription;
        this.f113673c = esimNotInstalled;
        this.d = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f113671a, v3Var.f113671a) && Intrinsics.f(this.f113672b, v3Var.f113672b) && Intrinsics.f(this.f113673c, v3Var.f113673c) && Intrinsics.f(this.d, v3Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f113671a.hashCode() * 31, 31, this.f113672b), 31, this.f113673c);
        Boolean bool = this.d;
        return iC + (bool == null ? 0 : bool.hashCode());
    }
}
