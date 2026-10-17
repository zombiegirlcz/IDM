package ne2;

import cli.g;
import cli.k;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import n3j.w;
import oki.h;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements dli.b {
    public final com.revolut.feature.apm.swish.impl.domain.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f214406p;

    public c(com.revolut.feature.apm.swish.impl.domain.a swishInteractor) {
        Intrinsics.checkNotNullParameter(swishInteractor, "swishInteractor");
        this.o = swishInteractor;
        this.f214406p = d.b(this, k.f25028a, new a54.b(21), null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w((Object) this, false, (Continuation) null, 21), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f214406p;
    }
}
