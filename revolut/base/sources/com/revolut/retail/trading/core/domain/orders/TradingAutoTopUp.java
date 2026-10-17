package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import k4l.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp;", "Landroid/os/Parcelable;", "Pocket", "Holding", "CombinedBuyingPower", "k4l/l0", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$CombinedBuyingPower;", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$Holding;", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$Pocket;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TradingAutoTopUp extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$CombinedBuyingPower;", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp;", "<init>", "()V", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CombinedBuyingPower implements TradingAutoTopUp {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CombinedBuyingPower f104654a = new CombinedBuyingPower();

        @NotNull
        public static final Parcelable.Creator<CombinedBuyingPower> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CombinedBuyingPower.f104654a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CombinedBuyingPower[i];
            }
        }

        private CombinedBuyingPower() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp
        public final l0 getType() {
            return l0.COMBINED_BUYING_POWER;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$Holding;", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Holding implements TradingAutoTopUp {

        @NotNull
        public static final Parcelable.Creator<Holding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f104656b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Holding(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Holding[i];
            }
        }

        public Holding(String str, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104655a = str;
            this.f104656b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Holding)) {
                return false;
            }
            Holding holding = (Holding) obj2;
            return Intrinsics.f(this.f104655a, holding.f104655a) && Intrinsics.f(this.f104656b, holding.f104656b);
        }

        @Override // com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp
        public final l0 getType() {
            return l0.HOLDING;
        }

        public final int hashCode() {
            String str = this.f104655a;
            return this.f104656b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104655a);
            dest.writeSerializable(this.f104656b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp$Pocket;", "Lcom/revolut/retail/trading/core/domain/orders/TradingAutoTopUp;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pocket implements TradingAutoTopUp {

        @NotNull
        public static final Parcelable.Creator<Pocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f104658b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pocket(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pocket[i];
            }
        }

        public Pocket(String pocketId, b currency) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104657a = pocketId;
            this.f104658b = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Pocket)) {
                return false;
            }
            Pocket pocket = (Pocket) obj2;
            return Intrinsics.f(this.f104657a, pocket.f104657a) && Intrinsics.f(this.f104658b, pocket.f104658b);
        }

        @Override // com.revolut.retail.trading.core.domain.orders.TradingAutoTopUp
        public final l0 getType() {
            return l0.POCKET;
        }

        public final int hashCode() {
            return this.f104658b.hashCode() + (this.f104657a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104657a);
            dest.writeSerializable(this.f104658b);
        }
    }

    l0 getType();
}
