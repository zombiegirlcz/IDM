package com.revolut.feature_crypto_order_flow.impl.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoExchangeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f96721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f96722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f96723c;
    public final boolean d;
    public final h e;
    public final Long f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoExchangeScreenContract$InputData((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), e.valueOf(parcel.readString()), parcel.readInt() != 0, h.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeScreenContract$InputData[i];
        }
    }

    public CryptoExchangeScreenContract$InputData(xi0.b targetCurrency, xi0.b bVar, e exchangeMode, boolean z, h orderType, Long l2) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f96721a = targetCurrency;
        this.f96722b = bVar;
        this.f96723c = exchangeMode;
        this.d = z;
        this.e = orderType;
        this.f = l2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoExchangeScreenContract$InputData)) {
            return false;
        }
        CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData = (CryptoExchangeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f96721a, cryptoExchangeScreenContract$InputData.f96721a) && Intrinsics.f(this.f96722b, cryptoExchangeScreenContract$InputData.f96722b) && this.f96723c == cryptoExchangeScreenContract$InputData.f96723c && this.d == cryptoExchangeScreenContract$InputData.d && this.e == cryptoExchangeScreenContract$InputData.e && Intrinsics.f(this.f, cryptoExchangeScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f96721a.hashCode() * 31;
        xi0.b bVar = this.f96722b;
        int iB = v1.c.b(this.e, j6.a.c(y.g(this.f96723c, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31, this.d), 31);
        Long l2 = this.f;
        return iB + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96721a);
        dest.writeSerializable(this.f96722b);
        dest.writeString(this.f96723c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeString(this.e.name());
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
    }
}
