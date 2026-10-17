package com.revolut.feature.insurance_pet.impl.ui.pet.dob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", "Landroid/os/Parcelable;", "Empty", "PartiallyFilled", "Filled", "tz7/b", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$Empty;", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$Filled;", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$PartiallyFilled;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DOBInputData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f76348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tz7.b f76350c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$Empty;", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", "<init>", "()V", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty extends DOBInputData {
        public static final Empty d = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Empty() {
            super("");
            m70.a.c(t0.f186434a);
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$PartiallyFilled;", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PartiallyFilled extends DOBInputData {

        @NotNull
        public static final Parcelable.Creator<PartiallyFilled> CREATOR = new a();
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PartiallyFilled(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PartiallyFilled[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartiallyFilled(String rawValue) {
            super(rawValue);
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            this.d = rawValue;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76349b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PartiallyFilled) && Intrinsics.f(this.d, ((PartiallyFilled) obj2).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.d);
        }
    }

    public DOBInputData(Date date, String str, tz7.b bVar) {
        this.f76348a = date;
        this.f76349b = str;
        this.f76350c = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public tz7.b getF76350c() {
        return this.f76350c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Date getF76348a() {
        return this.f76348a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getF76349b() {
        return this.f76349b;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData$Filled;", "Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Filled extends DOBInputData {

        @NotNull
        public static final Parcelable.Creator<Filled> CREATOR = new a();
        public final Date d;
        public final String e;
        public final tz7.b f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Filled((Date) parcel.readSerializable(), parcel.readString(), tz7.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filled[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Filled(Date date, String rawValue, tz7.b error) {
            super(date, rawValue, error);
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            Intrinsics.checkNotNullParameter(error, "error");
            this.d = date;
            this.e = rawValue;
            this.f = error;
        }

        public static Filled d(Filled filled, tz7.b error) {
            Date date = filled.d;
            String rawValue = filled.e;
            filled.getClass();
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Filled(date, rawValue, error);
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final tz7.b getF76350c() {
            return this.f;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Date getF76348a() {
            return this.d;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76349b() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Filled)) {
                return false;
            }
            Filled filled = (Filled) obj2;
            return Intrinsics.f(this.d, filled.d) && Intrinsics.f(this.e, filled.e) && this.f == filled.f;
        }

        public final int hashCode() {
            Date date = this.d;
            return this.f.hashCode() + p.a.c((date == null ? 0 : date.hashCode()) * 31, 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f.name());
        }

        public /* synthetic */ Filled(String str, Date date) {
            this(date, str, tz7.b.NONE);
        }
    }

    public /* synthetic */ DOBInputData(String str) {
        this(null, str, tz7.b.NONE);
    }
}
