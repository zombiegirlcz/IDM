package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.c f287987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eel.i f287988c;
    public final eel.m d;

    public j1(String ref2, eel.c chartPeriod, eel.i chartValueType, eel.m tradingHours) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(chartValueType, "chartValueType");
        Intrinsics.checkNotNullParameter(tradingHours, "tradingHours");
        this.f287986a = ref2;
        this.f287987b = chartPeriod;
        this.f287988c = chartValueType;
        this.d = tradingHours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f287986a, j1Var.f287986a) && this.f287987b == j1Var.f287987b && this.f287988c == j1Var.f287988c && this.d == j1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f287988c.hashCode() + prk.o.c(this.f287987b, this.f287986a.hashCode() * 31, 31)) * 31);
    }
}
