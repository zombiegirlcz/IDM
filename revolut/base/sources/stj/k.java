package stj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mtj.q;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtj.e f265614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f265615b;

    public k(mtj.e repository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f265614a = repository;
        this.f265615b = featureToggleInteractor;
    }

    public final Flow a() {
        if (!((jte.d) this.f265615b).c(RewardsHubApi$Toggles$RewardsHub.f99247c)) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        q qVar = (q) this.f265614a;
        qVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        x4l.c cVar = qVar.f208899l;
        Unit unit = Unit.f186387a;
        return cVar.b(unit, qVar.k.d(loadingStrategy, unit, true));
    }
}
