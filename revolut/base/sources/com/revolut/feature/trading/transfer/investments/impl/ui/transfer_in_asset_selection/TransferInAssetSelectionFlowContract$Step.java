package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectInstrument", "NumberOfShares", "BuyInPrice", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$BuyInPrice;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$NumberOfShares;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$SelectInstrument;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferInAssetSelectionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$BuyInPrice;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BuyInPrice implements TransferInAssetSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BuyInPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferInInstrument f91562a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BuyInPrice((TransferInInstrument) parcel.readParcelable(BuyInPrice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BuyInPrice[i];
            }
        }

        public BuyInPrice(TransferInInstrument selectedInstrument) {
            Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
            this.f91562a = selectedInstrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BuyInPrice) && Intrinsics.f(this.f91562a, ((BuyInPrice) obj2).f91562a);
        }

        public final int hashCode() {
            return this.f91562a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91562a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$NumberOfShares;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NumberOfShares implements TransferInAssetSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NumberOfShares> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferInInstrument f91563a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NumberOfShares((TransferInInstrument) parcel.readParcelable(NumberOfShares.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NumberOfShares[i];
            }
        }

        public NumberOfShares(TransferInInstrument selectedInstrument) {
            Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
            this.f91563a = selectedInstrument;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NumberOfShares) && Intrinsics.f(this.f91563a, ((NumberOfShares) obj2).f91563a);
        }

        public final int hashCode() {
            return this.f91563a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91563a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step$SelectInstrument;", "Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/TransferInAssetSelectionFlowContract$Step;", "<init>", "()V", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectInstrument implements TransferInAssetSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectInstrument f91564a = new SelectInstrument();

        @NotNull
        public static final Parcelable.Creator<SelectInstrument> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectInstrument.f91564a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectInstrument[i];
            }
        }

        private SelectInstrument() {
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
