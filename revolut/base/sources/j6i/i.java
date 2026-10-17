package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Limit.UpperRestrictionLimit f171780a;

    public i(Limit.UpperRestrictionLimit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f171780a = limit;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_input_error_limit_exceeded, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f171780a, ((i) obj2).f171780a);
    }

    public final int hashCode() {
        return this.f171780a.hashCode();
    }
}
