package cw;

import android.content.Context;
import androidx.camera.video.PendingRecording;
import androidx.camera.video.Recording;
import androidx.core.content.ContextCompat;
import aw.d0;
import bw.g;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;
import yw.h;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f109507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f109508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aqe.a f109509c;
    public final Lazy d;

    public a(Context appContext, h settings, g deviceInfoProvider, aqe.a videoFrameTimestampSinkProvider) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(videoFrameTimestampSinkProvider, "videoFrameTimestampSinkProvider");
        this.f109507a = appContext;
        this.f109508b = settings;
        this.f109509c = videoFrameTimestampSinkProvider;
        this.d = j.b(new co7.a(this, 13));
    }

    public final Recording a(PendingRecording pendingRecording, d0 d0Var) {
        if (this.f109508b.b().f317231b.f317243b) {
            pendingRecording = PendingRecording.withAudioEnabled$default(pendingRecording, false, 1, null);
        }
        Executor mainExecutor = ContextCompat.getMainExecutor(this.f109507a);
        Intrinsics.checkNotNullExpressionValue(mainExecutor, "getMainExecutor(...)");
        return pendingRecording.start(mainExecutor, d0Var);
    }
}
