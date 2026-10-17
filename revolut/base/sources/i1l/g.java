package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f157649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f157650b;

    public g(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f157649a = j2;
        this.f157650b = currency;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_amount_limits_exceeded, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f157649a == gVar.f157649a && Intrinsics.f(this.f157650b, gVar.f157650b);
    }

    public final int hashCode() {
        return this.f157650b.hashCode() + (Long.hashCode(this.f157649a) * 31);
    }
}
