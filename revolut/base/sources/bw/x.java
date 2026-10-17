package bw;

import androidx.camera.video.FileOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import aw.d0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class x extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f19166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a76.c f19167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vw.p f19168c;

    public x(File file, a76.c releaseCallback, vw.p videoPayloadFactory) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(releaseCallback, "releaseCallback");
        Intrinsics.checkNotNullParameter(videoPayloadFactory, "videoPayloadFactory");
        this.f19166a = file;
        this.f19167b = releaseCallback;
        this.f19168c = videoPayloadFactory;
    }

    @Override // bw.z
    public final void a() {
        this.f19167b.invoke();
    }

    @Override // bw.z
    public final Recording b(cw.a videoCapture, long j2, d0 consumer) {
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        videoCapture.getClass();
        File file = this.f19166a;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        PendingRecording pendingRecordingPrepareRecording = ((Recorder) ((VideoCapture) videoCapture.d.getValue()).getOutput()).prepareRecording(videoCapture.f109507a, ((FileOutputOptions.Builder) new FileOutputOptions.Builder(file).setDurationLimitMillis(j2)).build());
        Intrinsics.checkNotNullExpressionValue(pendingRecordingPrepareRecording, "prepareRecording(...)");
        return videoCapture.a(pendingRecordingPrepareRecording, consumer);
    }

    @Override // bw.z
    public final vw.o c() {
        return vw.p.a(this.f19168c, this.f19166a);
    }
}
