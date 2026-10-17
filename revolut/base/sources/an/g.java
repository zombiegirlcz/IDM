package an;

import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0.a f6505a;

    public g(p0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f6505a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f6505a, ((g) obj2).f6505a);
    }

    public final int hashCode() {
        return this.f6505a.hashCode();
    }
}
