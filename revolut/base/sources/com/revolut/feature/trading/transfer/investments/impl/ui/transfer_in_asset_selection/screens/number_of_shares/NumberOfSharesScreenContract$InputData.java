package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInInstrument;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/number_of_shares/NumberOfSharesScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NumberOfSharesScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NumberOfSharesScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferInInstrument f91572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f91573b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NumberOfSharesScreenContract$InputData((TransferInInstrument) parcel.readParcelable(NumberOfSharesScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NumberOfSharesScreenContract$InputData[i];
        }
    }

    public NumberOfSharesScreenContract$InputData(TransferInInstrument selectedInstrument, Integer num) {
        Intrinsics.checkNotNullParameter(selectedInstrument, "selectedInstrument");
        this.f91572a = selectedInstrument;
        this.f91573b = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NumberOfSharesScreenContract$InputData)) {
            return false;
        }
        NumberOfSharesScreenContract$InputData numberOfSharesScreenContract$InputData = (NumberOfSharesScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91572a, numberOfSharesScreenContract$InputData.f91572a) && Intrinsics.f(this.f91573b, numberOfSharesScreenContract$InputData.f91573b);
    }

    public final int hashCode() {
        int iHashCode = this.f91572a.hashCode() * 31;
        Integer num = this.f91573b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91572a, i);
        Integer num = this.f91573b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
