package yld;

import he3.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f314692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f314693b;

    public e(p periodPreferences, a chart) {
        Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.f314692a = periodPreferences;
        this.f314693b = chart;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f314692a, eVar.f314692a) && this.f314693b.equals(eVar.f314693b);
    }

    public final int hashCode() {
        return this.f314693b.hashCode() + (this.f314692a.hashCode() * 31);
    }
}
