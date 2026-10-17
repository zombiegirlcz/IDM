package xka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f306641a;

    public m(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f306641a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f306641a, ((m) obj2).f306641a);
    }

    public final int hashCode() {
        return this.f306641a.hashCode();
    }
}
