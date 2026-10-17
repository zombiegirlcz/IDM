package t05;

import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditScoreDetails f266929a;

    public r(CreditScoreDetails details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f266929a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f266929a, ((r) obj2).f266929a);
    }

    public final int hashCode() {
        return this.f266929a.hashCode();
    }
}
