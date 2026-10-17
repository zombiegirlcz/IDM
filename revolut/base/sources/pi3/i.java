package pi3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f236407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f236408b;

    public i(dj0.d pointsToRedeem, dj0.d fiatEquivalent) {
        Intrinsics.checkNotNullParameter(pointsToRedeem, "pointsToRedeem");
        Intrinsics.checkNotNullParameter(fiatEquivalent, "fiatEquivalent");
        this.f236407a = pointsToRedeem;
        this.f236408b = fiatEquivalent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236407a, iVar.f236407a) && Intrinsics.f(this.f236408b, iVar.f236408b);
    }

    public final int hashCode() {
        return this.f236408b.hashCode() + (this.f236407a.hashCode() * 31);
    }
}
