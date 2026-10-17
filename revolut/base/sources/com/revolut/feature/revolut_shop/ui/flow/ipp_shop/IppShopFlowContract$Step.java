package com.revolut.feature.revolut_shop.ui.flow.ipp_shop;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Dashboard", "Product", "Checkout", "Cart", "OrderConfirmation", "OrderHistory", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Cart;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Checkout;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Dashboard;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$OrderHistory;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Product;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IppShopFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Cart;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cart extends IppShopFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cart f84209a = new Cart();

        @NotNull
        public static final Parcelable.Creator<Cart> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cart.f84209a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cart[i];
            }
        }

        private Cart() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Checkout;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Checkout extends IppShopFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Checkout f84210a = new Checkout();

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Checkout.f84210a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        private Checkout() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Dashboard;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dashboard extends IppShopFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dashboard f84211a = new Dashboard();

        @NotNull
        public static final Parcelable.Creator<Dashboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dashboard.f84211a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dashboard[i];
            }
        }

        private Dashboard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderConfirmation extends IppShopFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84213b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderConfirmation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderConfirmation[i];
            }
        }

        public OrderConfirmation(String orderId, boolean z) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84212a = orderId;
            this.f84213b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderConfirmation)) {
                return false;
            }
            OrderConfirmation orderConfirmation = (OrderConfirmation) obj2;
            return Intrinsics.f(this.f84212a, orderConfirmation.f84212a) && this.f84213b == orderConfirmation.f84213b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84213b) + (this.f84212a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84212a);
            dest.writeInt(this.f84213b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$OrderHistory;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "<init>", "()V", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderHistory extends IppShopFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderHistory f84214a = new OrderHistory();

        @NotNull
        public static final Parcelable.Creator<OrderHistory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderHistory.f84214a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderHistory[i];
            }
        }

        private OrderHistory() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step$Product;", "Lcom/revolut/feature/revolut_shop/ui/flow/ipp_shop/IppShopFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product extends IppShopFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IppProductType f84215a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Product((IppProductType) parcel.readParcelable(Product.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Product[i];
            }
        }

        public Product(IppProductType productType) {
            Intrinsics.checkNotNullParameter(productType, "productType");
            this.f84215a = productType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Product) && Intrinsics.f(this.f84215a, ((Product) obj2).f84215a);
        }

        public final int hashCode() {
            return this.f84215a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84215a, i);
        }
    }

    private IppShopFlowContract$Step() {
    }
}
