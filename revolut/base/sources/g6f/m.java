package g6f;

import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final utk.f f140936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cli.n f140937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f140938n;

    public m(utk.f chartInteractor, cli.n mapper) {
        Intrinsics.checkNotNullParameter(chartInteractor, "chartInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f140936l = chartInteractor;
        this.f140937m = mapper;
        pdh.c cVar = pdh.c.ONE_MONTH;
        od0.i.Companion.getClass();
        this.f140938n = pyd.c.a(this, new b(cVar, od0.i.f224256b, new Data(null, null, true, 3, null)));
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        n.l2(this, q.Q(this.f140938n.B(new g64.c(2)), new l(continuation, this, 0)), null, new g06.k(this, continuation, 20), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f140938n;
    }
}
