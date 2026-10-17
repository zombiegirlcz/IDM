package lbm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f193718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f193719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f193720c;

    public g(j jVar) {
        this.f193720c = jVar;
        jbm.h hVar = jVar.f193727c;
        this.f193718a = new b(hVar.f172677h, hVar.i, hVar, jVar.f);
        this.f193719b = new AtomicBoolean(true);
    }

    @Override // lbm.f
    public final int a() {
        return 0;
    }

    @Override // lbm.f
    public final void c(long j2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(this.f193718a.b(j2));
    }

    @Override // lbm.f
    public final b d() {
        return this.f193718a;
    }

    @Override // lbm.f
    public final void e() {
    }

    @Override // lbm.f
    public final boolean f() {
        return this.f193719b.get();
    }

    @Override // lbm.f
    public final void g() {
    }

    @Override // lbm.f
    public final jbm.a getState() {
        return jbm.a.CLOSED;
    }

    @Override // lbm.f
    public final void h(long j2) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(this.f193718a.c(j2));
    }

    public final void i(a aVar) {
        a aVar2 = a.ABOVE_THRESHOLDS;
        if ((aVar == aVar2 || aVar == a.FAILURE_RATE_ABOVE_THRESHOLDS || aVar == aVar2 || aVar == a.SLOW_CALL_RATE_ABOVE_THRESHOLDS) && this.f193719b.compareAndSet(true, false)) {
            j jVar = this.f193720c;
            String str = jVar.f193725a;
            float f = -1.0f;
            b bVar = this.f193718a;
            if (aVar == aVar2 || aVar == a.FAILURE_RATE_ABOVE_THRESHOLDS) {
                int i = bVar.f193710a.b().f141229c;
                jVar.e(new kbm.f((i == 0 || i < bVar.f) ? -1.0f : i == 0 ? 0.0f : (r7.f141228b * 100.0f) / i, 0, str));
            }
            if (aVar == aVar2 || aVar == a.SLOW_CALL_RATE_ABOVE_THRESHOLDS) {
                int i2 = bVar.f193710a.b().f141229c;
                if (i2 != 0 && i2 >= bVar.f) {
                    f = i2 == 0 ? 0.0f : (r11.f141227a * 100.0f) / i2;
                }
                jVar.e(new kbm.f(f, 1, str));
            }
            jVar.f(jbm.a.OPEN, new c(jVar, 0));
        }
    }
}
