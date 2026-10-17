package u2f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276651a;

    public o(String partnerPointsBuyRate) {
        Intrinsics.checkNotNullParameter(partnerPointsBuyRate, "partnerPointsBuyRate");
        this.f276651a = partnerPointsBuyRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f276651a, ((o) obj2).f276651a);
    }

    public final int hashCode() {
        return this.f276651a.hashCode();
    }
}
