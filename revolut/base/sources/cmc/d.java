package cmc;

import android.content.Intent;
import android.graphics.Canvas;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.fragment.app.FragmentResultListener;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.messaging.d0;
import com.google.mlkit.vision.text.TextRecognizer;
import com.onfido.android.sdk.capture.common.permissions.PermissionsManagementFragment;
import com.onfido.android.sdk.capture.component.active.video.capture.data.repository.ActiveVideoCaptureRepositoryImpl;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.UploadActiveVideoCaptureUseCase;
import com.onfido.android.sdk.capture.core.OnfidoFragment;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.core.features.face.FaceCaptureFragment;
import com.onfido.android.sdk.capture.core.features.liveness.LivenessFragment;
import com.onfido.android.sdk.capture.detector.mrz.MRZDetectorGoogle;
import com.onfido.android.sdk.capture.internal.camera.Camera1Api;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.ui.OnfidoSplashActivity;
import com.onfido.android.sdk.capture.ui.camera.FrameCallback;
import com.onfido.android.sdk.capture.ui.camera.MediaCaptureCallback;
import com.onfido.android.sdk.capture.ui.camera.TorchMode;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessOverlayPresenter;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSource;
import com.onfido.android.sdk.capture.ui.camera.view.CameraSourcePreview;
import com.onfido.android.sdk.capture.ui.proofOfAddress.documentSubmission.PoaDocumentSubmissionFragment;
import efm.h0;
import fgm.q;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.CompletableTransformer;
import io.reactivex.rxjava3.core.FlowableTransformer;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import kfm.o;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d implements o, AccessibilityViewCommand, CanvasCompat.CanvasOperation, OnCompleteListener, ActivityResultCallback, igm.o, q, FragmentResultListener, FrameCallback, CompletableTransformer, FlowableTransformer, CameraSource.SetParametersCallback, CameraSource.PictureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25198b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f25197a = i;
        this.f25198b = obj2;
    }

    @Override // io.reactivex.rxjava3.core.FlowableTransformer
    public Publisher a(pgm.b bVar) {
        return LivenessOverlayPresenter.vibrateWhenProgressIsDone$lambda$0((LivenessOverlayPresenter) this.f25198b, bVar);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f25197a) {
            case 0:
                bwc.i iVar = (bwc.i) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) iVar.invoke(p0);
            case 1:
                c cVar = (c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) cVar.invoke(p0);
            case 2:
                b bVar = (b) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 3:
                c cVar2 = (c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) cVar2.invoke(p0);
            case 4:
                c cVar3 = (c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                cVar3.invoke(p0);
                return Boolean.TRUE;
            case 5:
                c cVar4 = (c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) cVar4.invoke(p0);
            case 6:
                coj.c cVar5 = (coj.c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar5.invoke(p0);
            case 7:
                coj.c cVar6 = (coj.c) this.f25198b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar6.invoke(p0);
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                return UploadActiveVideoCaptureUseCase.retryAfterDelay$lambda$0((Ref$ObjectRef) this.f25198b, (Throwable) p0);
            case 13:
                return ActiveVideoCaptureRepositoryImpl.uploadActiveVideoCapture$lambda$0((ActiveVideoCaptureRepositoryImpl) this.f25198b, (Throwable) p0);
        }
    }

    @Override // io.reactivex.rxjava3.core.CompletableTransformer
    public CompletableSource b(Completable completable) {
        return AnnouncementService.executeWhenEnabled$lambda$6((AnnouncementService) this.f25198b, completable);
    }

    @Override // fgm.q
    public void c(tgm.a aVar) {
        GetFaceDetectionModuleAvailabilityUseCase.invoke$lambda$2((GetFaceDetectionModuleAvailabilityUseCase) this.f25198b, aVar);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.SetParametersCallback
    public Camera.Parameters call(Camera.Parameters parameters, Camera camera) {
        switch (this.f25197a) {
            case 25:
                return ((CameraSource) this.f25198b).lambda$revertAutoFocusMode$6(parameters, camera);
            case 26:
                return CameraSource.lambda$autoFocusOnce$7((List) this.f25198b, parameters, camera);
            default:
                return CameraSourcePreview.lambda$setTorchMode$2((TorchMode) this.f25198b, parameters, camera);
        }
    }

    @Override // androidx.view.result.ActivityResultCallback
    public void onActivityResult(Object obj2) throws FileNotFoundException {
        switch (this.f25197a) {
            case 12:
                PermissionsManagementFragment.onAttach$lambda$3((PermissionsManagementFragment) this.f25198b, (Map) obj2);
                break;
            case 17:
                FaceCaptureFragment.onfidoLauncher$lambda$0((FaceCaptureFragment) this.f25198b, (Flow.Result) obj2);
                break;
            case 18:
                LivenessFragment.onfidoLauncher$lambda$0((LivenessFragment) this.f25198b, (Flow.Result) obj2);
                break;
            case 23:
                OnfidoSplashActivity.startForResult$lambda$0((OnfidoSplashActivity) this.f25198b, (ActivityResult) obj2);
                break;
            default:
                PoaDocumentSubmissionFragment.intentResultObserver$lambda$2((PoaDocumentSubmissionFragment) this.f25198b, (ActivityResult) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f25197a) {
            case 11:
                d0.a((Intent) this.f25198b);
                break;
            default:
                MRZDetectorGoogle.addSuccessAndFailureListeners$lambda$3((TextRecognizer) this.f25198b, task);
                break;
        }
    }

    @Override // androidx.fragment.app.FragmentResultListener
    public void onFragmentResult(String str, Bundle bundle) {
        OnfidoFragment.onViewCreated$lambda$0((OnfidoFragment) this.f25198b, str, bundle);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.FrameCallback
    public void onNextFrame(byte[] bArr, int i, int i2, int i3) {
        Camera1Api.observeFrame$lambda$0((Camera1Api) this.f25198b, bArr, i, i2, i3);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.view.CameraSource.PictureCallback
    public void onPictureTaken(byte[] bArr, int i, int i2) {
        CameraSourcePreview.lambda$takePicture$1((MediaCaptureCallback) this.f25198b, bArr, i, i2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        return ((BottomSheetDragHandleView) this.f25198b).lambda$onBottomSheetStateChanged$0(view, null);
    }

    @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
    public void run(Canvas canvas) {
        switch (this.f25197a) {
            case 9:
                ((MaskableFrameLayout) this.f25198b).lambda$dispatchDraw$1(canvas);
                break;
            default:
                ((NavigationView) this.f25198b).lambda$dispatchDraw$0(canvas);
                break;
        }
    }
}
