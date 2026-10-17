package jof;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ffk.t;
import ip0.ck0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f176952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final osg.b f176953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ylg.b f176954c;
    public final fgk.b d;
    public final u80.t e;
    public final qd0.b f;

    public d(wnf.b commonMapper, t pricingPlanInteractor, osg.b walletInteractor, ylg.b userInteractor, fgk.b pricingPlanStringMapper, u80.t ratesMoneyUtils, qd0.b languageProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176952a = pricingPlanInteractor;
        this.f176953b = walletInteractor;
        this.f176954c = userInteractor;
        this.d = pricingPlanStringMapper;
        this.e = ratesMoneyUtils;
        this.f = languageProvider;
    }

    public static final TextDelegate.Model b(int i, List list) {
        return new TextDelegate.Model("FEE_BREAKDOWN_DETAILS_DESCRIPTION", new TextLocalisedClause(i, list, null, 12), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x050d A[LOOP:2: B:164:0x0507->B:166:0x050d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rp0.y a(tof.a3 r49, java.util.List r50, wi0.b r51) {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jof.d.a(tof.a3, java.util.List, wi0.b):rp0.y");
    }
}
