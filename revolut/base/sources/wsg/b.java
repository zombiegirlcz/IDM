package wsg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import wp5.w;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements osg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final atg.i f299710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f299711b;

    public b(atg.i allWalletsRepository, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(allWalletsRepository, "allWalletsRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f299710a = allWalletsRepository;
        this.f299711b = userInteractor;
    }

    public final akg.n b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(((atg.h) this.f299710a).i(loadingStrategy)), new a(0));
    }

    public final Flow c(String ownerId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(nim.a.v(rd0.e.b(((atg.h) this.f299710a).i(loadingStrategy)), new wb3.k(ownerId, 22)));
    }

    public final Flow d(String walletId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(nim.a.v(rd0.e.b(((atg.h) this.f299710a).i(loadingStrategy)), new wb3.k(walletId, 21)));
    }

    public final Flow e(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(nim.a.v(u0.m(this.f299711b.j(loadingStrategy), rd0.e.b(((atg.h) this.f299710a).i(loadingStrategy))), new w(29)));
    }

    public final Object f(boolean z, gim.c cVar) {
        w4l.f fVar = ((atg.h) this.f299710a).f;
        Unit unit = Unit.f186387a;
        Object objA = nim.a.a(fVar.g(unit, z), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : unit;
    }
}
