package com.revolut.feature.kyc.impl.flow.kyc;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import yt8.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AdditionalVerificationPrompt", "USVisaDisclosure", "RevolutVision", "IncodeDocumentProcessingConsent", "DocumentCollection", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$AdditionalVerificationPrompt;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$IncodeDocumentProcessingConsent;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$RevolutVision;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$USVisaDisclosure;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$AdditionalVerificationPrompt;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalVerificationPrompt extends KycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalVerificationPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f77696a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalVerificationPrompt(e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalVerificationPrompt[i];
            }
        }

        public AdditionalVerificationPrompt(e alert) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            this.f77696a = alert;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalVerificationPrompt) && this.f77696a == ((AdditionalVerificationPrompt) obj2).f77696a;
        }

        public final int hashCode() {
            return this.f77696a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77696a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentCollection extends KycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentCollectionInputData f77697a;

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
            this.f77697a = documentCollectionInputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentCollection) && Intrinsics.f(this.f77697a, ((DocumentCollection) obj2).f77697a);
        }

        public final int hashCode() {
            return this.f77697a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77697a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$IncodeDocumentProcessingConsent;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncodeDocumentProcessingConsent extends KycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<IncodeDocumentProcessingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77698a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncodeDocumentProcessingConsent((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncodeDocumentProcessingConsent[i];
            }
        }

        public IncodeDocumentProcessingConsent(b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f77698a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IncodeDocumentProcessingConsent) && Intrinsics.f(this.f77698a, ((IncodeDocumentProcessingConsent) obj2).f77698a);
        }

        public final int hashCode() {
            return this.f77698a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77698a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$RevolutVision;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutVision extends KycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevolutVision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77699a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutVision(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutVision[i];
            }
        }

        public RevolutVision(String verificationToken) {
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            this.f77699a = verificationToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutVision) && Intrinsics.f(this.f77699a, ((RevolutVision) obj2).f77699a);
        }

        public final int hashCode() {
            return this.f77699a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77699a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step$USVisaDisclosure;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class USVisaDisclosure extends KycFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<USVisaDisclosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77700a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USVisaDisclosure((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new USVisaDisclosure[i];
            }
        }

        public USVisaDisclosure(b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f77700a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof USVisaDisclosure) && Intrinsics.f(this.f77700a, ((USVisaDisclosure) obj2).f77700a);
        }

        public final int hashCode() {
            return this.f77700a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77700a);
        }
    }

    private KycFlowContract$Step() {
    }
}
