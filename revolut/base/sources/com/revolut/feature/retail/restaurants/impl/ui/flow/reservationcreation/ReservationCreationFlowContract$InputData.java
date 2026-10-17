package com.revolut.feature.retail.restaurants.impl.ui.flow.reservationcreation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Creation", "Confirmation", "Details", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Creation;", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Details;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReservationCreationFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements ReservationCreationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String reservationId) {
            Intrinsics.checkNotNullParameter(reservationId, "reservationId");
            this.f82848a = reservationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f82848a, ((Confirmation) obj2).f82848a);
        }

        public final int hashCode() {
            return this.f82848a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82848a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Creation;", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Creation implements ReservationCreationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Creation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82849a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Creation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Creation[i];
            }
        }

        public Creation(String reservationPageId) {
            Intrinsics.checkNotNullParameter(reservationPageId, "reservationPageId");
            this.f82849a = reservationPageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Creation) && Intrinsics.f(this.f82849a, ((Creation) obj2).f82849a);
        }

        public final int hashCode() {
            return this.f82849a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82849a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData$Details;", "Lcom/revolut/feature/retail/restaurants/impl/ui/flow/reservationcreation/ReservationCreationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements ReservationCreationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82850a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String reservationId) {
            Intrinsics.checkNotNullParameter(reservationId, "reservationId");
            this.f82850a = reservationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f82850a, ((Details) obj2).f82850a);
        }

        public final int hashCode() {
            return this.f82850a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82850a);
        }
    }
}
