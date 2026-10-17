package yic;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsConfigurations.Configuration f314288a;

    public k(RentAndBillsConfigurations.Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f314288a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f314288a, ((k) obj2).f314288a);
    }

    public final int hashCode() {
        return this.f314288a.hashCode();
    }
}
