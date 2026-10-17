package com.revolut.feature.kyc_documents_scan.ui.onfido;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Onfido", "OnfidoStudio", "Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData$OnfidoStudio;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnfidoScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData$Onfido;", "Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onfido extends OnfidoScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Onfido> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.Onfido f77954a;

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
            this.f77954a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onfido) && Intrinsics.f(this.f77954a, ((Onfido) obj2).f77954a);
        }

        public final int hashCode() {
            return this.f77954a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77954a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData$OnfidoStudio;", "Lcom/revolut/feature/kyc_documents_scan/ui/onfido/OnfidoScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_kyc_documents_scan_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnfidoStudio extends OnfidoScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OnfidoStudio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowDocumentScanCofiguration.OnfidoStudio f77955a;

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
            this.f77955a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OnfidoStudio) && Intrinsics.f(this.f77955a, ((OnfidoStudio) obj2).f77955a);
        }

        public final int hashCode() {
            return this.f77955a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77955a, i);
        }
    }

    private OnfidoScreenContract$InputData() {
    }
}
