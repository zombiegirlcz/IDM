package com.revolut.feature_exchange.impl.ui.exchange.market_order;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_exchange/impl/ui/exchange/market_order/MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExchangeResult f96877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f96878c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload(parcel.readString(), (ExchangeResult) parcel.readParcelable(MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload.class.getClassLoader()), parcel.readParcelable(MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload[i];
        }
    }

    public MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload(String buttonId, ExchangeResult exchangeResult, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        Intrinsics.checkNotNullParameter(exchangeResult, "exchangeResult");
        this.f96876a = buttonId;
        this.f96877b = exchangeResult;
        this.f96878c = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload)) {
            return false;
        }
        MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload marketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload = (MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload) obj2;
        return Intrinsics.f(this.f96876a, marketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload.f96876a) && Intrinsics.f(this.f96877b, marketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload.f96877b) && Intrinsics.f(this.f96878c, marketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload.f96878c);
    }

    public final int hashCode() {
        int iHashCode = (this.f96877b.hashCode() + (this.f96876a.hashCode() * 31)) * 31;
        Parcelable parcelable = this.f96878c;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96876a);
        dest.writeParcelable(this.f96877b, i);
        dest.writeParcelable(this.f96878c, i);
    }

    public /* synthetic */ MarketOrderExchangeStatusPresenterDelegate$StatusDialogViewPayload(ExchangeResult exchangeResult) {
        this("ID_NO_BUTTON", exchangeResult, null);
    }
}
