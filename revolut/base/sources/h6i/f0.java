package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f149664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f149665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149666c;
    public final OrderQuote d;
    public final boolean e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f149667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final OrderMode f149668h;

    public f0(AccountWrapper accountWrapper, long j2, boolean z, OrderQuote orderQuote, boolean z3, Long l2, boolean z4, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        this.f149664a = accountWrapper;
        this.f149665b = j2;
        this.f149666c = z;
        this.d = orderQuote;
        this.e = z3;
        this.f = l2;
        this.f149667g = z4;
        this.f149668h = orderMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f149664a, f0Var.f149664a) && this.f149665b == f0Var.f149665b && this.f149666c == f0Var.f149666c && Intrinsics.f(this.d, f0Var.d) && this.e == f0Var.e && Intrinsics.f(this.f, f0Var.f) && this.f149667g == f0Var.f149667g && Intrinsics.f(this.f149668h, f0Var.f149668h);
    }

    public final int hashCode() {
        int iC = j6.a.c(a0.d.c(this.f149664a.hashCode() * 31, 31, this.f149665b), 31, this.f149666c);
        OrderQuote orderQuote = this.d;
        int iC2 = j6.a.c((iC + (orderQuote == null ? 0 : orderQuote.hashCode())) * 31, 31, this.e);
        Long l2 = this.f;
        return this.f149668h.hashCode() + j6.a.c((iC2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f149667g);
    }
}
