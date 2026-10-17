package iw5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f168964a;

    public d(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f168964a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f168964a, ((d) obj2).f168964a);
    }

    public final int hashCode() {
        return this.f168964a.hashCode();
    }
}
