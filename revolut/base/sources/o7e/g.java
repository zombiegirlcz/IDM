package o7e;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f222773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f222774b;

    public g(dj0.d sum, ArrayList activeBills) {
        Intrinsics.checkNotNullParameter(activeBills, "activeBills");
        Intrinsics.checkNotNullParameter(sum, "sum");
        this.f222773a = activeBills;
        this.f222774b = sum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f222773a.equals(gVar.f222773a) && Intrinsics.f(this.f222774b, gVar.f222774b);
    }

    public final int hashCode() {
        return this.f222774b.hashCode() + (this.f222773a.hashCode() * 31);
    }
}
