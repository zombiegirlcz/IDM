package lw;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import kw.d;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aqe.a f200385a;

    public b(aqe.a sinkProvider) {
        Intrinsics.checkNotNullParameter(sinkProvider, "sinkProvider");
        this.f200385a = sinkProvider;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession session, CaptureRequest request, long j2, long j3) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        d dVar = (d) this.f200385a.invoke();
        if (dVar != null) {
            a frame = new a(j3, j2, SystemClock.elapsedRealtimeNanos());
            Intrinsics.checkNotNullParameter(frame, "frame");
            if (dVar.f) {
                dVar.d.add(frame);
            }
        }
    }
}
