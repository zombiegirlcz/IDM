package kn;

import efm.d0;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import tpi.i;
import tpi.j;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ym.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f185966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f185967b;

    public h(d4m.a progressView) {
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f185966a = progressView;
        this.f185967b = new AtomicInteger(0);
    }

    @Override // ym.c
    public final void J2() {
        AtomicInteger atomicInteger = this.f185967b;
        if (atomicInteger.get() > 0) {
            ((i) ((j) this.f185966a.get())).Q();
        }
        atomicInteger.set(0);
    }

    @Override // ym.c
    public final d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        pfm.h hVar = new pfm.h(new hc7.a(loadingData, this, 19), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        z zVarD = o70.a.d(hVar).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }

    @Override // ym.c
    public final int getLevel() {
        return Integer.MIN_VALUE;
    }
}
