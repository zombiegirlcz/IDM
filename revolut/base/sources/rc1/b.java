package rc1;

import efm.d0;
import et6.g;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import raf.o;
import rd0.e;
import ufm.i;
import w4l.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends bji.b implements tb1.b {
    public final cfc.b u;
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, cfc.b merchantAccountInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(merchantAccountInteractor, "merchantAccountInteractor");
        this.u = merchantAccountInteractor;
        this.v = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        d0 d0VarFirstOrError = m70.a.g(e.c(((g) this.u.f23673a).d(h.f294642c), kotlin.coroutines.g.f186406a), null, null, 3).firstOrError();
        cd0.c cVar = new cd0.c(new ccg.c(24), 26);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        A2(ue0.e.F(iVar, Boolean.FALSE), new o(this, 5), new zii.c(4));
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.v;
    }
}
