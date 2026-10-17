package bw;

import android.os.ParcelFileDescriptor;
import androidx.camera.video.FileDescriptorOutputOptions;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recording;
import androidx.camera.video.VideoCapture;
import aw.d0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class y extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f19169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f19170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a76.c f19171c;
    public final vw.p d;

    public y(ParcelFileDescriptor descriptor, File previewFile, a76.c previewFileReleaseCallback, vw.p videoPayloadFactory) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(previewFile, "previewFile");
        Intrinsics.checkNotNullParameter(previewFileReleaseCallback, "previewFileReleaseCallback");
        Intrinsics.checkNotNullParameter(videoPayloadFactory, "videoPayloadFactory");
        this.f19169a = descriptor;
        this.f19170b = previewFile;
        this.f19171c = previewFileReleaseCallback;
        this.d = videoPayloadFactory;
    }

    @Override // bw.z
    public final void a() {
        try {
            m.Companion companion = yhm.m.INSTANCE;
            this.f19169a.close();
            Unit unit = Unit.f186387a;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            yhm.o.a(th10);
        }
        this.f19171c.invoke();
    }

    @Override // bw.z
    public final Recording b(cw.a videoCapture, long j2, d0 consumer) {
        Intrinsics.checkNotNullParameter(videoCapture, "videoCapture");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        videoCapture.getClass();
        ParcelFileDescriptor parcelFileDescriptor = this.f19169a;
        Intrinsics.checkNotNullParameter(parcelFileDescriptor, "parcelFileDescriptor");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        PendingRecording pendingRecordingPrepareRecording = ((Recorder) ((VideoCapture) videoCapture.d.getValue()).getOutput()).prepareRecording(videoCapture.f109507a, ((FileDescriptorOutputOptions.Builder) new FileDescriptorOutputOptions.Builder(parcelFileDescriptor).setDurationLimitMillis(j2)).build());
        Intrinsics.checkNotNullExpressionValue(pendingRecordingPrepareRecording, "prepareRecording(...)");
        return videoCapture.a(pendingRecordingPrepareRecording, consumer);
    }

    @Override // bw.z
    public final vw.o c() throws IOException {
        File previewFile = this.f19170b;
        ParcelFileDescriptor descriptor = this.f19169a;
        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(descriptor.getFileDescriptor());
        Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup, "dup(...)");
        uw.b bVar = new uw.b(parcelFileDescriptorDup);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(previewFile);
            try {
                zi0.c.m(bVar, fileOutputStream, 8192);
                fileOutputStream.close();
                bVar.close();
                this.d.getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(previewFile, "previewFile");
                return new vw.f(descriptor, previewFile);
            } finally {
            }
        } finally {
        }
    }
}
