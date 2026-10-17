package com.revolut.feature.kyc_documents_scan.ui.document_scan_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Onfido", "Vision", "Incode", "OnfidoStudio", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Incode;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Vision;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DocumentScanFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Incode;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Incode extends DocumentScanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Incode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Incode f77948a;

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
            this.f77948a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Incode) && Intrinsics.f(this.f77948a, ((Incode) obj2).f77948a);
        }

        public final int hashCode() {
            return this.f77948a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77948a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onfido extends DocumentScanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Onfido> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Onfido f77949a;

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
            this.f77949a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onfido) && Intrinsics.f(this.f77949a, ((Onfido) obj2).f77949a);
        }

        public final int hashCode() {
            return this.f77949a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77949a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnfidoStudio extends DocumentScanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.OnfidoStudio f77950a;

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
            this.f77950a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OnfidoStudio) && Intrinsics.f(this.f77950a, ((OnfidoStudio) obj2).f77950a);
        }

        public final int hashCode() {
            return this.f77950a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77950a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step$Vision;", "Lcom/revolut/feature/kyc_documents_scan/ui/document_scan_flow/DocumentScanFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Vision extends DocumentScanFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Vision> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Vision f77951a;

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
            this.f77951a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Vision) && Intrinsics.f(this.f77951a, ((Vision) obj2).f77951a);
        }

        public final int hashCode() {
            return this.f77951a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77951a, i);
        }
    }
}
