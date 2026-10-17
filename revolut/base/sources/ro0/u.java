package ro0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.k f255777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rnd.d0 f255778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f255779c;
    public Image d;
    public int e;
    public j70.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f255780g;

    public u() {
        this(0);
    }

    public u(int i) {
        rm0.k processorFactory = new rm0.k(10);
        rnd.k devicePerformanceProvider = new rnd.k(16);
        rnd.d0 runWhenLaidOut = new rnd.d0(2);
        Intrinsics.checkNotNullParameter(processorFactory, "processorFactory");
        Intrinsics.checkNotNullParameter(devicePerformanceProvider, "devicePerformanceProvider");
        Intrinsics.checkNotNullParameter(runWhenLaidOut, "runWhenLaidOut");
        this.f255777a = devicePerformanceProvider;
        this.f255778b = runWhenLaidOut;
        this.f255779c = te0.w.y0(new r1a.a(processorFactory, 19));
    }
}
