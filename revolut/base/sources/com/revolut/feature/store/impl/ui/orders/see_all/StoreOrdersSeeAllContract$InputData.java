package com.revolut.feature.store.impl.ui.orders.see_all;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData", "Landroid/os/Parcelable;", "<init>", "()V", "Orders", "GiftCards", "Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData$GiftCards;", "Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData$Orders;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StoreOrdersSeeAllContract$InputData implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData$Orders;", "Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Orders extends StoreOrdersSeeAllContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Orders f88715a = new Orders();

        @NotNull
        public static final Parcelable.Creator<Orders> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Orders.f88715a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Orders[i];
            }
        }

        private Orders() {
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

    private StoreOrdersSeeAllContract$InputData() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData$GiftCards;", "Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftCards extends StoreOrdersSeeAllContract$InputData {

        @NotNull
        public static final Parcelable.Creator<GiftCards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88714a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftCards(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftCards[i];
            }
        }

        public GiftCards(String str) {
            this.f88714a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GiftCards) && Intrinsics.f(this.f88714a, ((GiftCards) obj2).f88714a);
        }

        public final int hashCode() {
            String str = this.f88714a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f88714a);
        }

        public GiftCards() {
            this(null);
        }
    }
}
