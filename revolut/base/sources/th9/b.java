package th9;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f271330a;

    public b(ApmQuote apmQuote) {
        this.f271330a = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f271330a, ((b) obj2).f271330a);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f271330a;
        if (apmQuote == null) {
            return 0;
        }
        return apmQuote.hashCode();
    }
}
