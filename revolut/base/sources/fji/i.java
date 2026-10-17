package fji;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f135644a;

    public i(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f135644a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f135644a, ((i) obj2).f135644a);
    }

    public final int hashCode() {
        return this.f135644a.hashCode();
    }
}
