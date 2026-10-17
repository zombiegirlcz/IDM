package nwf;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ouf.a f219870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lvf.a f219871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.a f219872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f219873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f219874t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ouf.a transportInteractor, lvf.a transportLocationExtension, n60.a keyboardControllerExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(transportLocationExtension, "transportLocationExtension");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f219870p = transportInteractor;
        this.f219871q = transportLocationExtension;
        this.f219872r = keyboardControllerExtension;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f219873s = z1VarB;
        m70.a.c(t0.f186434a);
        this.f219874t = new e("", null, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new j(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, q.Q(this.f219873s, new ns9.h(continuation, this, 5)), null, null, new nwc.f(this, continuation, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f219874t;
    }
}
