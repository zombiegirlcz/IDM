package wp5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f299128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f299129b;

    public l(io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f299128a = pocket;
        this.f299129b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f299128a, lVar.f299128a) && this.f299129b == lVar.f299129b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f299129b) + (this.f299128a.hashCode() * 31);
    }

    @Override // wp5.n
    public final boolean isActive() {
        return this.f299129b;
    }
}
