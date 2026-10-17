package nme;

import a83.z;
import aw0.e8;
import aw0.i8;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.ScrollerNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.w;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.tab.lifestyle.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import hb4.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jfb.v0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tx0.r;
import x19.a;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c1 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jme.d f217291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dme.a f217292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kme.e f217293c;
    public final ime.a d;
    public final lme.b e;
    public final zjh.j f;

    public c1(jme.d mediaHeaderPlacementStateMapper, dme.a lifestyleHomeFeedStateMapper, kme.e lifestyleHomeProductsStateMapper, ime.a lifestylePersonalizeButtonMapper, lme.b lifestyleHomeSuggestedForYouStateMapper, zjh.j legalEntityDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(mediaHeaderPlacementStateMapper, "mediaHeaderPlacementStateMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeFeedStateMapper, "lifestyleHomeFeedStateMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeProductsStateMapper, "lifestyleHomeProductsStateMapper");
        Intrinsics.checkNotNullParameter(lifestylePersonalizeButtonMapper, "lifestylePersonalizeButtonMapper");
        Intrinsics.checkNotNullParameter(lifestyleHomeSuggestedForYouStateMapper, "lifestyleHomeSuggestedForYouStateMapper");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        this.f217291a = mediaHeaderPlacementStateMapper;
        this.f217292b = lifestyleHomeFeedStateMapper;
        this.f217293c = lifestyleHomeProductsStateMapper;
        this.d = lifestylePersonalizeButtonMapper;
        this.e = lifestyleHomeSuggestedForYouStateMapper;
        this.f = legalEntityDisclaimerMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        com.revolut.feature.tab.lifestyle.impl.ui.screen.a domainState = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data lifestyleTabAvailability = domainState.f89926g;
        final Data homeHeader = domainState.k;
        final Data pointsAvailability = domainState.f89925c;
        final Data baseCurrency = domainState.f89930m;
        final Data currentPlan = domainState.f89931n;
        final Data plansToUpgrade = domainState.o;
        final Data headerBackground = domainState.f89932p;
        final boolean z = domainState.d;
        final Data revPointsEarningRate = domainState.f89936t;
        final boolean z3 = domainState.f89938x;
        final Data userCompany = domainState.f89924b;
        final ld6.b bVar = domainState.z;
        final Data lifestyleOnboardingInfoState = domainState.A;
        final jme.i iVar = (jme.i) this.f217291a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(lifestyleTabAvailability, "lifestyleTabAvailability");
        Intrinsics.checkNotNullParameter(homeHeader, "homeHeader");
        Intrinsics.checkNotNullParameter(pointsAvailability, "pointsAvailability");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        Intrinsics.checkNotNullParameter(plansToUpgrade, "plansToUpgrade");
        Intrinsics.checkNotNullParameter(headerBackground, "headerBackground");
        Intrinsics.checkNotNullParameter(revPointsEarningRate, "revPointsEarningRate");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(lifestyleOnboardingInfoState, "lifestyleOnboardingInfoState");
        jme.c cVar = (jme.c) iii.c.f(lifestyleTabAvailability, new jj3.a(26), new jfb.v0(28), new Function3() { // from class: jme.e
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                v19.a lifestyleTabAvailability2 = (v19.a) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(lifestyleTabAvailability2, "lifestyleTabAvailability");
                if (h.f176612a[lifestyleTabAvailability2.ordinal()] != 1) {
                    IllegalStateException illegalStateException = new IllegalStateException("Lifestyle Media Header shouldn't be visible when Tab is not available.");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return new b(new w(f0.f322471a));
                }
                boolean z4 = z;
                i iVar2 = iVar;
                if (!z4) {
                    iVar2.getClass();
                    return new b((ScrollerNavBarContentView.b) iii.c.f(homeHeader, new jj3.a(27), new v0(29), new j75.i(iVar2, 8)));
                }
                fme.i iVar3 = (fme.i) iVar2.f176614b;
                iVar3.getClass();
                Data pointsAvailability2 = pointsAvailability;
                Intrinsics.checkNotNullParameter(pointsAvailability2, "pointsAvailability");
                Data baseCurrency2 = baseCurrency;
                Intrinsics.checkNotNullParameter(baseCurrency2, "baseCurrency");
                Data currentPlan2 = currentPlan;
                Intrinsics.checkNotNullParameter(currentPlan2, "currentPlan");
                Data plansToUpgrade2 = plansToUpgrade;
                Intrinsics.checkNotNullParameter(plansToUpgrade2, "plansToUpgrade");
                Data headerBackground2 = headerBackground;
                Intrinsics.checkNotNullParameter(headerBackground2, "headerBackground");
                Data earningRateAggregate = revPointsEarningRate;
                Intrinsics.checkNotNullParameter(earningRateAggregate, "earningRateAggregate");
                Data lifestyleOnboardingInfoState2 = lifestyleOnboardingInfoState;
                Intrinsics.checkNotNullParameter(lifestyleOnboardingInfoState2, "lifestyleOnboardingInfoState");
                Data dataT = t1.t(pointsAvailability2, headerBackground2);
                fme.g gVar = new fme.g(iVar3, 0);
                ld6.b bVar2 = bVar;
                r rVar = (r) iii.c.f(dataT, gVar, new z(iVar3, 2, headerBackground2, bVar2), new en6.b(iVar3, earningRateAggregate, currentPlan2, bVar2, z3, lifestyleOnboardingInfoState2, 2));
                tx0.c cVar2 = (Intrinsics.f(pointsAvailability2.getContent(), a.b.f302353a) || (rVar.a() > 0)) ? tx0.c.STANDARD : tx0.c.SHRINK_BY_ACTION_VIEWS_HEIGHT;
                hme.a aVar = iVar2.f176615c;
                Intrinsics.checkNotNullParameter(pointsAvailability2, "pointsAvailability");
                ola.b bVar3 = ola.b.LIFESTYLE_REVPOINTS;
                return new a(new aw0.b((i8) iii.c.f(pointsAvailability2, new hg4.a(bVar3, 19), new hkb.e(8), new n(aVar, bVar3, 13)), rVar), cVar2, (Clause) iii.c.f(userCompany, new jj3.a(28), new f(0), new jb8.b(13)));
            }
        });
        if (cVar instanceof jme.a) {
            boolean z4 = ((jme.a) cVar).f176599a.f10239a instanceof e8;
        }
        List listV = zjh.j.v(this.f, domainState.f89939y);
        int i = R$attr.uikit_dp24;
        yp0.b.q(listV, i, i, 0, 0, 12);
        ArrayList arrayListE0 = zhm.d0.E0(listV, (Collection) iii.c.f(lifestyleTabAvailability, new nfj.l(this, 28), new nmb.v(2), new njj.c1(domainState, this, 4)));
        itb.b params = domainState.f89923a;
        Intrinsics.checkNotNullParameter(params, "params");
        itb.a aVarB = ((kbb.f) iVar.f176613a).b(params);
        boolean z6 = domainState.e;
        if (domainState.d) {
            NavBarMenuItem[] elements = {!((jte.d) iVar.e).c(RevPointsApi$Toggles.RevPointsTrophyRoom.f83471c) ? null : new IconNavBarMenuItem("TROPHY_ROOM_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_gift, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.tab_lifestyle_accessibility_trophy_room, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION), jme.i.a()};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listC = kotlin.collections.d.L(elements);
        } else {
            listC = z6 ? zhm.u.c(new IconNavBarMenuItem("REVOLUT_CASHBACK_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.tab_lifestyle_accessibility_cashback, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : zhm.u.c(jme.i.a());
        }
        List list = listC;
        v19.a aVar = (v19.a) lifestyleTabAvailability.getContent();
        boolean z11 = aVar != null && aVar == v19.a.V3;
        ((ime.b) this.d).getClass();
        return new b0(arrayListE0, aVarB, cVar, list, z11, null, domainState.f89935s, domainState.v);
    }
}
