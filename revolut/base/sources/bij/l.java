package bij;

import b1c.p;
import bb2.t;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.R$string;
import dej.h0;
import dej.i0;
import dej.m0;
import dej.o0;
import ip0.ej;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dij.b f15528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f15529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cej.b f15530c;

    public l(dij.b installItemMapper, dij.a activateItemMapper, gte.a featureToggleInteractor, cej.b mobilePlansFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(installItemMapper, "installItemMapper");
        Intrinsics.checkNotNullParameter(activateItemMapper, "activateItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f15528a = installItemMapper;
        this.f15529b = featureToggleInteractor;
        this.f15530c = mobilePlansFeatureAvailabilityInteractor;
    }

    public static List b() {
        List listK = v.k(new s7("loadingItemId1", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId2", 0, 0, 0, 0, false, null, 126), new s7("loadingItemId3", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    public final ArrayList a(o0 installationState, boolean z) {
        CellDetailsChevronDelegate.Model modelA;
        CellDetailsChevronDelegate.Model model;
        if (installationState != null) {
            Intrinsics.checkNotNullParameter(installationState, "installationState");
            boolean z3 = installationState instanceof i0;
            dij.b bVar = this.f15528a;
            if (z3) {
                modelA = bVar.a(new TextLocalisedClause(R$string.esim_help_reinstall_your_esim_title, null, null, 14), ((i0) installationState).f113555a);
            } else if (installationState instanceof h0) {
                modelA = bVar.a(new TextLocalisedClause(R$string.esim_help_install_your_esim_title, null, null, 14), ((h0) installationState).f113546a);
            } else {
                if (!(installationState instanceof m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = null;
            }
        } else {
            modelA = null;
        }
        if (installationState != null) {
            Intrinsics.checkNotNullParameter(installationState, "installationState");
            if (installationState instanceof i0) {
                model = new CellDetailsChevronDelegate.Model("ID_ACTIVATION_INSTRUCTIONS_ITEM", new TextLocalisedClause(R$string.esim_help_turning_esim_on_title, null, null, 14), 0, false, null, null, null, 2044);
            } else {
                if (!(installationState instanceof h0) && !(installationState instanceof m0)) {
                    throw new NoWhenBranchMatchedException();
                }
                model = null;
            }
        } else {
            model = null;
        }
        CellDetailsChevronDelegate.Model model2 = (((jte.d) this.f15529b).c(EsimApi$Toggles.EsimConnectivityTroubleshooting.f100172c) && z) ? new CellDetailsChevronDelegate.Model("ID_CONNECTIVITY_TROUBLESHOOTING_ITEM", new TextLocalisedClause(R$string.esim_help_connectivity_issues_title, null, null, 14), 0, false, null, null, null, 2044) : null;
        CellDetailsChevronDelegate.Model model3 = new CellDetailsChevronDelegate.Model("ID_FAQ_ITEM", new TextLocalisedClause(R$string.esim_subscription_details_help_faq_title, null, null, 14), 0, false, null, null, null, 2044);
        cej.b bVar2 = this.f15530c;
        CellDetailsChevronDelegate.Model model4 = !((efj.d) bVar2).a() ? null : new CellDetailsChevronDelegate.Model("ID_LOST_OR_STOLEN_DEVICE_ITEM", new TextLocalisedClause(R$string.esim_help_lost_device_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), 0, false, null, null, null, 2036);
        ej ejVar = ((efj.d) bVar2).a() ? null : new ej("ID_FOOTER_ITEM", new c7(new TextLocalisedClause(R$string.esim_help_partner_disclaimer_text, u.c(new TextLocalisedClause(R$string.esim_help_partner_disclaimer_links_terms, null, new Click(30, (Integer) null, (Object) null, "ID_TERMS_URL", false), 10)), null, 12), false, null, 6));
        qv0.i[] elements = {modelA, model, model2, model3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        List listL2 = v.l(model4);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        ArrayList arrayListE0 = d0.E0(listL2, listL);
        List listL3 = v.l(ejVar);
        yp0.b.q(listL3, R$attr.uikit_dp0, 0, 0, 0, 14);
        return d0.E0(listL3, arrayListE0);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f15509a, new bek.a(this, 24), new t(this, 26), new p(this, domainState, 13)));
    }
}
