package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f138892a;

    public h(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f138892a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f138892a, ((h) obj2).f138892a);
    }

    public final int hashCode() {
        return this.f138892a.hashCode();
    }
}
