package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExpiryCollection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExplicitTerm;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import h30.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ril.f;
import ril.g;
import ril.h;
import ril.i;
import ril.j;
import sil.d;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ril/g", "ril/f", "ril/j", "ril/i", "ril/h", "Screen", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WorkflowStepConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WorkflowStepConfiguration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f105505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f105507c;
    public final String d;
    public final Map e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WorkflowScreenConfiguration f105508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f105509h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f105510j;
    public final i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Screen f105511l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f105512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f105513n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f105514p;

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "Landroid/os/Parcelable;", "Employer", "RiskAssessment", "PeriodicReview", "TermsReview", "TrackingConsent", "ContactSelection", "DocumentSelection", "ResidentialAddressCollection", "ResidentialAddressCollectionV2", "TransactionCountries", "PepConnections", "ProductClosures", "PodBeneficiaries", "AddressSuggestion", "CreditConsent", "TaxResidenciesCollection", "SendGuardianInvitation", "PricingPlansPrompt", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$AddressSuggestion;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$DocumentSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PeriodicReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ProductClosures;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TrackingConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TransactionCountries;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Screen extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$AddressSuggestion;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "AddressSuggestionItem", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AddressSuggestion implements Screen {

            @NotNull
            public static final Parcelable.Creator<AddressSuggestion> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105516b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105517c;
            public final String d;
            public final ArrayList e;
            public final AddressSuggestionItem f;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$AddressSuggestion$AddressSuggestionItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AddressSuggestionItem implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<AddressSuggestionItem> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Address f105518a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f105519b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f105520c;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AddressSuggestionItem((Address) parcel.readParcelable(AddressSuggestionItem.class.getClassLoader()), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AddressSuggestionItem[i];
                    }
                }

                public AddressSuggestionItem(Address address, String title, String str) {
                    Intrinsics.checkNotNullParameter(address, "address");
                    Intrinsics.checkNotNullParameter(title, "title");
                    this.f105518a = address;
                    this.f105519b = title;
                    this.f105520c = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AddressSuggestionItem)) {
                        return false;
                    }
                    AddressSuggestionItem addressSuggestionItem = (AddressSuggestionItem) obj2;
                    return Intrinsics.f(this.f105518a, addressSuggestionItem.f105518a) && Intrinsics.f(this.f105519b, addressSuggestionItem.f105519b) && Intrinsics.f(this.f105520c, addressSuggestionItem.f105520c);
                }

                public final int hashCode() {
                    int iC = p.a.c(this.f105518a.hashCode() * 31, 31, this.f105519b);
                    String str = this.f105520c;
                    return iC + (str == null ? 0 : str.hashCode());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f105518a, i);
                    dest.writeString(this.f105519b);
                    dest.writeString(this.f105520c);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AddressSuggestionItem.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new AddressSuggestion(string, string2, string3, string4, arrayList, parcel.readInt() == 0 ? null : AddressSuggestionItem.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AddressSuggestion[i];
                }
            }

            public AddressSuggestion(String title, String subtitle, String submitButton, String str, ArrayList items, AddressSuggestionItem addressSuggestionItem) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                Intrinsics.checkNotNullParameter(items, "items");
                this.f105515a = title;
                this.f105516b = subtitle;
                this.f105517c = submitButton;
                this.d = str;
                this.e = items;
                this.f = addressSuggestionItem;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AddressSuggestion)) {
                    return false;
                }
                AddressSuggestion addressSuggestion = (AddressSuggestion) obj2;
                return Intrinsics.f(this.f105515a, addressSuggestion.f105515a) && Intrinsics.f(this.f105516b, addressSuggestion.f105516b) && Intrinsics.f(this.f105517c, addressSuggestion.f105517c) && Intrinsics.f(this.d, addressSuggestion.d) && this.e.equals(addressSuggestion.e) && Intrinsics.f(this.f, addressSuggestion.f);
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.f105515a.hashCode() * 31, 31, this.f105516b), 31, this.f105517c);
                String str = this.d;
                int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
                AddressSuggestionItem addressSuggestionItem = this.f;
                return iB + (addressSuggestionItem != null ? addressSuggestionItem.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105515a);
                dest.writeString(this.f105516b);
                dest.writeString(this.f105517c);
                dest.writeString(this.d);
                Iterator itY = j6.a.y(this.e, dest);
                while (itY.hasNext()) {
                    ((AddressSuggestionItem) itY.next()).writeToParcel(dest, i);
                }
                AddressSuggestionItem addressSuggestionItem = this.f;
                if (addressSuggestionItem == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    addressSuggestionItem.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContactSelection implements Screen {

            @NotNull
            public static final Parcelable.Creator<ContactSelection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105521a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105522b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105523c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f105524g;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    boolean z6 = false;
                    boolean z11 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z6 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z11 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = z3;
                    } else {
                        z4 = z3;
                        z3 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z4 = z;
                    }
                    return new ContactSelection(string, string2, string3, z6, z11, z3, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ContactSelection[i];
                }
            }

            public ContactSelection(String title, String submitButton, String searchPlaceholder, boolean z, boolean z3, boolean z4, boolean z6) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(submitButton, "submitButton");
                Intrinsics.checkNotNullParameter(searchPlaceholder, "searchPlaceholder");
                this.f105521a = title;
                this.f105522b = submitButton;
                this.f105523c = searchPlaceholder;
                this.d = z;
                this.e = z3;
                this.f = z4;
                this.f105524g = z6;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ContactSelection)) {
                    return false;
                }
                ContactSelection contactSelection = (ContactSelection) obj2;
                return Intrinsics.f(this.f105521a, contactSelection.f105521a) && Intrinsics.f(this.f105522b, contactSelection.f105522b) && Intrinsics.f(this.f105523c, contactSelection.f105523c) && this.d == contactSelection.d && this.e == contactSelection.e && this.f == contactSelection.f && this.f105524g == contactSelection.f105524g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f105524g) + j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(this.f105521a.hashCode() * 31, 31, this.f105522b), 31, this.f105523c), 31, this.d), 31, this.e), 31, this.f);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105521a);
                dest.writeString(this.f105522b);
                dest.writeString(this.f105523c);
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f105524g ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$DocumentSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "AlternativeDocuments", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DocumentSelection implements Screen {

            @NotNull
            public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105528a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105529b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105530c;
            public final String d;
            public final String e;
            public final String f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f105531g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f105532h;
            public final String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final AlternativeDocuments f105533j;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$DocumentSelection$AlternativeDocuments;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class AlternativeDocuments implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<AlternativeDocuments> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f105534a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f105535b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f105536c;
                public final String d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new AlternativeDocuments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new AlternativeDocuments[i];
                    }
                }

                public AlternativeDocuments(String title, String str, String alternativeMethodsLabel, String alternativeMethodsFaqDeeplink) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(alternativeMethodsLabel, "alternativeMethodsLabel");
                    Intrinsics.checkNotNullParameter(alternativeMethodsFaqDeeplink, "alternativeMethodsFaqDeeplink");
                    this.f105534a = title;
                    this.f105535b = str;
                    this.f105536c = alternativeMethodsLabel;
                    this.d = alternativeMethodsFaqDeeplink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof AlternativeDocuments)) {
                        return false;
                    }
                    AlternativeDocuments alternativeDocuments = (AlternativeDocuments) obj2;
                    return Intrinsics.f(this.f105534a, alternativeDocuments.f105534a) && Intrinsics.f(this.f105535b, alternativeDocuments.f105535b) && Intrinsics.f(this.f105536c, alternativeDocuments.f105536c) && Intrinsics.f(this.d, alternativeDocuments.d);
                }

                public final int hashCode() {
                    int iHashCode = this.f105534a.hashCode() * 31;
                    String str = this.f105535b;
                    return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105536c);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f105534a);
                    dest.writeString(this.f105535b);
                    dest.writeString(this.f105536c);
                    dest.writeString(this.d);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DocumentSelection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AlternativeDocuments.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DocumentSelection[i];
                }
            }

            public DocumentSelection(String citizenshipSelectionTitle, String str, String str2, String documentSelectionTitle, String str3, String documentSelectionSubmitButton, String str4, String citizenshipsQuery, String applicableDocumentsQuery, AlternativeDocuments alternativeDocuments) {
                Intrinsics.checkNotNullParameter(citizenshipSelectionTitle, "citizenshipSelectionTitle");
                Intrinsics.checkNotNullParameter(documentSelectionTitle, "documentSelectionTitle");
                Intrinsics.checkNotNullParameter(documentSelectionSubmitButton, "documentSelectionSubmitButton");
                Intrinsics.checkNotNullParameter(citizenshipsQuery, "citizenshipsQuery");
                Intrinsics.checkNotNullParameter(applicableDocumentsQuery, "applicableDocumentsQuery");
                this.f105528a = citizenshipSelectionTitle;
                this.f105529b = str;
                this.f105530c = str2;
                this.d = documentSelectionTitle;
                this.e = str3;
                this.f = documentSelectionSubmitButton;
                this.f105531g = str4;
                this.f105532h = citizenshipsQuery;
                this.i = applicableDocumentsQuery;
                this.f105533j = alternativeDocuments;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof DocumentSelection)) {
                    return false;
                }
                DocumentSelection documentSelection = (DocumentSelection) obj2;
                return Intrinsics.f(this.f105528a, documentSelection.f105528a) && Intrinsics.f(this.f105529b, documentSelection.f105529b) && Intrinsics.f(this.f105530c, documentSelection.f105530c) && Intrinsics.f(this.d, documentSelection.d) && Intrinsics.f(this.e, documentSelection.e) && Intrinsics.f(this.f, documentSelection.f) && Intrinsics.f(this.f105531g, documentSelection.f105531g) && Intrinsics.f(this.f105532h, documentSelection.f105532h) && Intrinsics.f(this.i, documentSelection.i) && Intrinsics.f(this.f105533j, documentSelection.f105533j);
            }

            public final int hashCode() {
                int iHashCode = this.f105528a.hashCode() * 31;
                String str = this.f105529b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f105530c;
                int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
                String str3 = this.e;
                int iC2 = p.a.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
                String str4 = this.f105531g;
                int iC3 = p.a.c(p.a.c((iC2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f105532h), 31, this.i);
                AlternativeDocuments alternativeDocuments = this.f105533j;
                return iC3 + (alternativeDocuments != null ? alternativeDocuments.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105528a);
                dest.writeString(this.f105529b);
                dest.writeString(this.f105530c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.f105531g);
                dest.writeString(this.f105532h);
                dest.writeString(this.i);
                AlternativeDocuments alternativeDocuments = this.f105533j;
                if (alternativeDocuments == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    alternativeDocuments.writeToParcel(dest, i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PepConnections implements Screen {

            @NotNull
            public static final Parcelable.Creator<PepConnections> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f105538a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PepConnections(h.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PepConnections[i];
                }
            }

            public PepConnections(h workflowScreenName) {
                Intrinsics.checkNotNullParameter(workflowScreenName, "workflowScreenName");
                this.f105538a = workflowScreenName;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PepConnections) && this.f105538a == ((PepConnections) obj2).f105538a;
            }

            public final int hashCode() {
                return this.f105538a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105538a.name());
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PeriodicReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PeriodicReview implements Screen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PeriodicReview f105539a = new PeriodicReview();

            @NotNull
            public static final Parcelable.Creator<PeriodicReview> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PeriodicReview.f105539a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PeriodicReview[i];
                }
            }

            private PeriodicReview() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PodBeneficiaries implements Screen {

            @NotNull
            public static final Parcelable.Creator<PodBeneficiaries> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f105540a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PodBeneficiaries(d.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PodBeneficiaries[i];
                }
            }

            public PodBeneficiaries(d flowType) {
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                this.f105540a = flowType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PodBeneficiaries) && this.f105540a == ((PodBeneficiaries) obj2).f105540a;
            }

            public final int hashCode() {
                return this.f105540a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105540a.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PricingPlansPrompt implements Screen {

            @NotNull
            public static final Parcelable.Creator<PricingPlansPrompt> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105541a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PricingPlansPrompt(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PricingPlansPrompt[i];
                }
            }

            public PricingPlansPrompt(String promptType) {
                Intrinsics.checkNotNullParameter(promptType, "promptType");
                this.f105541a = promptType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PricingPlansPrompt) && Intrinsics.f(this.f105541a, ((PricingPlansPrompt) obj2).f105541a);
            }

            public final int hashCode() {
                return this.f105541a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105541a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ProductClosures;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProductClosures implements Screen {

            @NotNull
            public static final Parcelable.Creator<ProductClosures> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105543b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105544c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProductClosures(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProductClosures[i];
                }
            }

            public ProductClosures(String title, String subtitle, String migrationContext) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(migrationContext, "migrationContext");
                this.f105542a = title;
                this.f105543b = subtitle;
                this.f105544c = migrationContext;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ProductClosures)) {
                    return false;
                }
                ProductClosures productClosures = (ProductClosures) obj2;
                return Intrinsics.f(this.f105542a, productClosures.f105542a) && Intrinsics.f(this.f105543b, productClosures.f105543b) && Intrinsics.f(this.f105544c, productClosures.f105544c);
            }

            public final int hashCode() {
                return this.f105544c.hashCode() + p.a.c(this.f105542a.hashCode() * 31, 31, this.f105543b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105542a);
                dest.writeString(this.f105543b);
                dest.writeString(this.f105544c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ResidentialAddressCollection implements Screen {

            @NotNull
            public static final Parcelable.Creator<ResidentialAddressCollection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105545a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ResidentialAddressCollection(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ResidentialAddressCollection[i];
                }
            }

            public ResidentialAddressCollection(String countryChoiceState) {
                Intrinsics.checkNotNullParameter(countryChoiceState, "countryChoiceState");
                this.f105545a = countryChoiceState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ResidentialAddressCollection) && Intrinsics.f(this.f105545a, ((ResidentialAddressCollection) obj2).f105545a);
            }

            public final int hashCode() {
                return this.f105545a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105545a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ResidentialAddressCollectionV2 implements Screen {

            @NotNull
            public static final Parcelable.Creator<ResidentialAddressCollectionV2> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105546a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Address f105547b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105548c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ResidentialAddressCollectionV2((Address) parcel.readParcelable(ResidentialAddressCollectionV2.class.getClassLoader()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ResidentialAddressCollectionV2[i];
                }
            }

            public ResidentialAddressCollectionV2(Address address, String prefillChoice, String str) {
                Intrinsics.checkNotNullParameter(prefillChoice, "prefillChoice");
                this.f105546a = prefillChoice;
                this.f105547b = address;
                this.f105548c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ResidentialAddressCollectionV2)) {
                    return false;
                }
                ResidentialAddressCollectionV2 residentialAddressCollectionV2 = (ResidentialAddressCollectionV2) obj2;
                return Intrinsics.f(this.f105546a, residentialAddressCollectionV2.f105546a) && Intrinsics.f(this.f105547b, residentialAddressCollectionV2.f105547b) && Intrinsics.f(this.f105548c, residentialAddressCollectionV2.f105548c);
            }

            public final int hashCode() {
                int iHashCode = this.f105546a.hashCode() * 31;
                Address address = this.f105547b;
                int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
                String str = this.f105548c;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105546a);
                dest.writeParcelable(this.f105547b, i);
                dest.writeString(this.f105548c);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RiskAssessment implements Screen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RiskAssessment f105549a = new RiskAssessment();

            @NotNull
            public static final Parcelable.Creator<RiskAssessment> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RiskAssessment.f105549a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RiskAssessment[i];
                }
            }

            private RiskAssessment() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SendGuardianInvitation implements Screen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SendGuardianInvitation f105550a = new SendGuardianInvitation();

            @NotNull
            public static final Parcelable.Creator<SendGuardianInvitation> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SendGuardianInvitation.f105550a;
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "ProductConfigurationKey", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxResidenciesCollection implements Screen {

            @NotNull
            public static final Parcelable.Creator<TaxResidenciesCollection> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105552b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ProductConfigurationKey f105553c;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TaxResidenciesCollection$ProductConfigurationKey;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ProductConfigurationKey implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<ProductConfigurationKey> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f105554a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final String f105555b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final String f105556c;
                public final String d;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new ProductConfigurationKey(parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new ProductConfigurationKey[i];
                    }
                }

                public ProductConfigurationKey(String product, String division, String companyId, b country) {
                    Intrinsics.checkNotNullParameter(country, "country");
                    Intrinsics.checkNotNullParameter(product, "product");
                    Intrinsics.checkNotNullParameter(division, "division");
                    Intrinsics.checkNotNullParameter(companyId, "companyId");
                    this.f105554a = country;
                    this.f105555b = product;
                    this.f105556c = division;
                    this.d = companyId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof ProductConfigurationKey)) {
                        return false;
                    }
                    ProductConfigurationKey productConfigurationKey = (ProductConfigurationKey) obj2;
                    return Intrinsics.f(this.f105554a, productConfigurationKey.f105554a) && Intrinsics.f(this.f105555b, productConfigurationKey.f105555b) && Intrinsics.f(this.f105556c, productConfigurationKey.f105556c) && Intrinsics.f(this.d, productConfigurationKey.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + p.a.c(p.a.c(this.f105554a.f297794a.hashCode() * 31, 31, this.f105555b), 31, this.f105556c);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f105554a);
                    dest.writeString(this.f105555b);
                    dest.writeString(this.f105556c);
                    dest.writeString(this.d);
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TaxResidenciesCollection(ProductConfigurationKey.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxResidenciesCollection[i];
                }
            }

            public TaxResidenciesCollection(ProductConfigurationKey productConfigurationKey, String str, String flowType) {
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                Intrinsics.checkNotNullParameter(productConfigurationKey, "productConfigurationKey");
                this.f105551a = str;
                this.f105552b = flowType;
                this.f105553c = productConfigurationKey;
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
                return Intrinsics.f(this.f105551a, taxResidenciesCollection.f105551a) && Intrinsics.f(this.f105552b, taxResidenciesCollection.f105552b) && Intrinsics.f(this.f105553c, taxResidenciesCollection.f105553c);
            }

            public final int hashCode() {
                String str = this.f105551a;
                return this.f105553c.hashCode() + p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f105552b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105551a);
                dest.writeString(this.f105552b);
                this.f105553c.writeToParcel(dest, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TermsReview implements Screen {

            @NotNull
            public static final Parcelable.Creator<TermsReview> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105557a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f105558b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new TermsReview(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TermsReview[i];
                }
            }

            public TermsReview(String countryCode, List termsIds) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(termsIds, "termsIds");
                this.f105557a = countryCode;
                this.f105558b = termsIds;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TermsReview)) {
                    return false;
                }
                TermsReview termsReview = (TermsReview) obj2;
                return Intrinsics.f(this.f105557a, termsReview.f105557a) && Intrinsics.f(this.f105558b, termsReview.f105558b);
            }

            public final int hashCode() {
                return this.f105558b.hashCode() + (this.f105557a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105557a);
                dest.writeStringList(this.f105558b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TrackingConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "<init>", "()V", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TrackingConsent implements Screen {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TrackingConsent f105559a = new TrackingConsent();

            @NotNull
            public static final Parcelable.Creator<TrackingConsent> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TrackingConsent.f105559a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TrackingConsent[i];
                }
            }

            private TrackingConsent() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$TransactionCountries;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TransactionCountries implements Screen {

            @NotNull
            public static final Parcelable.Creator<TransactionCountries> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105561b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ArrayList f105562c;
            public final ArrayList d;
            public final b e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iC = 0;
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                    }
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    int iC2 = 0;
                    while (iC2 != i2) {
                        iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, 1);
                    }
                    return new TransactionCountries(string, string2, arrayList, arrayList2, (b) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TransactionCountries[i];
                }
            }

            public TransactionCountries(String title, String subtitle, ArrayList suggestedCountries, ArrayList allCountries, b currentCountry, boolean z) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
                Intrinsics.checkNotNullParameter(allCountries, "allCountries");
                Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
                this.f105560a = title;
                this.f105561b = subtitle;
                this.f105562c = suggestedCountries;
                this.d = allCountries;
                this.e = currentCountry;
                this.f = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TransactionCountries)) {
                    return false;
                }
                TransactionCountries transactionCountries = (TransactionCountries) obj2;
                return Intrinsics.f(this.f105560a, transactionCountries.f105560a) && Intrinsics.f(this.f105561b, transactionCountries.f105561b) && this.f105562c.equals(transactionCountries.f105562c) && this.d.equals(transactionCountries.d) && Intrinsics.f(this.e, transactionCountries.e) && this.f == transactionCountries.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105562c, p.a.c(this.f105560a.hashCode() * 31, 31, this.f105561b), 31), 31), 31, this.e.f297794a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105560a);
                dest.writeString(this.f105561b);
                Iterator itY = j6.a.y(this.f105562c, dest);
                while (itY.hasNext()) {
                    dest.writeSerializable((Serializable) itY.next());
                }
                Iterator itY2 = j6.a.y(this.d, dest);
                while (itY2.hasNext()) {
                    dest.writeSerializable((Serializable) itY2.next());
                }
                dest.writeSerializable(this.e);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Employer implements Screen {

            @NotNull
            public static final Parcelable.Creator<Employer> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f105537a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Employer(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Employer[i];
                }
            }

            public Employer(boolean z) {
                this.f105537a = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Employer) && this.f105537a == ((Employer) obj2).f105537a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f105537a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f105537a ? 1 : 0);
            }

            public Employer() {
                this(false);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/models/WorkflowStepConfiguration$Screen;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreditConsent implements Screen {

            @NotNull
            public static final Parcelable.Creator<CreditConsent> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105525a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f105526b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final CreditConsentExpiryCollection f105527c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditConsentExplicitTerm.CREATOR, parcel, arrayList, iA, 1);
                        }
                    }
                    return new CreditConsent(string, arrayList, parcel.readInt() != 0 ? CreditConsentExpiryCollection.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditConsent[i];
                }
            }

            public CreditConsent(String str, ArrayList arrayList, CreditConsentExpiryCollection creditConsentExpiryCollection) {
                this.f105525a = str;
                this.f105526b = arrayList;
                this.f105527c = creditConsentExpiryCollection;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CreditConsent)) {
                    return false;
                }
                CreditConsent creditConsent = (CreditConsent) obj2;
                return Intrinsics.f(this.f105525a, creditConsent.f105525a) && Intrinsics.f(this.f105526b, creditConsent.f105526b) && Intrinsics.f(this.f105527c, creditConsent.f105527c);
            }

            public final int hashCode() {
                String str = this.f105525a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                List list = this.f105526b;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                CreditConsentExpiryCollection creditConsentExpiryCollection = this.f105527c;
                return iHashCode2 + (creditConsentExpiryCollection != null ? creditConsentExpiryCollection.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105525a);
                List list = this.f105526b;
                if (list == null) {
                    dest.writeInt(0);
                } else {
                    Iterator itQ = v0.a.q(dest, 1, list);
                    while (itQ.hasNext()) {
                        ((CreditConsentExplicitTerm) itQ.next()).writeToParcel(dest, i);
                    }
                }
                CreditConsentExpiryCollection creditConsentExpiryCollection = this.f105527c;
                if (creditConsentExpiryCollection == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    creditConsentExpiryCollection.writeToParcel(dest, i);
                }
            }

            public CreditConsent() {
                this(null, null, null);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g gVarValueOf = parcel.readInt() == 0 ? null : g.valueOf(parcel.readString());
            String string = parcel.readString();
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DataPoint.CREATOR, parcel, arrayList3, iA, 1);
                }
                arrayList2 = arrayList3;
            }
            WorkflowScreenConfiguration workflowScreenConfigurationCreateFromParcel = parcel.readInt() == 0 ? null : WorkflowScreenConfiguration.CREATOR.createFromParcel(parcel);
            f fVarValueOf = parcel.readInt() == 0 ? null : f.valueOf(parcel.readString());
            j jVarValueOf = parcel.readInt() == 0 ? null : j.valueOf(parcel.readString());
            String string3 = parcel.readString();
            i iVarValueOf = parcel.readInt() == 0 ? null : i.valueOf(parcel.readString());
            Screen screen = (Screen) parcel.readParcelable(WorkflowStepConfiguration.class.getClassLoader());
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            IndividualIdentityId individualIdentityId = (IndividualIdentityId) parcel.readParcelable(WorkflowStepConfiguration.class.getClassLoader());
            String str = individualIdentityId != null ? individualIdentityId.f74763a : null;
            RegisteredIdentityId registeredIdentityId = (RegisteredIdentityId) parcel.readParcelable(WorkflowStepConfiguration.class.getClassLoader());
            return new WorkflowStepConfiguration(gVarValueOf, string, arrayList, string2, linkedHashMap, arrayList2, workflowScreenConfigurationCreateFromParcel, fVarValueOf, jVarValueOf, string3, iVarValueOf, screen, string4, numValueOf, str, registeredIdentityId != null ? registeredIdentityId.f74764a : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WorkflowStepConfiguration[i];
        }
    }

    public WorkflowStepConfiguration(g gVar, String str, ArrayList arrayList, String str2, Map map, List list, WorkflowScreenConfiguration workflowScreenConfiguration, f fVar, j jVar, String str3, i iVar, Screen screen, String str4, Integer num, String str5, String str6) {
        this.f105505a = gVar;
        this.f105506b = str;
        this.f105507c = arrayList;
        this.d = str2;
        this.e = map;
        this.f = list;
        this.f105508g = workflowScreenConfiguration;
        this.f105509h = fVar;
        this.i = jVar;
        this.f105510j = str3;
        this.k = iVar;
        this.f105511l = screen;
        this.f105512m = str4;
        this.f105513n = num;
        this.o = str5;
        this.f105514p = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration r5 = (com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration) r5
            ril.g r1 = r4.f105505a
            ril.g r3 = r5.f105505a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f105506b
            java.lang.String r3 = r5.f105506b
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.util.List r1 = r4.f105507c
            java.util.List r3 = r5.f105507c
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.util.Map r1 = r4.e
            java.util.Map r3 = r5.e
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.util.List r1 = r4.f
            java.util.List r3 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration r1 = r4.f105508g
            com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration r3 = r5.f105508g
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            ril.f r1 = r4.f105509h
            ril.f r3 = r5.f105509h
            if (r1 == r3) goto L5c
            return r2
        L5c:
            ril.j r1 = r4.i
            ril.j r3 = r5.i
            if (r1 == r3) goto L63
            return r2
        L63:
            java.lang.String r1 = r4.f105510j
            java.lang.String r3 = r5.f105510j
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L6e
            return r2
        L6e:
            ril.i r1 = r4.k
            ril.i r3 = r5.k
            if (r1 == r3) goto L75
            return r2
        L75:
            com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration$Screen r1 = r4.f105511l
            com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration$Screen r3 = r5.f105511l
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L80
            return r2
        L80:
            java.lang.String r1 = r4.f105512m
            java.lang.String r3 = r5.f105512m
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L8b
            return r2
        L8b:
            java.lang.Integer r1 = r4.f105513n
            java.lang.Integer r3 = r5.f105513n
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L96
            return r2
        L96:
            java.lang.String r1 = r5.o
            java.lang.String r3 = r4.o
            if (r3 != 0) goto La2
            if (r1 != 0) goto La0
            r1 = r0
            goto La9
        La0:
            r1 = r2
            goto La9
        La2:
            if (r1 != 0) goto La5
            goto La0
        La5:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r3, r1)
        La9:
            if (r1 != 0) goto Lac
            return r2
        Lac:
            java.lang.String r5 = r5.f105514p
            java.lang.String r1 = r4.f105514p
            if (r1 != 0) goto Lb8
            if (r5 != 0) goto Lb6
            r5 = r0
            goto Lbf
        Lb6:
            r5 = r2
            goto Lbf
        Lb8:
            if (r5 != 0) goto Lbb
            goto Lb6
        Lbb:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
        Lbf:
            if (r5 != 0) goto Lc2
            return r2
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        g gVar = this.f105505a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        String str = this.f105506b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f105507c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.e;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List list2 = this.f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f105508g;
        int iHashCode7 = (iHashCode6 + (workflowScreenConfiguration == null ? 0 : workflowScreenConfiguration.hashCode())) * 31;
        f fVar = this.f105509h;
        int iHashCode8 = (iHashCode7 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        j jVar = this.i;
        int iHashCode9 = (iHashCode8 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str3 = this.f105510j;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i iVar = this.k;
        int iHashCode11 = (iHashCode10 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Screen screen = this.f105511l;
        int iHashCode12 = (iHashCode11 + (screen == null ? 0 : screen.hashCode())) * 31;
        String str4 = this.f105512m;
        int iHashCode13 = (iHashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f105513n;
        int iHashCode14 = (iHashCode13 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f105514p;
        return iHashCode15 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        g gVar = this.f105505a;
        if (gVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(gVar.name());
        }
        dest.writeString(this.f105506b);
        List list = this.f105507c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        dest.writeString(this.d);
        Map map = this.e;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        List list2 = this.f;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((DataPoint) itQ2.next()).writeToParcel(dest, i);
            }
        }
        WorkflowScreenConfiguration workflowScreenConfiguration = this.f105508g;
        if (workflowScreenConfiguration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            workflowScreenConfiguration.writeToParcel(dest, i);
        }
        f fVar = this.f105509h;
        if (fVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(fVar.name());
        }
        j jVar = this.i;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        dest.writeString(this.f105510j);
        i iVar = this.k;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeParcelable(this.f105511l, i);
        dest.writeString(this.f105512m);
        Integer num = this.f105513n;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        String str = this.o;
        dest.writeParcelable(str != null ? new IndividualIdentityId(str) : null, i);
        String str2 = this.f105514p;
        dest.writeParcelable(str2 != null ? new RegisteredIdentityId(str2) : null, i);
    }
}
