package com.revolut.feature.stock_lending.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/stock_lending/api/navigation/StockLendingDetailsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "LendingDetailsDestination", "feature_stock_lending_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StockLendingDetailsFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/stock_lending/api/navigation/StockLendingDetailsFeatureConfig$LendingDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_stock_lending_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LendingDetailsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LendingDetailsDestination f88396a = new LendingDetailsDestination();

        @NotNull
        public static final Parcelable.Creator<LendingDetailsDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes7.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LendingDetailsDestination.f88396a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LendingDetailsDestination[i];
            }
        }

        private LendingDetailsDestination() {
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

    public StockLendingDetailsFeatureConfig() {
        this(0);
    }

    public StockLendingDetailsFeatureConfig(int i) {
        super((ActivityAnimation) null, (ParcelableDestination) LendingDetailsDestination.f88396a, false, (Integer) null, 0, 60);
    }
}
