package he4;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements dli.b {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f151592p;

    public s(ang.f userInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = userInteractor;
        this.f151592p = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        ang.f fVar = this.o;
        akg.n nVarV = nim.a.v(rd0.e.b(fVar.k(false)), new hb4.k(29));
        efm.r rVarX = fVar.g().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        yji.l.a1(this, nim.a.v(u0.m(nVarV, rd0.e.b(rVarX)), new r(0)), null, null, new hba.k(this, (Continuation) null, 8), 3);
    }

    public final void J2(l event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof k;
        n nVar = n.f151586a;
        if (z) {
            C2(nVar);
            return;
        }
        if (event instanceof g) {
            C2(nVar);
            return;
        }
        boolean z3 = event instanceof i;
        y yVar = this.f151592p;
        if (z3) {
            C2(new o(((e) zi0.c.I(((f) ((j2) yVar.f22677a).getValue()).f151579a)).f151577a));
        } else if (event instanceof j) {
            C2(new m(((e) zi0.c.I(((f) ((j2) yVar.f22677a).getValue()).f151579a)).f151577a));
        } else {
            if (!(event instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            I2();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f151592p;
    }
}
