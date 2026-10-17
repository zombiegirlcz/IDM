package xva;

import aii.e;
import com.revolut.feature.referrals.code.api.ReferralCodeApiContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReferralCodeApiContract$InputData f309226a;

    public a(ReferralCodeApiContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f309226a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f309226a, ((a) obj2).f309226a);
    }

    public final int hashCode() {
        return this.f309226a.f81673a.hashCode();
    }
}
