package p4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f232932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f232933b;

    public b(c source, Object obj2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f232932a = source;
        this.f232933b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f232932a == bVar.f232932a && Intrinsics.f(this.f232933b, bVar.f232933b);
    }

    public final int hashCode() {
        int iHashCode = this.f232932a.hashCode() * 31;
        Object obj2 = this.f232933b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
