package z8b;

import an9.t;
import cli.n;
import cli.y;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;
import zhm.a1;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements dli.b {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8b.d f320063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f320064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f320065r;

    public j(n stateMapper, h inputData, x8b.d cryptoCurrenciesProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoCurrenciesProvider, "cryptoCurrenciesProvider");
        this.o = inputData;
        this.f320063p = cryptoCurrenciesProvider;
        this.f320064q = mra.d.b(this, new g(5, inputData.f320061b), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f320065r = z1VarB;
    }

    public final void I2(xi0.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        y yVar = this.f320064q;
        Set set = ((g) ((j2) yVar.f22677a).getValue()).f320058b;
        H2(yVar, new t(set.contains(item) ? a1.j(set, item) : a1.m(set, item), 18));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, nim.a.v(q.Q(this.f320065r, new z6e.g(continuation, this, 7)), new z2.a(this, 17)), null, new yy6.f(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f320064q;
    }
}
