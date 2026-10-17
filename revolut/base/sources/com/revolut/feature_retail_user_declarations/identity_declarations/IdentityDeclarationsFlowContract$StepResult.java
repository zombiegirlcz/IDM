package com.revolut.feature_retail_user_declarations.identity_declarations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import com.revolut.shared.feature.user_declarations.api.models.NativeName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult", "Landroid/os/Parcelable;", "Name", "DateOfBirth", "Occupation", "Gender", "PlaceOfBirth", "PurposeOfAccount", "AcceptedTerms", "PersonalCode", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$AcceptedTerms;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$DateOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Gender;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Name;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Occupation;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PersonalCode;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PlaceOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PurposeOfAccount;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IdentityDeclarationsFlowContract$StepResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$AcceptedTerms;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptedTerms implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<AcceptedTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f97656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97657b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AcceptedTerms.class, parcel, arrayList, iE, 1);
                }
                return new AcceptedTerms(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptedTerms[i];
            }
        }

        public AcceptedTerms(List terms, String legalEntityId) {
            Intrinsics.checkNotNullParameter(terms, "terms");
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            this.f97656a = terms;
            this.f97657b = legalEntityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptedTerms)) {
                return false;
            }
            AcceptedTerms acceptedTerms = (AcceptedTerms) obj2;
            return Intrinsics.f(this.f97656a, acceptedTerms.f97656a) && Intrinsics.f(this.f97657b, acceptedTerms.f97657b);
        }

        public final int hashCode() {
            return this.f97657b.hashCode() + (this.f97656a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f97656a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeString(this.f97657b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$DateOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOfBirth implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f97658a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOfBirth((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        public DateOfBirth(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f97658a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOfBirth) && Intrinsics.f(this.f97658a, ((DateOfBirth) obj2).f97658a);
        }

        public final int hashCode() {
            return this.f97658a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97658a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Gender;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gender implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<Gender> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bj0.b f97659a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gender(bj0.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gender[i];
            }
        }

        public Gender(bj0.b gender) {
            Intrinsics.checkNotNullParameter(gender, "gender");
            this.f97659a = gender;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Gender) && this.f97659a == ((Gender) obj2).f97659a;
        }

        public final int hashCode() {
            return this.f97659a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97659a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Occupation;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Occupation implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<Occupation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tbi.a f97664a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Occupation(tbi.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Occupation[i];
            }
        }

        public Occupation(tbi.a occupation) {
            Intrinsics.checkNotNullParameter(occupation, "occupation");
            this.f97664a = occupation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Occupation) && this.f97664a == ((Occupation) obj2).f97664a;
        }

        public final int hashCode() {
            return this.f97664a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97664a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PersonalCode;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalCode implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<PersonalCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97666b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalCode((wi0.b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCode[i];
            }
        }

        public PersonalCode(wi0.b countryCode, String code) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(code, "code");
            this.f97665a = countryCode;
            this.f97666b = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalCode)) {
                return false;
            }
            PersonalCode personalCode = (PersonalCode) obj2;
            return Intrinsics.f(this.f97665a, personalCode.f97665a) && Intrinsics.f(this.f97666b, personalCode.f97666b);
        }

        public final int hashCode() {
            return this.f97666b.hashCode() + (this.f97665a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97665a);
            dest.writeString(this.f97666b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PlaceOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceOfBirth implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<PlaceOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlaceOfBirthFlowOutputData.Success f97667a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceOfBirth((PlaceOfBirthFlowOutputData.Success) parcel.readParcelable(PlaceOfBirth.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceOfBirth[i];
            }
        }

        public PlaceOfBirth(PlaceOfBirthFlowOutputData.Success placeOfBirth) {
            Intrinsics.checkNotNullParameter(placeOfBirth, "placeOfBirth");
            this.f97667a = placeOfBirth;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlaceOfBirth) && Intrinsics.f(this.f97667a, ((PlaceOfBirth) obj2).f97667a);
        }

        public final int hashCode() {
            return this.f97667a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97667a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$PurposeOfAccount;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccount implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f97668a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeOfAccount(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccount[i];
            }
        }

        public PurposeOfAccount(List purposes) {
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            this.f97668a = purposes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurposeOfAccount) && Intrinsics.f(this.f97668a, ((PurposeOfAccount) obj2).f97668a);
        }

        public final int hashCode() {
            return this.f97668a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f97668a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult$Name;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsFlowContract$StepResult;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Name implements IdentityDeclarationsFlowContract$StepResult {

        @NotNull
        public static final Parcelable.Creator<Name> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97662c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NativeName f97663g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Name(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (NativeName) parcel.readParcelable(Name.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Name[i];
            }
        }

        public Name(String str, String str2, String str3, String str4, String str5, String str6, NativeName nativeName) {
            this.f97660a = str;
            this.f97661b = str2;
            this.f97662c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.f97663g = nativeName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Name)) {
                return false;
            }
            Name name = (Name) obj2;
            return Intrinsics.f(this.f97660a, name.f97660a) && Intrinsics.f(this.f97661b, name.f97661b) && Intrinsics.f(this.f97662c, name.f97662c) && Intrinsics.f(this.d, name.d) && Intrinsics.f(this.e, name.e) && Intrinsics.f(this.f, name.f) && Intrinsics.f(this.f97663g, name.f97663g);
        }

        public final int hashCode() {
            String str = this.f97660a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f97661b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f97662c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            NativeName nativeName = this.f97663g;
            return iHashCode6 + (nativeName != null ? nativeName.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97660a);
            dest.writeString(this.f97661b);
            dest.writeString(this.f97662c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeParcelable(this.f97663g, i);
        }

        public Name() {
            this(null, null, null, null, null, null, null);
        }
    }
}
