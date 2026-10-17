package eg2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f125530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f125531b;

    public h(io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f125530a = z;
        this.f125531b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f125530a == hVar.f125530a && Intrinsics.f(this.f125531b, hVar.f125531b);
    }

    public final int hashCode() {
        return this.f125531b.hashCode() + (Boolean.hashCode(this.f125530a) * 31);
    }
}
