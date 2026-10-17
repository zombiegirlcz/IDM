package com.revolut.feature.trading_asset_quotes.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading_asset_quotes/api/domain/models/FiatExchangeOrderQuoteParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_asset_quotes_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FiatExchangeOrderQuoteParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatExchangeOrderQuoteParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderQuoteParams f91689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rcf.a f91690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91691c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatExchangeOrderQuoteParams((OrderQuoteParams) parcel.readParcelable(FiatExchangeOrderQuoteParams.class.getClassLoader()), parcel.readInt() == 0 ? null : rcf.a.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FiatExchangeOrderQuoteParams[i];
        }
    }

    public FiatExchangeOrderQuoteParams(OrderQuoteParams orderQuoteParams, rcf.a aVar, String str) {
        Intrinsics.checkNotNullParameter(orderQuoteParams, "orderQuoteParams");
        this.f91689a = orderQuoteParams;
        this.f91690b = aVar;
        this.f91691c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FiatExchangeOrderQuoteParams)) {
            return false;
        }
        FiatExchangeOrderQuoteParams fiatExchangeOrderQuoteParams = (FiatExchangeOrderQuoteParams) obj2;
        return Intrinsics.f(this.f91689a, fiatExchangeOrderQuoteParams.f91689a) && this.f91690b == fiatExchangeOrderQuoteParams.f91690b && Intrinsics.f(this.f91691c, fiatExchangeOrderQuoteParams.f91691c);
    }

    public final int hashCode() {
        int iHashCode = this.f91689a.hashCode() * 31;
        rcf.a aVar = this.f91690b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f91691c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91689a, i);
        rcf.a aVar = this.f91690b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f91691c);
    }
}
