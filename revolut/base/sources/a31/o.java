package a31;

import com.google.android.gms.tasks.OnSuccessListener;
import com.onfido.android.sdk.capture.component.active.video.capture.domain.usecase.GetFaceDetectionModuleAvailabilityUseCase;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.FaceDetectorAvcMLKit;
import com.onfido.android.sdk.capture.detector.barcode.BarcodeDetectorGoogle;
import com.onfido.android.sdk.capture.detector.face.FaceDetectorGoogle;
import com.onfido.android.sdk.capture.detector.face.FaceOnDocumentDetectorGoogle;
import com.onfido.android.sdk.capture.detector.mrz.MRZDetectorGoogle;
import com.onfido.android.sdk.capture.internal.util.TaskExtensionKt;
import com.revolut.core.ui_kit.internal.views.quiz.QuizView;
import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements kfm.o, kfm.g, OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f985b;

    public /* synthetic */ o(int i, Function1 function1) {
        this.f984a = i;
        this.f985b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f984a;
        Function1 function1 = this.f985b;
        switch (i) {
            case 2:
                function1.invoke(obj2);
                break;
            case 18:
                function1.invoke(obj2);
                break;
            case 24:
                int i2 = QuizView.k;
                function1.invoke(obj2);
                break;
            case 25:
                int i3 = QuizView.k;
                function1.invoke(obj2);
                break;
            default:
                int i5 = QuizView.k;
                function1.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f984a) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 18:
            case 24:
            case 25:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (Data) this.f985b.invoke(p0);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f984a) {
            case 4:
                GetFaceDetectionModuleAvailabilityUseCase.invoke$lambda$2$lambda$0(this.f985b, obj2);
                break;
            case 5:
                FaceDetectorAvcMLKit.detect$lambda$3$lambda$0(this.f985b, obj2);
                break;
            case 6:
                BarcodeDetectorGoogle.processImage$lambda$1(this.f985b, obj2);
                break;
            case 7:
                FaceDetectorGoogle.addSuccessAndFailureListeners$lambda$1(this.f985b, obj2);
                break;
            case 8:
                FaceOnDocumentDetectorGoogle.detectWithDegree$lambda$3$lambda$1(this.f985b, obj2);
                break;
            case 9:
                MRZDetectorGoogle.addSuccessAndFailureListeners$lambda$1(this.f985b, obj2);
                break;
            default:
                TaskExtensionKt.toSingle$lambda$2$lambda$0(this.f985b, obj2);
                break;
        }
    }
}
