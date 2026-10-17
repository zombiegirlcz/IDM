package oe4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f224528a;

    public k(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f224528a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f224528a, ((k) obj2).f224528a);
    }

    public final int hashCode() {
        return this.f224528a.hashCode();
    }
}
