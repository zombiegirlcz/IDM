package com.revolut.feature_retail_user_declarations.identity_declarations;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.user_declarations.api.models.DateOfBirthScreenConfig;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Name", "DateOfBirth", "Occupation", "Gender", "PlaceOfBirth", "PurposeOfAccount", "AcceptedTerms", "PersonalCode", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$AcceptedTerms;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$DateOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Gender;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Name;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Occupation;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PersonalCode;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PlaceOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PurposeOfAccount;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class IdentityDeclarationsStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$AcceptedTerms;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptedTerms extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<AcceptedTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f97673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f97674c;
        public final WorkflowScreenConfiguration d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(AcceptedTerms.class, parcel, arrayList, iE, 1);
                }
                return new AcceptedTerms((WorkflowScreenConfiguration) parcel.readParcelable(AcceptedTerms.class.getClassLoader()), parcel.readString(), arrayList, bVar);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptedTerms[i];
            }
        }

        public AcceptedTerms(WorkflowScreenConfiguration workflowScreenConfiguration, String legalEntityId, ArrayList scopes, wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(scopes, "scopes");
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            this.f97672a = country;
            this.f97673b = scopes;
            this.f97674c = legalEntityId;
            this.d = workflowScreenConfiguration;
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
            return Intrinsics.f(this.f97672a, acceptedTerms.f97672a) && this.f97673b.equals(acceptedTerms.f97673b) && Intrinsics.f(this.f97674c, acceptedTerms.f97674c) && Intrinsics.f(this.d, acceptedTerms.d);
        }

        public final int hashCode() {
            int iC = p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f97673b, this.f97672a.f297794a.hashCode() * 31, 31), 31, this.f97674c);
            WorkflowScreenConfiguration workflowScreenConfiguration = this.d;
            return iC + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97672a);
            Iterator itY = j6.a.y(this.f97673b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeString(this.f97674c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$DateOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOfBirth extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateOfBirthScreenConfig f97675a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOfBirth((DateOfBirthScreenConfig) parcel.readParcelable(DateOfBirth.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        public DateOfBirth(DateOfBirthScreenConfig screenConfiguration) {
            Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
            this.f97675a = screenConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOfBirth) && Intrinsics.f(this.f97675a, ((DateOfBirth) obj2).f97675a);
        }

        public final int hashCode() {
            return this.f97675a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97675a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Gender;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Gender extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<Gender> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97677b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Gender((wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gender[i];
            }
        }

        public Gender(wi0.b countryCode, boolean z) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f97676a = countryCode;
            this.f97677b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Gender)) {
                return false;
            }
            Gender gender = (Gender) obj2;
            return Intrinsics.f(this.f97676a, gender.f97676a) && this.f97677b == gender.f97677b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97677b) + (this.f97676a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97676a);
            dest.writeInt(this.f97677b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Name;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Name extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<Name> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f97679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97680c;
        public final pbl.a d;
        public final WorkflowScreenConfiguration e;
        public final pbl.b f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f97681g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new Name(bVar, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : pbl.a.valueOf(parcel.readString()), (WorkflowScreenConfiguration) parcel.readParcelable(Name.class.getClassLoader()), pbl.b.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Name[i];
            }
        }

        public Name(wi0.b country, boolean z, boolean z3, pbl.a aVar, WorkflowScreenConfiguration workflowScreenConfiguration, pbl.b screenMode, Integer num) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(screenMode, "screenMode");
            this.f97678a = country;
            this.f97679b = z;
            this.f97680c = z3;
            this.d = aVar;
            this.e = workflowScreenConfiguration;
            this.f = screenMode;
            this.f97681g = num;
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
            return Intrinsics.f(this.f97678a, name.f97678a) && this.f97679b == name.f97679b && this.f97680c == name.f97680c && this.d == name.d && Intrinsics.f(this.e, name.e) && this.f == name.f && Intrinsics.f(this.f97681g, name.f97681g);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(this.f97678a.f297794a.hashCode() * 31, 31, this.f97679b), 31, this.f97680c);
            pbl.a aVar = this.d;
            int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
            WorkflowScreenConfiguration workflowScreenConfiguration = this.e;
            int iHashCode2 = (this.f.hashCode() + ((iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31)) * 31;
            Integer num = this.f97681g;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97678a);
            dest.writeInt(this.f97679b ? 1 : 0);
            dest.writeInt(this.f97680c ? 1 : 0);
            pbl.a aVar = this.d;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f.name());
            Integer num = this.f97681g;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$Occupation;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Occupation extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<Occupation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowScreenConfiguration f97683b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Occupation((wi0.b) parcel.readSerializable(), (WorkflowScreenConfiguration) parcel.readParcelable(Occupation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Occupation[i];
            }
        }

        public Occupation(wi0.b country, WorkflowScreenConfiguration workflowScreenConfiguration) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f97682a = country;
            this.f97683b = workflowScreenConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Occupation)) {
                return false;
            }
            Occupation occupation = (Occupation) obj2;
            return Intrinsics.f(this.f97682a, occupation.f97682a) && Intrinsics.f(this.f97683b, occupation.f97683b);
        }

        public final int hashCode() {
            int iHashCode = this.f97682a.f297794a.hashCode() * 31;
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f97683b;
            return iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97682a);
            dest.writeParcelable(this.f97683b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PersonalCode;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalCode extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<PersonalCode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97684a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalCode((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCode[i];
            }
        }

        public PersonalCode(wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f97684a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PersonalCode) && Intrinsics.f(this.f97684a, ((PersonalCode) obj2).f97684a);
        }

        public final int hashCode() {
            return this.f97684a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97684a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PlaceOfBirth;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceOfBirth extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<PlaceOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97685a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceOfBirth((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceOfBirth[i];
            }
        }

        public PlaceOfBirth(wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f97685a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlaceOfBirth) && Intrinsics.f(this.f97685a, ((PlaceOfBirth) obj2).f97685a);
        }

        public final int hashCode() {
            return this.f97685a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97685a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep$PurposeOfAccount;", "Lcom/revolut/feature_retail_user_declarations/identity_declarations/IdentityDeclarationsStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccount extends IdentityDeclarationsStep {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f97686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowScreenConfiguration f97687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f97688c;
        public final Boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                WorkflowScreenConfiguration workflowScreenConfiguration = (WorkflowScreenConfiguration) parcel.readParcelable(PurposeOfAccount.class.getClassLoader());
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new PurposeOfAccount(bVar, workflowScreenConfiguration, boolValueOf, boolValueOf2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccount[i];
            }
        }

        public PurposeOfAccount(wi0.b country, WorkflowScreenConfiguration workflowScreenConfiguration, Boolean bool, Boolean bool2) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f97686a = country;
            this.f97687b = workflowScreenConfiguration;
            this.f97688c = bool;
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
            if (!(obj2 instanceof PurposeOfAccount)) {
                return false;
            }
            PurposeOfAccount purposeOfAccount = (PurposeOfAccount) obj2;
            return Intrinsics.f(this.f97686a, purposeOfAccount.f97686a) && Intrinsics.f(this.f97687b, purposeOfAccount.f97687b) && Intrinsics.f(this.f97688c, purposeOfAccount.f97688c) && Intrinsics.f(this.d, purposeOfAccount.d);
        }

        public final int hashCode() {
            int iHashCode = this.f97686a.f297794a.hashCode() * 31;
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f97687b;
            int iHashCode2 = (iHashCode + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
            Boolean bool = this.f97688c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.d;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97686a);
            dest.writeParcelable(this.f97687b, i);
            Boolean bool = this.f97688c;
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

    private IdentityDeclarationsStep() {
    }
}
