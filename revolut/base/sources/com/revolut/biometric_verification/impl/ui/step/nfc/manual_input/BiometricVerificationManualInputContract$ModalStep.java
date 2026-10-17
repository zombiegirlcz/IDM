package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PickDateStep", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ModalStep$PickDateStep;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationManualInputContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ModalStep$PickDateStep;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PickDateStep implements BiometricVerificationManualInputContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PickDateStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f50644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent f50645b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PickDateStep((LocalDate) parcel.readSerializable(), (BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent) parcel.readParcelable(PickDateStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PickDateStep[i];
            }
        }

        public PickDateStep(LocalDate selectedDate, BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent event) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f50644a = selectedDate;
            this.f50645b = event;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PickDateStep)) {
                return false;
            }
            PickDateStep pickDateStep = (PickDateStep) obj2;
            return Intrinsics.f(this.f50644a, pickDateStep.f50644a) && Intrinsics.f(this.f50645b, pickDateStep.f50645b);
        }

        public final int hashCode() {
            return this.f50645b.hashCode() + (this.f50644a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f50644a);
            dest.writeParcelable(this.f50645b, i);
        }
    }
}
