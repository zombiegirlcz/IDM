package wf0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hg0.d f296865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hg0.o f296866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f296867c;

    public a0(hg0.d lightenedFaqInteractor, hg0.o pigeonTreeInteractor, c0 searchRepository) {
        Intrinsics.checkNotNullParameter(lightenedFaqInteractor, "lightenedFaqInteractor");
        Intrinsics.checkNotNullParameter(pigeonTreeInteractor, "pigeonTreeInteractor");
        Intrinsics.checkNotNullParameter(searchRepository, "searchRepository");
        this.f296865a = lightenedFaqInteractor;
        this.f296866b = pigeonTreeInteractor;
        this.f296867c = searchRepository;
    }

    public final Flow a(String query, k0 k0Var) {
        int i = y.f296941a[k0Var.ordinal()];
        boolean z = false;
        if (i == 1) {
            return new wc7.e(new f3d.g(((eg0.h) ((hg0.m) this.f296865a).f152059a).d(false), false, 1), 2, this, query);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        hg0.o oVar = this.f296866b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        fg0.k kVar = oVar.f152062a;
        efm.r rVarX = kVar.f134878b.b().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        Continuation continuation = null;
        return nim.a.v(nim.a.u(new hg0.n(oVar, query, continuation, 0), vkm.q.Q(rd0.e.b(rVarX), new bbg.c0(continuation, kVar, z, 2))), new wd3.a(this, 23));
    }
}
