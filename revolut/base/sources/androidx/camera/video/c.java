package androidx.camera.video;

import androidx.camera.core.impl.SessionConfig;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6889c;

    public /* synthetic */ c(Recorder.RecordingRecord recordingRecord, VideoRecordEvent videoRecordEvent) {
        this.f6887a = 1;
        this.f6888b = recordingRecord;
        this.f6889c = videoRecordEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6887a) {
            case 0:
                ((Recorder) this.f6889c).lambda$pause$5((Recorder.RecordingRecord) this.f6888b);
                break;
            case 1:
                ((Recorder.RecordingRecord) this.f6888b).lambda$updateVideoRecordEvent$5((VideoRecordEvent) this.f6889c);
                break;
            default:
                ((VideoCapture.AnonymousClass2) this.f6889c).lambda$onCaptureCompleted$0((SessionConfig.Builder) this.f6888b);
                break;
        }
    }

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f6887a = i;
        this.f6889c = obj2;
        this.f6888b = obj3;
    }
}
