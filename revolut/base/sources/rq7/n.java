package rq7;

import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import kl7.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f256492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationDetails f256493b;

    public n(m1 policyStatus, CancellationDetails cancellationDetails) {
        Intrinsics.checkNotNullParameter(policyStatus, "policyStatus");
        Intrinsics.checkNotNullParameter(cancellationDetails, "cancellationDetails");
        this.f256492a = policyStatus;
        this.f256493b = cancellationDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f256492a == nVar.f256492a && Intrinsics.f(this.f256493b, nVar.f256493b);
    }

    public final int hashCode() {
        return this.f256493b.hashCode() + (this.f256492a.hashCode() * 31);
    }
}
