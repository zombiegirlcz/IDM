package com.revolut.feature.retail.cfd.api.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget;", "Landroid/os/Parcelable;", "Position", "PositionsGroup", "Order", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$Order;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$Position;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$PositionsGroup;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdExposureBreakdownTarget extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$Order;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Order implements CfdExposureBreakdownTarget {

        @NotNull
        public static final Parcelable.Creator<Order> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CfdExposureBreakdownOrderType f82100a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Order((CfdExposureBreakdownOrderType) parcel.readParcelable(Order.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Order[i];
            }
        }

        public Order(CfdExposureBreakdownOrderType orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82100a = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Order) && Intrinsics.f(this.f82100a, ((Order) obj2).f82100a);
        }

        public final int hashCode() {
            return this.f82100a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82100a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$Position;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Position implements CfdExposureBreakdownTarget {

        @NotNull
        public static final Parcelable.Creator<Position> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82101a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Position(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Position[i];
            }
        }

        public Position(String positionId) {
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            this.f82101a = positionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Position) && Intrinsics.f(this.f82101a, ((Position) obj2).f82101a);
        }

        public final int hashCode() {
            return this.f82101a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82101a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget$PositionsGroup;", "Lcom/revolut/feature/retail/cfd/api/domain/models/CfdExposureBreakdownTarget;", "<init>", "()V", "feature_retail_cfd_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PositionsGroup implements CfdExposureBreakdownTarget {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PositionsGroup f82102a = new PositionsGroup();

        @NotNull
        public static final Parcelable.Creator<PositionsGroup> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PositionsGroup.f82102a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PositionsGroup[i];
            }
        }

        private PositionsGroup() {
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
}
