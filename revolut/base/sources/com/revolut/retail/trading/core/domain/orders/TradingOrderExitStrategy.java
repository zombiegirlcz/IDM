package com.revolut.retail.trading.core.domain.orders;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy;", "Landroid/os/Parcelable;", "<init>", "()V", "Price", "Amount", "Distance", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Amount;", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Distance;", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Price;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TradingOrderExitStrategy implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Amount;", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Amount extends TradingOrderExitStrategy {

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f104662a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Amount((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        public Amount(b targetAmount) {
            Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
            this.f104662a = targetAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Amount) && Intrinsics.f(this.f104662a, ((Amount) obj2).f104662a);
        }

        public final int hashCode() {
            return this.f104662a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104662a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Distance;", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Distance extends TradingOrderExitStrategy {

        @NotNull
        public static final Parcelable.Creator<Distance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BigDecimal f104663a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Distance((BigDecimal) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Distance[i];
            }
        }

        public Distance(BigDecimal distance) {
            Intrinsics.checkNotNullParameter(distance, "distance");
            this.f104663a = distance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Distance) && Intrinsics.f(this.f104663a, ((Distance) obj2).f104663a);
        }

        public final int hashCode() {
            return this.f104663a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104663a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy$Price;", "Lcom/revolut/retail/trading/core/domain/orders/TradingOrderExitStrategy;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Price extends TradingOrderExitStrategy {

        @NotNull
        public static final Parcelable.Creator<Price> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f104664a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Price((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Price[i];
            }
        }

        public Price(b targetPrice) {
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            this.f104664a = targetPrice;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Price) && Intrinsics.f(this.f104664a, ((Price) obj2).f104664a);
        }

        public final int hashCode() {
            return this.f104664a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104664a);
        }
    }

    private TradingOrderExitStrategy() {
    }
}
