package kbb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.main_screen.container.impl.R$string;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import java.util.List;
import k8d.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vdl.c1;
import vge.f1;
import vkm.t0;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements ftb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u29.o f182565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ji5.m f182566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uke.a f182567c;
    public final ekg.g d;
    public final ibb.d e;
    public final xx9.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n8b.a f182568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vie.j f182569h;

    public o(u29.o lifestyleTabStateInteractor, ji5.m cryptoPreferencesInteractor, uke.a investTabStateInteractor, ekg.g uiPersonalisationInteractor, ibb.d retailTabsUIInfo, xx9.p recentRecipientInteractor, n8b.a countryInteractor, vtb.a tabMerger, vie.j tabCreditVisibilityInteractor) {
        Intrinsics.checkNotNullParameter(lifestyleTabStateInteractor, "lifestyleTabStateInteractor");
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        Intrinsics.checkNotNullParameter(investTabStateInteractor, "investTabStateInteractor");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(retailTabsUIInfo, "retailTabsUIInfo");
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(tabMerger, "tabMerger");
        Intrinsics.checkNotNullParameter(tabCreditVisibilityInteractor, "tabCreditVisibilityInteractor");
        this.f182565a = lifestyleTabStateInteractor;
        this.f182566b = cryptoPreferencesInteractor;
        this.f182567c = investTabStateInteractor;
        this.d = uiPersonalisationInteractor;
        this.e = retailTabsUIInfo;
        this.f = recentRecipientInteractor;
        this.f182568g = countryInteractor;
        this.f182569h = tabCreditVisibilityInteractor;
    }

    public static final FloatingBottomBarView.Item a(o oVar, MainScreenTab mainScreenTab, boolean z, u19.b bVar) {
        TextLocalisedClause textLocalisedClause;
        int i;
        String str = mainScreenTab.f83420a;
        ibb.d dVar = oVar.e;
        MainScreenTab mainScreenTab2 = ibb.c.f160140a;
        if (mainScreenTab.equals(mainScreenTab2)) {
            textLocalisedClause = new TextLocalisedClause(R$string.tab_accounts_title, null, null, 14);
        } else if (mainScreenTab.equals(ibb.c.f160141b)) {
            textLocalisedClause = ((rbb.b) dVar).a(z);
        } else if (mainScreenTab.equals(ibb.c.f160142c)) {
            textLocalisedClause = new TextLocalisedClause(R$string.tab_payments_title, null, null, 14);
        } else if (mainScreenTab.equals(ibb.c.d)) {
            textLocalisedClause = new TextLocalisedClause(R$string.tab_crypto_title, null, null, 14);
        } else if (mainScreenTab.equals(ibb.c.e)) {
            int i2 = h.f182556a[bVar.ordinal()];
            if (i2 == 1) {
                throw new IllegalArgumentException("Lifestyle tab is not available: " + oVar);
            }
            if (i2 == 2) {
                textLocalisedClause = new TextLocalisedClause(R$string.tab_lifestyle_title, null, null, 14);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.tab_revpoints_title, null, null, 14);
            }
        } else {
            if (!mainScreenTab.equals(ibb.c.f)) {
                throw new IllegalArgumentException(j6.a.q("Unsupported MainScreenTab id=", str));
            }
            textLocalisedClause = new TextLocalisedClause(R$string.tab_credit_title, null, null, 14);
        }
        if (mainScreenTab.equals(mainScreenTab2)) {
            i = R$drawable.uikit_icn_24_logo_revolut;
        } else if (mainScreenTab.equals(ibb.c.f160141b)) {
            i = R$drawable.uikit_icn_24_invest;
        } else if (mainScreenTab.equals(ibb.c.f160142c)) {
            i = R$drawable.uikit_icn_24_arrow_right_left;
        } else if (mainScreenTab.equals(ibb.c.d)) {
            i = R$drawable.uikit_icn_24_bitcoin;
        } else if (mainScreenTab.equals(ibb.c.e)) {
            int i3 = h.f182556a[bVar.ordinal()];
            if (i3 == 1) {
                throw new IllegalArgumentException("Lifestyle tab is not available: " + oVar);
            }
            if (i3 == 2) {
                i = R$drawable.uikit_icn_24_lifestyle;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_revpoints;
            }
        } else {
            if (!mainScreenTab.equals(ibb.c.f)) {
                throw new IllegalArgumentException(j6.a.q("Unsupported MainScreenTab id=", str));
            }
            i = R$drawable.uikit_icn_24_coins;
        }
        return new FloatingBottomBarView.Item(str, textLocalisedClause, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), mainScreenTab.equals(mainScreenTab2), 16);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Flow b(Flow flow) {
        if (!((Boolean) jo0.g.u.getValue()).booleanValue()) {
            return flow;
        }
        mk0.a aVar = ((akg.o) this.d.f127161b).f;
        akg.o.Companion.getClass();
        Intrinsics.checkNotNullParameter("HOME_TABS_ORDER", "id");
        return new t38.e(flow, 24, mo3.a.g(aVar.f(new tk0.e("HOME_TABS_ORDER")), new s(15), null, 2), new i(this, null));
    }

    public final Flow c() {
        Flow flowB;
        u29.o oVar = this.f182565a;
        u29.g gVar = oVar.f276579a;
        int i = 3;
        Continuation continuation = null;
        if (((o8b.c) this.f182568g).g()) {
            flowB = b(vkm.q.B(new k(this, null), rd0.e.e(vkm.q.B(new tz6.e(oVar, continuation, 11), gVar.a()), h0.f322473a, new i23.c(i, 17, continuation))));
        } else {
            t0 t0VarB = vkm.q.B(new tz6.e(oVar, continuation, 11), gVar.a());
            ji5.m mVar = this.f182566b;
            wkm.l lVarQ = vkm.q.Q(mVar.b(), new ji5.k(continuation, mVar, 0));
            vkm.d dVarA = this.f182567c.a();
            vie.j jVar = this.f182569h;
            flowB = b(ta6.a.g(t0VarB, lVarQ, dVarA, rd0.e.e(vkm.q.Q(new v1(new vge.r(jVar.f289584a, continuation, 14)), new c1(continuation, jVar, 9)), h0.f322473a, new f1(i, 11, continuation)), new j(this, null)));
        }
        return vkm.q.q(new y(new l(this, null), flowB));
    }
}
