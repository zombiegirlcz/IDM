package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f288075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.m f288076c;

    public z0(String ref2, eel.c chartPeriod, eel.m tradingHours) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        this.f288074a = ref2;
        this.f288075b = chartPeriod;
        this.f288076c = tradingHours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f288074a, z0Var.f288074a) && this.f288075b == z0Var.f288075b && this.f288076c == z0Var.f288076c;
    }

    public final int hashCode() {
        return this.f288076c.hashCode() + prk.o.c(this.f288075b, this.f288074a.hashCode() * 31, 31);
    }
}
