package com.revolut.shared.feature.workflow.engine.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "Landroid/os/Parcelable;", "NameDataPointValue", "StringDataPointValue", "CitizenshipDataPointValue", "PlaceOfBirthDataPointValue", "PurposeOfAccountDataPointValue", "DocumentIdDataPointValue", "AcceptedTermsDataPointValue", "DocumentIdValue", "FieldValue", "PersonalCodeValue", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$AcceptedTermsDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$CitizenshipDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$DocumentIdDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$NameDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PersonalCodeValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PlaceOfBirthDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PurposeOfAccountDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$StringDataPointValue;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EligibilityDataPointValue extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$AcceptedTermsDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "AcceptedTermsValue", "AcceptedTermsReference", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptedTermsDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<AcceptedTermsDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AcceptedTermsValue f105382b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$AcceptedTermsDataPointValue$AcceptedTermsReference;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AcceptedTermsReference implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AcceptedTermsReference> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105383a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105384b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105385c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AcceptedTermsReference(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AcceptedTermsReference[i];
                }
            }

            public AcceptedTermsReference(String id10, String scope, String version) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(scope, "scope");
                Intrinsics.checkNotNullParameter(version, "version");
                this.f105383a = id10;
                this.f105384b = scope;
                this.f105385c = version;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AcceptedTermsReference)) {
                    return false;
                }
                AcceptedTermsReference acceptedTermsReference = (AcceptedTermsReference) obj2;
                return Intrinsics.f(this.f105383a, acceptedTermsReference.f105383a) && Intrinsics.f(this.f105384b, acceptedTermsReference.f105384b) && Intrinsics.f(this.f105385c, acceptedTermsReference.f105385c);
            }

            public final int hashCode() {
                return this.f105385c.hashCode() + p.a.c(this.f105383a.hashCode() * 31, 31, this.f105384b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105383a);
                dest.writeString(this.f105384b);
                dest.writeString(this.f105385c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$AcceptedTermsDataPointValue$AcceptedTermsValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AcceptedTermsValue implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<AcceptedTermsValue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f105386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f105387b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(AcceptedTermsReference.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new AcceptedTermsValue(parcel.readString(), arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AcceptedTermsValue[i];
                }
            }

            public AcceptedTermsValue(String legalEntityId, ArrayList references) {
                Intrinsics.checkNotNullParameter(references, "references");
                Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
                this.f105386a = references;
                this.f105387b = legalEntityId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AcceptedTermsValue)) {
                    return false;
                }
                AcceptedTermsValue acceptedTermsValue = (AcceptedTermsValue) obj2;
                return this.f105386a.equals(acceptedTermsValue.f105386a) && Intrinsics.f(this.f105387b, acceptedTermsValue.f105387b);
            }

            public final int hashCode() {
                return this.f105387b.hashCode() + (this.f105386a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itY = j6.a.y(this.f105386a, dest);
                while (itY.hasNext()) {
                    ((AcceptedTermsReference) itY.next()).writeToParcel(dest, i);
                }
                dest.writeString(this.f105387b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptedTermsDataPointValue(parcel.readString(), AcceptedTermsValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptedTermsDataPointValue[i];
            }
        }

        public AcceptedTermsDataPointValue(String name, AcceptedTermsValue value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105381a = name;
            this.f105382b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AcceptedTermsDataPointValue)) {
                return false;
            }
            AcceptedTermsDataPointValue acceptedTermsDataPointValue = (AcceptedTermsDataPointValue) obj2;
            return Intrinsics.f(this.f105381a, acceptedTermsDataPointValue.f105381a) && Intrinsics.f(this.f105382b, acceptedTermsDataPointValue.f105382b);
        }

        public final int hashCode() {
            return this.f105382b.hashCode() + (this.f105381a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105381a);
            this.f105382b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$CitizenshipDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CitizenshipDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<CitizenshipDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105389b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CitizenshipDataPointValue(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CitizenshipDataPointValue[i];
            }
        }

        public CitizenshipDataPointValue(String name, List value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105388a = name;
            this.f105389b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CitizenshipDataPointValue)) {
                return false;
            }
            CitizenshipDataPointValue citizenshipDataPointValue = (CitizenshipDataPointValue) obj2;
            return Intrinsics.f(this.f105388a, citizenshipDataPointValue.f105388a) && Intrinsics.f(this.f105389b, citizenshipDataPointValue.f105389b);
        }

        public final int hashCode() {
            return this.f105389b.hashCode() + (this.f105388a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105388a);
            dest.writeStringList(this.f105389b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$DocumentIdDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentIdDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<DocumentIdDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DocumentIdValue f105391b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentIdDataPointValue(parcel.readString(), DocumentIdValue.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentIdDataPointValue[i];
            }
        }

        public DocumentIdDataPointValue(String name, DocumentIdValue value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105390a = name;
            this.f105391b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentIdDataPointValue)) {
                return false;
            }
            DocumentIdDataPointValue documentIdDataPointValue = (DocumentIdDataPointValue) obj2;
            return Intrinsics.f(this.f105390a, documentIdDataPointValue.f105390a) && Intrinsics.f(this.f105391b, documentIdDataPointValue.f105391b);
        }

        public final int hashCode() {
            return this.f105391b.hashCode() + (this.f105390a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105390a);
            this.f105391b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$DocumentIdValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentIdValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentIdValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105394c;
        public final ArrayList d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(FieldValue.CREATOR, parcel, arrayList, iA, 1);
                }
                return new DocumentIdValue(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentIdValue[i];
            }
        }

        public DocumentIdValue(String type, String subType, String issuingCountry, ArrayList fields) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
            Intrinsics.checkNotNullParameter(fields, "fields");
            this.f105392a = type;
            this.f105393b = subType;
            this.f105394c = issuingCountry;
            this.d = fields;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentIdValue)) {
                return false;
            }
            DocumentIdValue documentIdValue = (DocumentIdValue) obj2;
            return Intrinsics.f(this.f105392a, documentIdValue.f105392a) && Intrinsics.f(this.f105393b, documentIdValue.f105393b) && Intrinsics.f(this.f105394c, documentIdValue.f105394c) && this.d.equals(documentIdValue.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f105392a.hashCode() * 31, 31, this.f105393b), 31, this.f105394c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105392a);
            dest.writeString(this.f105393b);
            dest.writeString(this.f105394c);
            Iterator itY = j6.a.y(this.d, dest);
            while (itY.hasNext()) {
                ((FieldValue) itY.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$FieldValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldValue implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FieldValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105397c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FieldValue(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FieldValue[i];
            }
        }

        public FieldValue(String fieldName, String valueType, String value) {
            Intrinsics.checkNotNullParameter(fieldName, "fieldName");
            Intrinsics.checkNotNullParameter(valueType, "valueType");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105395a = fieldName;
            this.f105396b = valueType;
            this.f105397c = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FieldValue)) {
                return false;
            }
            FieldValue fieldValue = (FieldValue) obj2;
            return Intrinsics.f(this.f105395a, fieldValue.f105395a) && Intrinsics.f(this.f105396b, fieldValue.f105396b) && Intrinsics.f(this.f105397c, fieldValue.f105397c);
        }

        public final int hashCode() {
            return this.f105397c.hashCode() + p.a.c(this.f105395a.hashCode() * 31, 31, this.f105396b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105395a);
            dest.writeString(this.f105396b);
            dest.writeString(this.f105397c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$NameDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NameDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<NameDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105400c;
        public final String d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f105401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f105402h;
        public final String i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NameDataPointValue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NameDataPointValue[i];
            }
        }

        public /* synthetic */ NameDataPointValue(int i, String str, String str2, String str3, String str4, String str5) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, null, (i & 32) != 0 ? null : str5, null, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NameDataPointValue)) {
                return false;
            }
            NameDataPointValue nameDataPointValue = (NameDataPointValue) obj2;
            return Intrinsics.f(this.f105398a, nameDataPointValue.f105398a) && Intrinsics.f(this.f105399b, nameDataPointValue.f105399b) && Intrinsics.f(this.f105400c, nameDataPointValue.f105400c) && Intrinsics.f(this.d, nameDataPointValue.d) && Intrinsics.f(this.e, nameDataPointValue.e) && Intrinsics.f(this.f, nameDataPointValue.f) && Intrinsics.f(this.f105401g, nameDataPointValue.f105401g) && Intrinsics.f(this.f105402h, nameDataPointValue.f105402h);
        }

        public final int hashCode() {
            int iHashCode = this.f105398a.hashCode() * 31;
            String str = this.f105399b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f105400c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f105401g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f105402h;
            return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105398a);
            dest.writeString(this.f105399b);
            dest.writeString(this.f105400c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeString(this.f105401g);
            dest.writeString(this.f105402h);
        }

        public NameDataPointValue(String datapointName, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            Intrinsics.checkNotNullParameter(datapointName, "datapointName");
            this.f105398a = datapointName;
            this.f105399b = str;
            this.f105400c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.f105401g = str6;
            this.f105402h = str7;
            String[] elements = {str2, str4, str3, str6, str7, str5};
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.i = d0.k0(d.L(elements), " ", null, null, 0, null, 62);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PersonalCodeValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalCodeValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<PersonalCodeValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105405c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalCodeValue(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCodeValue[i];
            }
        }

        public PersonalCodeValue(String name, String country, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105403a = name;
            this.f105404b = country;
            this.f105405c = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalCodeValue)) {
                return false;
            }
            PersonalCodeValue personalCodeValue = (PersonalCodeValue) obj2;
            return Intrinsics.f(this.f105403a, personalCodeValue.f105403a) && Intrinsics.f(this.f105404b, personalCodeValue.f105404b) && Intrinsics.f(this.f105405c, personalCodeValue.f105405c);
        }

        public final int hashCode() {
            return this.f105405c.hashCode() + p.a.c(this.f105403a.hashCode() * 31, 31, this.f105404b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105403a);
            dest.writeString(this.f105404b);
            dest.writeString(this.f105405c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PlaceOfBirthDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceOfBirthDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<PlaceOfBirthDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105408c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceOfBirthDataPointValue(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceOfBirthDataPointValue[i];
            }
        }

        public PlaceOfBirthDataPointValue(String name, String country, String city) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(city, "city");
            this.f105406a = name;
            this.f105407b = country;
            this.f105408c = city;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlaceOfBirthDataPointValue)) {
                return false;
            }
            PlaceOfBirthDataPointValue placeOfBirthDataPointValue = (PlaceOfBirthDataPointValue) obj2;
            return Intrinsics.f(this.f105406a, placeOfBirthDataPointValue.f105406a) && Intrinsics.f(this.f105407b, placeOfBirthDataPointValue.f105407b) && Intrinsics.f(this.f105408c, placeOfBirthDataPointValue.f105408c);
        }

        public final int hashCode() {
            return this.f105408c.hashCode() + p.a.c(this.f105406a.hashCode() * 31, 31, this.f105407b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105406a);
            dest.writeString(this.f105407b);
            dest.writeString(this.f105408c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$PurposeOfAccountDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccountDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccountDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f105410b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeOfAccountDataPointValue(parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccountDataPointValue[i];
            }
        }

        public PurposeOfAccountDataPointValue(String name, List purposes) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(purposes, "purposes");
            this.f105409a = name;
            this.f105410b = purposes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PurposeOfAccountDataPointValue)) {
                return false;
            }
            PurposeOfAccountDataPointValue purposeOfAccountDataPointValue = (PurposeOfAccountDataPointValue) obj2;
            return Intrinsics.f(this.f105409a, purposeOfAccountDataPointValue.f105409a) && Intrinsics.f(this.f105410b, purposeOfAccountDataPointValue.f105410b);
        }

        public final int hashCode() {
            return this.f105410b.hashCode() + (this.f105409a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105409a);
            dest.writeStringList(this.f105410b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue$StringDataPointValue;", "Lcom/revolut/shared/feature/workflow/engine/api/models/EligibilityDataPointValue;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StringDataPointValue implements EligibilityDataPointValue {

        @NotNull
        public static final Parcelable.Creator<StringDataPointValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f105411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105412b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StringDataPointValue(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StringDataPointValue[i];
            }
        }

        public StringDataPointValue(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f105411a = name;
            this.f105412b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StringDataPointValue)) {
                return false;
            }
            StringDataPointValue stringDataPointValue = (StringDataPointValue) obj2;
            return Intrinsics.f(this.f105411a, stringDataPointValue.f105411a) && Intrinsics.f(this.f105412b, stringDataPointValue.f105412b);
        }

        public final int hashCode() {
            return this.f105412b.hashCode() + (this.f105411a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f105411a);
            dest.writeString(this.f105412b);
        }
    }
}
