package v23;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f285635a;

    public i(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f285635a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f285635a, ((i) obj2).f285635a);
    }

    public final int hashCode() {
        return this.f285635a.hashCode();
    }
}
