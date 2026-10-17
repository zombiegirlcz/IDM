package t9f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ej0.b f269021a;

    public j(ej0.b buyInPrice) {
        Intrinsics.checkNotNullParameter(buyInPrice, "buyInPrice");
        this.f269021a = buyInPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f269021a, ((j) obj2).f269021a);
    }

    public final int hashCode() {
        return this.f269021a.hashCode();
    }
}
