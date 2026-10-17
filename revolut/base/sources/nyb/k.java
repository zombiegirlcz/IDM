package nyb;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jxb.f f220804a;

    public k(jxb.f revPointsRepository) {
        Intrinsics.checkNotNullParameter(revPointsRepository, "revPointsRepository");
        this.f220804a = revPointsRepository;
    }

    public final pfm.a a(String challengeId) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        jxb.l lVar = (jxb.l) this.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        pfm.r rVarG0 = te0.w.g0(lVar.f179124a.claimChallengeReward(challengeId));
        w4l.f fVar = lVar.e;
        Unit unit = Unit.f186387a;
        pfm.a aVarE = rVarG0.e(fVar.g(unit, false)).e(lVar.f179130l.g(unit, false));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final efm.r b() {
        return nim.a.w(((jxb.l) this.f220804a).a(true), new nxa.v(25));
    }

    public final efm.r c(boolean z) {
        return ((jxb.l) this.f220804a).a(z);
    }

    public final efm.b d() {
        return ((jxb.l) this.f220804a).e.g(Unit.f186387a, false);
    }
}
