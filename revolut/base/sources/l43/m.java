package l43;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.api.cardlimit.CardLimitDestination;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import klf.a3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l43.e;
import vkm.j2;
import vkm.q;
import vkm.v1;
import wtc.a1;
import wtc.w;
import wtc.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements f {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ptc.a f192057p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rul.e f192058q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f192059r;

    public m(d inputData, ptc.a wealthProtectionInteractor, rul.e securityHubFeatureChecker, l stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        Intrinsics.checkNotNullParameter(securityHubFeatureChecker, "securityHubFeatureChecker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f192057p = wealthProtectionInteractor;
        this.f192058q = securityHubFeatureChecker;
        this.f192059r = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        a1 a1Var = (a1) ((ptc.a) this.f192058q.f257630b);
        a1Var.getClass();
        Continuation continuation = null;
        yji.l.a1(this, q.Q(new w(new v1(new y0(a1Var, null)), 0), new a3(continuation, this, 18)), null, null, new l1g.e(this, continuation, 3), 3);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof h)) {
            if (!(event instanceof g)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(e.a.f192052a);
            return;
        }
        String str = ((h) event).f192054a;
        if (Intrinsics.f(str, "CARD_LIMIT_INFO_ID")) {
            C1(new CardLimitDestination(this.o.f192051a));
            B2();
        } else if (Intrinsics.f(str, "CARD_DAILY_LIMIT_INFO_ID")) {
            WealthProtectionFeatureDetails wealthProtectionFeatureDetails = (WealthProtectionFeatureDetails) ((c) ((j2) this.f192059r.f22677a).getValue()).f192050a.getContent();
            if (wealthProtectionFeatureDetails != null) {
                C1(new SecurityHubDestination((SecurityHubStartScreen) new SecurityHubStartScreen.WealthProtectionChangeLimit(qtc.k.CARD_PAYMENTS, otc.c.a(wealthProtectionFeatureDetails)), false, (String) null, false, 30));
            }
            B2();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f192059r;
    }
}
