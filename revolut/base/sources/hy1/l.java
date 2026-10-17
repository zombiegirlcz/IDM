package hy1;

import com.revolut.feature.apm.core.contacts.data.network.ApmContactsDiscoveryService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements ky1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmContactsDiscoveryService f156660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tx1.a f156661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lx1.h f156662c;

    public l(ApmContactsDiscoveryService service, tx1.a bizumContactDao, lx1.h apmRecipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(bizumContactDao, "bizumContactDao");
        Intrinsics.checkNotNullParameter(apmRecipientFilterInteractor, "apmRecipientFilterInteractor");
        this.f156660a = service;
        this.f156661b = bizumContactDao;
        this.f156662c = apmRecipientFilterInteractor;
    }

    @Override // ky1.a
    public final Flow a(String str) {
        return new g0c.e(e(), this, str, 25);
    }

    @Override // ky1.a
    public final Object b(List list, Continuation continuation) throws Throwable {
        hul.f0 f0Var = new hul.f0(this, list, null, 11);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, f0Var, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // ky1.a
    public final Object c(String str, gim.c cVar) {
        j jVar = new j(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, jVar, cVar);
    }

    @Override // ky1.a
    public final vkm.d e() {
        efm.r map = this.f156661b.i().map(new hw3.d(27, new hwf.b(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final vkm.d f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = this.f156661b.h(id10).map(new hw3.d(28, new i(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final Object g(String str, fy1.c cVar) {
        j jVar = new j(this, str, null, 2);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, jVar, cVar);
    }
}
