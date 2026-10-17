package g8i;

import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuote f141395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f141396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f141397c;
    public final OrderMode d;

    public t(OrderQuote lastQuote, boolean z, Integer num, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(lastQuote, "lastQuote");
        Intrinsics.checkNotNullParameter("MOVE_MONEY_REVIEW_SCREEN_CTA_TAG", "buttonTag");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        this.f141395a = lastQuote;
        this.f141396b = z;
        this.f141397c = num;
        this.d = orderMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f141395a, tVar.f141395a) && this.f141396b == tVar.f141396b && Intrinsics.f(this.f141397c, tVar.f141397c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(((this.f141395a.hashCode() * 31) + 1970324946) * 31, 31, this.f141396b);
        Integer num = this.f141397c;
        return this.d.hashCode() + ((iC + (num == null ? 0 : num.hashCode())) * 31);
    }
}
