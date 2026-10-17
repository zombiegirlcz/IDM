package htf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonCategory f155372a;

    public k(TransferReasonCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f155372a = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f155372a, ((k) obj2).f155372a);
    }

    public final int hashCode() {
        return this.f155372a.hashCode();
    }
}
