package qsf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsValues f248832a;

    public l(TransferReasonsValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f248832a = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f248832a, ((l) obj2).f248832a);
    }

    public final int hashCode() {
        return this.f248832a.hashCode();
    }
}
