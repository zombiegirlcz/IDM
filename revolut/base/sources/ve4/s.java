package ve4;

import cli.y;
import com.revolut.data.model.Data;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements n {
    public final re4.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qe4.e f288129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f288130q;

    public s(re4.e interactor, qe4.e startSigningProcessControllerModelExtension, t stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(startSigningProcessControllerModelExtension, "startSigningProcessControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f288129p = startSigningProcessControllerModelExtension;
        this.f288130q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, pyd.c.m(ngm.n.K(new uk9.h(this, continuation, 11))), null, null, new v44.e(this, continuation, 27), 3);
    }

    public final void I2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof i) {
            B2();
            return;
        }
        Continuation continuation = null;
        if (!(event instanceof h)) {
            if (event instanceof f) {
                yji.l.a1(this, pyd.c.m(ngm.n.K(new uk9.h(this, continuation, 11))), null, null, new v44.e(this, continuation, 27), 3);
                return;
            } else {
                if (!(event instanceof g)) {
                    throw new NoWhenBranchMatchedException();
                }
                C2(new k(((yy3.a) zi0.c.I(((e) ((j2) this.f288130q.f22677a).getValue()).f288113a)).f317765b));
                return;
            }
        }
        Object obj2 = ((h) event).f288116a.u;
        if (obj2 instanceof yy3.i) {
            l2(new v06.i(this, (yy3.i) obj2, continuation, 24), new yi5.b(26));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "SigningMethodsScreenModel", a0.d.m(obj2, "Unsupported parcel: "), null, h0Var);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f288130q;
    }
}
