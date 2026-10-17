package e54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx4.a f122755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f122756b;

    public n(dx4.a action, Long l2) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f122755a = action;
        this.f122756b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f122755a, nVar.f122755a) && Intrinsics.f(this.f122756b, nVar.f122756b);
    }

    public final int hashCode() {
        int iHashCode = this.f122755a.f120542a.hashCode() * 31;
        Long l2 = this.f122756b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }
}
