package qtc;

import com.revolut.feature.security_hub.api.models.WalletBalanceLimit;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletBalanceLimit f249081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f249083c;
    public final dj0.d d;
    public final dj0.d e;

    public h(WalletBalanceLimit limit, dj0.d dVar, dj0.d remainingInDestinationCurrency, dj0.d currentValueInDestinationCurrency, dj0.d maxValueInDestinationCurrency) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(remainingInDestinationCurrency, "remainingInDestinationCurrency");
        Intrinsics.checkNotNullParameter(currentValueInDestinationCurrency, "currentValueInDestinationCurrency");
        Intrinsics.checkNotNullParameter(maxValueInDestinationCurrency, "maxValueInDestinationCurrency");
        this.f249081a = limit;
        this.f249082b = dVar;
        this.f249083c = remainingInDestinationCurrency;
        this.d = currentValueInDestinationCurrency;
        this.e = maxValueInDestinationCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f249081a, hVar.f249081a) && Intrinsics.f(this.f249082b, hVar.f249082b) && Intrinsics.f(this.f249083c, hVar.f249083c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f249081a.hashCode() * 31;
        dj0.d dVar = this.f249082b;
        return this.e.hashCode() + v7.c(v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f249083c), 31, this.d);
    }
}
