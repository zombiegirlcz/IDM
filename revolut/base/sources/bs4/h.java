package bs4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql4.j f18048a;

    public h(ql4.j paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f18048a = paymentMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f18048a == ((h) obj2).f18048a;
    }

    public final int hashCode() {
        return this.f18048a.hashCode();
    }
}
