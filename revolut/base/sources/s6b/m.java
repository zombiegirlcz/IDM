package s6b;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wli.x;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends oki.h implements i {
    public final c6b.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f260208p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f260209q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f260210r;

    public m(cli.n stateMapper, c6b.a accountsInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = accountsInteractor;
        this.f260208p = deeplinkHandler;
        this.f260209q = new vii.b();
        this.f260210r = mra.d.b(this, new g(r0.g(), r0.g(), new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f260209q, new r3k.c(continuation, this, 24)), null, null, new s56.i(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f260210r;
    }
}
