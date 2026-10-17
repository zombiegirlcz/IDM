package fx6;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import et6.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements f {
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f138754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f138755q;

    public i(h1 freelancerInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f138754p = z1VarB;
        this.f138755q = mra.d.b(this, new e(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f138754p, new f5h.b(continuation, this, 16)), null, null, new fna.f(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f138755q;
    }
}
