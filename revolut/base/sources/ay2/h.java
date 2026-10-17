package ay2;

import ffk.t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy2.f f11037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg3.a f11038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f11039c;
    public final gte.a d;
    public final nyb.k e;

    public h(hy2.f cardDesignInteractor, lg3.a checklistChallengesInteractor, t pricingPlanInteractor, gte.a featureToggleInteractor, nyb.k revPointsInteractor) {
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        this.f11037a = cardDesignInteractor;
        this.f11038b = checklistChallengesInteractor;
        this.f11039c = pricingPlanInteractor;
        this.d = featureToggleInteractor;
        this.e = revPointsInteractor;
    }

    public static final boolean a(h hVar, hha.d dVar, String str, List list) {
        Object next;
        e93.f fVar;
        hVar.getClass();
        if (list == null) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((e93.q) next).f123889c, str)) {
                break;
            }
        }
        e93.q qVar = (e93.q) next;
        if (qVar == null || (fVar = (e93.f) d0.d0(qVar.d)) == null) {
            return false;
        }
        return hVar.f11037a.g(fVar, dVar);
    }
}
