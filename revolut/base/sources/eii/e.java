package eii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f126651a;

    public e(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f126651a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f126651a, ((e) obj2).f126651a);
    }

    public final int hashCode() {
        return this.f126651a.hashCode();
    }
}
