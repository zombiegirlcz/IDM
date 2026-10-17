package com.revolut.feature_exchange.impl.ui.exchange_v2.market_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason", "Landroid/os/Parcelable;", "CryptoUpperLimitError", "CryptoLowerLimitError", "Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason$CryptoLowerLimitError;", "Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason$CryptoUpperLimitError;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MarketOrderPresenterV2$HintDialogReason extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason$CryptoLowerLimitError;", "Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoLowerLimitError implements MarketOrderPresenterV2$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<CryptoLowerLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f96944a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoLowerLimitError((Amount) parcel.readParcelable(CryptoLowerLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoLowerLimitError[i];
            }
        }

        public CryptoLowerLimitError(Amount amount) {
            this.f96944a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoLowerLimitError) && Intrinsics.f(this.f96944a, ((CryptoLowerLimitError) obj2).f96944a);
        }

        public final int hashCode() {
            Amount amount = this.f96944a;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96944a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason$CryptoUpperLimitError;", "Lcom/revolut/feature_exchange/impl/ui/exchange_v2/market_order/MarketOrderPresenterV2$HintDialogReason;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoUpperLimitError implements MarketOrderPresenterV2$HintDialogReason {

        @NotNull
        public static final Parcelable.Creator<CryptoUpperLimitError> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Amount f96945a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoUpperLimitError((Amount) parcel.readParcelable(CryptoUpperLimitError.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoUpperLimitError[i];
            }
        }

        public CryptoUpperLimitError(Amount amount) {
            this.f96945a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoUpperLimitError) && Intrinsics.f(this.f96945a, ((CryptoUpperLimitError) obj2).f96945a);
        }

        public final int hashCode() {
            Amount amount = this.f96945a;
            if (amount == null) {
                return 0;
            }
            return amount.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96945a, i);
        }
    }
}
