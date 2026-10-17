package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.selected_assets;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_create/screens/selected_assets/SelectedAssetsListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectedAssetsListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectedAssetsListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f91602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91603b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectedAssetsListScreenContract$InputData((TransferBroker) parcel.readParcelable(SelectedAssetsListScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectedAssetsListScreenContract$InputData[i];
        }
    }

    public SelectedAssetsListScreenContract$InputData(TransferBroker broker, String tradingAccountId) {
        Intrinsics.checkNotNullParameter(broker, "broker");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        this.f91602a = broker;
        this.f91603b = tradingAccountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectedAssetsListScreenContract$InputData)) {
            return false;
        }
        SelectedAssetsListScreenContract$InputData selectedAssetsListScreenContract$InputData = (SelectedAssetsListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91602a, selectedAssetsListScreenContract$InputData.f91602a) && Intrinsics.f(this.f91603b, selectedAssetsListScreenContract$InputData.f91603b);
    }

    public final int hashCode() {
        return this.f91603b.hashCode() + (this.f91602a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91602a, i);
        dest.writeString(this.f91603b);
    }
}
