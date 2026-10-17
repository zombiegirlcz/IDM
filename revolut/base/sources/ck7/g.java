package ck7;

import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACReimbursementType f24791a;

    public g(CFACReimbursementType reimbursementType) {
        Intrinsics.checkNotNullParameter(reimbursementType, "reimbursementType");
        this.f24791a = reimbursementType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f24791a == ((g) obj2).f24791a;
    }

    public final int hashCode() {
        return this.f24791a.hashCode();
    }
}
