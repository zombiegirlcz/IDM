package com.revolut.feature.orders.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery", "Landroid/os/Parcelable;", "EMPTY", "Simple", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery$EMPTY;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery$Simple;", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OrdersWidgetContract$FilterQuery extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery$EMPTY;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery;", "<init>", "()V", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EMPTY implements OrdersWidgetContract$FilterQuery {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EMPTY f78614a = new EMPTY();

        @NotNull
        public static final Parcelable.Creator<EMPTY> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EMPTY.f78614a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EMPTY[i];
            }
        }

        private EMPTY() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery$Simple;", "Lcom/revolut/feature/orders/ui/api/OrdersWidgetContract$FilterQuery;", "", "toString", "()Ljava/lang/String;", "feature_orders_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Simple implements OrdersWidgetContract$FilterQuery {

        @NotNull
        public static final Parcelable.Creator<Simple> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78615a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Simple(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Simple[i];
            }
        }

        public Simple(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            this.f78615a = query;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Simple) && Intrinsics.f(this.f78615a, ((Simple) obj2).f78615a);
        }

        public final int hashCode() {
            return this.f78615a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78615a);
        }
    }
}
