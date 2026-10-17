package zl4;

import aii.r;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardActionParcel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardActionParcel f323182a;

    public f(CreditCardActionParcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f323182a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f323182a, ((f) obj2).f323182a);
    }

    public final int hashCode() {
        return this.f323182a.hashCode();
    }
}
