package j6i;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_move_money.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetClause f171779a;

    public h(AssetClause assetClause) {
        this.f171779a = assetClause;
    }

    @Override // yqi.b
    public final Clause a() {
        return new TextLocalisedClause(R$string.move_money_amount_screen_input_error_below_minimum, v.l(this.f171779a), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f171779a, ((h) obj2).f171779a);
    }

    public final int hashCode() {
        AssetClause assetClause = this.f171779a;
        if (assetClause == null) {
            return 0;
        }
        return assetClause.hashCode();
    }
}
