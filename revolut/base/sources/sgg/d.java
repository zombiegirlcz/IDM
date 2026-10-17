package sgg;

import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAccountV2 f262653a;

    public d(TravelMilesAccountV2 account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f262653a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f262653a, ((d) obj2).f262653a);
    }

    public final int hashCode() {
        return this.f262653a.hashCode();
    }
}
