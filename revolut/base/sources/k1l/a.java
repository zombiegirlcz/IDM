package k1l;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;
import yqi.b;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f180286a;

    public a(d amountMultiple) {
        Intrinsics.checkNotNullParameter(amountMultiple, "amountMultiple");
        this.f180286a = amountMultiple;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.transfer_error_amount_must_be_multiple, u.c(new MoneyClause(this.f180286a, new MoneyClause.Format.Defaults(null, null, true, false, 11), null, null, 12)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f180286a, ((a) obj2).f180286a);
    }

    public final int hashCode() {
        return this.f180286a.hashCode();
    }
}
