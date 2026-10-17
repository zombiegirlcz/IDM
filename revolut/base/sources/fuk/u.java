package fuk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f138273a;

    public u(b chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f138273a = chart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f138273a == ((u) obj2).f138273a;
    }

    public final int hashCode() {
        return this.f138273a.hashCode();
    }
}
