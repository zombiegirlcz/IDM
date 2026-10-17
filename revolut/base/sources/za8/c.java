package za8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320575a;

    public c(Data tradingProfileWithAgeEligibility) {
        Intrinsics.checkNotNullParameter(tradingProfileWithAgeEligibility, "tradingProfileWithAgeEligibility");
        this.f320575a = tradingProfileWithAgeEligibility;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f320575a, ((c) obj2).f320575a);
    }

    public final int hashCode() {
        return this.f320575a.hashCode();
    }
}
