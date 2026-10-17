package yic;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsConfigurations.Configuration f314287a;

    public j(RentAndBillsConfigurations.Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f314287a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f314287a, ((j) obj2).f314287a);
    }

    public final int hashCode() {
        return this.f314287a.hashCode();
    }
}
