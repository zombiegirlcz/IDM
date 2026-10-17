package tk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f271915a;

    public d(Data repaymentWithPlan) {
        Intrinsics.checkNotNullParameter(repaymentWithPlan, "repaymentWithPlan");
        this.f271915a = repaymentWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271915a, ((d) obj2).f271915a);
    }

    public final int hashCode() {
        return this.f271915a.hashCode();
    }
}
