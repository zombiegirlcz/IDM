package uij;

import com.revolut.core.ui_kit.delegates.u5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.c1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import yik.h;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f280455a;

    public b(h planStringMapper) {
        Intrinsics.checkNotNullParameter(planStringMapper, "planStringMapper");
        this.f280455a = planStringMapper;
    }

    public final u5 a(c1 planOffer, List pricingPlans) {
        Object next;
        Intrinsics.checkNotNullParameter(planOffer, "planOffer");
        Intrinsics.checkNotNullParameter(pricingPlans, "pricingPlans");
        Iterator it8 = pricingPlans.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((hha.d) next).f152287a, planOffer.f113505b)) {
                break;
            }
        }
        hha.d dVar = (hha.d) next;
        if (dVar != null) {
            return new u5(new TextLocalisedClause(R$string.esim_subscriptions_item_label_included_in_plan, u.c(fgk.b.a(this.f280455a, dVar)), null, 12), new TextLocalisedClause(R$string.esim_subscriptions_actions_claim, null, null, 14));
        }
        IllegalStateException illegalStateException = new IllegalStateException("Pricing plan associated with plan offer is not found");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimSubscriptionsPlanOfferBottomViewMapper", null, illegalStateException, h0Var);
        return null;
    }
}
