package qbg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f244269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsCancellationPolicyScreenContract$Mode f244270b;

    public e(Data policyData, TravelHotelsCancellationPolicyScreenContract$Mode mode) {
        Intrinsics.checkNotNullParameter(policyData, "policyData");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f244269a = policyData;
        this.f244270b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f244269a, eVar.f244269a) && Intrinsics.f(this.f244270b, eVar.f244270b);
    }

    public final int hashCode() {
        return this.f244270b.hashCode() + (this.f244269a.hashCode() * 31);
    }
}
