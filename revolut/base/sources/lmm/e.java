package lmm;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import ulm.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Interceptor {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f197101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile h0 f197102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h0 f197103c;
    public volatile b d;

    public e() {
        this(0);
    }

    public final void a(u0 u0Var, int i) {
        h0 h0Var = this.f197102b;
        u0Var.getClass();
        h0Var.contains(ue8.c.l(u0Var, i));
        String strQ = ue8.c.q(u0Var, i);
        this.f197101a.log(ue8.c.l(u0Var, i) + ": " + strQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[LOOP:0: B:45:0x0106->B:46:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0247  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(ulm.y0 r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lmm.e.intercept(ulm.y0):okhttp3.Response");
    }

    public e(d logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f197101a = logger;
        h0 h0Var = h0.f322473a;
        this.f197102b = h0Var;
        this.f197103c = h0Var;
        this.d = b.NONE;
    }

    public /* synthetic */ e(int i) {
        this(d.w1);
    }
}
