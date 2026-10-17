package ltf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsValues f199867a;

    public g(TransferReasonsValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f199867a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f199867a, ((g) obj2).f199867a);
    }

    public final int hashCode() {
        return this.f199867a.hashCode();
    }
}
