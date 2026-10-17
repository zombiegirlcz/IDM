package ea4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f124135a;

    public k(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f124135a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f124135a, ((k) obj2).f124135a);
    }

    public final int hashCode() {
        return this.f124135a.hashCode();
    }
}
