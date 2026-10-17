package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "Landroid/os/Parcelable;", "Employer", "RiskAssessment", "TermsReview", "TrackingConsent", "ContactSelection", "AddressSuggestion", "ResidentialAddressCollection", "ResidentialAddressCollectionV2", "TransactionActivity", "PepConnections", "ProductClosures", "PodBeneficiaries", "CreditConsent", "TaxResidenciesCollection", "SendGuardianInvitation", "PricingPlansPrompt", "UserIdentifier", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$AddressSuggestion;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ProductClosures;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TrackingConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TransactionActivity;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MobileScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$AddressSuggestion;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressSuggestion implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<AddressSuggestion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem f105421a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressSuggestion(WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressSuggestion[i];
            }
        }

        public AddressSuggestion(WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f105421a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddressSuggestion) && Intrinsics.f(this.f105421a, ((AddressSuggestion) obj2).f105421a);
        }

        public final int hashCode() {
            return this.f105421a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105421a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactSelection implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<ContactSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f105422a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ContactSelection.class, parcel, arrayList, iE, 1);
                }
                return new ContactSelection(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactSelection[i];
            }
        }

        public ContactSelection(ArrayList users) {
            Intrinsics.checkNotNullParameter(users, "users");
            this.f105422a = users;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactSelection) && this.f105422a.equals(((ContactSelection) obj2).f105422a);
        }

        public final int hashCode() {
            return this.f105422a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f105422a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditConsent implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<CreditConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105423a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditConsent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditConsent[i];
            }
        }

        public CreditConsent(boolean z) {
            this.f105423a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditConsent) && this.f105423a == ((CreditConsent) obj2).f105423a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f105423a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f105423a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Employer implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<Employer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Address f105430c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Employer(parcel.readInt() != 0, parcel.readString(), (Address) parcel.readParcelable(Employer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Employer[i];
            }
        }

        public Employer(boolean z, String str, Address address) {
            this.f105428a = z;
            this.f105429b = str;
            this.f105430c = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Employer)) {
                return false;
            }
            Employer employer = (Employer) obj2;
            return this.f105428a == employer.f105428a && Intrinsics.f(this.f105429b, employer.f105429b) && Intrinsics.f(this.f105430c, employer.f105430c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f105428a) * 31;
            String str = this.f105429b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Address address = this.f105430c;
            return iHashCode2 + (address != null ? address.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f105428a ? 1 : 0);
            dest.writeString(this.f105429b);
            dest.writeParcelable(this.f105430c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "PepConnection", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PepConnections implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<PepConnections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105431a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f105432b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PepConnections$PepConnection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PepConnection implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PepConnection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105433a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105434b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105435c;
            public final String d;
            public final String e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PepConnection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PepConnection[i];
                }
            }

            public PepConnection(String str, String firstName, String firstSurname, String str2, String str3, String str4) {
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
                this.f105433a = str;
                this.f105434b = firstName;
                this.f105435c = firstSurname;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PepConnection)) {
                    return false;
                }
                PepConnection pepConnection = (PepConnection) obj2;
                return Intrinsics.f(this.f105433a, pepConnection.f105433a) && Intrinsics.f(this.f105434b, pepConnection.f105434b) && Intrinsics.f(this.f105435c, pepConnection.f105435c) && Intrinsics.f(this.d, pepConnection.d) && Intrinsics.f(this.e, pepConnection.e) && Intrinsics.f(this.f, pepConnection.f);
            }

            public final int hashCode() {
                String str = this.f105433a;
                int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f105434b), 31, this.f105435c);
                String str2 = this.d;
                int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.e;
                int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f;
                return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105433a);
                dest.writeString(this.f105434b);
                dest.writeString(this.f105435c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PepConnection.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PepConnections(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PepConnections[i];
            }
        }

        public PepConnections(String mobileScreenName, ArrayList connections) {
            Intrinsics.checkNotNullParameter(mobileScreenName, "mobileScreenName");
            Intrinsics.checkNotNullParameter(connections, "connections");
            this.f105431a = mobileScreenName;
            this.f105432b = connections;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PepConnections)) {
                return false;
            }
            PepConnections pepConnections = (PepConnections) obj2;
            return Intrinsics.f(this.f105431a, pepConnections.f105431a) && this.f105432b.equals(pepConnections.f105432b);
        }

        public final int hashCode() {
            return this.f105432b.hashCode() + (this.f105431a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105431a);
            Iterator itY = j6.a.y(this.f105432b, dest);
            while (itY.hasNext()) {
                ((PepConnection) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "PodBeneficiary", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodBeneficiaries implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<PodBeneficiaries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f105436a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PodBeneficiaries$PodBeneficiary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PodBeneficiary implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PodBeneficiary> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105437a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105438b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105439c;
            public final String d;
            public final String e;
            public final Address f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final int f105440g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PodBeneficiary(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Address) parcel.readParcelable(PodBeneficiary.class.getClassLoader()), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PodBeneficiary[i];
                }
            }

            public PodBeneficiary(String str, String firstName, String lastName, String dob2, String str2, Address address, int i) {
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(dob2, "dob");
                this.f105437a = str;
                this.f105438b = firstName;
                this.f105439c = lastName;
                this.d = dob2;
                this.e = str2;
                this.f = address;
                this.f105440g = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PodBeneficiary)) {
                    return false;
                }
                PodBeneficiary podBeneficiary = (PodBeneficiary) obj2;
                return Intrinsics.f(this.f105437a, podBeneficiary.f105437a) && Intrinsics.f(this.f105438b, podBeneficiary.f105438b) && Intrinsics.f(this.f105439c, podBeneficiary.f105439c) && Intrinsics.f(this.d, podBeneficiary.d) && Intrinsics.f(this.e, podBeneficiary.e) && Intrinsics.f(this.f, podBeneficiary.f) && this.f105440g == podBeneficiary.f105440g;
            }

            public final int hashCode() {
                String str = this.f105437a;
                int iC = p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f105438b), 31, this.f105439c), 31, this.d);
                String str2 = this.e;
                int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
                Address address = this.f;
                return Integer.hashCode(this.f105440g) + ((iHashCode + (address != null ? address.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105437a);
                dest.writeString(this.f105438b);
                dest.writeString(this.f105439c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeParcelable(this.f, i);
                dest.writeInt(this.f105440g);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PodBeneficiary.CREATOR, parcel, arrayList, iA, 1);
                }
                return new PodBeneficiaries(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodBeneficiaries[i];
            }
        }

        public PodBeneficiaries(ArrayList nominees) {
            Intrinsics.checkNotNullParameter(nominees, "nominees");
            this.f105436a = nominees;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PodBeneficiaries) && this.f105436a.equals(((PodBeneficiaries) obj2).f105436a);
        }

        public final int hashCode() {
            return this.f105436a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f105436a, dest);
            while (itY.hasNext()) {
                ((PodBeneficiary) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PricingPlansPrompt implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<PricingPlansPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105441a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PricingPlansPrompt(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PricingPlansPrompt[i];
            }
        }

        public PricingPlansPrompt(boolean z) {
            this.f105441a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PricingPlansPrompt) && this.f105441a == ((PricingPlansPrompt) obj2).f105441a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f105441a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f105441a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ProductClosures;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductClosures implements MobileScreenParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductClosures f105442a = new ProductClosures();

        @NotNull
        public static final Parcelable.Creator<ProductClosures> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductClosures.f105442a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductClosures[i];
            }
        }

        private ProductClosures() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResidentialAddressCollection implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<ResidentialAddressCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f105443a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResidentialAddressCollection((Address) parcel.readParcelable(ResidentialAddressCollection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidentialAddressCollection[i];
            }
        }

        public ResidentialAddressCollection(Address residentialAddress) {
            Intrinsics.checkNotNullParameter(residentialAddress, "residentialAddress");
            this.f105443a = residentialAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ResidentialAddressCollection) && Intrinsics.f(this.f105443a, ((ResidentialAddressCollection) obj2).f105443a);
        }

        public final int hashCode() {
            return this.f105443a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f105443a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResidentialAddressCollectionV2 implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<ResidentialAddressCollectionV2> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f105444a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResidentialAddressCollectionV2((Address) parcel.readParcelable(ResidentialAddressCollectionV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidentialAddressCollectionV2[i];
            }
        }

        public ResidentialAddressCollectionV2(Address residentialAddress) {
            Intrinsics.checkNotNullParameter(residentialAddress, "residentialAddress");
            this.f105444a = residentialAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ResidentialAddressCollectionV2) && Intrinsics.f(this.f105444a, ((ResidentialAddressCollectionV2) obj2).f105444a);
        }

        public final int hashCode() {
            return this.f105444a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f105444a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskAssessment implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<RiskAssessment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f105445a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskAssessment(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskAssessment[i];
            }
        }

        public RiskAssessment(List risks) {
            Intrinsics.checkNotNullParameter(risks, "risks");
            this.f105445a = risks;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskAssessment) && Intrinsics.f(this.f105445a, ((RiskAssessment) obj2).f105445a);
        }

        public final int hashCode() {
            return this.f105445a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f105445a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SendGuardianInvitation implements MobileScreenParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SendGuardianInvitation f105446a = new SendGuardianInvitation();

        @NotNull
        public static final Parcelable.Creator<SendGuardianInvitation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SendGuardianInvitation.f105446a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendGuardianInvitation[i];
            }
        }

        private SendGuardianInvitation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "PrimaryCountryReplacement", "com/revolut/shared/feature/workflow/engine/api/models/a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidenciesCollection implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<TaxResidenciesCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimaryCountryReplacement f105447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f105449c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TaxResidenciesCollection$PrimaryCountryReplacement;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PrimaryCountryReplacement implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<PrimaryCountryReplacement> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f105450a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105452c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PrimaryCountryReplacement((b) parcel.readSerializable(), (b) parcel.readSerializable(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PrimaryCountryReplacement[i];
                }
            }

            public PrimaryCountryReplacement(b removedCountry, b addedCountry, String str) {
                Intrinsics.checkNotNullParameter(removedCountry, "removedCountry");
                Intrinsics.checkNotNullParameter(addedCountry, "addedCountry");
                this.f105450a = removedCountry;
                this.f105451b = addedCountry;
                this.f105452c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof PrimaryCountryReplacement)) {
                    return false;
                }
                PrimaryCountryReplacement primaryCountryReplacement = (PrimaryCountryReplacement) obj2;
                return Intrinsics.f(this.f105450a, primaryCountryReplacement.f105450a) && Intrinsics.f(this.f105451b, primaryCountryReplacement.f105451b) && Intrinsics.f(this.f105452c, primaryCountryReplacement.f105452c);
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105450a.f297794a.hashCode() * 31, 31, this.f105451b.f297794a);
                String str = this.f105452c;
                return iC + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105450a);
                dest.writeSerializable(this.f105451b);
                dest.writeString(this.f105452c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList2 = null;
                PrimaryCountryReplacement primaryCountryReplacementCreateFromParcel = parcel.readInt() == 0 ? null : PrimaryCountryReplacement.CREATOR.createFromParcel(parcel);
                int iC = 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(com.revolut.shared.feature.workflow.engine.api.models.a.valueOf(parcel.readString()));
                    }
                }
                if (parcel.readInt() != 0) {
                    int i3 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i3);
                    while (iC != i3) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList3, iC, 1);
                    }
                    arrayList2 = arrayList3;
                }
                return new TaxResidenciesCollection(primaryCountryReplacementCreateFromParcel, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidenciesCollection[i];
            }
        }

        public TaxResidenciesCollection(PrimaryCountryReplacement primaryCountryReplacement, List list, List list2) {
            this.f105447a = primaryCountryReplacement;
            this.f105448b = list;
            this.f105449c = list2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidenciesCollection)) {
                return false;
            }
            TaxResidenciesCollection taxResidenciesCollection = (TaxResidenciesCollection) obj2;
            return Intrinsics.f(this.f105447a, taxResidenciesCollection.f105447a) && Intrinsics.f(this.f105448b, taxResidenciesCollection.f105448b) && Intrinsics.f(this.f105449c, taxResidenciesCollection.f105449c);
        }

        public final int hashCode() {
            PrimaryCountryReplacement primaryCountryReplacement = this.f105447a;
            int iHashCode = (primaryCountryReplacement == null ? 0 : primaryCountryReplacement.hashCode()) * 31;
            List list = this.f105448b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.f105449c;
            return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PrimaryCountryReplacement primaryCountryReplacement = this.f105447a;
            if (primaryCountryReplacement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                primaryCountryReplacement.writeToParcel(dest, i);
            }
            List list = this.f105448b;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeString(((com.revolut.shared.feature.workflow.engine.api.models.a) itQ.next()).name());
                }
            }
            List list2 = this.f105449c;
            if (list2 == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                dest.writeSerializable((Serializable) itQ2.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f105453a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TermsReview(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsReview[i];
            }
        }

        public TermsReview(List termsIds) {
            Intrinsics.checkNotNullParameter(termsIds, "termsIds");
            this.f105453a = termsIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TermsReview) && Intrinsics.f(this.f105453a, ((TermsReview) obj2).f105453a);
        }

        public final int hashCode() {
            return this.f105453a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f105453a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TrackingConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingConsent implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<TrackingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f105454a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrackingConsent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackingConsent[i];
            }
        }

        public TrackingConsent(boolean z) {
            this.f105454a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TrackingConsent) && this.f105454a == ((TrackingConsent) obj2).f105454a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f105454a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f105454a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TransactionActivity;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams;", "", "toString", "()Ljava/lang/String;", "CountryTransaction", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionActivity implements MobileScreenParams {

        @NotNull
        public static final Parcelable.Creator<TransactionActivity> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f105455a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$TransactionActivity$CountryTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CountryTransaction implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CountryTransaction> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f105456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f105457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105458c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CountryTransaction((d) parcel.readSerializable(), parcel.readString(), (b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CountryTransaction[i];
                }
            }

            public CountryTransaction(d dVar, String str, b country) {
                Intrinsics.checkNotNullParameter(country, "country");
                this.f105456a = country;
                this.f105457b = dVar;
                this.f105458c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CountryTransaction)) {
                    return false;
                }
                CountryTransaction countryTransaction = (CountryTransaction) obj2;
                return Intrinsics.f(this.f105456a, countryTransaction.f105456a) && Intrinsics.f(this.f105457b, countryTransaction.f105457b) && Intrinsics.f(this.f105458c, countryTransaction.f105458c);
            }

            public final int hashCode() {
                int iHashCode = this.f105456a.f297794a.hashCode() * 31;
                d dVar = this.f105457b;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                String str = this.f105458c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f105456a);
                dest.writeSerializable(this.f105457b);
                dest.writeString(this.f105458c);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CountryTransaction.CREATOR, parcel, arrayList, iA, 1);
                }
                return new TransactionActivity(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionActivity[i];
            }
        }

        public TransactionActivity(ArrayList transactionCountries) {
            Intrinsics.checkNotNullParameter(transactionCountries, "transactionCountries");
            this.f105455a = transactionCountries;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionActivity) && this.f105455a.equals(((TransactionActivity) obj2).f105455a);
        }

        public final int hashCode() {
            return this.f105455a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f105455a, dest);
            while (itY.hasNext()) {
                ((CountryTransaction) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier;", "Landroid/os/Parcelable;", "Code", "Email", "Phone", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Code;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Email;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Phone;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface UserIdentifier extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Code;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier;", "code", "", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Code implements UserIdentifier {

            @NotNull
            public static final Parcelable.Creator<Code> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105459a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new Code(v7.t(parcel, "parcel", "code"));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Code[i];
                }
            }

            public /* synthetic */ Code(String str) {
                this.f105459a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (obj2 instanceof Code) {
                    return Intrinsics.f(this.f105459a, ((Code) obj2).f105459a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f105459a.hashCode();
            }

            public final String toString() {
                return p.a.p("Code(code=", this.f105459a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105459a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Email;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier;", "email", "", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Email implements UserIdentifier {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105460a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new Email(v7.t(parcel, "parcel", "email"));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Email[i];
                }
            }

            public /* synthetic */ Email(String str) {
                this.f105460a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (obj2 instanceof Email) {
                    return Intrinsics.f(this.f105460a, ((Email) obj2).f105460a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f105460a.hashCode();
            }

            public final String toString() {
                return p.a.p("Email(email=", this.f105460a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105460a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier$Phone;", "Lcom/revolut/shared/feature/workflow/engine/api/models/MobileScreenParams$UserIdentifier;", "phone", "", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Phone implements UserIdentifier {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105461a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new Phone(v7.t(parcel, "parcel", "phone"));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Phone[i];
                }
            }

            public /* synthetic */ Phone(String str) {
                this.f105461a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (obj2 instanceof Phone) {
                    return Intrinsics.f(this.f105461a, ((Phone) obj2).f105461a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f105461a.hashCode();
            }

            public final String toString() {
                return p.a.p("Phone(phone=", this.f105461a, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105461a);
            }
        }
    }
}
