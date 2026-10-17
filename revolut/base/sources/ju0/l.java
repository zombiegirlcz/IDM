package ju0;

import android.os.SystemClock;
import ix0.h1;
import ju0.a;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f178569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f178570c;
    public long d;
    public long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f178568a = v0.a.d("create(...)");
    public final fp0.l f = new fp0.l(this, 20);

    public final void a(long j2, long j3, boolean z) {
        this.f178568a.onNext(new c(z, j2, j3));
    }

    public final void b() {
        k kVar = this.f178569b;
        if (kVar == null || this.f178570c) {
            return;
        }
        long jF = kotlin.time.b.f(kVar.f178566a);
        if (jF <= 0) {
            this.f178568a.onNext(new a.b(new IllegalStateException(p.a.m(jF, "Duration is negative "))));
            return;
        }
        if (!kVar.f178567b && this.d >= jF) {
            this.d = 0L;
        }
        long j2 = jF - this.d;
        long j3 = j2 >= 0 ? j2 : 0L;
        this.f178570c = true;
        this.e = SystemClock.elapsedRealtime();
        fp0.l lVar = this.f;
        h1.e(lVar);
        h1.d(j3, lVar);
        a(this.d, jF, true);
    }

    public final void c() {
        k kVar;
        boolean z = this.f178570c;
        this.f178570c = false;
        this.d = 0L;
        this.e = 0L;
        Lazy lazy = h1.f169241a;
        h1.e(this.f);
        if (z && (kVar = this.f178569b) != null) {
            a(0L, kotlin.time.b.f(kVar.f178566a), false);
        }
    }
}
