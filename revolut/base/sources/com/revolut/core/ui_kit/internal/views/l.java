package com.revolut.core.ui_kit.internal.views;

import android.view.Choreographer;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import ms0.w4;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57227a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f57228b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f57229c = -1;
    public final /* synthetic */ k d;

    public l(k kVar) {
        this.d = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        Long l2;
        k kVar = this.d;
        if (kVar.i && kVar.f57224h) {
            long j3 = this.f57228b;
            if (j3 < 0) {
                long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis();
                this.f57228b = j2;
                this.f57229c = jCurrentTimeMillis - kVar.f57222c;
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            long millis = TimeUnit.NANOSECONDS.toMillis(j2 - j3) + this.f57229c;
            long j5 = kVar.e;
            int i = (int) kotlin.ranges.f.i(j5 - millis, 0L, j5);
            w4 w4Var = kVar.f57226l;
            if (w4Var != null) {
                w4Var.d(i);
            }
            if (!kVar.f57223g && (l2 = kVar.f) != null && l2.longValue() <= millis) {
                kVar.f57221b.onNext(Unit.f186387a);
                kVar.f57223g = true;
            }
            k.Companion.getClass();
            int iCeil = (int) Math.ceil(((double) i) / 1000.0d);
            if (iCeil != this.f57227a) {
                w4 w4Var2 = kVar.f57226l;
                if (w4Var2 != null) {
                    w4Var2.a(iCeil);
                }
                this.f57227a = iCeil;
            }
            if (i > 0) {
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            kVar.f57220a.onNext(Unit.f186387a);
            kVar.f57225j = true;
            this.f57228b = -1L;
            kVar.i = false;
        }
    }
}
