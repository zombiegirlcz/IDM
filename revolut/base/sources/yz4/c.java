package yz4;

import com.revolut.feature.credit.loan.api.models.legacy.UnavailabilityReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnavailabilityReason f318033a;

    public c(UnavailabilityReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f318033a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f318033a, ((c) obj2).f318033a);
    }

    public final int hashCode() {
        return this.f318033a.hashCode();
    }
}
