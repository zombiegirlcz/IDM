package com.fourthline.vision.internal;

import android.media.MediaRecorder;
import com.fourthline.vision.internal.ra;
import java.io.File;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f36220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f36221b = yhm.j.b(new aem.v(14));

    private final MediaRecorder getRecorder() {
        return (MediaRecorder) this.f36221b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaRecorder recorder_delegate$lambda$0() {
        MediaRecorder mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(5);
        mediaRecorder.setOutputFormat(1);
        mediaRecorder.setAudioEncoder(2);
        if (mediaRecorder.getClass().isAnonymousClass()) {
            String name = mediaRecorder.getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                return mediaRecorder;
            }
        } else {
            String simpleName = mediaRecorder.getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
                return mediaRecorder;
            }
        }
        return mediaRecorder;
    }

    @Override // com.fourthline.vision.internal.f
    public void startRecording(@NotNull File outputFile) {
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        this.f36220a = outputFile;
        MediaRecorder recorder = getRecorder();
        recorder.setOutputFile(outputFile.getAbsolutePath());
        try {
            recorder.prepare();
        } catch (IOException unused) {
            if (recorder.getClass().isAnonymousClass()) {
                String name = recorder.getClass().getName();
                if (name.length() > 23) {
                    Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            } else {
                String simpleName = recorder.getClass().getSimpleName();
                if (simpleName.length() > 23) {
                    Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
                }
            }
        }
        recorder.start();
    }

    @Override // com.fourthline.vision.internal.f
    @NotNull
    public File stopRecording() throws ra.a {
        File file = this.f36220a;
        if (file == null) {
            throw new ra.a(pa.i, null, 2, null);
        }
        MediaRecorder recorder = getRecorder();
        recorder.stop();
        recorder.release();
        return file;
    }
}
