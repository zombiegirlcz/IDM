package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/AdditionalDriver;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Relationship", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalDriver implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalDriver> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75163c;
    public final LocalDate d;
    public final Relationship e;
    public final Survey f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f75164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZonedDateTime f75165h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/AdditionalDriver$Relationship;", "Lcom/revolut/feature/insurance_car/impl/data/model/Answer;", "", "SPOUSE", "PARENT", "FAMILY", "OTHER", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Relationship implements Answer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Relationship[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<Relationship> CREATOR;
        public static final Relationship FAMILY;
        public static final Relationship OTHER;
        public static final Relationship PARENT;
        public static final Relationship SPOUSE;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Relationship.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Relationship[i];
            }
        }

        static {
            Relationship relationship = new Relationship("SPOUSE", 0);
            SPOUSE = relationship;
            Relationship relationship2 = new Relationship("PARENT", 1);
            PARENT = relationship2;
            Relationship relationship3 = new Relationship("FAMILY", 2);
            FAMILY = relationship3;
            Relationship relationship4 = new Relationship("OTHER", 3);
            OTHER = relationship4;
            Relationship[] relationshipArr = {relationship, relationship2, relationship3, relationship4};
            $VALUES = relationshipArr;
            $ENTRIES = s.n(relationshipArr);
            CREATOR = new a();
        }

        public static Relationship valueOf(String str) {
            return (Relationship) Enum.valueOf(Relationship.class, str);
        }

        public static Relationship[] values() {
            return (Relationship[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalDriver(parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), Relationship.CREATOR.createFromParcel(parcel), Survey.CREATOR.createFromParcel(parcel), (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalDriver[i];
        }
    }

    public AdditionalDriver(String str, String firstName, String lastName, LocalDate dateOfBirth, Relationship relationship, Survey survey, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(survey, "survey");
        this.f75161a = str;
        this.f75162b = firstName;
        this.f75163c = lastName;
        this.d = dateOfBirth;
        this.e = relationship;
        this.f = survey;
        this.f75164g = zonedDateTime;
        this.f75165h = zonedDateTime2;
    }

    public final String a() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f75162b, " ", this.f75163c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalDriver)) {
            return false;
        }
        AdditionalDriver additionalDriver = (AdditionalDriver) obj2;
        return Intrinsics.f(this.f75161a, additionalDriver.f75161a) && Intrinsics.f(this.f75162b, additionalDriver.f75162b) && Intrinsics.f(this.f75163c, additionalDriver.f75163c) && Intrinsics.f(this.d, additionalDriver.d) && this.e == additionalDriver.e && Intrinsics.f(this.f, additionalDriver.f) && Intrinsics.f(this.f75164g, additionalDriver.f75164g) && Intrinsics.f(this.f75165h, additionalDriver.f75165h);
    }

    public final int hashCode() {
        String str = this.f75161a;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + y.a(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75162b), 31, this.f75163c), 31, this.d)) * 31)) * 31;
        ZonedDateTime zonedDateTime = this.f75164g;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f75165h;
        return iHashCode2 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75161a);
        dest.writeString(this.f75162b);
        dest.writeString(this.f75163c);
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        dest.writeSerializable(this.f75164g);
        dest.writeSerializable(this.f75165h);
    }
}
