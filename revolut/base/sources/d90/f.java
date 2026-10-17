package d90;

import android.media.MediaRecorder;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l80.h;
import oo0.l;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements MediaRecorder.OnErrorListener {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaRecorder f112327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f112328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f112329c;
    public a d;
    public long e;
    public long f;

    public f(File outputFile, MediaRecorder mediaRecorder, h systemTimeProvider) {
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(mediaRecorder, "mediaRecorder");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f112327a = mediaRecorder;
        this.f112328b = systemTimeProvider;
        this.f112329c = b.CREATED;
        mediaRecorder.setOnErrorListener(this);
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(2);
        mediaRecorder.setAudioEncoder(3);
        mediaRecorder.setAudioSamplingRate(16000);
        mediaRecorder.setAudioEncodingBitRate(32000);
        mediaRecorder.setAudioChannels(1);
        mediaRecorder.setOutputFile(outputFile.getAbsolutePath());
    }

    public final long a() {
        int i = d.f112325a[this.f112329c.ordinal()];
        if (i == 1) {
            this.f112328b.getClass();
            return SystemClock.elapsedRealtime() - this.e;
        }
        if (i == 2) {
            return this.f;
        }
        if (i == 3 || i == 4) {
            return 0L;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void b(Throwable th10) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        try {
            m.Companion companion = m.INSTANCE;
            this.f112327a.release();
            Unit unit = Unit.f186387a;
        } catch (Throwable th11) {
            m.Companion companion2 = m.INSTANCE;
            o.a(th11);
        }
        this.f112329c = b.FAILED;
        a aVar = this.d;
        if (aVar != null) {
            ((xrg.d) aVar).k3(l.Error, 1);
        }
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof d90.e
            if (r0 == 0) goto L13
            r0 = r7
            d90.e r0 = (d90.e) r0
            int r1 = r0.f112326w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112326w = r1
            goto L18
        L13:
            d90.e r0 = new d90.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112326w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L51
        L27:
            r7 = move-exception
            goto L6a
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            d90.b r7 = r6.f112329c
            d90.b r2 = d90.b.CREATED
            if (r7 != r2) goto L88
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L27
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Throwable -> L27
            co7.c r2 = new co7.c     // Catch: java.lang.Throwable -> L27
            r4 = 23
            r5 = 0
            r2.<init>(r6, r5, r4)     // Catch: java.lang.Throwable -> L27
            r0.f112326w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L51
            return r1
        L51:
            android.media.MediaRecorder r7 = r6.f112327a     // Catch: java.lang.Throwable -> L27
            r7.start()     // Catch: java.lang.Throwable -> L27
            l80.h r7 = r6.f112328b     // Catch: java.lang.Throwable -> L27
            r7.getClass()     // Catch: java.lang.Throwable -> L27
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L27
            r6.e = r0     // Catch: java.lang.Throwable -> L27
            d90.b r7 = d90.b.STARTED     // Catch: java.lang.Throwable -> L27
            r6.f112329c = r7     // Catch: java.lang.Throwable -> L27
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L70
        L6a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L70:
            java.lang.Throwable r0 = yhm.m.a(r7)
            if (r0 == 0) goto L7c
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L7b
            goto L7c
        L7b:
            throw r0
        L7c:
            java.lang.Throwable r7 = yhm.m.a(r7)
            if (r7 == 0) goto L85
            r6.b(r7)
        L85:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d90.f.c(gim.c):java.lang.Object");
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        Intrinsics.checkNotNullParameter(mediaRecorder, "mediaRecorder");
        b(new RuntimeException(a0.d.g(i, i2, "Recording failed with error code = ", "; extra = ")));
    }
}
