package nu0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f219186a;

    public k(j side) {
        Intrinsics.checkNotNullParameter(side, "side");
        this.f219186a = side;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f219186a == ((k) obj2).f219186a;
    }

    public final int hashCode() {
        return this.f219186a.hashCode();
    }
}
