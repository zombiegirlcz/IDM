package cza;

import cli.j;
import com.revolut.feature.referrals.common.data.api.domain.model.common.Upsell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Upsell f110172a;

    public d(Upsell upsell) {
        Intrinsics.checkNotNullParameter(upsell, "upsell");
        this.f110172a = upsell;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f110172a, ((d) obj2).f110172a);
    }

    public final int hashCode() {
        return this.f110172a.hashCode();
    }
}
