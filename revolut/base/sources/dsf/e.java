package dsf;

import aii.r;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsValues f117310a;

    public e(TransferReasonsValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f117310a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f117310a, ((e) obj2).f117310a);
    }

    public final int hashCode() {
        return this.f117310a.hashCode();
    }
}
