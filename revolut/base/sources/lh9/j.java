package lh9;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuote f195183a;

    public j(ApmQuote apmQuote) {
        this.f195183a = apmQuote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f195183a, ((j) obj2).f195183a);
    }

    public final int hashCode() {
        ApmQuote apmQuote = this.f195183a;
        if (apmQuote == null) {
            return 0;
        }
        return apmQuote.hashCode();
    }
}
