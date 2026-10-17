package m22;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements dli.b {
    public final e12.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f201683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f201684q;

    public g(e12.b extension, n stateMapper) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = extension;
        this.f201683p = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f201684q = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f201684q, new li2.f(continuation, this, 19)), null, null, new lph.h(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f201683p;
    }
}
