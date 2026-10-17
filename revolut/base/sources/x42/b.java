package x42;

import aii.r;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferPayerSettings f302775a;

    public b(ApmTransferPayerSettings payerSettings) {
        Intrinsics.checkNotNullParameter(payerSettings, "payerSettings");
        this.f302775a = payerSettings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f302775a, ((b) obj2).f302775a);
    }

    public final int hashCode() {
        return this.f302775a.hashCode();
    }
}
