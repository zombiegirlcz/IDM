package jlk;

import cli.y;
import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import jlk.j;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends oki.h implements k {

    @NotNull
    public static final m Companion = new m();
    public final q06.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final llk.a f175865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f175866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ajk.b f175867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f175868s;

    public p(cli.n stateMapper, PlanDowngradeFeesAndTermsScreenContract$InputData inputData, q06.l deeplinkRouter, llk.a planDowngradeFeesAndTermsDialogBuilder, j60.a bottomDialogExtension, ajk.b outOfAppNavigationProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(planDowngradeFeesAndTermsDialogBuilder, "planDowngradeFeesAndTermsDialogBuilder");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        this.o = deeplinkRouter;
        this.f175865p = planDowngradeFeesAndTermsDialogBuilder;
        this.f175866q = bottomDialogExtension;
        this.f175867r = outOfAppNavigationProvider;
        this.f175868s = mra.d.b(this, new i(inputData.f103498a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(String id10, PricingPlanCancelScreenConfig.ActionButton action) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(action, "action");
        String str = action.f81163a;
        boolean zF = Intrinsics.f(str, "CANCEL");
        j.a aVar = j.a.f175856a;
        if (zF) {
            C2(aVar);
            return;
        }
        boolean zF2 = Intrinsics.f(str, "PROCEED");
        j.b bVar = j.b.f175857a;
        if (zF2) {
            C2(bVar);
            return;
        }
        Continuation continuation = null;
        if (str != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanDowngradeFees", p.a.p("click action ", action.f81163a, " is not supported"), null, h0Var);
        }
        switch (id10.hashCode()) {
            case -1412423919:
                if (!id10.equals("DIALOG_BUTTON_ID")) {
                    return;
                }
                break;
            case -833361784:
                if (!id10.equals("DIALOG_TWIN_BUTTON_ID")) {
                    return;
                }
                break;
            case -233592877:
                if (id10.equals("ID_PRIMARY_BUTTON")) {
                    C2(bVar);
                    return;
                }
                return;
            case 2061992737:
                if (id10.equals("ID_SECONDARY_BUTTON")) {
                    C2(aVar);
                    return;
                }
                return;
            default:
                return;
        }
        j60.a.v(this.f175866q, false, null, 3);
        String str2 = action.f81165c;
        if (str2 != null) {
            n2(new o(this, str2, continuation, 1), new whi.b(6));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f175868s;
    }
}
