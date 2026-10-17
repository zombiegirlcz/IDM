package com.revolut.feature.checkout.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/checkout/models/Checkout;", "Ljava/io/Serializable;", "Lcom/revolut/feature/checkout/models/CheckoutConfig;", "<init>", "()V", "Companion", "Id", "Order", "a", "Lcom/revolut/feature/checkout/models/Checkout$Id;", "Lcom/revolut/feature/checkout/models/Checkout$Order;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Checkout implements Serializable, CheckoutConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/Checkout$Id;", "Lcom/revolut/feature/checkout/models/Checkout;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id extends Checkout {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65843a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f65843a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && Intrinsics.f(this.f65843a, ((Id) obj2).f65843a);
        }

        @Override // com.revolut.feature.checkout.models.Checkout
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF65845b() {
            return this.f65843a;
        }

        public final int hashCode() {
            return this.f65843a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65843a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checkout/models/Checkout$Order;", "Lcom/revolut/feature/checkout/models/Checkout;", "", "toString", "()Ljava/lang/String;", "feature_checkout_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order extends Checkout {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheckoutOrder f65844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65845b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order(CheckoutOrder.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(CheckoutOrder order) {
            Intrinsics.checkNotNullParameter(order, "order");
            this.f65844a = order;
            this.f65845b = com.revolut.feature.checkout.models.a.c(order);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Order) && Intrinsics.f(this.f65844a, ((Order) obj2).f65844a);
        }

        @Override // com.revolut.feature.checkout.models.Checkout
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF65845b() {
            return this.f65845b;
        }

        public final int hashCode() {
            return this.f65844a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65844a.writeToParcel(dest, i);
        }
    }

    static {
        new Id("");
    }

    private Checkout() {
    }

    /* JADX INFO: renamed from: getId */
    public abstract String getF65845b();
}
