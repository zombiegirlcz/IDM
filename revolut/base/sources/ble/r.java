package ble;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.b f16592a;

    public r(aw0.b lineChart) {
        Intrinsics.checkNotNullParameter(lineChart, "lineChart");
        this.f16592a = lineChart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f16592a, ((r) obj2).f16592a);
    }

    public final int hashCode() {
        return this.f16592a.hashCode();
    }
}
