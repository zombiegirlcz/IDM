package com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ReadyToScan", "Reading", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep$Reading;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep$ReadyToScan;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep$Reading;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reading extends BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Reading> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f50631a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reading((short) parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reading[i];
            }
        }

        public Reading(short s2) {
            this.f50631a = s2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Reading) && this.f50631a == ((Reading) obj2).f50631a;
        }

        public final int hashCode() {
            return Short.hashCode(this.f50631a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50631a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep$ReadyToScan;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep;", "Landroid/os/Parcelable;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReadyToScan extends BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReadyToScan f50632a = new ReadyToScan();

        @NotNull
        public static final Parcelable.Creator<ReadyToScan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReadyToScan.f50632a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReadyToScan[i];
            }
        }

        private ReadyToScan() {
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

    private BiometricVerificationNfcV2ConsolidatedScreenContract$ModalStep() {
    }
}
