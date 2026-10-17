package com.revolut.feature_crypto_order_details.api.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "TpslInputData", "StopLimitInputData", "RecurringInputData", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$RecurringInputData;", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$StopLimitInputData;", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$TpslInputData;", "feature_crypto_order_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoOrderDetailsInputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$RecurringInputData;", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringInputData extends CryptoOrderDetailsInputData {

        @NotNull
        public static final Parcelable.Creator<RecurringInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f96659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f96660c;
        public final b d;
        public final String e;
        public final b f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringInputData(parcel.readString(), parcel.readInt() != 0, parcel.readLong(), (b) parcel.readSerializable(), parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringInputData[i];
            }
        }

        public RecurringInputData(String recurringPaymentId, boolean z, long j2, b currency, String destinationPocketId, b destinationPocketCurrency) {
            Intrinsics.checkNotNullParameter(recurringPaymentId, "recurringPaymentId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(destinationPocketId, "destinationPocketId");
            Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
            this.f96658a = recurringPaymentId;
            this.f96659b = z;
            this.f96660c = j2;
            this.d = currency;
            this.e = destinationPocketId;
            this.f = destinationPocketCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringInputData)) {
                return false;
            }
            RecurringInputData recurringInputData = (RecurringInputData) obj2;
            return Intrinsics.f(this.f96658a, recurringInputData.f96658a) && this.f96659b == recurringInputData.f96659b && this.f96660c == recurringInputData.f96660c && Intrinsics.f(this.d, recurringInputData.d) && Intrinsics.f(this.e, recurringInputData.e) && Intrinsics.f(this.f, recurringInputData.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + p.a.c(l.j(this.d, d.c(j6.a.c(this.f96658a.hashCode() * 31, 31, this.f96659b), 31, this.f96660c), 31), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96658a);
            dest.writeInt(this.f96659b ? 1 : 0);
            dest.writeLong(this.f96660c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$StopLimitInputData;", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StopLimitInputData extends CryptoOrderDetailsInputData {

        @NotNull
        public static final Parcelable.Creator<StopLimitInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrder f96661a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopLimitInputData((ExchangeOrder) parcel.readParcelable(StopLimitInputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StopLimitInputData[i];
            }
        }

        public StopLimitInputData(ExchangeOrder exchangeOrder) {
            Intrinsics.checkNotNullParameter(exchangeOrder, "exchangeOrder");
            this.f96661a = exchangeOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StopLimitInputData) && Intrinsics.f(this.f96661a, ((StopLimitInputData) obj2).f96661a);
        }

        public final int hashCode() {
            return this.f96661a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96661a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData$TpslInputData;", "Lcom/revolut/feature_crypto_order_details/api/navigation/CryptoOrderDetailsInputData;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TpslInputData extends CryptoOrderDetailsInputData {

        @NotNull
        public static final Parcelable.Creator<TpslInputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrder f96662a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TpslInputData((ExchangeOrder) parcel.readParcelable(TpslInputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TpslInputData[i];
            }
        }

        public TpslInputData(ExchangeOrder exchangeOrder) {
            Intrinsics.checkNotNullParameter(exchangeOrder, "exchangeOrder");
            this.f96662a = exchangeOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TpslInputData) && Intrinsics.f(this.f96662a, ((TpslInputData) obj2).f96662a);
        }

        public final int hashCode() {
            return this.f96662a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96662a, i);
        }
    }

    private CryptoOrderDetailsInputData() {
    }
}
