package com.revolut.biometric_verification.impl.ui.step.nfc.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "IntroStep", "UpdateDetails", "ConsolidatedNfcReaderStep", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$ConsolidatedNfcReaderStep;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$IntroStep;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$UpdateDetails;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationNfcFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$ConsolidatedNfcReaderStep;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsolidatedNfcReaderStep implements BiometricVerificationNfcFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsolidatedNfcReaderStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationNfcFlowContract$AuthData.ICAO f50621a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsolidatedNfcReaderStep(BiometricVerificationNfcFlowContract$AuthData.ICAO.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsolidatedNfcReaderStep[i];
            }
        }

        public ConsolidatedNfcReaderStep(BiometricVerificationNfcFlowContract$AuthData.ICAO authData) {
            Intrinsics.checkNotNullParameter(authData, "authData");
            this.f50621a = authData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsolidatedNfcReaderStep) && Intrinsics.f(this.f50621a, ((ConsolidatedNfcReaderStep) obj2).f50621a);
        }

        public final int hashCode() {
            return this.f50621a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50621a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$IntroStep;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IntroStep implements BiometricVerificationNfcFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IntroStep f50622a = new IntroStep();

        @NotNull
        public static final Parcelable.Creator<IntroStep> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IntroStep.f50622a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntroStep[i];
            }
        }

        private IntroStep() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step$UpdateDetails;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/flow/BiometricVerificationNfcFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateDetails implements BiometricVerificationNfcFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpdateDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f50625c;
        public final yt.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateDetails(parcel.readString(), parcel.readString(), parcel.readString(), yt.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateDetails[i];
            }
        }

        public UpdateDetails(String documentNumber, String dateOfBirth, String dateOfExpiry, yt.a documentType) {
            Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f50623a = documentNumber;
            this.f50624b = dateOfBirth;
            this.f50625c = dateOfExpiry;
            this.d = documentType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdateDetails)) {
                return false;
            }
            UpdateDetails updateDetails = (UpdateDetails) obj2;
            return Intrinsics.f(this.f50623a, updateDetails.f50623a) && Intrinsics.f(this.f50624b, updateDetails.f50624b) && Intrinsics.f(this.f50625c, updateDetails.f50625c) && this.d == updateDetails.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f50623a.hashCode() * 31, 31, this.f50624b), 31, this.f50625c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50623a);
            dest.writeString(this.f50624b);
            dest.writeString(this.f50625c);
            dest.writeString(this.d.name());
        }
    }
}
