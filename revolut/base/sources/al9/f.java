package al9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f6168a;

    public f(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f6168a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f6168a, ((f) obj2).f6168a);
    }

    public final int hashCode() {
        return this.f6168a.hashCode();
    }
}
