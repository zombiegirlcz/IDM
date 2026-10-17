package com.revolut.feature.revolutpay.order_tracking.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/DeliveryWithOrder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Order", "Merchant", "a", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryWithOrder implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Delivery f84659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Order f84660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Merchant f84661c;

    @NotNull
    public static final Parcelable.Creator<DeliveryWithOrder> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/DeliveryWithOrder$Merchant;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Merchant implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Merchant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84663b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Merchant(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Merchant[i];
            }
        }

        public Merchant(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f84662a = name;
            this.f84663b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Merchant)) {
                return false;
            }
            Merchant merchant = (Merchant) obj2;
            return Intrinsics.f(this.f84662a, merchant.f84662a) && Intrinsics.f(this.f84663b, merchant.f84663b);
        }

        public final int hashCode() {
            int iHashCode = this.f84662a.hashCode() * 31;
            String str = this.f84663b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84662a);
            dest.writeString(this.f84663b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/DeliveryWithOrder$Order;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84665b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(String id10, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f84664a = id10;
            this.f84665b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Order)) {
                return false;
            }
            Order order = (Order) obj2;
            return Intrinsics.f(this.f84664a, order.f84664a) && Intrinsics.f(this.f84665b, order.f84665b);
        }

        public final int hashCode() {
            int iHashCode = this.f84664a.hashCode() * 31;
            String str = this.f84665b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84664a);
            dest.writeString(this.f84665b);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryWithOrder(Delivery.CREATOR.createFromParcel(parcel), Order.CREATOR.createFromParcel(parcel), Merchant.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryWithOrder[i];
        }
    }

    public DeliveryWithOrder(Delivery delivery, Order order, Merchant merchant) {
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        this.f84659a = delivery;
        this.f84660b = order;
        this.f84661c = merchant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryWithOrder)) {
            return false;
        }
        DeliveryWithOrder deliveryWithOrder = (DeliveryWithOrder) obj2;
        return Intrinsics.f(this.f84659a, deliveryWithOrder.f84659a) && Intrinsics.f(this.f84660b, deliveryWithOrder.f84660b) && Intrinsics.f(this.f84661c, deliveryWithOrder.f84661c);
    }

    public final int hashCode() {
        return this.f84661c.hashCode() + ((this.f84660b.hashCode() + (this.f84659a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84659a.writeToParcel(dest, i);
        this.f84660b.writeToParcel(dest, i);
        this.f84661c.writeToParcel(dest, i);
    }
}
