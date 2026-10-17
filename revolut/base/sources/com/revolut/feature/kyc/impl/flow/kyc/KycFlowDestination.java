package com.revolut.feature.kyc.impl.flow.kyc;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.navigation.document_collection.DocumentCollectionInputData;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import yt8.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "AdditionalVerification", "USVisaDisclosure", "RevolutVision", "IncodeDocumentConsentProcessing", "DocumentCollection", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$AdditionalVerification;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$IncodeDocumentConsentProcessing;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$RevolutVision;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$USVisaDisclosure;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KycFlowDestination extends KompotDestination {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$AdditionalVerification;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalVerification implements KycFlowDestination {

        @NotNull
        public static final Parcelable.Creator<AdditionalVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f77701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f77702b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalVerification(e.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(AdditionalVerification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalVerification[i];
            }
        }

        public AdditionalVerification(e alert, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(alert, "alert");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77701a = alert;
            this.f77702b = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF77710b() {
            return this.f77702b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getF77701a() {
            return this.f77701a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalVerification)) {
                return false;
            }
            AdditionalVerification additionalVerification = (AdditionalVerification) obj2;
            return this.f77701a == additionalVerification.f77701a && Intrinsics.f(this.f77702b, additionalVerification.f77702b);
        }

        public final int hashCode() {
            return this.f77702b.hashCode() + (this.f77701a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77701a.name());
            dest.writeParcelable(this.f77702b, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$DocumentCollection;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentCollection implements KycFlowDestination {

        @NotNull
        public static final Parcelable.Creator<DocumentCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentCollectionInputData f77703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f77704b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentCollection((DocumentCollectionInputData) parcel.readParcelable(DocumentCollection.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(DocumentCollection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentCollection[i];
            }
        }

        public DocumentCollection(DocumentCollectionInputData documentCollectionInputData, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(documentCollectionInputData, "documentCollectionInputData");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77703a = documentCollectionInputData;
            this.f77704b = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF77710b() {
            return this.f77704b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentCollectionInputData getF77703a() {
            return this.f77703a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentCollection)) {
                return false;
            }
            DocumentCollection documentCollection = (DocumentCollection) obj2;
            return Intrinsics.f(this.f77703a, documentCollection.f77703a) && Intrinsics.f(this.f77704b, documentCollection.f77704b);
        }

        public final int hashCode() {
            return this.f77704b.hashCode() + (this.f77703a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77703a, i);
            dest.writeParcelable(this.f77704b, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$IncodeDocumentConsentProcessing;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncodeDocumentConsentProcessing implements KycFlowDestination {

        @NotNull
        public static final Parcelable.Creator<IncodeDocumentConsentProcessing> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f77706b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncodeDocumentConsentProcessing((b) parcel.readSerializable(), (AnalyticsProduct) parcel.readParcelable(IncodeDocumentConsentProcessing.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncodeDocumentConsentProcessing[i];
            }
        }

        public IncodeDocumentConsentProcessing(b country, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77705a = country;
            this.f77706b = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF77710b() {
            return this.f77706b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF77705a() {
            return this.f77705a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncodeDocumentConsentProcessing)) {
                return false;
            }
            IncodeDocumentConsentProcessing incodeDocumentConsentProcessing = (IncodeDocumentConsentProcessing) obj2;
            return Intrinsics.f(this.f77705a, incodeDocumentConsentProcessing.f77705a) && Intrinsics.f(this.f77706b, incodeDocumentConsentProcessing.f77706b);
        }

        public final int hashCode() {
            return this.f77706b.hashCode() + (this.f77705a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77705a);
            dest.writeParcelable(this.f77706b, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$RevolutVision;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutVision implements KycFlowDestination {

        @NotNull
        public static final Parcelable.Creator<RevolutVision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f77708b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutVision(parcel.readString(), (AnalyticsProduct) parcel.readParcelable(RevolutVision.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutVision[i];
            }
        }

        public RevolutVision(String verificationToken, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77707a = verificationToken;
            this.f77708b = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF77710b() {
            return this.f77708b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF77707a() {
            return this.f77707a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevolutVision)) {
                return false;
            }
            RevolutVision revolutVision = (RevolutVision) obj2;
            return Intrinsics.f(this.f77707a, revolutVision.f77707a) && Intrinsics.f(this.f77708b, revolutVision.f77708b);
        }

        public final int hashCode() {
            return this.f77708b.hashCode() + (this.f77707a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77707a);
            dest.writeParcelable(this.f77708b, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination$USVisaDisclosure;", "Lcom/revolut/feature/kyc/impl/flow/kyc/KycFlowDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class USVisaDisclosure implements KycFlowDestination {

        @NotNull
        public static final Parcelable.Creator<USVisaDisclosure> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f77709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnalyticsProduct f77710b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USVisaDisclosure((b) parcel.readSerializable(), (AnalyticsProduct) parcel.readParcelable(USVisaDisclosure.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new USVisaDisclosure[i];
            }
        }

        public USVisaDisclosure(b country, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f77709a = country;
            this.f77710b = analyticsProduct;
        }

        @Override // com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination
        /* JADX INFO: renamed from: P, reason: from getter */
        public final AnalyticsProduct getF77710b() {
            return this.f77710b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getF77709a() {
            return this.f77709a;
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
            return Intrinsics.f(this.f77709a, uSVisaDisclosure.f77709a) && Intrinsics.f(this.f77710b, uSVisaDisclosure.f77710b);
        }

        public final int hashCode() {
            return this.f77710b.hashCode() + (this.f77709a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77709a);
            dest.writeParcelable(this.f77710b, i);
        }
    }

    /* JADX INFO: renamed from: P */
    AnalyticsProduct getF77710b();
}
