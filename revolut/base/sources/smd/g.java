package smd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f264414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f264415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f264416c;
    public final dj0.d d;

    public g(i3 category, dj0.d averageSpending, String str, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(averageSpending, "averageSpending");
        this.f264414a = category;
        this.f264415b = averageSpending;
        this.f264416c = str;
        this.d = dVar;
    }

    public static g a(g gVar, dj0.d dVar) {
        i3 category = gVar.f264414a;
        dj0.d averageSpending = gVar.f264415b;
        String str = gVar.f264416c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(averageSpending, "averageSpending");
        return new g(category, averageSpending, str, dVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f264414a, gVar.f264414a) && Intrinsics.f(this.f264415b, gVar.f264415b) && Intrinsics.f(this.f264416c, gVar.f264416c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f264414a.hashCode() * 31, 31, this.f264415b);
        String str = this.f264416c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
