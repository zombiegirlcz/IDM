package sdf;

import k4l.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f261871a;

    public d(j monthlyInvestments) {
        Intrinsics.checkNotNullParameter(monthlyInvestments, "monthlyInvestments");
        this.f261871a = monthlyInvestments;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f261871a, ((d) obj2).f261871a);
    }

    public final int hashCode() {
        return this.f261871a.hashCode();
    }
}
