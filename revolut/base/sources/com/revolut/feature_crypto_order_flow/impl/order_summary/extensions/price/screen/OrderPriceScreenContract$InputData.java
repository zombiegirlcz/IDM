package com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.config.api.models.CryptoPeggedPair;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/order_summary/extensions/price/screen/OrderPriceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrderPriceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OrderPriceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f96795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f96796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoPeggedPair f96797c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderPriceScreenContract$InputData(h.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (CryptoPeggedPair) parcel.readParcelable(OrderPriceScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrderPriceScreenContract$InputData[i];
        }
    }

    public OrderPriceScreenContract$InputData(h orderType, e exchangeMode, CryptoPeggedPair cryptoPeggedPair) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f96795a = orderType;
        this.f96796b = exchangeMode;
        this.f96797c = cryptoPeggedPair;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrderPriceScreenContract$InputData)) {
            return false;
        }
        OrderPriceScreenContract$InputData orderPriceScreenContract$InputData = (OrderPriceScreenContract$InputData) obj2;
        return this.f96795a == orderPriceScreenContract$InputData.f96795a && this.f96796b == orderPriceScreenContract$InputData.f96796b && Intrinsics.f(this.f96797c, orderPriceScreenContract$InputData.f96797c);
    }

    public final int hashCode() {
        int iG = y.g(this.f96796b, this.f96795a.hashCode() * 31, 31);
        CryptoPeggedPair cryptoPeggedPair = this.f96797c;
        return iG + (cryptoPeggedPair == null ? 0 : cryptoPeggedPair.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96795a.name());
        dest.writeString(this.f96796b.name());
        dest.writeParcelable(this.f96797c, i);
    }
}
