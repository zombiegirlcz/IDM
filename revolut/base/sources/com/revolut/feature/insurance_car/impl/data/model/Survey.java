package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import dj0.d;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "Licence", "Employment", "CurrentInsurance", "Claims", "LicencePenalties", "a", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Survey implements Parcelable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f75313g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Licence f75314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Employment f75315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrentInsurance f75316c;
    public final Claims d;
    public final LicencePenalties e;
    public final Answer.Mileage f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<Survey> CREATOR = new b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$Claims;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Claims implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Claims> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.ClaimsState f75317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f75318b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$Claims$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Details implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Details> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LocalDate f75319a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Answer.ClaimType f75320b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Boolean f75321c;
            public final Boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    LocalDate localDate = (LocalDate) parcel.readSerializable();
                    Answer.ClaimType claimTypeCreateFromParcel = Answer.ClaimType.CREATOR.createFromParcel(parcel);
                    Boolean boolValueOf2 = null;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() != 0) {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Details(localDate, claimTypeCreateFromParcel, boolValueOf, boolValueOf2);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Details[i];
                }
            }

            public Details(LocalDate localDate, Answer.ClaimType type, Boolean bool, Boolean bool2) {
                Intrinsics.checkNotNullParameter(type, "type");
                this.f75319a = localDate;
                this.f75320b = type;
                this.f75321c = bool;
                this.d = bool2;
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
                return Intrinsics.f(this.f75319a, details.f75319a) && this.f75320b == details.f75320b && Intrinsics.f(this.f75321c, details.f75321c) && Intrinsics.f(this.d, details.d);
            }

            public final int hashCode() {
                LocalDate localDate = this.f75319a;
                int iHashCode = (this.f75320b.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31;
                Boolean bool = this.f75321c;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.d;
                return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f75319a);
                this.f75320b.writeToParcel(dest, i);
                Boolean bool = this.f75321c;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    p.a.A(dest, 1, bool);
                }
                Boolean bool2 = this.d;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    p.a.A(dest, 1, bool2);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Answer.ClaimsState claimsStateCreateFromParcel = Answer.ClaimsState.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Details.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Claims(claimsStateCreateFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Claims[i];
            }
        }

        public Claims(Answer.ClaimsState state, List details) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(details, "details");
            this.f75317a = state;
            this.f75318b = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Claims)) {
                return false;
            }
            Claims claims = (Claims) obj2;
            return this.f75317a == claims.f75317a && Intrinsics.f(this.f75318b, claims.f75318b);
        }

        public final int hashCode() {
            return this.f75318b.hashCode() + (this.f75317a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75317a.writeToParcel(dest, i);
            Iterator itV = p.a.v(this.f75318b, dest);
            while (itV.hasNext()) {
                ((Details) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$CurrentInsurance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrentInsurance implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CurrentInsurance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.CurrentInsuranceState f75322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Answer.NoClaimsDiscount f75323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Answer.AdditionalClaimsDiscount f75324c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrentInsurance(Answer.CurrentInsuranceState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Answer.NoClaimsDiscount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Answer.AdditionalClaimsDiscount.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrentInsurance[i];
            }
        }

        public CurrentInsurance(Answer.CurrentInsuranceState state, Answer.NoClaimsDiscount noClaimsDiscount, Answer.AdditionalClaimsDiscount additionalClaimsDiscount) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f75322a = state;
            this.f75323b = noClaimsDiscount;
            this.f75324c = additionalClaimsDiscount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrentInsurance)) {
                return false;
            }
            CurrentInsurance currentInsurance = (CurrentInsurance) obj2;
            return this.f75322a == currentInsurance.f75322a && this.f75323b == currentInsurance.f75323b && this.f75324c == currentInsurance.f75324c;
        }

        public final int hashCode() {
            int iHashCode = this.f75322a.hashCode() * 31;
            Answer.NoClaimsDiscount noClaimsDiscount = this.f75323b;
            int iHashCode2 = (iHashCode + (noClaimsDiscount == null ? 0 : noClaimsDiscount.hashCode())) * 31;
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount = this.f75324c;
            return iHashCode2 + (additionalClaimsDiscount != null ? additionalClaimsDiscount.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75322a.writeToParcel(dest, i);
            Answer.NoClaimsDiscount noClaimsDiscount = this.f75323b;
            if (noClaimsDiscount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                noClaimsDiscount.writeToParcel(dest, i);
            }
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount = this.f75324c;
            if (additionalClaimsDiscount == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                additionalClaimsDiscount.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$Employment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Employment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Employment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.EmploymentStatus f75325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Occupation f75326b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Employment(Answer.EmploymentStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Occupation.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Employment[i];
            }
        }

        public Employment(Answer.EmploymentStatus status, Occupation occupation) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.f75325a = status;
            this.f75326b = occupation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Employment)) {
                return false;
            }
            Employment employment = (Employment) obj2;
            return this.f75325a == employment.f75325a && Intrinsics.f(this.f75326b, employment.f75326b);
        }

        public final int hashCode() {
            int iHashCode = this.f75325a.hashCode() * 31;
            Occupation occupation = this.f75326b;
            return iHashCode + (occupation == null ? 0 : occupation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75325a.writeToParcel(dest, i);
            Occupation occupation = this.f75326b;
            if (occupation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                occupation.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$Licence;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Licence implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Licence> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.LicenceType f75327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Answer.LicenceDuration f75328b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Licence(Answer.LicenceType.CREATOR.createFromParcel(parcel), Answer.LicenceDuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Licence[i];
            }
        }

        public Licence(Answer.LicenceType type, Answer.LicenceDuration yearsSinceIssued) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(yearsSinceIssued, "yearsSinceIssued");
            this.f75327a = type;
            this.f75328b = yearsSinceIssued;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Licence)) {
                return false;
            }
            Licence licence = (Licence) obj2;
            return this.f75327a == licence.f75327a && this.f75328b == licence.f75328b;
        }

        public final int hashCode() {
            return this.f75328b.hashCode() + (this.f75327a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75327a.writeToParcel(dest, i);
            this.f75328b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Survey$LicencePenalties;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LicencePenalties implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<LicencePenalties> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.PenaltyPoints f75329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Boolean f75330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f75331c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Answer.PenaltyPoints penaltyPointsCreateFromParcel = Answer.PenaltyPoints.CREATOR.createFromParcel(parcel);
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new LicencePenalties(penaltyPointsCreateFromParcel, boolValueOf, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LicencePenalties[i];
            }
        }

        public LicencePenalties(Answer.PenaltyPoints points, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(points, "points");
            this.f75329a = points;
            this.f75330b = bool;
            this.f75331c = bool2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LicencePenalties)) {
                return false;
            }
            LicencePenalties licencePenalties = (LicencePenalties) obj2;
            return this.f75329a == licencePenalties.f75329a && Intrinsics.f(this.f75330b, licencePenalties.f75330b) && Intrinsics.f(this.f75331c, licencePenalties.f75331c);
        }

        public final int hashCode() {
            int iHashCode = this.f75329a.hashCode() * 31;
            Boolean bool = this.f75330b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f75331c;
            return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75329a.writeToParcel(dest, i);
            Boolean bool = this.f75330b;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool);
            }
            Boolean bool2 = this.f75331c;
            if (bool2 == null) {
                dest.writeInt(0);
            } else {
                p.a.A(dest, 1, bool2);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.insurance_car.impl.data.model.Survey$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Survey(parcel.readInt() == 0 ? null : Licence.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Employment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CurrentInsurance.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Claims.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LicencePenalties.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Answer.Mileage.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Survey[i];
        }
    }

    static {
        xi0.b.Companion.getClass();
        f75313g = new d(1000000L, xi0.b.f306272g);
    }

    public Survey() {
        this(null, null, null, null, null, null, 63);
    }

    public static Survey a(Survey survey, Licence licence, Employment employment, CurrentInsurance currentInsurance, Claims claims, LicencePenalties licencePenalties, Answer.Mileage mileage, int i) {
        if ((i & 1) != 0) {
            licence = survey.f75314a;
        }
        Licence licence2 = licence;
        if ((i & 2) != 0) {
            employment = survey.f75315b;
        }
        Employment employment2 = employment;
        if ((i & 4) != 0) {
            currentInsurance = survey.f75316c;
        }
        CurrentInsurance currentInsurance2 = currentInsurance;
        if ((i & 8) != 0) {
            claims = survey.d;
        }
        Claims claims2 = claims;
        if ((i & 16) != 0) {
            licencePenalties = survey.e;
        }
        LicencePenalties licencePenalties2 = licencePenalties;
        if ((i & 32) != 0) {
            mileage = survey.f;
        }
        survey.getClass();
        return new Survey(licence2, employment2, currentInsurance2, claims2, licencePenalties2, mileage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Survey)) {
            return false;
        }
        Survey survey = (Survey) obj2;
        return Intrinsics.f(this.f75314a, survey.f75314a) && Intrinsics.f(this.f75315b, survey.f75315b) && Intrinsics.f(this.f75316c, survey.f75316c) && Intrinsics.f(this.d, survey.d) && Intrinsics.f(this.e, survey.e) && this.f == survey.f;
    }

    public final int hashCode() {
        Licence licence = this.f75314a;
        int iHashCode = (licence == null ? 0 : licence.hashCode()) * 31;
        Employment employment = this.f75315b;
        int iHashCode2 = (iHashCode + (employment == null ? 0 : employment.hashCode())) * 31;
        CurrentInsurance currentInsurance = this.f75316c;
        int iHashCode3 = (iHashCode2 + (currentInsurance == null ? 0 : currentInsurance.hashCode())) * 31;
        Claims claims = this.d;
        int iHashCode4 = (iHashCode3 + (claims == null ? 0 : claims.hashCode())) * 31;
        LicencePenalties licencePenalties = this.e;
        int iHashCode5 = (iHashCode4 + (licencePenalties == null ? 0 : licencePenalties.hashCode())) * 31;
        Answer.Mileage mileage = this.f;
        return iHashCode5 + (mileage != null ? mileage.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Licence licence = this.f75314a;
        if (licence == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            licence.writeToParcel(dest, i);
        }
        Employment employment = this.f75315b;
        if (employment == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            employment.writeToParcel(dest, i);
        }
        CurrentInsurance currentInsurance = this.f75316c;
        if (currentInsurance == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currentInsurance.writeToParcel(dest, i);
        }
        Claims claims = this.d;
        if (claims == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            claims.writeToParcel(dest, i);
        }
        LicencePenalties licencePenalties = this.e;
        if (licencePenalties == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            licencePenalties.writeToParcel(dest, i);
        }
        Answer.Mileage mileage = this.f;
        if (mileage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mileage.writeToParcel(dest, i);
        }
    }

    public Survey(Licence licence, Employment employment, CurrentInsurance currentInsurance, Claims claims, LicencePenalties licencePenalties, Answer.Mileage mileage) {
        this.f75314a = licence;
        this.f75315b = employment;
        this.f75316c = currentInsurance;
        this.d = claims;
        this.e = licencePenalties;
        this.f = mileage;
    }

    public /* synthetic */ Survey(Licence licence, Employment employment, CurrentInsurance currentInsurance, Claims claims, LicencePenalties licencePenalties, Answer.Mileage mileage, int i) {
        this((i & 1) != 0 ? null : licence, (i & 2) != 0 ? null : employment, (i & 4) != 0 ? null : currentInsurance, (i & 8) != 0 ? null : claims, (i & 16) != 0 ? null : licencePenalties, (i & 32) != 0 ? null : mileage);
    }
}
