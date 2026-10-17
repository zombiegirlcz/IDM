package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import android.os.Parcel;
import android.os.Parcelable;
import du.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent", "Ldu/h;", "Landroid/os/Parcelable;", "SelectDob", "SelectExpiryDate", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent$SelectDob;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent$SelectExpiryDate;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent extends h, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent$SelectDob;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectDob implements BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectDob f50646a = new SelectDob();

        @NotNull
        public static final Parcelable.Creator<SelectDob> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectDob.f50646a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDob[i];
            }
        }

        private SelectDob() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent$SelectExpiryDate;", "Lcom/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectExpiryDate implements BiometricVerificationManualInputContract$ViewControllerModelApi$InputEvent$CalendarSelectionEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectExpiryDate f50647a = new SelectExpiryDate();

        @NotNull
        public static final Parcelable.Creator<SelectExpiryDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectExpiryDate.f50647a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectExpiryDate[i];
            }
        }

        private SelectExpiryDate() {
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
