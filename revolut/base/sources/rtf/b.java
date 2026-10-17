package rtf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsValues f257227a;

    public b(TransferReasonsValues reasons) {
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        this.f257227a = reasons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f257227a, ((b) obj2).f257227a);
    }

    public final int hashCode() {
        return this.f257227a.hashCode();
    }
}
