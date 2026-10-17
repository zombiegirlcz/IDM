package com.revolut.feature.revolut_shop.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolut_shop.api.domain.model.IppProductType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Catalog", "Product", "OrderHistory", "OrderConfirmation", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$Catalog;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$OrderHistory;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$Product;", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutShopDestination$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$Catalog;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData;", "<init>", "()V", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Catalog extends RevolutShopDestination$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Catalog f84188a = new Catalog();

        @NotNull
        public static final Parcelable.Creator<Catalog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Catalog.f84188a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Catalog[i];
            }
        }

        private Catalog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$OrderConfirmation;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderConfirmation extends RevolutShopDestination$InputData {

        @NotNull
        public static final Parcelable.Creator<OrderConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84189a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderConfirmation[i];
            }
        }

        public OrderConfirmation(String orderId) {
            Intrinsics.checkNotNullParameter(orderId, "orderId");
            this.f84189a = orderId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderConfirmation) && Intrinsics.f(this.f84189a, ((OrderConfirmation) obj2).f84189a);
        }

        public final int hashCode() {
            return this.f84189a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$OrderHistory;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData;", "<init>", "()V", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderHistory extends RevolutShopDestination$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderHistory f84190a = new OrderHistory();

        @NotNull
        public static final Parcelable.Creator<OrderHistory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderHistory.f84190a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData$Product;", "Lcom/revolut/feature/revolut_shop/api/RevolutShopDestination$InputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_shop_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Product extends RevolutShopDestination$InputData {

        @NotNull
        public static final Parcelable.Creator<Product> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IppProductType f84191a;

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
            this.f84191a = productType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Product) && Intrinsics.f(this.f84191a, ((Product) obj2).f84191a);
        }

        public final int hashCode() {
            return this.f84191a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84191a, i);
        }
    }

    private RevolutShopDestination$InputData() {
    }
}
