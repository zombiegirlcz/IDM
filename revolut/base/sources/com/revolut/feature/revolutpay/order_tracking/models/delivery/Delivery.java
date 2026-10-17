package com.revolut.feature.revolutpay.order_tracking.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jetbrains.annotations.NotNull;
import wbc.c;
import wbc.n;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/Delivery;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "wbc/c", "Weight", "a", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Delivery implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84642c;
    public final DeliveryAddress d;
    public final DeliveryCarrier e;
    public final Weight f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f84643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f84644h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f84645j;
    public final LocalDate k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f84646l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f84647m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f84648n;

    @NotNull
    public static final Parcelable.Creator<Delivery> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/Delivery$Weight;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Weight implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f84649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f84650b;

        @NotNull
        public static final Parcelable.Creator<Weight> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Weight(parcel.readDouble(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Weight[i];
            }
        }

        public Weight(double d, n unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f84649a = d;
            this.f84650b = unit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Weight)) {
                return false;
            }
            Weight weight = (Weight) obj2;
            return Double.compare(this.f84649a, weight.f84649a) == 0 && this.f84650b == weight.f84650b;
        }

        public final int hashCode() {
            return this.f84650b.hashCode() + (Double.hashCode(this.f84649a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f84649a);
            dest.writeString(this.f84650b.name());
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeliveryAddress deliveryAddressCreateFromParcel = parcel.readInt() == 0 ? null : DeliveryAddress.CREATOR.createFromParcel(parcel);
            DeliveryCarrier deliveryCarrierCreateFromParcel = DeliveryCarrier.CREATOR.createFromParcel(parcel);
            Weight weightCreateFromParcel = parcel.readInt() != 0 ? Weight.CREATOR.createFromParcel(parcel) : null;
            c cVarValueOf = c.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            LocalDate localDate4 = (LocalDate) parcel.readSerializable();
            LocalDate localDate5 = (LocalDate) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z3 = z;
            int iA = 0;
            while (iA != i) {
                iA = a.a(DeliveryCheckpoint.CREATOR, parcel, arrayList, iA, 1);
                i = i;
                string = string;
            }
            return new Delivery(string, string2, string3, deliveryAddressCreateFromParcel, deliveryCarrierCreateFromParcel, weightCreateFromParcel, cVarValueOf, localDate, localDate2, localDate3, localDate4, localDate5, z3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Delivery[i];
        }
    }

    public Delivery(String id10, String trackingNumber, String str, DeliveryAddress deliveryAddress, DeliveryCarrier carrier, Weight weight, c progress, LocalDate orderedDate, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, boolean z, List checkpoints) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(trackingNumber, "trackingNumber");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(orderedDate, "orderedDate");
        Intrinsics.checkNotNullParameter(checkpoints, "checkpoints");
        this.f84640a = id10;
        this.f84641b = trackingNumber;
        this.f84642c = str;
        this.d = deliveryAddress;
        this.e = carrier;
        this.f = weight;
        this.f84643g = progress;
        this.f84644h = orderedDate;
        this.i = localDate;
        this.f84645j = localDate2;
        this.k = localDate3;
        this.f84646l = localDate4;
        this.f84647m = z;
        this.f84648n = checkpoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Delivery)) {
            return false;
        }
        Delivery delivery = (Delivery) obj2;
        return Intrinsics.f(this.f84640a, delivery.f84640a) && Intrinsics.f(this.f84641b, delivery.f84641b) && Intrinsics.f(this.f84642c, delivery.f84642c) && Intrinsics.f(this.d, delivery.d) && Intrinsics.f(this.e, delivery.e) && Intrinsics.f(this.f, delivery.f) && this.f84643g == delivery.f84643g && Intrinsics.f(this.f84644h, delivery.f84644h) && Intrinsics.f(this.i, delivery.i) && Intrinsics.f(this.f84645j, delivery.f84645j) && Intrinsics.f(this.k, delivery.k) && Intrinsics.f(this.f84646l, delivery.f84646l) && this.f84647m == delivery.f84647m && Intrinsics.f(this.f84648n, delivery.f84648n);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f84640a.hashCode() * 31, 31, this.f84641b);
        String str = this.f84642c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryAddress deliveryAddress = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (deliveryAddress == null ? 0 : deliveryAddress.hashCode())) * 31)) * 31;
        Weight weight = this.f;
        int iA = y.a((this.f84643g.hashCode() + ((iHashCode2 + (weight == null ? 0 : weight.hashCode())) * 31)) * 31, 31, this.f84644h);
        LocalDate localDate = this.i;
        int iHashCode3 = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f84645j;
        int iHashCode4 = (iHashCode3 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.k;
        int iHashCode5 = (iHashCode4 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.f84646l;
        return this.f84648n.hashCode() + j6.a.c((iHashCode5 + (localDate4 != null ? localDate4.hashCode() : 0)) * 31, 31, this.f84647m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84640a);
        dest.writeString(this.f84641b);
        dest.writeString(this.f84642c);
        DeliveryAddress deliveryAddress = this.d;
        if (deliveryAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deliveryAddress.writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        Weight weight = this.f;
        if (weight == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            weight.writeToParcel(dest, i);
        }
        dest.writeString(this.f84643g.name());
        dest.writeSerializable(this.f84644h);
        dest.writeSerializable(this.i);
        dest.writeSerializable(this.f84645j);
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f84646l);
        dest.writeInt(this.f84647m ? 1 : 0);
        Iterator itV = p.a.v(this.f84648n, dest);
        while (itV.hasNext()) {
            ((DeliveryCheckpoint) itV.next()).writeToParcel(dest, i);
        }
    }
}
