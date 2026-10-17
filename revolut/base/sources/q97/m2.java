package q97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class m2 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oih.i f243739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f243740c;
    public final gte.a d;
    public final t97.d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(t97.c productCellProvider, oih.i wealthRoboAccountCommandProvider, xoj.a featuresInteractor, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthRoboAccountCommandProvider, "wealthRoboAccountCommandProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243739b = wealthRoboAccountCommandProvider;
        this.f243740c = featuresInteractor;
        this.d = featureToggleInteractor;
        this.e = t97.d.ROBO;
    }

    @Override // r97.b
    public final Flow d() {
        return rd0.e.b(((cpj.b) this.f243740c).l(yoj.c.ROBO));
    }

    @Override // r97.b
    public final p97.a e(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        return ((jte.d) this.d).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? p97.a.a(productCell, R$drawable.uikit_icn_24_revolut, new TextLocalisedClause(R$string.wealth_strategies_global_search_title, null, null, 14), null, new TextLocalisedClause(R$string.wealth_strategies_global_search_description, null, null, 14), zhm.v.k(new TextLocalisedClause(R$string.wealth_robo_global_search_keys_automated, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_global_search_keys_strategies, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_global_search_keys_robo_advisor, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_global_search_keys_robo, null, null, 14)), null, 73) : productCell;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof q97.l2
            if (r0 == 0) goto L13
            r0 = r5
            q97.l2 r0 = (q97.l2) r0
            int r1 = r0.f243731w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f243731w = r1
            goto L1a
        L13:
            q97.l2 r0 = new q97.l2
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f243731w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            oih.b r5 = new oih.b
            r5.<init>()
            oih.i r2 = r4.f243739b
            llh.f r2 = (llh.f) r2
            ufm.i r5 = r2.a(r5)
            r0.f243731w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
            o97.l r0 = new o97.l
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.m2.g(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
