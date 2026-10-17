package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.i f157654a;

    public l(hrf.i limits) {
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f157654a = limits;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_amount_limits_exceeded, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f157654a, ((l) obj2).f157654a);
    }

    public final int hashCode() {
        return this.f157654a.hashCode();
    }
}
