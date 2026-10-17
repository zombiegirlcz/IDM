package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Descriptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Descriptor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Descriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Details f75202b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Descriptor$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f75204b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String title, String text) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f75203a = title;
            this.f75204b = text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f75203a, details.f75203a) && Intrinsics.f(this.f75204b, details.f75204b);
        }

        public final int hashCode() {
            return this.f75204b.hashCode() + (this.f75203a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75203a);
            dest.writeString(this.f75204b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Descriptor(parcel.readString(), parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Descriptor[i];
        }
    }

    public Descriptor(String text, Details details) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f75201a = text;
        this.f75202b = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Descriptor)) {
            return false;
        }
        Descriptor descriptor = (Descriptor) obj2;
        return Intrinsics.f(this.f75201a, descriptor.f75201a) && Intrinsics.f(this.f75202b, descriptor.f75202b);
    }

    public final int hashCode() {
        int iHashCode = this.f75201a.hashCode() * 31;
        Details details = this.f75202b;
        return iHashCode + (details == null ? 0 : details.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75201a);
        Details details = this.f75202b;
        if (details == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            details.writeToParcel(dest, i);
        }
    }
}
