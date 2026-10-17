package kl;

import android.os.Parcel;
import android.os.Parcelable;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessPerformedChallenges;
import com.onfido.android.sdk.capture.ui.options.MotionCaptureVariantOptions;
import com.onfido.hosted.web.module.model.HostedWebModuleModuleInfo;
import com.onfido.workflow.internal.ui.FaceLivenessIntroScreen;
import com.onfido.workflow.internal.ui.FaceSelfieIntroScreen;
import com.onfido.workflow.internal.ui.HostedWebModuleScreen;
import com.onfido.workflow.internal.ui.LivenessConfirmationScreen;
import com.onfido.workflow.internal.ui.LoadingScreen;
import com.onfido.workflow.internal.ui.MotionScreen;
import com.onfido.workflow.internal.ui.NfcNotSupportedScreen;
import com.onfido.workflow.internal.ui.PermissionsScreen;
import com.onfido.workflow.internal.ui.PoaScreen;
import com.onfido.workflow.internal.ui.RetryWorkflowScreen;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185142a;

    public /* synthetic */ b(int i) {
        this.f185142a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f185142a) {
            case 0:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaceLivenessIntroScreen(parcel.readInt() != 0);
            case 1:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaceSelfieIntroScreen(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            case 2:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HostedWebModuleScreen((HostedWebModuleModuleInfo) parcel.readParcelable(HostedWebModuleScreen.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            case 3:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LivenessConfirmationScreen(parcel.readString(), (LivenessPerformedChallenges) parcel.readSerializable(), parcel.readInt() != 0);
            case 4:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LoadingScreen.f50189a;
            case 5:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MotionScreen((MotionCaptureVariantOptions) parcel.readSerializable(), parcel.readInt() != 0);
            case 6:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NfcNotSupportedScreen.f50195a;
            case 7:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PermissionsScreen((CaptureStepDataBundle) parcel.readSerializable());
            case 8:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PoaScreen(parcel.readInt() != 0);
            default:
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RetryWorkflowScreen(RetryWorkflowViewDescriptor.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f185142a) {
            case 0:
                return new FaceLivenessIntroScreen[i];
            case 1:
                return new FaceSelfieIntroScreen[i];
            case 2:
                return new HostedWebModuleScreen[i];
            case 3:
                return new LivenessConfirmationScreen[i];
            case 4:
                return new LoadingScreen[i];
            case 5:
                return new MotionScreen[i];
            case 6:
                return new NfcNotSupportedScreen[i];
            case 7:
                return new PermissionsScreen[i];
            case 8:
                return new PoaScreen[i];
            default:
                return new RetryWorkflowScreen[i];
        }
    }
}
