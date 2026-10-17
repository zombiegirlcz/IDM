package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.core.content.ContextCompat;
import aw.d0;
import ch.qos.logback.core.util.FileSize;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.android.sdk.capture.internal.camera.OnfidoCamera;
import com.onfido.android.sdk.capture.internal.camera.VideoFileBuilder;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.camera.capture.VideoCaptureConfig;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000i\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0005*\u0001'\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0087\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Landroidx/camera/video/VideoRecordEvent;", "recordEvent", "", "maxRecordingDuration", "Ljava/io/File;", "outputFile", "Lkotlin/Function1;", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoCaptureEvent;", "", "callback", "handleRecordingEvent", "(Landroidx/camera/video/VideoRecordEvent;JLjava/io/File;Lkotlin/jvm/functions/Function1;)V", "closeRecording", "()V", "Landroidx/camera/video/VideoCapture;", "Landroidx/camera/video/Recorder;", "videoCapture", "Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;", "config", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "invoke", "(Landroidx/camera/video/VideoCapture;Lcom/onfido/android/sdk/capture/ui/camera/capture/VideoCaptureConfig;Lkotlin/jvm/functions/Function1;)Lcom/onfido/android/sdk/capture/internal/camera/OnfidoCamera$VideoRecorder;", "Landroid/content/Context;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Landroidx/camera/video/Recording;", "recording", "Landroidx/camera/video/Recording;", "", "isRecordingFailed", "Z", "_hasValidRecording", "com/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase$recorderController$1", "recorderController", "Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase$recorderController$1;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraXTakeVideoUseCase {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MINIMUM_BYTE_FOR_VALID_RECORDING = 1024;
    private boolean _hasValidRecording;

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final Executor executor;
    private boolean isRecordingFailed;

    @NotNull
    private final CameraXTakeVideoUseCase$recorderController$1 recorderController;
    private Recording recording;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/camera/camerax/CameraXTakeVideoUseCase$Companion;", "", "()V", "MINIMUM_BYTE_FOR_VALID_RECORDING", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakeVideoUseCase$recorderController$1] */
    public CameraXTakeVideoUseCase(@ApplicationContext @NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
        Executor mainExecutor = ContextCompat.getMainExecutor(applicationContext);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        this.executor = mainExecutor;
        this.recorderController = new OnfidoCamera.VideoRecorder() { // from class: com.onfido.android.sdk.capture.internal.camera.camerax.CameraXTakeVideoUseCase$recorderController$1
            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public void cancel() {
                try {
                    Recording recording = this.this$0.recording;
                    if (recording != null) {
                        recording.pause();
                    }
                } catch (IllegalStateException e) {
                    Timber.INSTANCE.e(e);
                }
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public void finish() throws Throwable {
                Recording recording = this.this$0.recording;
                if (recording != null) {
                    recording.stop();
                }
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public boolean getHasValidRecording() {
                return this.this$0._hasValidRecording;
            }

            @Override // com.onfido.android.sdk.capture.internal.camera.OnfidoCamera.VideoRecorder
            public boolean isRecording() {
                return this.this$0.recording != null;
            }
        };
    }

    private final void closeRecording() throws Throwable {
        Recording recording = this.recording;
        if (recording != null) {
            recording.close();
        }
        this.recording = null;
    }

    private final void handleRecordingEvent(VideoRecordEvent recordEvent, long maxRecordingDuration, File outputFile, Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> callback) throws Throwable {
        if (recordEvent instanceof VideoRecordEvent.Status) {
            VideoRecordEvent.Status status = (VideoRecordEvent.Status) recordEvent;
            if (status.getRecordingStats().getRecordedDurationNanos() >= maxRecordingDuration && this.recording != null) {
                this.isRecordingFailed = true;
                closeRecording();
                callback.invoke(OnfidoCamera.VideoCaptureEvent.Timeout.INSTANCE);
            }
            this._hasValidRecording = status.getRecordingStats().getNumBytesRecorded() > FileSize.KB_COEFFICIENT;
            return;
        }
        if (recordEvent instanceof VideoRecordEvent.Pause) {
            this.isRecordingFailed = true;
            closeRecording();
            callback.invoke(OnfidoCamera.VideoCaptureEvent.Canceled.INSTANCE);
            return;
        }
        if (recordEvent instanceof VideoRecordEvent.Start) {
            this.isRecordingFailed = false;
            callback.invoke(OnfidoCamera.VideoCaptureEvent.Started.INSTANCE);
            return;
        }
        if (recordEvent instanceof VideoRecordEvent.Finalize) {
            this.recording = null;
            VideoRecordEvent.Finalize finalize = (VideoRecordEvent.Finalize) recordEvent;
            if (!finalize.hasError()) {
                if (this.isRecordingFailed) {
                    outputFile.delete();
                    return;
                }
                String absolutePath = outputFile.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                callback.invoke(new OnfidoCamera.VideoCaptureEvent.Recorded(absolutePath));
                return;
            }
            this.isRecordingFailed = true;
            outputFile.delete();
            Timber.INSTANCE.e("CameraX couldn't record video since " + finalize.getCause() + " with error code " + finalize.getError(), new Object[0]);
            Throwable cause = finalize.getCause();
            if (cause == null) {
                cause = new IllegalStateException("Recording failed");
            }
            callback.invoke(new OnfidoCamera.VideoCaptureEvent.Error(cause));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(CameraXTakeVideoUseCase this$0, long j2, File outputFile, Function1 callback, VideoRecordEvent videoRecordEvent) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(outputFile, "$outputFile");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.h(videoRecordEvent);
        this$0.handleRecordingEvent(videoRecordEvent, j2, outputFile, callback);
    }

    @NotNull
    public final OnfidoCamera.VideoRecorder invoke(@NotNull VideoCapture<Recorder> videoCapture, @NotNull VideoCaptureConfig config, @NotNull Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> callback) throws IOException {
        CameraXTakeVideoUseCase cameraXTakeVideoUseCase;
        Function1<? super OnfidoCamera.VideoCaptureEvent, Unit> function1;
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this._hasValidRecording = false;
        File fileBuild = new VideoFileBuilder().prefix(config.getFileNamePrefix()).build(this.applicationContext);
        FileOutputOptions fileOutputOptionsBuild = new FileOutputOptions.Builder(fileBuild).build();
        Intrinsics.checkNotNullExpressionValue(fileOutputOptionsBuild, "build(...)");
        PendingRecording pendingRecordingPrepareRecording = ((Recorder) videoCapture.getOutput()).prepareRecording(this.applicationContext, fileOutputOptionsBuild);
        if (config.getHasAudio()) {
            pendingRecordingPrepareRecording.withAudioEnabled();
        }
        Intrinsics.checkNotNullExpressionValue(pendingRecordingPrepareRecording, "apply(...)");
        try {
            cameraXTakeVideoUseCase = this;
            function1 = callback;
            try {
                cameraXTakeVideoUseCase.recording = pendingRecordingPrepareRecording.start(this.executor, new d0(cameraXTakeVideoUseCase, TimeUnit.MILLISECONDS.toNanos(config.getMaxDuration()), fileBuild, function1));
            } catch (IllegalStateException e) {
                e = e;
                IllegalStateException illegalStateException = e;
                Timber.INSTANCE.e(illegalStateException);
                function1.invoke(new OnfidoCamera.VideoCaptureEvent.Error(illegalStateException));
            }
        } catch (IllegalStateException e2) {
            e = e2;
            cameraXTakeVideoUseCase = this;
            function1 = callback;
        }
        return cameraXTakeVideoUseCase.recorderController;
    }
}
