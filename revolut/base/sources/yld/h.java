package yld;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qua.p;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f314696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f314697b;

    public h(p recurringPayment, List scheduledDates) {
        Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
        Intrinsics.checkNotNullParameter(scheduledDates, "scheduledDates");
        this.f314696a = recurringPayment;
        this.f314697b = scheduledDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f314696a, hVar.f314696a) && Intrinsics.f(this.f314697b, hVar.f314697b);
    }

    public final int hashCode() {
        return this.f314697b.hashCode() + (this.f314696a.hashCode() * 31);
    }
}
