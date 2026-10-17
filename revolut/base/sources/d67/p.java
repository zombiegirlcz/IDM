package d67;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f111461a;

    public p(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f111461a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f111461a, ((p) obj2).f111461a);
    }

    public final int hashCode() {
        return this.f111461a.hashCode();
    }
}
