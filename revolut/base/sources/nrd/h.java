package nrd;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends oki.h implements dli.b {
    public final tsj.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f218618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f218619q;

    public h(tsj.g customAssetsInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = customAssetsInteractor;
        this.f218618p = mra.d.b(this, new a(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
        this.f218619q = new vii.b();
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, nim.a.v(q.Q(this.f218619q, new mk0.f(continuation, this, 29)), new nrb.c(2)), null, new nn7.d(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f218618p;
    }
}
