package kw;

import android.hardware.SensorManager;
import android.os.HandlerThread;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import r10.v;
import vw.l;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f190180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f190181c;
    public final ConcurrentLinkedQueue d;
    public final ConcurrentLinkedQueue e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f190182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f190183h;

    public d(String sessionId, l timestampSource, double d, a artifactAssembler) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(timestampSource, "timestampSource");
        Intrinsics.checkNotNullParameter(artifactAssembler, "artifactAssembler");
        this.f190179a = sessionId;
        this.f190180b = timestampSource;
        this.f190181c = d;
        this.d = new ConcurrentLinkedQueue();
        this.e = new ConcurrentLinkedQueue();
        this.f190182g = new AtomicBoolean(false);
    }

    public final void a() {
        v vVar = this.f190183h;
        if (vVar != null) {
            ((SensorManager) vVar.f250863b).unregisterListener((jw.d) vVar.f250864c);
            ((HandlerThread) vVar.d).quitSafely();
        }
        this.f190183h = null;
    }
}
