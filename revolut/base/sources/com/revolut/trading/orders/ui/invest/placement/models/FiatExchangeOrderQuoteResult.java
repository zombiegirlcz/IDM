package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/FiatExchangeOrderQuoteResult;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatExchangeOrderQuoteResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatExchangeOrderQuoteResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiatExchangeOrderQuoteParams f106842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatExchangeOrderQuote f106843b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatExchangeOrderQuoteResult((FiatExchangeOrderQuoteParams) parcel.readParcelable(FiatExchangeOrderQuoteResult.class.getClassLoader()), (FiatExchangeOrderQuote) parcel.readParcelable(FiatExchangeOrderQuoteResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatExchangeOrderQuoteResult[i];
        }
    }

    public FiatExchangeOrderQuoteResult(FiatExchangeOrderQuoteParams orderQuoteParams, FiatExchangeOrderQuote orderQuote) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        this.f106842a = orderQuoteParams;
        this.f106843b = orderQuote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiatExchangeOrderQuoteResult)) {
            return false;
        }
        FiatExchangeOrderQuoteResult fiatExchangeOrderQuoteResult = (FiatExchangeOrderQuoteResult) obj2;
        return Intrinsics.f(this.f106842a, fiatExchangeOrderQuoteResult.f106842a) && Intrinsics.f(this.f106843b, fiatExchangeOrderQuoteResult.f106843b);
    }

    public final int hashCode() {
        return this.f106843b.hashCode() + (this.f106842a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106842a, i);
        dest.writeParcelable(this.f106843b, i);
    }
}
