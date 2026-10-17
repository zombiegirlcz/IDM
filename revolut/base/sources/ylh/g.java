package ylh;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f314715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f314716b;

    public g(w currentPeriodType, LinkedHashMap periods) {
        Intrinsics.checkNotNullParameter(currentPeriodType, "currentPeriodType");
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.f314715a = currentPeriodType;
        this.f314716b = periods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f314715a == gVar.f314715a && this.f314716b.equals(gVar.f314716b);
    }

    public final int hashCode() {
        return this.f314716b.hashCode() + (this.f314715a.hashCode() * 31);
    }
}
