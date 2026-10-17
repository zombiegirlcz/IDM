package s82;

import h02.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f260878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f260879b;

    public c(dj0.d targetAmount, g gVar) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        this.f260878a = targetAmount;
        this.f260879b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f260878a, cVar.f260878a) && Intrinsics.f(this.f260879b, cVar.f260879b);
    }

    public final int hashCode() {
        int iHashCode = this.f260878a.hashCode() * 31;
        g gVar = this.f260879b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}
