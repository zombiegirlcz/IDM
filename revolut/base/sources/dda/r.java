package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f113194b;

    public r(String value, t tVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f113193a = value;
        this.f113194b = tVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f113193a, rVar.f113193a) && Intrinsics.f(this.f113194b, rVar.f113194b);
    }

    public final int hashCode() {
        int iHashCode = this.f113193a.hashCode() * 31;
        t tVar = this.f113194b;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }
}
