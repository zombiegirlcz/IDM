package zri;

import a0.d;
import java.util.concurrent.CopyOnWriteArrayList;
import rd0.c;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f324739a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile int f324740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile int f324741c;
    public static volatile long d;
    public static volatile boolean e;

    private a() {
    }

    public final void a(int i) {
        f324741c = i;
        if (i < 0) {
            IllegalStateException illegalStateException = new IllegalStateException(d.n("existingScreensCount=", i));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "ScreensRepository", null, illegalStateException, h0Var);
        }
    }

    public final void b(int i) {
        f324740b = i;
        if (i < 0) {
            IllegalStateException illegalStateException = new IllegalStateException(d.n("openScreensCount=", i));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "ScreensRepository", null, illegalStateException, h0Var);
        }
    }
}
