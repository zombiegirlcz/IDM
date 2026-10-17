package uj8;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements b {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h35.c f280537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f280538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f280539r;

    public i(k stateMapper, hj8.a juniorProfileInteractor, h35.c onJuniorSelectedDestinationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(onJuniorSelectedDestinationProvider, "onJuniorSelectedDestinationProvider");
        this.o = juniorProfileInteractor;
        this.f280537p = onJuniorSelectedDestinationProvider;
        this.f280538q = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f280539r = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f280539r, new uec.d(continuation, this, 3)), null, null, new uf0.d(this, continuation, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f280538q;
    }
}
