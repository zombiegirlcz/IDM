package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.buy_in_price;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.kompot.common.IOData$Input;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/buy_in_price/BuyInPriceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BuyInPriceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BuyInPriceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f91566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f91567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91568c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyInPriceScreenContract$InputData((TransferInInstrument) parcel.readParcelable(BuyInPriceScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BuyInPriceScreenContract$InputData[i];
        }
    }

    public BuyInPriceScreenContract$InputData(TransferInInstrument selectedInstrument, b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
        this.f91566a = selectedInstrument;
        this.f91567b = bVar;
        this.f91568c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BuyInPriceScreenContract$InputData)) {
            return false;
        }
        BuyInPriceScreenContract$InputData buyInPriceScreenContract$InputData = (BuyInPriceScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91566a, buyInPriceScreenContract$InputData.f91566a) && Intrinsics.f(this.f91567b, buyInPriceScreenContract$InputData.f91567b) && this.f91568c == buyInPriceScreenContract$InputData.f91568c;
    }

    public final int hashCode() {
        int iHashCode = this.f91566a.hashCode() * 31;
        b bVar = this.f91567b;
        return Boolean.hashCode(this.f91568c) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91566a, i);
        dest.writeSerializable(this.f91567b);
        dest.writeInt(this.f91568c ? 1 : 0);
    }
}
