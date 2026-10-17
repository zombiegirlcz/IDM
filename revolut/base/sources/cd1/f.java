package cd1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23153b;

    public f(boolean z, String str) {
        this.f23152a = z;
        this.f23153b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f23152a == fVar.f23152a && Intrinsics.f(this.f23153b, fVar.f23153b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f23152a) * 31;
        String str = this.f23153b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
