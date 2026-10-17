package hnk;

import cli.j;
import hha.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f154131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154132b;

    public b(o planCharge, String planTitle) {
        Intrinsics.checkNotNullParameter(planCharge, "planCharge");
        Intrinsics.checkNotNullParameter(planTitle, "planTitle");
        this.f154131a = planCharge;
        this.f154132b = planTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154131a, bVar.f154131a) && Intrinsics.f(this.f154132b, bVar.f154132b);
    }

    public final int hashCode() {
        return this.f154132b.hashCode() + (this.f154131a.hashCode() * 31);
    }
}
