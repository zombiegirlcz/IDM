package q35;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f241847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f241848c;
    public final ArrayList d;

    public z(String refinancingIdentifier, y refinancingState, String loanId, ArrayList refinancedCredits) {
        Intrinsics.checkNotNullParameter(refinancingIdentifier, "refinancingIdentifier");
        Intrinsics.checkNotNullParameter(refinancingState, "refinancingState");
        Intrinsics.checkNotNullParameter(loanId, "loanId");
        Intrinsics.checkNotNullParameter(refinancedCredits, "refinancedCredits");
        this.f241846a = refinancingIdentifier;
        this.f241847b = refinancingState;
        this.f241848c = loanId;
        this.d = refinancedCredits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f241846a, zVar.f241846a) && this.f241847b == zVar.f241847b && Intrinsics.f(this.f241848c, zVar.f241848c) && this.d.equals(zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c((this.f241847b.hashCode() + (this.f241846a.hashCode() * 31)) * 31, 31, this.f241848c);
    }
}
