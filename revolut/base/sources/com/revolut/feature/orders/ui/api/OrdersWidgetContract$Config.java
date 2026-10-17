package com.revolut.feature.orders.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd9.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/feature/orders/ui/api/OrdersWidgetContract$Config", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Style", "a", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OrdersWidgetContract$Config implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f78608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Style f78609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78610c;
    public final OrdersWidgetContract$FilterQuery d;

    @NotNull
    public static final Parcelable.Creator<OrdersWidgetContract$Config> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style;", "Landroid/os/Parcelable;", "HeaderUnboxed", "HeaderBoxed", "NoHeader", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$HeaderBoxed;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$HeaderUnboxed;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$NoHeader;", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Style extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$HeaderBoxed;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style;", "<init>", "()V", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class HeaderBoxed implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final HeaderBoxed f78611a = new HeaderBoxed();

            @NotNull
            public static final Parcelable.Creator<HeaderBoxed> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HeaderBoxed.f78611a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HeaderBoxed[i];
                }
            }

            private HeaderBoxed() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$NoHeader;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style;", "<init>", "()V", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NoHeader implements Style {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NoHeader f78613a = new NoHeader();

            @NotNull
            public static final Parcelable.Creator<NoHeader> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NoHeader.f78613a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NoHeader[i];
                }
            }

            private NoHeader() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style$HeaderUnboxed;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$Config$Style;", "", "toString", "()Ljava/lang/String;", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HeaderUnboxed implements Style {

            @NotNull
            public static final Parcelable.Creator<HeaderUnboxed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f78612a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new HeaderUnboxed(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HeaderUnboxed[i];
                }
            }

            public HeaderUnboxed(boolean z) {
                this.f78612a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof HeaderUnboxed) && this.f78612a == ((HeaderUnboxed) obj2).f78612a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f78612a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f78612a ? 1 : 0);
            }

            public HeaderUnboxed() {
                this(false);
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrdersWidgetContract$Config(d.valueOf(parcel.readString()), (Style) parcel.readParcelable(OrdersWidgetContract$Config.class.getClassLoader()), parcel.readInt(), (OrdersWidgetContract$FilterQuery) parcel.readParcelable(OrdersWidgetContract$Config.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OrdersWidgetContract$Config[i];
        }
    }

    public OrdersWidgetContract$Config(d assetType, Style style, int i, OrdersWidgetContract$FilterQuery filterQuery) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
        this.f78608a = assetType;
        this.f78609b = style;
        this.f78610c = i;
        this.d = filterQuery;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OrdersWidgetContract$Config)) {
            return false;
        }
        OrdersWidgetContract$Config ordersWidgetContract$Config = (OrdersWidgetContract$Config) obj2;
        return this.f78608a == ordersWidgetContract$Config.f78608a && Intrinsics.f(this.f78609b, ordersWidgetContract$Config.f78609b) && this.f78610c == ordersWidgetContract$Config.f78610c && Intrinsics.f(this.d, ordersWidgetContract$Config.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a.b(this.f78610c, (this.f78609b.hashCode() + (this.f78608a.hashCode() * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78608a.name());
        dest.writeParcelable(this.f78609b, i);
        dest.writeInt(this.f78610c);
        dest.writeParcelable(this.d, i);
    }
}
