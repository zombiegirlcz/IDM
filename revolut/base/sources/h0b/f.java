package h0b;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1b.e f148344a;

    public f(c1b.e chartDrawing) {
        Intrinsics.checkNotNullParameter(chartDrawing, "chartDrawing");
        this.f148344a = chartDrawing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f148344a == ((f) obj2).f148344a;
    }

    public final int hashCode() {
        return this.f148344a.hashCode();
    }
}
