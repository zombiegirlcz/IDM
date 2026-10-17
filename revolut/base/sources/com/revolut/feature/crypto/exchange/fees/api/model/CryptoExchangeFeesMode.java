package com.revolut.feature.crypto.exchange.fees.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode;", "Landroid/os/Parcelable;", "TradeMore", "UpgradePlan", "Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode$TradeMore;", "Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode$UpgradePlan;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeFeesMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode$TradeMore;", "Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradeMore implements CryptoExchangeFeesMode {

        @NotNull
        public static final Parcelable.Creator<TradeMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f70812a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradeMore(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradeMore[i];
            }
        }

        public TradeMore(Double d) {
            this.f70812a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TradeMore) && Intrinsics.f(this.f70812a, ((TradeMore) obj2).f70812a);
        }

        public final int hashCode() {
            Double d = this.f70812a;
            if (d == null) {
                return 0;
            }
            return d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Double d = this.f70812a;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }

        public TradeMore() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode$UpgradePlan;", "Lcom/revolut/feature/crypto/exchange/fees/api/model/CryptoExchangeFeesMode;", "", "toString", "()Ljava/lang/String;", "feature_crypto_exchange_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpgradePlan implements CryptoExchangeFeesMode {

        @NotNull
        public static final Parcelable.Creator<UpgradePlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f70813a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpgradePlan(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpgradePlan[i];
            }
        }

        public UpgradePlan(boolean z) {
            this.f70813a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpgradePlan) && this.f70813a == ((UpgradePlan) obj2).f70813a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70813a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70813a ? 1 : 0);
        }

        public UpgradePlan() {
            this(false);
        }
    }
}
