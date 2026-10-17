package v62;

import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoWithdrawalCode f286319a;

    public i(MultibancoWithdrawalCode code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f286319a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f286319a, ((i) obj2).f286319a);
    }

    public final int hashCode() {
        return this.f286319a.hashCode();
    }
}
