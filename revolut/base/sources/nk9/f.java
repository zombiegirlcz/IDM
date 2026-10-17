package nk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f216759a;

    public f(List repaymentWithPlan) {
        Intrinsics.checkNotNullParameter(repaymentWithPlan, "repaymentWithPlan");
        this.f216759a = repaymentWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f216759a, ((f) obj2).f216759a);
    }

    public final int hashCode() {
        return this.f216759a.hashCode();
    }
}
