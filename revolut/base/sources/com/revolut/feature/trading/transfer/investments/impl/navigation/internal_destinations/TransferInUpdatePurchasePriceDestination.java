package com.revolut.feature.trading.transfer.investments.impl.navigation.internal_destinations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferRequest;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/navigation/internal_destinations/TransferInUpdatePurchasePriceDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/trading/transfer/investments/impl/navigation/internal_destinations/TransferInUpdatePurchasePriceDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferInUpdatePurchasePriceDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TransferInUpdatePurchasePriceDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferRequest f91552b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/navigation/internal_destinations/TransferInUpdatePurchasePriceDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferRequest f91553a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((TransferRequest) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(TransferRequest transferRequest) {
            Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
            this.f91553a = transferRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f91553a, ((InputData) obj2).f91553a);
        }

        public final int hashCode() {
            return this.f91553a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91553a, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferInUpdatePurchasePriceDestination((TransferRequest) parcel.readParcelable(TransferInUpdatePurchasePriceDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferInUpdatePurchasePriceDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferInUpdatePurchasePriceDestination(TransferRequest transferRequest) {
        super(new InputData(transferRequest));
        Intrinsics.checkNotNullParameter(transferRequest, "transferRequest");
        this.f91552b = transferRequest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TransferRequest getF91552b() {
        return this.f91552b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TransferInUpdatePurchasePriceDestination) && Intrinsics.f(this.f91552b, ((TransferInUpdatePurchasePriceDestination) obj2).f91552b);
    }

    public final int hashCode() {
        return this.f91552b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91552b, i);
    }
}
