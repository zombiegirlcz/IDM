package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f138898a;

    public n(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f138898a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f138898a, ((n) obj2).f138898a);
    }

    public final int hashCode() {
        return this.f138898a.hashCode();
    }
}
