package t2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f267550a;

    public i(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f267550a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f267550a, ((i) obj2).f267550a);
    }

    public final int hashCode() {
        return this.f267550a.hashCode();
    }
}
