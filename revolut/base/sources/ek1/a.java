package ek1;

import ck1.c;
import com.revolut.data.model.Data;
import com.revolut.feature.air.tip.learn.api.LearnAirTipApi$Toggles$InvestLearnAirTips;
import go.g;
import java.util.concurrent.ConcurrentHashMap;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import w4l.h;
import yj1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f126921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f126922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f126923c;

    public a(gte.a featureToggleInteractor, c repository) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f126921a = featureToggleInteractor;
        this.f126922b = repository;
        this.f126923c = ConcurrentHashMap.newKeySet();
    }

    public final Flow a(e params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (!((d) this.f126921a).c(LearnAirTipApi$Toggles$InvestLearnAirTips.f61058c)) {
            i.Companion.getClass();
            return new g(new Data(i.f224256b, null, false, 6, null), 2);
        }
        c cVar = this.f126922b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return cVar.d.b(params, loadingStrategy);
    }
}
