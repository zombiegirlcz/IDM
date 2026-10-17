package com.revolut.trading.orders.ui.invest.placement.screens.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/trading/orders/ui/invest/placement/screens/review/InvestOrderReviewScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderReviewScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<InvestOrderReviewScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrequencySettings f106971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AutoTopUpStatus f106972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderQuoteResult f106973c;
    public final dj0.d d;
    public final FiatExchangeOrderQuoteResult e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderReviewScreenContract$RetainedState((FrequencySettings) parcel.readParcelable(InvestOrderReviewScreenContract$RetainedState.class.getClassLoader()), (AutoTopUpStatus) parcel.readParcelable(InvestOrderReviewScreenContract$RetainedState.class.getClassLoader()), parcel.readInt() == 0 ? null : OrderQuoteResult.CREATOR.createFromParcel(parcel), (dj0.d) parcel.readSerializable(), parcel.readInt() != 0 ? FiatExchangeOrderQuoteResult.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderReviewScreenContract$RetainedState[i];
        }
    }

    public InvestOrderReviewScreenContract$RetainedState(FrequencySettings frequencySettings, AutoTopUpStatus autoTopUpStatus, OrderQuoteResult orderQuoteResult, dj0.d dVar, FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult) {
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        this.f106971a = frequencySettings;
        this.f106972b = autoTopUpStatus;
        this.f106973c = orderQuoteResult;
        this.d = dVar;
        this.e = fiatExchangeOrderQuoteResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderReviewScreenContract$RetainedState)) {
            return false;
        }
        InvestOrderReviewScreenContract$RetainedState investOrderReviewScreenContract$RetainedState = (InvestOrderReviewScreenContract$RetainedState) obj2;
        return Intrinsics.f(this.f106971a, investOrderReviewScreenContract$RetainedState.f106971a) && Intrinsics.f(this.f106972b, investOrderReviewScreenContract$RetainedState.f106972b) && Intrinsics.f(this.f106973c, investOrderReviewScreenContract$RetainedState.f106973c) && Intrinsics.f(this.d, investOrderReviewScreenContract$RetainedState.d) && Intrinsics.f(this.e, investOrderReviewScreenContract$RetainedState.e);
    }

    public final int hashCode() {
        FrequencySettings frequencySettings = this.f106971a;
        int iHashCode = (this.f106972b.hashCode() + ((frequencySettings == null ? 0 : frequencySettings.hashCode()) * 31)) * 31;
        OrderQuoteResult orderQuoteResult = this.f106973c;
        int iHashCode2 = (iHashCode + (orderQuoteResult == null ? 0 : orderQuoteResult.hashCode())) * 31;
        dj0.d dVar = this.d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = this.e;
        return iHashCode3 + (fiatExchangeOrderQuoteResult != null ? fiatExchangeOrderQuoteResult.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106971a, i);
        dest.writeParcelable(this.f106972b, i);
        OrderQuoteResult orderQuoteResult = this.f106973c;
        if (orderQuoteResult == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            orderQuoteResult.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.d);
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = this.e;
        if (fiatExchangeOrderQuoteResult == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatExchangeOrderQuoteResult.writeToParcel(dest, i);
        }
    }
}
