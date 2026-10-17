package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.impl.domain.models.active_liveness.ActiveLivenessCode;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Intro", "Camera", "VideoQualityConfirmation", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$Camera;", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$Intro;", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$VideoQualityConfirmation;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationActiveLivenessStepFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$Camera;", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Camera implements BiometricVerificationActiveLivenessStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Camera> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActiveLivenessCode f50499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50500b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Camera(ActiveLivenessCode.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Camera[i];
            }
        }

        public Camera(ActiveLivenessCode activeLivenessCode, boolean z) {
            Intrinsics.checkNotNullParameter(activeLivenessCode, "activeLivenessCode");
            this.f50499a = activeLivenessCode;
            this.f50500b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) obj2;
            return Intrinsics.f(this.f50499a, camera.f50499a) && this.f50500b == camera.f50500b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50500b) + (this.f50499a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50499a.writeToParcel(dest, i);
            dest.writeInt(this.f50500b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$Intro;", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements BiometricVerificationActiveLivenessStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50501a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(boolean z) {
            this.f50501a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && this.f50501a == ((Intro) obj2).f50501a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50501a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50501a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step$VideoQualityConfirmation;", "Lcom/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VideoQualityConfirmation implements BiometricVerificationActiveLivenessStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<VideoQualityConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50502a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VideoQualityConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VideoQualityConfirmation[i];
            }
        }

        public VideoQualityConfirmation(String confirmationCode) {
            Intrinsics.checkNotNullParameter(confirmationCode, "confirmationCode");
            this.f50502a = confirmationCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VideoQualityConfirmation) && Intrinsics.f(this.f50502a, ((VideoQualityConfirmation) obj2).f50502a);
        }

        public final int hashCode() {
            return this.f50502a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50502a);
        }
    }
}
