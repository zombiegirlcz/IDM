package qgg;

import aii.r;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAccountV2 f245835a;

    public i(TravelMilesAccountV2 account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f245835a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f245835a, ((i) obj2).f245835a);
    }

    public final int hashCode() {
        return this.f245835a.hashCode();
    }
}
