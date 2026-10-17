package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f138896a;

    public l(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f138896a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f138896a, ((l) obj2).f138896a);
    }

    public final int hashCode() {
        return this.f138896a.hashCode();
    }
}
