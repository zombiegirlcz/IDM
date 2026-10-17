package q42;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pkf.x;
import q2e.i0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements h {
    public final e12.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f242000p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f242001q;

    public j(e12.h extension, n stateMapper) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = extension;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f242000p = z1VarB;
        this.f242001q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f242000p, new x(continuation, this, 21)), null, null, new i0(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f242001q;
    }
}
