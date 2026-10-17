package eii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f126654a;

    public h(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f126654a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f126654a, ((h) obj2).f126654a);
    }

    public final int hashCode() {
        return this.f126654a.hashCode();
    }
}
