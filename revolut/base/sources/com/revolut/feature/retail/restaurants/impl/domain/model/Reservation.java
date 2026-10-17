package com.revolut.feature.retail.restaurants.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/Reservation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Guarantee", "DateTime", "xdb/a", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Reservation implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdb.a f82810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f82811c;
    public final LocalTime d;
    public final LocationInfo e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReservationArea f82812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f82813h;
    public final Guarantee i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f82814j;
    public final Customer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f82815l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Duration f82816m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Instant f82817n;
    public final Duration o;

    @NotNull
    public static final Parcelable.Creator<Reservation> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/Reservation$DateTime;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateTime implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f82818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalTime f82819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDateTime f82820c;

        @NotNull
        public static final Parcelable.Creator<DateTime> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateTime((LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateTime[i];
            }
        }

        public DateTime(LocalDate date, LocalTime time) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            this.f82818a = date;
            this.f82819b = time;
            LocalDateTime localDateTimeAtTime = date.atTime(time);
            Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "atTime(...)");
            this.f82820c = localDateTimeAtTime;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DateTime)) {
                return false;
            }
            DateTime dateTime = (DateTime) obj2;
            return Intrinsics.f(this.f82818a, dateTime.f82818a) && Intrinsics.f(this.f82819b, dateTime.f82819b);
        }

        public final int hashCode() {
            return this.f82819b.hashCode() + (this.f82818a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82818a);
            dest.writeSerializable(this.f82819b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0004\u0006\u0007\b\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/Reservation$Guarantee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Order", "com/revolut/feature/retail/restaurants/impl/domain/model/b", "com/revolut/feature/retail/restaurants/impl/domain/model/c", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Guarantee implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.retail.restaurants.impl.domain.model.b f82821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f82822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Order f82823c;

        @NotNull
        public static final Parcelable.Creator<Guarantee> CREATOR = new b();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/domain/model/Reservation$Guarantee$Order;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/feature/retail/restaurants/impl/domain/model/a", "a", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Order implements Parcelable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f82824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f82825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f82826c;
            public final String d;

            @NotNull
            public static final Parcelable.Creator<Order> CREATOR = new b();

            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Order(a.valueOf(parcel.readString()), (dj0.d) parcel.readSerializable(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Order[i];
                }
            }

            public Order(a state, dj0.d dVar, String str, String str2) {
                Intrinsics.checkNotNullParameter(state, "state");
                this.f82824a = state;
                this.f82825b = dVar;
                this.f82826c = str;
                this.d = str2;
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
                return this.f82824a == order.f82824a && Intrinsics.f(this.f82825b, order.f82825b) && Intrinsics.f(this.f82826c, order.f82826c) && Intrinsics.f(this.d, order.d);
            }

            public final int hashCode() {
                int iHashCode = this.f82824a.hashCode() * 31;
                dj0.d dVar = this.f82825b;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str = this.f82826c;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82824a.name());
                dest.writeSerializable(this.f82825b);
                dest.writeString(this.f82826c);
                dest.writeString(this.d);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Guarantee(com.revolut.feature.retail.restaurants.impl.domain.model.b.valueOf(parcel.readString()), c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Order.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Guarantee[i];
            }
        }

        public Guarantee(com.revolut.feature.retail.restaurants.impl.domain.model.b state, c type, Order order) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f82821a = state;
            this.f82822b = type;
            this.f82823c = order;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Guarantee)) {
                return false;
            }
            Guarantee guarantee = (Guarantee) obj2;
            return this.f82821a == guarantee.f82821a && this.f82822b == guarantee.f82822b && Intrinsics.f(this.f82823c, guarantee.f82823c);
        }

        public final int hashCode() {
            int iHashCode = (this.f82822b.hashCode() + (this.f82821a.hashCode() * 31)) * 31;
            Order order = this.f82823c;
            return iHashCode + (order == null ? 0 : order.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82821a.name());
            dest.writeString(this.f82822b.name());
            Order order = this.f82823c;
            if (order == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                order.writeToParcel(dest, i);
            }
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Reservation(parcel.readString(), xdb.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), LocationInfo.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : ReservationArea.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DateTime.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Guarantee.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Customer.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (Duration) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Reservation[i];
        }
    }

    public Reservation(String id10, xdb.a state, LocalDate date, LocalTime time, LocationInfo location, int i, ReservationArea reservationArea, DateTime dateTime, Guarantee guarantee, String str, Customer customer, String str2, Duration duration) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f82809a = id10;
        this.f82810b = state;
        this.f82811c = date;
        this.d = time;
        this.e = location;
        this.f = i;
        this.f82812g = reservationArea;
        this.f82813h = dateTime;
        this.i = guarantee;
        this.f82814j = str;
        this.k = customer;
        this.f82815l = str2;
        this.f82816m = duration;
        LocalDateTime localDateTimeAtTime = date.atTime(time);
        Intrinsics.checkNotNullExpressionValue(localDateTimeAtTime, "atTime(...)");
        this.f82817n = dateTime != null ? dateTime.f82820c.atZone(location.a()).toInstant() : null;
        this.o = dateTime != null ? Duration.between(dateTime.f82820c, localDateTimeAtTime).abs() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Reservation)) {
            return false;
        }
        Reservation reservation = (Reservation) obj2;
        return Intrinsics.f(this.f82809a, reservation.f82809a) && this.f82810b == reservation.f82810b && Intrinsics.f(this.f82811c, reservation.f82811c) && Intrinsics.f(this.d, reservation.d) && Intrinsics.f(this.e, reservation.e) && this.f == reservation.f && Intrinsics.f(this.f82812g, reservation.f82812g) && Intrinsics.f(this.f82813h, reservation.f82813h) && Intrinsics.f(this.i, reservation.i) && Intrinsics.f(this.f82814j, reservation.f82814j) && Intrinsics.f(this.k, reservation.k) && Intrinsics.f(this.f82815l, reservation.f82815l) && Intrinsics.f(this.f82816m, reservation.f82816m);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, (this.e.hashCode() + ((this.d.hashCode() + y.a((this.f82810b.hashCode() + (this.f82809a.hashCode() * 31)) * 31, 31, this.f82811c)) * 31)) * 31, 31);
        ReservationArea reservationArea = this.f82812g;
        int iHashCode = (iB + (reservationArea == null ? 0 : reservationArea.hashCode())) * 31;
        DateTime dateTime = this.f82813h;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Guarantee guarantee = this.i;
        int iHashCode3 = (iHashCode2 + (guarantee == null ? 0 : guarantee.hashCode())) * 31;
        String str = this.f82814j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Customer customer = this.k;
        int iHashCode5 = (iHashCode4 + (customer == null ? 0 : customer.hashCode())) * 31;
        String str2 = this.f82815l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Duration duration = this.f82816m;
        return iHashCode6 + (duration != null ? duration.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82809a);
        dest.writeString(this.f82810b.name());
        dest.writeSerializable(this.f82811c);
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        dest.writeInt(this.f);
        ReservationArea reservationArea = this.f82812g;
        if (reservationArea == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reservationArea.writeToParcel(dest, i);
        }
        DateTime dateTime = this.f82813h;
        if (dateTime == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dateTime.writeToParcel(dest, i);
        }
        Guarantee guarantee = this.i;
        if (guarantee == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            guarantee.writeToParcel(dest, i);
        }
        dest.writeString(this.f82814j);
        Customer customer = this.k;
        if (customer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            customer.writeToParcel(dest, i);
        }
        dest.writeString(this.f82815l);
        dest.writeSerializable(this.f82816m);
    }
}
