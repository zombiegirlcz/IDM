package com.fourthline.vision;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.PermissionChecker;
import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.vision.internal.ff;
import com.fourthline.vision.internal.na;
import com.fourthline.vision.internal.q9;
import com.fourthline.vision.internal.uf;
import com.fourthline.vision.internal.vf;
import ib.h;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\fH ¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u0006H ¢\u0006\u0004\b\u0012\u0010\u0005J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0018\u0010\u0005R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&8 X \u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8 X \u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\t8 X \u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018 X \u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058 X \u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0001098 X \u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\t8 X \u0004¢\u0006\u0006\u001a\u0004\b=\u0010/R\u0016\u0010B\u001a\u0004\u0018\u00010?8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/fourthline/vision/VisionActivity;", "SCANNER_STEP", "SCANNER_CONFIG", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "setupVisionView", "", "", "isPermissionDenied", "(Ljava/lang/String;)Z", "Lcom/fourthline/vision/internal/ff;", "trackPermissionNotGranted", "(Lcom/fourthline/vision/internal/ff;)V", "permission", "onPermissionNotGranted$fourthline_vision_release", "onPermissionNotGranted", "onNotSupportedDevice$fourthline_vision_release", "onNotSupportedDevice", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/fourthline/vision/internal/vf;", "visionView", "Lcom/fourthline/vision/internal/vf;", "getVisionView$fourthline_vision_release", "()Lcom/fourthline/vision/internal/vf;", "setVisionView$fourthline_vision_release", "(Lcom/fourthline/vision/internal/vf;)V", "Landroid/view/ViewGroup;", "a", "Lkotlin/Lazy;", "getRoot", "()Landroid/view/ViewGroup;", "root", "Lcom/fourthline/vision/internal/uf;", "getSubcomponent$fourthline_vision_release", "()Lcom/fourthline/vision/internal/uf;", "subcomponent", "Lcom/fourthline/vision/RecordingType;", "getRecordingType$fourthline_vision_release", "()Lcom/fourthline/vision/RecordingType;", "recordingType", "getDebugModeEnabled$fourthline_vision_release", "()Z", "debugModeEnabled", "Landroid/graphics/Rect;", "getDetectionArea$fourthline_vision_release", "()Landroid/graphics/Rect;", "detectionArea", "Landroid/view/View;", "getOverlayView$fourthline_vision_release", "()Landroid/view/View;", "overlayView", "Lcom/fourthline/vision/internal/na;", "getScannerDataSource$fourthline_vision_release", "()Lcom/fourthline/vision/internal/na;", "scannerDataSource", "isCameraInputMirrored$fourthline_vision_release", "isCameraInputMirrored", "Landroid/graphics/Matrix;", "getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release", "()Landroid/graphics/Matrix;", "imageToScreenCoordsMatrixAndTranslation", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class VisionActivity<SCANNER_STEP, SCANNER_CONFIG> extends AppCompatActivity {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy root = j.b(new a(this, 0));
    public vf visionView;

    private final ViewGroup getRoot() {
        return (ViewGroup) this.root.getValue();
    }

    private final boolean isPermissionDenied(String str) {
        return PermissionChecker.checkSelfPermission(this, str) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout root_delegate$lambda$0(VisionActivity visionActivity) {
        return new FrameLayout(visionActivity);
    }

    private final void setupVisionView() {
        uf subcomponent$fourthline_vision_release = getSubcomponent$fourthline_vision_release();
        vf vfVar = new vf(this, null, 0, subcomponent$fourthline_vision_release.getVisionViewModel(), subcomponent$fourthline_vision_release.getMediaCodecDataSource(), subcomponent$fourthline_vision_release.getLegacyPreviewCalculator(), subcomponent$fourthline_vision_release.getCameraFocusManager(), 6, null);
        vfVar.setOverlayView$fourthline_vision_release(getOverlayView$fourthline_vision_release());
        vfVar.setContentDetectionAreaProvider$fourthline_vision_release(new a(this, 1));
        if (getDebugModeEnabled$fourthline_vision_release()) {
            vfVar.enableDebugView$fourthline_vision_release(subcomponent$fourthline_vision_release.getDebugConsumer(), getIsCameraInputMirrored());
        }
        getRoot().addView(vfVar);
        setVisionView$fourthline_vision_release(vfVar);
    }

    private final void trackPermissionNotGranted(ff ffVar) {
        getSubcomponent$fourthline_vision_release().getVisionAnalytics().onPermissionNotGranted(ffVar);
    }

    public abstract boolean getDebugModeEnabled$fourthline_vision_release();

    @NotNull
    public abstract Rect getDetectionArea$fourthline_vision_release();

    public final Matrix getImageToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        if (this.visionView != null) {
            return getVisionView$fourthline_vision_release().getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release();
        }
        return null;
    }

    public abstract View getOverlayView$fourthline_vision_release();

    @NotNull
    public abstract RecordingType getRecordingType$fourthline_vision_release();

    @NotNull
    public abstract na getScannerDataSource$fourthline_vision_release();

    @NotNull
    public abstract uf getSubcomponent$fourthline_vision_release();

    @NotNull
    public final vf getVisionView$fourthline_vision_release() {
        vf vfVar = this.visionView;
        if (vfVar != null) {
            return vfVar;
        }
        Intrinsics.r("visionView");
        throw null;
    }

    /* JADX INFO: renamed from: isCameraInputMirrored$fourthline_vision_release */
    public abstract boolean getIsCameraInputMirrored();

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (DeviceMetadataKt.isDeviceRooted()) {
            h hVar = hb.a.f150532a;
            if (hVar != null) {
                hVar.f(q9.f36731a);
            }
            onNotSupportedDevice$fourthline_vision_release();
            finish();
            return;
        }
        setContentView(getRoot());
        setupVisionView();
        if (isPermissionDenied("android.permission.CAMERA")) {
            ff ffVar = ff.f36208a;
            trackPermissionNotGranted(ffVar);
            onPermissionNotGranted$fourthline_vision_release(ffVar);
        } else if (getRecordingType$fourthline_vision_release() == RecordingType.VIDEO_WITH_AUDIO && isPermissionDenied("android.permission.RECORD_AUDIO")) {
            ff ffVar2 = ff.f36209b;
            trackPermissionNotGranted(ffVar2);
            onPermissionNotGranted$fourthline_vision_release(ffVar2);
        } else {
            vf visionView$fourthline_vision_release = getVisionView$fourthline_vision_release();
            if (visionView$fourthline_vision_release == null) {
                visionView$fourthline_vision_release = null;
            }
            if (visionView$fourthline_vision_release != null) {
                getLifecycle().addObserver(visionView$fourthline_vision_release);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vf visionView$fourthline_vision_release = getVisionView$fourthline_vision_release();
        if (visionView$fourthline_vision_release == null) {
            visionView$fourthline_vision_release = null;
        }
        if (visionView$fourthline_vision_release != null) {
            getLifecycle().removeObserver(visionView$fourthline_vision_release);
        }
    }

    public abstract void onNotSupportedDevice$fourthline_vision_release();

    public abstract void onPermissionNotGranted$fourthline_vision_release(@NotNull ff permission);

    public final void setVisionView$fourthline_vision_release(@NotNull vf vfVar) {
        Intrinsics.checkNotNullParameter(vfVar, "<set-?>");
        this.visionView = vfVar;
    }
}
