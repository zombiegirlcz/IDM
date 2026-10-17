package z8k;

import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferenceData f320165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f320166b;

    public d0(ReferenceData referenceData, String str) {
        Intrinsics.checkNotNullParameter(referenceData, "referenceData");
        this.f320165a = referenceData;
        this.f320166b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f320165a, d0Var.f320165a) && Intrinsics.f(this.f320166b, d0Var.f320166b);
    }

    public final int hashCode() {
        int iHashCode = this.f320165a.hashCode() * 31;
        String str = this.f320166b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
