package com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UnrealisedReturnStep", "HoldingsAveragePrice", "Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep$HoldingsAveragePrice;", "Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep$UnrealisedReturnStep;", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CommodityPositionDetailsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep$HoldingsAveragePrice;", "Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HoldingsAveragePrice implements CommodityPositionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HoldingsAveragePrice f99791a = new HoldingsAveragePrice();

        @NotNull
        public static final Parcelable.Creator<HoldingsAveragePrice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HoldingsAveragePrice.f99791a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HoldingsAveragePrice[i];
            }
        }

        private HoldingsAveragePrice() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep$UnrealisedReturnStep;", "Lcom/revolut/retail/feature/commodity/asset_details/impl/ui/screens/position_details/CommodityPositionDetailsControllerContract$ModalStep;", "<init>", "()V", "feature_commodity_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnrealisedReturnStep implements CommodityPositionDetailsControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnrealisedReturnStep f99792a = new UnrealisedReturnStep();

        @NotNull
        public static final Parcelable.Creator<UnrealisedReturnStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnrealisedReturnStep.f99792a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnrealisedReturnStep[i];
            }
        }

        private UnrealisedReturnStep() {
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
}
