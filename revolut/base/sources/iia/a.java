package iia;

import he3.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yld.a f161595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f161596b;

    public a(yld.a chart, m periodPreferences) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(periodPreferences, "periodPreferences");
        this.f161595a = chart;
        this.f161596b = periodPreferences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f161595a.equals(aVar.f161595a) && this.f161596b.equals(aVar.f161596b);
    }

    public final int hashCode() {
        return this.f161596b.hashCode() + (this.f161595a.hashCode() * 31);
    }
}
