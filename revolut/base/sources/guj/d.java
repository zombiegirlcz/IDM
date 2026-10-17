package guj;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends h implements dli.b {
    public final EligibilityCriteriaScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final stj.h f146962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f146963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f146964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f146965s;

    public d(EligibilityCriteriaScreenContract$InputData inputData, stj.h interactor, x deeplinkHandler, g stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f146962p = interactor;
        this.f146963q = deeplinkHandler;
        this.f146964r = new vii.b();
        this.f146965s = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f146964r, new g6f.l(continuation, this, 17)), null, new gii.b(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f146965s;
    }
}
