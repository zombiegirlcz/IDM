package yic;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsConfigurations.Configuration f314289a;

    public l(RentAndBillsConfigurations.Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f314289a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f314289a, ((l) obj2).f314289a);
    }

    public final int hashCode() {
        return this.f314289a.hashCode();
    }
}
