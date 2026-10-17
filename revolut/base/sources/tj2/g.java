package tj2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f271604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f271605b;

    public g(c limitType, dj0.d limitAmount) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        this.f271604a = limitType;
        this.f271605b = limitAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f271604a == gVar.f271604a && Intrinsics.f(this.f271605b, gVar.f271605b);
    }

    public final int hashCode() {
        return this.f271605b.hashCode() + (this.f271604a.hashCode() * 31);
    }
}
