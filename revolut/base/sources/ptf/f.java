package ptf;

import aii.r;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f239662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonsValues f239663b;

    public f(a3 transaction, TransferReasonsValues values) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f239662a = transaction;
        this.f239663b = values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239662a, fVar.f239662a) && Intrinsics.f(this.f239663b, fVar.f239663b);
    }

    public final int hashCode() {
        return this.f239663b.hashCode() + (this.f239662a.hashCode() * 31);
    }
}
