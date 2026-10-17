package w3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f294274b;

    public f(String orderId, boolean z) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        this.f294273a = orderId;
        this.f294274b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f294273a, fVar.f294273a) && this.f294274b == fVar.f294274b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f294274b) + (this.f294273a.hashCode() * 31);
    }
}
