package fy4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f138897a;

    public m(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f138897a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f138897a, ((m) obj2).f138897a);
    }

    public final int hashCode() {
        return this.f138897a.hashCode();
    }
}
