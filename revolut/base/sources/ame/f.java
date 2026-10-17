package ame;

import cli.n;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.a2;
import v20.s;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements dli.b {
    public final u19.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f6362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f6363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f6364r;

    public f(n stateMapper, u19.a lifestyleDocumentsInteractor, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(lifestyleDocumentsInteractor, "lifestyleDocumentsInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = lifestyleDocumentsInteractor;
        this.f6362p = termsNavigationFactory;
        this.f6363q = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f6364r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f6364r = l.a1(this, nim.a.v(rd0.e.b(pre.c.l(((v29.c) this.o).f285685a, null, null, v29.c.f285684b, 11)), new s(19)), null, null, new af4.e(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f6363q;
    }
}
