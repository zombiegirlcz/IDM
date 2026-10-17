package j02;

import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentSource f169913a;

    public b(ApmPaymentSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f169913a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f169913a, ((b) obj2).f169913a);
    }

    public final int hashCode() {
        return this.f169913a.hashCode();
    }
}
