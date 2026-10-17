package fce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qua.p f133706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133707b;

    public i(qua.p subscription, boolean z) {
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.f133706a = subscription;
        this.f133707b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f133706a, iVar.f133706a) && this.f133707b == iVar.f133707b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133707b) + (this.f133706a.hashCode() * 31);
    }
}
