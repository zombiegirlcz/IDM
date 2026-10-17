package com.revolut.biometric_verification.impl.ui.step.selfie_search.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/selfie_search/flow/BiometricVerificationSelfieSearchFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CaptureSelfie", "Lcom/revolut/biometric_verification/impl/ui/step/selfie_search/flow/BiometricVerificationSelfieSearchFlowContract$Step$CaptureSelfie;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationSelfieSearchFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/selfie_search/flow/BiometricVerificationSelfieSearchFlowContract$Step$CaptureSelfie;", "Lcom/revolut/biometric_verification/impl/ui/step/selfie_search/flow/BiometricVerificationSelfieSearchFlowContract$Step;", "<init>", "()V", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CaptureSelfie implements BiometricVerificationSelfieSearchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CaptureSelfie f50660a = new CaptureSelfie();

        @NotNull
        public static final Parcelable.Creator<CaptureSelfie> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CaptureSelfie.f50660a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CaptureSelfie[i];
            }
        }

        private CaptureSelfie() {
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
