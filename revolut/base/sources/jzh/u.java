package jzh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f179858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Limit.UsageLimit f179859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f179860c;

    public u() {
        this(0);
    }

    public static u b(u uVar, boolean z, Limit.UsageLimit usageLimit, Data orderQuote, int i) {
        if ((i & 1) != 0) {
            z = uVar.f179858a;
        }
        if ((i & 2) != 0) {
            usageLimit = uVar.f179859b;
        }
        if ((i & 4) != 0) {
            orderQuote = uVar.f179860c;
        }
        uVar.getClass();
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        return new u(z, usageLimit, orderQuote);
    }

    @Override // jzh.s
    public final Limit.UsageLimit a() {
        return this.f179859b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f179858a == uVar.f179858a && Intrinsics.f(this.f179859b, uVar.f179859b) && Intrinsics.f(this.f179860c, uVar.f179860c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f179858a) * 31;
        Limit.UsageLimit usageLimit = this.f179859b;
        return this.f179860c.hashCode() + ((iHashCode + (usageLimit == null ? 0 : usageLimit.hashCode())) * 31);
    }

    public u(boolean z, Limit.UsageLimit usageLimit, Data orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f179858a = z;
        this.f179859b = usageLimit;
        this.f179860c = orderQuote;
    }

    public /* synthetic */ u(int i) {
        this(false, null, new Data(null, null, true, 3, null));
    }
}
