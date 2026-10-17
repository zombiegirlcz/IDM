package y6b;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wli.x;
import y4f.o;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends oki.h implements g {
    public final c6b.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f311256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f311257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f311258r;

    public k(n stateMapper, c6b.b cobrandedCardsBillingInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cobrandedCardsBillingInteractor, "cobrandedCardsBillingInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = cobrandedCardsBillingInteractor;
        this.f311256p = deeplinkHandler;
        this.f311257q = new vii.b(w4l.i.f294643c);
        this.f311258r = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f311257q, new o(continuation, this, 5)), null, null, new xv4.o(this, continuation, 27), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f311258r;
    }
}
