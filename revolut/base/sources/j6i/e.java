package j6i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Limit.UsageLimit f171776a;

    public e(Limit.UsageLimit limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f171776a = limit;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_input_error_brl_limit_usage, null, null, 14);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f171776a, ((e) obj2).f171776a);
    }

    public final int hashCode() {
        return this.f171776a.hashCode();
    }
}
