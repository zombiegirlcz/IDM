package v2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f285722a;

    public n(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f285722a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f285722a, ((n) obj2).f285722a);
    }

    public final int hashCode() {
        return this.f285722a.hashCode();
    }
}
