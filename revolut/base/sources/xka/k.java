package xka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f306639a;

    public k(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f306639a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f306639a, ((k) obj2).f306639a);
    }

    public final int hashCode() {
        return this.f306639a.hashCode();
    }
}
