package dq7;

import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import kl7.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f116921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CancellationDetails f116922b;

    public d(m1 status, CancellationDetails cancellationDetails) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cancellationDetails, "cancellationDetails");
        this.f116921a = status;
        this.f116922b = cancellationDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f116921a == dVar.f116921a && Intrinsics.f(this.f116922b, dVar.f116922b);
    }

    public final int hashCode() {
        return this.f116922b.hashCode() + (this.f116921a.hashCode() * 31);
    }
}
