package com.revolut.feature.kyc.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import cu8.a1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"com/revolut/feature/kyc/impl/KycScreenContract$Step", "Landroid/os/Parcelable;", "<init>", "()V", "RemoteDocs", "MoreDocs", "SubmitCitizenship", "AdditionalVerification", "USVisaDisclosure", "Vision", "IncodeDocumentProcessingConsent", "DocumentCollection", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$AdditionalVerification;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$IncodeDocumentProcessingConsent;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$MoreDocs;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$RemoteDocs;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$SubmitCitizenship;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$USVisaDisclosure;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$Vision;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycScreenContract$Step implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$AdditionalVerification;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "Lcu8/a1;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalVerification extends KycScreenContract$Step implements a1 {

        @NotNull
        public static final Parcelable.Creator<AdditionalVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yt8.e f77555a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalVerification(yt8.e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalVerification[i];
            }
        }

        public AdditionalVerification(yt8.e alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.f77555a = alert;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalVerification) && this.f77555a == ((AdditionalVerification) obj2).f77555a;
        }

        public final int hashCode() {
            return this.f77555a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77555a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "Lcu8/a1;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentCollection extends KycScreenContract$Step implements a1 {

        @NotNull
        public static final Parcelable.Creator<DocumentCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentCollectionInputData f77556a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentCollection((DocumentCollectionInputData) parcel.readParcelable(DocumentCollection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentCollection[i];
            }
        }

        public DocumentCollection(DocumentCollectionInputData documentCollectionInputData) {
            Intrinsics.checkNotNullParameter(documentCollectionInputData, "documentCollectionInputData");
            this.f77556a = documentCollectionInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentCollection) && Intrinsics.f(this.f77556a, ((DocumentCollection) obj2).f77556a);
        }

        public final int hashCode() {
            return this.f77556a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77556a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$IncodeDocumentProcessingConsent;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "Lcu8/a1;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncodeDocumentProcessingConsent extends KycScreenContract$Step implements a1 {

        @NotNull
        public static final Parcelable.Creator<IncodeDocumentProcessingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f77557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycScreenContract$Step f77558b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncodeDocumentProcessingConsent((wi0.b) parcel.readSerializable(), (KycScreenContract$Step) parcel.readParcelable(IncodeDocumentProcessingConsent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncodeDocumentProcessingConsent[i];
            }
        }

        public IncodeDocumentProcessingConsent(wi0.b country, KycScreenContract$Step lastStep) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(lastStep, "lastStep");
            this.f77557a = country;
            this.f77558b = lastStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncodeDocumentProcessingConsent)) {
                return false;
            }
            IncodeDocumentProcessingConsent incodeDocumentProcessingConsent = (IncodeDocumentProcessingConsent) obj2;
            return Intrinsics.f(this.f77557a, incodeDocumentProcessingConsent.f77557a) && Intrinsics.f(this.f77558b, incodeDocumentProcessingConsent.f77558b);
        }

        public final int hashCode() {
            return this.f77558b.hashCode() + (this.f77557a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77557a);
            dest.writeParcelable(this.f77558b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$MoreDocs;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreDocs extends KycScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<MoreDocs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f77559a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new MoreDocs(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoreDocs[i];
            }
        }

        public MoreDocs(List previousDocs) {
            Intrinsics.checkNotNullParameter(previousDocs, "previousDocs");
            this.f77559a = previousDocs;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoreDocs) && Intrinsics.f(this.f77559a, ((MoreDocs) obj2).f77559a);
        }

        public final int hashCode() {
            return this.f77559a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f77559a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$RemoteDocs;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteDocs extends KycScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoteDocs f77560a = new RemoteDocs();

        @NotNull
        public static final Parcelable.Creator<RemoteDocs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemoteDocs.f77560a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoteDocs[i];
            }
        }

        private RemoteDocs() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$SubmitCitizenship;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "<init>", "()V", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SubmitCitizenship extends KycScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SubmitCitizenship f77561a = new SubmitCitizenship();

        @NotNull
        public static final Parcelable.Creator<SubmitCitizenship> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SubmitCitizenship.f77561a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubmitCitizenship[i];
            }
        }

        private SubmitCitizenship() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$USVisaDisclosure;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "Lcu8/a1;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class USVisaDisclosure extends KycScreenContract$Step implements a1 {

        @NotNull
        public static final Parcelable.Creator<USVisaDisclosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f77562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycScreenContract$Step f77563b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USVisaDisclosure((wi0.b) parcel.readSerializable(), (KycScreenContract$Step) parcel.readParcelable(USVisaDisclosure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new USVisaDisclosure[i];
            }
        }

        public USVisaDisclosure(wi0.b country, KycScreenContract$Step lastStep) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(lastStep, "lastStep");
            this.f77562a = country;
            this.f77563b = lastStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof USVisaDisclosure)) {
                return false;
            }
            USVisaDisclosure uSVisaDisclosure = (USVisaDisclosure) obj2;
            return Intrinsics.f(this.f77562a, uSVisaDisclosure.f77562a) && Intrinsics.f(this.f77563b, uSVisaDisclosure.f77563b);
        }

        public final int hashCode() {
            return this.f77563b.hashCode() + (this.f77562a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77562a);
            dest.writeParcelable(this.f77563b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/impl/KycScreenContract$Step$Vision;", "Lcom/revolut/feature/kyc/impl/KycScreenContract$Step;", "Lcu8/a1;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vision extends KycScreenContract$Step implements a1 {

        @NotNull
        public static final Parcelable.Creator<Vision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycScreenContract$Step f77565b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Vision(parcel.readString(), (KycScreenContract$Step) parcel.readParcelable(Vision.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vision[i];
            }
        }

        public Vision(String verificationToken, KycScreenContract$Step lastStep) {
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            Intrinsics.checkNotNullParameter(lastStep, "lastStep");
            this.f77564a = verificationToken;
            this.f77565b = lastStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Vision)) {
                return false;
            }
            Vision vision = (Vision) obj2;
            return Intrinsics.f(this.f77564a, vision.f77564a) && Intrinsics.f(this.f77565b, vision.f77565b);
        }

        public final int hashCode() {
            return this.f77565b.hashCode() + (this.f77564a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77564a);
            dest.writeParcelable(this.f77565b, i);
        }
    }

    private KycScreenContract$Step() {
    }
}
