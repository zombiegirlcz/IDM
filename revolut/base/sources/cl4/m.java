package cl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f24954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f24955b;

    public m(l interestFree, k kVar) {
        Intrinsics.checkNotNullParameter(interestFree, "interestFree");
        this.f24954a = interestFree;
        this.f24955b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f24954a, mVar.f24954a) && Intrinsics.f(this.f24955b, mVar.f24955b);
    }

    public final int hashCode() {
        int iHashCode = this.f24954a.f24953a.hashCode() * 31;
        k kVar = this.f24955b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
