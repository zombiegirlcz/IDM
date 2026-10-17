package bjl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f16174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16175b;

    public k(d0 signInData, j jVar) {
        Intrinsics.checkNotNullParameter(signInData, "signInData");
        this.f16174a = signInData;
        this.f16175b = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f16174a, kVar.f16174a) && Intrinsics.f(this.f16175b, kVar.f16175b);
    }

    public final int hashCode() {
        int iHashCode = this.f16174a.hashCode() * 31;
        j jVar = this.f16175b;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
