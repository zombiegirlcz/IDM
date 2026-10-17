package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import li8.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus", "Landroid/os/Parcelable;", "Valid", "OverRegistrationAge", "Invalid", "Missing", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Invalid;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Missing;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$OverRegistrationAge;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Valid;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorPersonalDetailsScreenContract$DateOfBirthStatus extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Invalid;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invalid implements JuniorPersonalDetailsScreenContract$DateOfBirthStatus {

        @NotNull
        public static final Parcelable.Creator<Invalid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f77043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f77044b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Invalid((LocalDate) parcel.readSerializable(), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invalid[i];
            }
        }

        public Invalid(LocalDate localDate, e reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f77043a = localDate;
            this.f77044b = reason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) obj2;
            return Intrinsics.f(this.f77043a, invalid.f77043a) && this.f77044b == invalid.f77044b;
        }

        @Override // com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus
        /* JADX INFO: renamed from: getDate, reason: from getter */
        public final LocalDate getF77048a() {
            return this.f77043a;
        }

        public final int hashCode() {
            LocalDate localDate = this.f77043a;
            return this.f77044b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77043a);
            dest.writeString(this.f77044b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Missing;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Missing implements JuniorPersonalDetailsScreenContract$DateOfBirthStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Missing f77045a = new Missing();

        @NotNull
        public static final Parcelable.Creator<Missing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Missing.f77045a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Missing[i];
            }
        }

        private Missing() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus
        /* JADX INFO: renamed from: getDate */
        public final LocalDate getF77048a() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$OverRegistrationAge;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverRegistrationAge implements JuniorPersonalDetailsScreenContract$DateOfBirthStatus {

        @NotNull
        public static final Parcelable.Creator<OverRegistrationAge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f77046a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77047b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverRegistrationAge(parcel.readInt(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverRegistrationAge[i];
            }
        }

        public OverRegistrationAge(int i, LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f77046a = date;
            this.f77047b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OverRegistrationAge)) {
                return false;
            }
            OverRegistrationAge overRegistrationAge = (OverRegistrationAge) obj2;
            return Intrinsics.f(this.f77046a, overRegistrationAge.f77046a) && this.f77047b == overRegistrationAge.f77047b;
        }

        @Override // com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus
        /* JADX INFO: renamed from: getDate, reason: from getter */
        public final LocalDate getF77048a() {
            return this.f77046a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f77047b) + (this.f77046a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77046a);
            dest.writeInt(this.f77047b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus$Valid;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/personal_details/JuniorPersonalDetailsScreenContract$DateOfBirthStatus;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Valid implements JuniorPersonalDetailsScreenContract$DateOfBirthStatus {

        @NotNull
        public static final Parcelable.Creator<Valid> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f77048a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Valid((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Valid[i];
            }
        }

        public Valid(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f77048a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Valid) && Intrinsics.f(this.f77048a, ((Valid) obj2).f77048a);
        }

        @Override // com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreenContract$DateOfBirthStatus
        /* JADX INFO: renamed from: getDate, reason: from getter */
        public final LocalDate getF77048a() {
            return this.f77048a;
        }

        public final int hashCode() {
            return this.f77048a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77048a);
        }
    }

    /* JADX INFO: renamed from: getDate */
    LocalDate getF77048a();
}
