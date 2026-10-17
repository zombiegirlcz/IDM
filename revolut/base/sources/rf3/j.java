package rf3;

import com.revolut.chat.ChatApi$Toggles;
import ffk.t;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f253683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.c f253684b;

    public j(t pricingPlanInteractor, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f253683a = pricingPlanInteractor;
        this.f253684b = chatFeatureToggles;
    }

    public final Flow a() {
        Continuation continuation = null;
        if (((jte.d) ((d) this.f253684b).f253679a).c(ChatApi$Toggles.InboundCallsAllPlans.f50983c)) {
            return new go.g(zi0.c.P(Boolean.TRUE, false, null, 3), 2);
        }
        return q.q(nim.a.u(new qkg.a(2, 7, continuation), rd0.e.b(this.f253683a.q())));
    }
}
