package com.revolut.biometric_verification.impl.ui.step.document.manual_document_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DocumentSelection", "CountrySelection", "Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep$CountrySelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep$DocumentSelection;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationManualDocumentSelectionScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep$CountrySelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountrySelection implements BiometricVerificationManualDocumentSelectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountrySelection f50604a = new CountrySelection();

        @NotNull
        public static final Parcelable.Creator<CountrySelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountrySelection.f50604a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountrySelection[i];
            }
        }

        private CountrySelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep$DocumentSelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/manual_document_selection/BiometricVerificationManualDocumentSelectionScreenContract$ModalStep;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentSelection implements BiometricVerificationManualDocumentSelectionScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DocumentSelection f50605a = new DocumentSelection();

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DocumentSelection.f50605a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        private DocumentSelection() {
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
}
