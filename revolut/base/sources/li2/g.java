package li2;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements c {
    public final ki2.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f195410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f195411q;

    public g(ki2.b weroPayInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(weroPayInteractor, "weroPayInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = weroPayInteractor;
        this.f195410p = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f195411q = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, q.Q(this.f195411q, new f(null, this, 0)), null, null, new le8.d(this, (Continuation) null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f195410p;
    }
}
