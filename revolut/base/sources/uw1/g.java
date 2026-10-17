package uw1;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f283520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f283521b;

    public g(Set filters, Set newTransfer) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(newTransfer, "newTransfer");
        this.f283520a = filters;
        this.f283521b = newTransfer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f283520a, gVar.f283520a) && Intrinsics.f(this.f283521b, gVar.f283521b);
    }

    public final int hashCode() {
        return this.f283521b.hashCode() + (this.f283520a.hashCode() * 31);
    }
}
