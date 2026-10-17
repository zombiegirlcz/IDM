package hq8;

import cli.y;
import com.revolut.data.model.Data;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends oki.h implements f {
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f154635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f154636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f154637r;

    public m(n stateMapper, h inputData, hj8.a profileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(profileInteractor, "profileInteractor");
        this.o = inputData;
        this.f154635p = profileInteractor;
        this.f154636q = new vii.b();
        this.f154637r = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f154636q, new o(continuation, this, 9)), null, null, new hp2.d(this, continuation, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f154637r;
    }
}
