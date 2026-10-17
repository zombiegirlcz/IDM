package com.revolut.trading.orders.ui.invest.placement.models;

import android.os.Parcel;
import android.os.Parcelable;
import k4l.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper;", "Landroid/os/Parcelable;", "MarketOrderType", "LimitOrderType", "StopOrderType", "RecurringOrderType", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$LimitOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$MarketOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$RecurringOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$StopOrderType;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrderTypeWrapper extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$LimitOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitOrderType implements OrderTypeWrapper {

        @NotNull
        public static final Parcelable.Creator<LimitOrderType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f106861b = r0.LIMIT;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitOrderType(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitOrderType[i];
            }
        }

        public LimitOrderType(boolean z) {
            this.f106860a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LimitOrderType) && this.f106860a == ((LimitOrderType) obj2).f106860a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106860a);
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper
        /* JADX INFO: renamed from: t, reason: from getter */
        public final r0 getF106867b() {
            return this.f106861b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106860a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$MarketOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MarketOrderType implements OrderTypeWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MarketOrderType f106862a = new MarketOrderType();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r0 f106863b = r0.MARKET;

        @NotNull
        public static final Parcelable.Creator<MarketOrderType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MarketOrderType.f106862a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketOrderType[i];
            }
        }

        private MarketOrderType() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper
        /* JADX INFO: renamed from: t */
        public final r0 getF106867b() {
            return f106863b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$RecurringOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper;", "<init>", "()V", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RecurringOrderType implements OrderTypeWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RecurringOrderType f106864a = new RecurringOrderType();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final r0 f106865b = r0.RECURRING;

        @NotNull
        public static final Parcelable.Creator<RecurringOrderType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RecurringOrderType.f106864a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringOrderType[i];
            }
        }

        private RecurringOrderType() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper
        /* JADX INFO: renamed from: t */
        public final r0 getF106867b() {
            return f106865b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper$StopOrderType;", "Lcom/revolut/trading/orders/ui/invest/placement/models/OrderTypeWrapper;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StopOrderType implements OrderTypeWrapper {

        @NotNull
        public static final Parcelable.Creator<StopOrderType> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f106866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f106867b = r0.STOP;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopOrderType(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StopOrderType[i];
            }
        }

        public StopOrderType(boolean z) {
            this.f106866a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StopOrderType) && this.f106866a == ((StopOrderType) obj2).f106866a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106866a);
        }

        @Override // com.revolut.trading.orders.ui.invest.placement.models.OrderTypeWrapper
        /* JADX INFO: renamed from: t, reason: from getter */
        public final r0 getF106867b() {
            return this.f106867b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f106866a ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: t */
    r0 getF106867b();
}
