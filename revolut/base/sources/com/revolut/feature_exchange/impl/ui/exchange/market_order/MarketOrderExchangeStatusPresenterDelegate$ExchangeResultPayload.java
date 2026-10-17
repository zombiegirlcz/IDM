package com.revolut.feature_exchange.impl.ui.exchange.market_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeStakingData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/market_order/MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeResult f96873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExchangeStakingData f96874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96875c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload((ExchangeResult) parcel.readParcelable(MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload.class.getClassLoader()), parcel.readInt() == 0 ? null : ExchangeStakingData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload[i];
        }
    }

    public MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload(ExchangeResult exchangeResult, ExchangeStakingData exchangeStakingData, boolean z) {
        Intrinsics.checkNotNullParameter(exchangeResult, "exchangeResult");
        this.f96873a = exchangeResult;
        this.f96874b = exchangeStakingData;
        this.f96875c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload)) {
            return false;
        }
        MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload marketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload = (MarketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload) obj2;
        return Intrinsics.f(this.f96873a, marketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload.f96873a) && Intrinsics.f(this.f96874b, marketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload.f96874b) && this.f96875c == marketOrderExchangeStatusPresenterDelegate$ExchangeResultPayload.f96875c;
    }

    public final int hashCode() {
        int iHashCode = this.f96873a.hashCode() * 31;
        ExchangeStakingData exchangeStakingData = this.f96874b;
        return Boolean.hashCode(this.f96875c) + ((iHashCode + (exchangeStakingData == null ? 0 : exchangeStakingData.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96873a, i);
        ExchangeStakingData exchangeStakingData = this.f96874b;
        if (exchangeStakingData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            exchangeStakingData.writeToParcel(dest, i);
        }
        dest.writeInt(this.f96875c ? 1 : 0);
    }
}
