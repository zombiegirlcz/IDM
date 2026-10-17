package jzh;

import com.revolut.shared.feature.market_data.models.domain.models.Limit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Limit.UsageLimit f179822a;

    public g0() {
        this(null);
    }

    @Override // jzh.s
    public final Limit.UsageLimit a() {
        return this.f179822a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f179822a, ((g0) obj2).f179822a);
    }

    public final int hashCode() {
        Limit.UsageLimit usageLimit = this.f179822a;
        if (usageLimit == null) {
            return 0;
        }
        return usageLimit.hashCode();
    }

    public g0(Limit.UsageLimit usageLimit) {
        this.f179822a = usageLimit;
    }
}
