package xti;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends oki.h implements dli.b {
    public final mti.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zti.d f308831p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f308832q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f308833r;

    public j(n stateMapper, mti.a airportsInteractor, zti.d searchResultsFilterer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(airportsInteractor, "airportsInteractor");
        Intrinsics.checkNotNullParameter(searchResultsFilterer, "searchResultsFilterer");
        this.o = airportsInteractor;
        this.f308831p = searchResultsFilterer;
        this.f308832q = new vii.b();
        this.f308833r = mra.d.b(this, new e(new Data(null, null, true, 3, null), ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f308832q, new i(continuation, this, 0)), null, null, new xjl.g(this, continuation, 26), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f308833r;
    }
}
