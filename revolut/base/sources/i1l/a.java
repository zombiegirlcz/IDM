package i1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157644a;

    public a(String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f157644a = currency;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_currency_not_supported, u.c(this.f157644a), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f157644a, ((a) obj2).f157644a);
    }

    public final int hashCode() {
        return this.f157644a.hashCode();
    }
}
