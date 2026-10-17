package md0;

import efm.d0;
import efm.r;
import g9j.v;
import gd0.f;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f204465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kd0.a f204466b;

    public e(f chaosManagementRepository, kd0.a bannerDomain) {
        Intrinsics.checkNotNullParameter(chaosManagementRepository, "chaosManagementRepository");
        Intrinsics.checkNotNullParameter(bannerDomain, "bannerDomain");
        this.f204465a = chaosManagementRepository;
        this.f204466b = bannerDomain;
    }

    public final r a() {
        f fVar = this.f204465a;
        fVar.getClass();
        kd0.a domain = this.f204466b;
        Intrinsics.checkNotNullParameter(domain, "domain");
        return nim.a.w(fVar.d.f(domain, true), new c(0));
    }

    public final efm.b b(nd0.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        nd0.d params = new nd0.d(type, this.f204466b);
        f fVar = this.f204465a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        return fVar.f143029c.g(params, false);
    }

    public final pfm.a c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        f fVar = this.f204465a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        kd0.a domain = this.f204466b;
        Intrinsics.checkNotNullParameter(domain, "domain");
        pfm.r rVarG0 = w.g0(fVar.f143027a.subscribeToIncident(id10, domain.a()));
        nd0.a newState = nd0.a.SUBSCRIBED;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(domain, "domain");
        d0 d0VarFirstOrError = m70.a.g(fVar.d.f(domain, false), null, null, 3).firstOrError();
        v vVar = new v(new dqd.a(id10, newState, fVar, domain, 15), 16);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, vVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarE = rVarG0.e(aVar);
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
