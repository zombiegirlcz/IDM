package te8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f270088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f270089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ff8.j f270090c;

    public z(ffk.t pricingPlanInteractor, ang.f userInteractor, ff8.j repository) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f270088a = pricingPlanInteractor;
        this.f270089b = userInteractor;
        this.f270090c = repository;
    }

    public static efm.r b(z zVar, String juniorUserId, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        zVar.getClass();
        Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
        return nim.a.w(zVar.a(null, z), new a(juniorUserId, 3));
    }

    public static pfm.a c(z zVar) {
        efm.d0 d0VarFirstOrError = zVar.d(null, true).firstOrError();
        tcg.q qVar = new tcg.q(14, new td1.f(zVar, 9));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, qVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.r a(String str, boolean z) {
        efm.r rVarSwitchMap = te0.w.l(m70.a.g(this.f270088a.v(w4l.h.f294642c), null, new tc6.b(14), 1), d(str, z)).switchMap(new tcg.q(12, new t9f.n(this, z, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return nim.a.w(rVarSwitchMap, new tcg.a0(18));
    }

    public final efm.r d(String str, boolean z) {
        efm.r rVarJust;
        if (str != null && (rVarJust = efm.r.just(str)) != null) {
            return rVarJust;
        }
        efm.r map = m70.a.g(rd0.e.c(this.f270089b.j(z ? w4l.i.f294643c : w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, new tc6.b(15), 1).map(new tcg.q(13, new tcg.a0(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
