package wbl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f296270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296271b;

    public k(n state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f296270a = state;
        this.f296271b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f296270a == kVar.f296270a && Intrinsics.f(this.f296271b, kVar.f296271b);
    }

    public final int hashCode() {
        int iHashCode = this.f296270a.hashCode() * 31;
        String str = this.f296271b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
