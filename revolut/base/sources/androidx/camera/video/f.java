package androidx.camera.video;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.Recorder;
import androidx.camera.video.internal.muxer.MuxerFactory;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class f implements Recorder.RecordingRecord.MuxerSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Recorder.RecordingRecord f6893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MuxerFactory f6894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OutputOptions f6895c;
    public final /* synthetic */ ParcelFileDescriptor d;

    public /* synthetic */ f(Recorder.RecordingRecord recordingRecord, MuxerFactory muxerFactory, OutputOptions outputOptions, ParcelFileDescriptor parcelFileDescriptor) {
        this.f6893a = recordingRecord;
        this.f6894b = muxerFactory;
        this.f6895c = outputOptions;
        this.d = parcelFileDescriptor;
    }
}
