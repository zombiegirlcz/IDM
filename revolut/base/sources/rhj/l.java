package rhj;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import g2e.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import raf.o;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends oki.h implements j {
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f254499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gfj.b f254500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f254501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.d f254502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nkj.d f254503t;
    public final vii.b u;
    public final y v;

    public l(n stateMapper, c70.a clipboard, gte.a featureToggleInteractor, gfj.b expiredSubscriptionsInteractor, t deviceGroupingInteractor, r10.d subscriptionsViewGroupingInteractor, nkj.d phoneNumberShotDialogBuilder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(expiredSubscriptionsInteractor, "expiredSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(deviceGroupingInteractor, "deviceGroupingInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsViewGroupingInteractor, "subscriptionsViewGroupingInteractor");
        Intrinsics.checkNotNullParameter(phoneNumberShotDialogBuilder, "phoneNumberShotDialogBuilder");
        this.o = clipboard;
        this.f254499p = featureToggleInteractor;
        this.f254500q = expiredSubscriptionsInteractor;
        this.f254501r = deviceGroupingInteractor;
        this.f254502s = subscriptionsViewGroupingInteractor;
        this.f254503t = phoneNumberShotDialogBuilder;
        this.u = new vii.b(w4l.i.f294643c);
        this.v = mra.d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, boh.f.e(q.Q(this.u, new r3k.c(continuation, this, 6)), new o(this, 23)), null, null, new r5e.e(this, continuation, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
