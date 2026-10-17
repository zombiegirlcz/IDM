package hy1;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ky1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sx1.a f156636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.h f156637b;

    public c(sx1.a aaniContactDao, lx1.h apmRecipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(aaniContactDao, "aaniContactDao");
        Intrinsics.checkNotNullParameter(apmRecipientFilterInteractor, "apmRecipientFilterInteractor");
        this.f156636a = aaniContactDao;
        this.f156637b = apmRecipientFilterInteractor;
    }

    @Override // ky1.a
    public final Flow a(String str) {
        return new g0c.e(e(), this, str, 24);
    }

    @Override // ky1.a
    public final Object b(List list, Continuation continuation) throws Throwable {
        hul.f0 f0Var = new hul.f0(this, list, null, 10);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, f0Var, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // ky1.a
    public final Object c(String str, gim.c cVar) {
        a aVar = new a(this, str, null, 0);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, aVar, cVar);
    }

    @Override // ky1.a
    public final vkm.d e() {
        efm.r map = this.f156636a.g().map(new hw3.d(25, new hwf.b(27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final vkm.d f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = this.f156636a.f(id10).map(new hw3.d(26, new hwf.b(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final Object g(String str, fy1.c cVar) {
        a aVar = new a(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, aVar, cVar);
    }
}
