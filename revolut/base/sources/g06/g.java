package g06;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f139357a;

    public g(dj0.d tipAmount) {
        Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
        this.f139357a = tipAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f139357a, ((g) obj2).f139357a);
    }

    public final int hashCode() {
        return this.f139357a.hashCode();
    }
}
