package com.revolut.feature_crypto_order_flow.api.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/api/exchange/CryptoOrderPocketInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoOrderPocketInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoOrderPocketInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentPocketInfo f96703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f96705c;
    public final long d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoOrderPocketInfo((PaymentPocketInfo) parcel.readParcelable(CryptoOrderPocketInfo.class.getClassLoader()), parcel.readString(), l.valueOf(parcel.readString()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoOrderPocketInfo[i];
        }
    }

    public CryptoOrderPocketInfo(PaymentPocketInfo paymentPocketInfo, String pocketId, l pocketType, long j2) {
        Intrinsics.checkNotNullParameter(paymentPocketInfo, "paymentPocketInfo");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f96703a = paymentPocketInfo;
        this.f96704b = pocketId;
        this.f96705c = pocketType;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoOrderPocketInfo)) {
            return false;
        }
        CryptoOrderPocketInfo cryptoOrderPocketInfo = (CryptoOrderPocketInfo) obj2;
        return Intrinsics.f(this.f96703a, cryptoOrderPocketInfo.f96703a) && Intrinsics.f(this.f96704b, cryptoOrderPocketInfo.f96704b) && this.f96705c == cryptoOrderPocketInfo.f96705c && this.d == cryptoOrderPocketInfo.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + t61.a.c(this.f96705c, p.a.c(this.f96703a.hashCode() * 31, 31, this.f96704b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96703a, i);
        dest.writeString(this.f96704b);
        dest.writeString(this.f96705c.name());
        dest.writeLong(this.d);
    }
}
