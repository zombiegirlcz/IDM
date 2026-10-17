package buk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fuk.b f18898a;

    public e(fuk.b chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f18898a = chart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f18898a == ((e) obj2).f18898a;
    }

    public final int hashCode() {
        return this.f18898a.hashCode();
    }
}
