package iga;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.UnlockBenefitsScreenContract$InputData;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n30.n;
import skm.a2;
import vkm.q;
import vkm.v1;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements h {
    public final UnlockBenefitsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f161109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final egk.d f161110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ega.d f161111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f161112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f161113t;

    public j(UnlockBenefitsScreenContract$InputData inputData, n chatInteractor, egk.d pricingPlansBenefitsInteractor, ega.d unlockBenefitsInteractor, x deeplinkHandler, com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.screen.unlock_benefits.b stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansBenefitsInteractor, "pricingPlansBenefitsInteractor");
        Intrinsics.checkNotNullParameter(unlockBenefitsInteractor, "unlockBenefitsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f161109p = chatInteractor;
        this.f161110q = pricingPlansBenefitsInteractor;
        this.f161111r = unlockBenefitsInteractor;
        this.f161112s = deeplinkHandler;
        this.f161113t = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (!this.o.f80970a) {
            I2();
        } else {
            l2(new hy2.e(this, null, 23), new yi5.b(26));
        }
    }

    public final a2 I2() {
        Continuation continuation = null;
        return l.a1(this, q.Q(new v1(new i44.a(this, continuation, 22)), new o(continuation, this, 22)), null, null, new ibg.g(this, continuation, 4), 3);
    }

    public final void J2(Object obj2) {
        Continuation continuation = null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            return;
        }
        n2(new i44.a(this, str, continuation, 23), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161113t;
    }
}
