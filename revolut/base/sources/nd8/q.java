package nd8;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends oki.h implements dli.b {

    @NotNull
    private static final k Companion = new k();
    public final g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f214345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kd8.e f214346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final skd.i f214347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f214348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f214349t;

    public q(g inputData, hj8.a juniorProfileInteractor, kd8.e juniorConsentInteractor, skd.i slotManagerInteractor, j stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f214345p = juniorProfileInteractor;
        this.f214346q = juniorConsentInteractor;
        this.f214347r = slotManagerInteractor;
        this.f214348s = new vii.b();
        this.f214349t = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(vkm.q.Q(this.f214348s, new mk0.f(continuation, this, 22)), new i(2)), new m(this, continuation, 0), null, new m(this, continuation, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f214349t;
    }
}
