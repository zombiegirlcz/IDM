package com.revolut.trading.orders.ui.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus;", "Landroid/os/Parcelable;", "<init>", "()V", "Unavailable", "OptedOut", "OptedIn", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$OptedIn;", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$OptedOut;", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$Unavailable;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExtendedHoursStatus implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$OptedIn;", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptedIn extends ExtendedHoursStatus {

        @NotNull
        public static final Parcelable.Creator<OptedIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f107063a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptedIn(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptedIn[i];
            }
        }

        public OptedIn(boolean z) {
            this.f107063a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptedIn) && this.f107063a == ((OptedIn) obj2).f107063a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f107063a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f107063a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$OptedOut;", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OptedOut extends ExtendedHoursStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OptedOut f107064a = new OptedOut();

        @NotNull
        public static final Parcelable.Creator<OptedOut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OptedOut.f107064a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptedOut[i];
            }
        }

        private OptedOut() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus$Unavailable;", "Lcom/revolut/trading/orders/ui/trade/model/ExtendedHoursStatus;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unavailable extends ExtendedHoursStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unavailable f107065a = new Unavailable();

        @NotNull
        public static final Parcelable.Creator<Unavailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unavailable.f107065a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unavailable[i];
            }
        }

        private Unavailable() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private ExtendedHoursStatus() {
    }
}
