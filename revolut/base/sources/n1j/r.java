package n1j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1j.d f211398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f211399b;

    public r(j1j.d selectedBalance, boolean z) {
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        this.f211398a = selectedBalance;
        this.f211399b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f211398a, rVar.f211398a) && this.f211399b == rVar.f211399b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f211399b) + (this.f211398a.hashCode() * 31);
    }
}
