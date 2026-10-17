package tk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ah0.b f271837a;

    public d(ah0.b bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f271837a = bounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271837a, ((d) obj2).f271837a);
    }

    public final int hashCode() {
        return this.f271837a.hashCode();
    }
}
