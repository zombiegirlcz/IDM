package com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/performance_details/PerformanceDetailsScreenContract$TitleClickParcel", "Landroid/os/Parcelable;", "<init>", "()V", "TotalReturnInfo", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/performance_details/PerformanceDetailsScreenContract$TitleClickParcel$TotalReturnInfo;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PerformanceDetailsScreenContract$TitleClickParcel implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/performance_details/PerformanceDetailsScreenContract$TitleClickParcel$TotalReturnInfo;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/performance_details/PerformanceDetailsScreenContract$TitleClickParcel;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TotalReturnInfo extends PerformanceDetailsScreenContract$TitleClickParcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TotalReturnInfo f91339a = new TotalReturnInfo();

        @NotNull
        public static final Parcelable.Creator<TotalReturnInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TotalReturnInfo.f91339a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalReturnInfo[i];
            }
        }

        private TotalReturnInfo() {
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

    private PerformanceDetailsScreenContract$TitleClickParcel() {
    }
}
