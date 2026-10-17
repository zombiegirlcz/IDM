package com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/performance/ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights", "", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights f91336a = new ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights();

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights.f91336a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights[i];
        }
    }

    private ManagedPortfolioPerformanceExtensionContract$Action$ExploreInsights() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
