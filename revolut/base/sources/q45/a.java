package q45;

import kotlin.jvm.internal.Intrinsics;
import o45.w1;
import o45.z;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f242064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f242065b;

    public a(w1 loan, z zVar) {
        Intrinsics.checkNotNullParameter(loan, "loan");
        this.f242064a = loan;
        this.f242065b = zVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f242064a, aVar.f242064a) && Intrinsics.f(this.f242065b, aVar.f242065b);
    }

    public final int hashCode() {
        int iHashCode = this.f242064a.hashCode() * 31;
        z zVar = this.f242065b;
        return iHashCode + (zVar == null ? 0 : zVar.hashCode());
    }
}
