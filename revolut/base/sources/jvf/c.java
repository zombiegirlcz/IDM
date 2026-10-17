package jvf;

import a82.s;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jsl.t0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.t;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ouf.a f178874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a2 f178875m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2 f178876n;

    public c(ouf.a transportInteractor) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        this.f178874l = transportInteractor;
    }

    @Override // yji.n
    public final void E2() {
        a2 a2Var = this.f178875m;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f178875m = null;
        c3();
    }

    public final void Z2(List ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        a2 a2Var = this.f178875m;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f178875m = null;
        this.f178875m = n.j2(this, ta6.a.H(10000L, 1000L, TimeUnit.MILLISECONDS), null, new t0(this, ids, continuation, 6), 3);
    }

    public final void b3(long j2, Function0 onCompletion, Function1 onTicker) {
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(onTicker, "onTicker");
        c3();
        Continuation continuation = null;
        this.f178876n = n.j2(this, new t(ta6.a.H(j2, 1000L, TimeUnit.MILLISECONDS), new a0e.n(onCompletion, continuation, 8)), null, new s(onTicker, continuation, 4), 3);
    }

    public final void c3() {
        a2 a2Var = this.f178876n;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f178876n = null;
    }
}
