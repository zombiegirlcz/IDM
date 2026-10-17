package uj7;

import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACCancellationReason f280526a;

    public f(CFACCancellationReason reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f280526a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f280526a, ((f) obj2).f280526a);
    }

    public final int hashCode() {
        return this.f280526a.hashCode();
    }
}
