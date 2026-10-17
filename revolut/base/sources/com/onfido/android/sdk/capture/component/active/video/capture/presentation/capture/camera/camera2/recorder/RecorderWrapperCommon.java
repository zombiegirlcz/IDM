package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder;

import a0.d;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.display.DisplayManager;
import android.media.MediaRecorder;
import android.util.Size;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.util.SurfaceSizeProvider;
import com.onfido.android.sdk.capture.internal.camera.VideoFileBuilder;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 62\u00020\u0001:\u00016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00120\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010 J#\u0010#\u001a\u00020\"*\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001b\u0010*\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapperCommon;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/recorder/RecorderWrapper;", "Landroid/content/Context;", "context", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;", "surfaceSizeProvider", "<init>", "(Landroid/content/Context;Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;)V", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "getOrientationHint", "(Landroid/hardware/camera2/CameraCharacteristics;)I", "Ljava/io/File;", "createFile", "()Ljava/io/File;", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "videoCaptureConfig", "", "reset", "(Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Landroid/hardware/camera2/CameraCharacteristics;)V", "", "getVideoFilePath", "()Ljava/lang/String;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecording", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "stopRecording", "()V", "releaseRecorder", "Landroid/media/MediaRecorder;", "configureMediaRecorder", "(Landroid/media/MediaRecorder;Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Landroid/hardware/camera2/CameraCharacteristics;)Landroid/media/MediaRecorder;", "Landroid/content/Context;", "Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/camera/camera2/util/SurfaceSizeProvider;", "outputFile$delegate", "Lkotlin/Lazy;", "getOutputFile", "outputFile", "Landroid/hardware/display/DisplayManager;", "displayManager$delegate", "getDisplayManager", "()Landroid/hardware/display/DisplayManager;", "displayManager", "mediaRecorder", "Landroid/media/MediaRecorder;", "getMediaRecorder", "()Landroid/media/MediaRecorder;", "setMediaRecorder", "(Landroid/media/MediaRecorder;)V", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RecorderWrapperCommon implements RecorderWrapper {
    private static final int AUDIO_BITRATE = 96000;
    private static final int AUDIO_CHANNELS = 1;
    private static final int AUDIO_SAMPLE_RATE = 44100;

    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: displayManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayManager;
    private MediaRecorder mediaRecorder;

    /* JADX INFO: renamed from: outputFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy outputFile;

    @NotNull
    private final SurfaceSizeProvider surfaceSizeProvider;

    public RecorderWrapperCommon(@NotNull Context context, @NotNull SurfaceSizeProvider surfaceSizeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surfaceSizeProvider, "surfaceSizeProvider");
        this.context = context;
        this.surfaceSizeProvider = surfaceSizeProvider;
        this.outputFile = j.b(new RecorderWrapperCommon$outputFile$2(this));
        this.displayManager = j.b(new RecorderWrapperCommon$displayManager$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File createFile() {
        return new VideoFileBuilder().prefix("ONFIDO_AVC_VID").build(this.context);
    }

    private final DisplayManager getDisplayManager() {
        return (DisplayManager) this.displayManager.getValue();
    }

    private final int getOrientationHint(CameraCharacteristics cameraCharacteristics) {
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Intrinsics.h(obj2);
        int iIntValue = ((Number) obj2).intValue();
        int i = 0;
        int rotation = getDisplayManager().getDisplay(0).getRotation();
        if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        }
        return ((iIntValue + i) + 360) % 360;
    }

    private final File getOutputFile() {
        return (File) this.outputFile.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startRecording$lambda$0(Function1 onError, MediaRecorder mediaRecorder, int i, int i2) {
        Intrinsics.checkNotNullParameter(onError, "$onError");
        onError.invoke(new IllegalStateException(d.n("Camera2: Error while recording the video. Error code: ", i)));
    }

    @NotNull
    public final MediaRecorder configureMediaRecorder(@NotNull MediaRecorder mediaRecorder, @NotNull VideoCaptureConfig videoCaptureConfig, @NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(mediaRecorder, "<this>");
        Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        mediaRecorder.setVideoSource(2);
        if (videoCaptureConfig.getHasAudio()) {
            mediaRecorder.setAudioSource(5);
        }
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setOutputFile(getOutputFile().getAbsolutePath());
        mediaRecorder.setVideoEncodingBitRate(videoCaptureConfig.getBitrate());
        mediaRecorder.setVideoFrameRate(videoCaptureConfig.getMaxFps());
        Size landscape = this.surfaceSizeProvider.getVideoSize(cameraCharacteristics).getLandscape();
        mediaRecorder.setVideoSize(landscape.getWidth(), landscape.getHeight());
        mediaRecorder.setVideoEncoder(2);
        if (videoCaptureConfig.getHasAudio()) {
            mediaRecorder.setAudioEncoder(3);
            mediaRecorder.setAudioSamplingRate(44100);
            mediaRecorder.setAudioChannels(1);
            mediaRecorder.setAudioEncodingBitRate(AUDIO_BITRATE);
        }
        mediaRecorder.setOrientationHint(getOrientationHint(cameraCharacteristics));
        mediaRecorder.prepare();
        return mediaRecorder;
    }

    public final MediaRecorder getMediaRecorder() {
        return this.mediaRecorder;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper
    @NotNull
    public String getVideoFilePath() {
        String absolutePath = getOutputFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper
    public void releaseRecorder() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        this.mediaRecorder = null;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper
    public void reset(@NotNull VideoCaptureConfig videoCaptureConfig, @NotNull CameraCharacteristics cameraCharacteristics) {
        Intrinsics.checkNotNullParameter(videoCaptureConfig, "videoCaptureConfig");
        Intrinsics.checkNotNullParameter(cameraCharacteristics, "cameraCharacteristics");
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        initialize(videoCaptureConfig, cameraCharacteristics);
    }

    public final void setMediaRecorder(MediaRecorder mediaRecorder) {
        this.mediaRecorder = mediaRecorder;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper
    public void startRecording(@NotNull Function0<Unit> onSuccess, @NotNull final Function1<? super Throwable, Unit> onError) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.start();
        }
        onSuccess.invoke();
        MediaRecorder mediaRecorder2 = this.mediaRecorder;
        if (mediaRecorder2 != null) {
            mediaRecorder2.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.a
                @Override // android.media.MediaRecorder.OnErrorListener
                public final void onError(MediaRecorder mediaRecorder3, int i, int i2) {
                    RecorderWrapperCommon.startRecording$lambda$0(onError, mediaRecorder3, i, i2);
                }
            });
        }
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.camera2.recorder.RecorderWrapper
    public void stopRecording() {
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.stop();
        }
        MediaRecorder mediaRecorder2 = this.mediaRecorder;
        if (mediaRecorder2 != null) {
            mediaRecorder2.setOnErrorListener(null);
        }
        Timber.INSTANCE.d("Recording stopped. Output file: " + getOutputFile(), new Object[0]);
    }
}
