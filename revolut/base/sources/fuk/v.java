package fuk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f138274a;

    public v(b chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f138274a = chart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f138274a == ((v) obj2).f138274a;
    }

    public final int hashCode() {
        return this.f138274a.hashCode();
    }
}
