package fe9;

import fag.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wl0.k;
import wl0.l;
import wl0.m;
import wl0.n;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends cki.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wl0.c f134483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f134484n;

    public h(wl0.c biometricHelper) {
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        this.f134483m = biometricHelper;
        this.f134484n = new j(null);
    }

    @Override // yji.n
    public final void F2() {
        d3(new f(0));
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f134484n;
    }

    public final void e3(boolean z, boolean z3) {
        Object aVar;
        if (z) {
            wl0.c cVar = this.f134483m;
            aVar = new ee9.a(cVar.d(), cVar.f298341b.a(), z3);
        } else {
            aVar = ee9.e.f125159a;
        }
        d3(new fca.d(aVar, 8));
    }

    public final void f3(n value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof wl0.j) {
            d3(new o0(28));
            return;
        }
        if (value instanceof k) {
            d3(new fca.d(this, 6));
        } else if (value instanceof l) {
            d3(new o0(29));
        } else {
            if (!(value instanceof m)) {
                throw new NoWhenBranchMatchedException();
            }
            d3(new fca.d(value, 7));
        }
    }
}
