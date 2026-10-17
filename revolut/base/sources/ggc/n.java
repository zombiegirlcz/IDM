package ggc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f143654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143655b;

    public n(e day, ArrayList intervals) {
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f143654a = day;
        this.f143655b = intervals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f143654a == nVar.f143654a && this.f143655b.equals(nVar.f143655b);
    }

    public final int hashCode() {
        return this.f143655b.hashCode() + (this.f143654a.hashCode() * 31);
    }
}
