package com.revolut.feature.kyc_documents_scan.ui.document_scan_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Onfido", "Vision", "Incode", "OnfidoStudio", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Incode;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Vision;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentScanFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Incode;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Incode extends DocumentScanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Incode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Incode f77944a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Incode((WorkflowDocumentScanCofiguration.Incode) parcel.readParcelable(Incode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Incode[i];
            }
        }

        public Incode(WorkflowDocumentScanCofiguration.Incode configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f77944a = configuration;
        }

        @Override // com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData
        public final WorkflowDocumentScanCofiguration a() {
            return this.f77944a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Incode) && Intrinsics.f(this.f77944a, ((Incode) obj2).f77944a);
        }

        public final int hashCode() {
            return this.f77944a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77944a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onfido extends DocumentScanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Onfido> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Onfido f77945a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onfido((WorkflowDocumentScanCofiguration.Onfido) parcel.readParcelable(Onfido.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onfido[i];
            }
        }

        public Onfido(WorkflowDocumentScanCofiguration.Onfido configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f77945a = configuration;
        }

        @Override // com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData
        public final WorkflowDocumentScanCofiguration a() {
            return this.f77945a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onfido) && Intrinsics.f(this.f77945a, ((Onfido) obj2).f77945a);
        }

        public final int hashCode() {
            return this.f77945a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77945a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnfidoStudio extends DocumentScanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.OnfidoStudio f77946a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OnfidoStudio((WorkflowDocumentScanCofiguration.OnfidoStudio) parcel.readParcelable(OnfidoStudio.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnfidoStudio[i];
            }
        }

        public OnfidoStudio(WorkflowDocumentScanCofiguration.OnfidoStudio configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f77946a = configuration;
        }

        @Override // com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData
        public final WorkflowDocumentScanCofiguration a() {
            return this.f77946a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OnfidoStudio) && Intrinsics.f(this.f77946a, ((OnfidoStudio) obj2).f77946a);
        }

        public final int hashCode() {
            return this.f77946a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77946a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData$Vision;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vision extends DocumentScanFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Vision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Vision f77947a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Vision((WorkflowDocumentScanCofiguration.Vision) parcel.readParcelable(Vision.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Vision[i];
            }
        }

        public Vision(WorkflowDocumentScanCofiguration.Vision configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f77947a = configuration;
        }

        @Override // com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$InputData
        public final WorkflowDocumentScanCofiguration a() {
            return this.f77947a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Vision) && Intrinsics.f(this.f77947a, ((Vision) obj2).f77947a);
        }

        public final int hashCode() {
            return this.f77947a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77947a, i);
        }
    }

    public abstract WorkflowDocumentScanCofiguration a();
}
