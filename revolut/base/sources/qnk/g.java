package qnk;

import cli.y;
import ffk.e0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends oki.h implements dli.b {
    public final tik.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f247963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f247964q;

    public g(h stateMapper, tik.c resendCooldownTimer, e0 interactor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(resendCooldownTimer, "resendCooldownTimer");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = resendCooldownTimer;
        this.f247963p = interactor;
        long jLongValue = ((Number) resendCooldownTimer.f271575a.getValue()).longValue() - System.currentTimeMillis();
        this.f247964q = mra.d.b(this, new c((int) ((jLongValue < 0 ? 0L : jLongValue) / 1000)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        tik.c cVar = this.o;
        Continuation continuation = null;
        l.b1(this, q.Q(cVar.f271575a, new tik.b(continuation, cVar, 0)), null, new f(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f247964q;
    }
}
