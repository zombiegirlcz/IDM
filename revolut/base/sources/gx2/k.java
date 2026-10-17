package gx2;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaActivity;
import com.revolut.feature.card_contactless_limit.impl.ui.mvp.RevolutCardResetScaScreenContract$Configuration;
import com.revolut.feature.card_screen.api.navigation.RetailCardsScreenFeatureConfig;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import cu8.u0;
import cul.r1;
import e7l.g;
import efm.d0;
import gld.h0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends bsi.a implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cx2.b f147626j;
    public final RevolutCardResetScaScreenContract$Configuration k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iqi.h f147627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k3l.b f147628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cx2.c f147629n;
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kpi.c f147630p;

    public k(cx2.b presentationModel, RevolutCardResetScaScreenContract$Configuration configuration, iqi.h twinButton, k3l.b statusView, cx2.c router, r scaItemsProvider, kpi.c activityResult) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(twinButton, "twinButton");
        Intrinsics.checkNotNullParameter(statusView, "statusView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(scaItemsProvider, "scaItemsProvider");
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        this.f147626j = presentationModel;
        this.k = configuration;
        this.f147627l = twinButton;
        this.f147628m = statusView;
        this.f147629n = router;
        this.o = scaItemsProvider;
        this.f147630p = activityResult;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        efm.r rVarEmpty;
        efm.r map;
        s view = (s) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        RevolutCardResetScaScreenContract$Configuration revolutCardResetScaScreenContract$Configuration = this.k;
        Integer num = revolutCardResetScaScreenContract$Configuration.d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(num != null ? num.intValue() : R$string.common_action_continue, null, null, 14);
        iqi.b bVar = (iqi.b) this.f147627l;
        bVar.a0(textLocalisedClause);
        bVar.d0(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_sca_limit_reset_tutorial_it_wasnt_me, null, null, 14));
        bVar.W();
        bVar.e0(revolutCardResetScaScreenContract$Configuration.f64532c);
        bVar.X(false);
        pfm.a aVar2 = new pfm.a(w.D(bVar.O(), new b(this, 2)), new a08.s(16, new h0(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ea9.c cVar = new ea9.c(17, i.f147624a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new a08.r(21, sVar), cVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        pfm.a aVar3 = new pfm.a(w.D(bVar.Q(), new b(this, 3)), new a08.s(16, new h0(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a08.r(21, sVar), new ea9.c(17, j.f147625a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        Mode mode = revolutCardResetScaScreenContract$Configuration.f64530a;
        boolean z = mode instanceof Mode.SingleCard;
        g.b bVar3 = g.b.f123407a;
        cx2.b bVar4 = this.f147626j;
        if (z) {
            String cardId = ((Mode.SingleCard) mode).f64513a;
            cx2.e eVar = (cx2.e) bVar4;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            efm.r map2 = w.l(eVar.d.a(), m70.a.g(((ik3.g) eVar.e).a(bVar3, false), null, new r1(19), 1)).map(new u0(16, new c86.c(cardId, 20)));
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            efm.r map3 = map2.map(new gv5.b(new gvi.p(10), 6));
            Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
            map = ue0.e.E(map3, new p(null));
        } else {
            if (!(mode instanceof Mode.AllCardsLimitWarning)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((Mode.AllCardsLimitWarning) mode).f64510a;
            cx2.e eVar2 = (cx2.e) bVar4;
            if (str != null) {
                d0 d0VarFirstOrError = l93.f.i(eVar2.f109887c).firstOrError();
                u0 u0Var = new u0(17, new c86.c(str, 21));
                d0VarFirstOrError.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError, u0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                rVarEmpty = iVar.x();
            } else {
                eVar2.getClass();
                rVarEmpty = efm.r.empty();
            }
            efm.r rVarConcatWith = rVarEmpty.concatWith(w.m(l93.f.i(eVar2.f109887c), eVar2.d.a(), m70.a.g(((ik3.g) eVar2.e).a(bVar3, false), null, new r1(19), 1)).map(new u0(15, new cw7.j(6))));
            Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
            map = rVarConcatWith.map(new gv5.b(new gvi.p(11), 7));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        }
        efm.r map4 = map.map(new gv5.b(new b(this, 0), 10));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        efm.r rVarF = o70.a.f(map4);
        gwe.d dVar = new gwe.d(view, 2);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.s(16, new h0(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(21, dVar), new a08.r(21, sVar), new ea9.c(17, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        if (revolutCardResetScaScreenContract$Configuration.e) {
            List<? extends NavBarMenuItem> menuItems = zhm.u.c(new TextNavBarMenuItem("IGNORE_MENU_ITEM_ID", new TextLocalisedClause(R.string.common_action_ignore, null, null, 14), null, null, 12));
            RevolutCardResetScaActivity revolutCardResetScaActivity = (RevolutCardResetScaActivity) view;
            revolutCardResetScaActivity.getClass();
            Intrinsics.checkNotNullParameter(menuItems, "menuItems");
            revolutCardResetScaActivity.Z0().setMenuItems(menuItems);
            pfm.a aVar4 = new pfm.a(w.D(revolutCardResetScaActivity.Z0().f59210a.f57403b, new b(this, 7)), new a08.s(16, new h0(new BreadcrumbException(), 11)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
            ofm.h hVarW3 = aVar4.w(new a08.r(21, sVar), new ea9.c(17, e.f147620a));
            Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
            w.j0(bVar2, hVarW3);
        } else {
            RevolutCardResetScaActivity revolutCardResetScaActivity2 = (RevolutCardResetScaActivity) view;
            revolutCardResetScaActivity2.Z0().setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
            pfm.a aVar5 = new pfm.a(w.D(revolutCardResetScaActivity2.Z0().f59211b, new b(this, 6)), new a08.s(16, new h0(new BreadcrumbException(), 10)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
            ofm.h hVarW4 = aVar5.w(new a08.r(21, sVar), new ea9.c(17, d.f147619a));
            Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
            w.j0(bVar2, hVarW4);
        }
        efm.r rVarFilter = ((k3l.d) this.f147628m).f180813j.filter(new gv5.b(new gvi.p(12), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        pfm.a aVar6 = new pfm.a(w.D(o70.a.f(rVarFilter), new b(this, 1)), new a08.s(16, new h0(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new a08.r(21, sVar), new ea9.c(17, f.f147621a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        if (revolutCardResetScaScreenContract$Configuration.f64533g) {
            cx2.g gVar = (cx2.g) ((cx2.e) bVar4).f109886b;
            efm.b bVarFlatMapCompletable = gVar.f109890b.getValue(gVar, cx2.g.f109889c[0]).c(te0.s.f270018a).filter(new gv5.b(new gvi.p(9), 5)).flatMapCompletable(new gv5.b(new b(this, 4), 8));
            Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
            a08.s sVar2 = new a08.s(16, new h0(new BreadcrumbException(), 13));
            bVarFlatMapCompletable.getClass();
            pfm.a aVar7 = new pfm.a(bVarFlatMapCompletable, sVar2, 2);
            Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
            ofm.h hVarW6 = aVar7.w(new a08.r(21, sVar), new ea9.c(17, g.f147622a));
            Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
            w.j0(bVar2, hVarW6);
        }
        efm.b bVarFlatMapCompletable2 = o70.a.f(i26.l.g(this.f147630p.N(0))).flatMapCompletable(new gv5.b(new b(this, 5), 9));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        a08.s sVar3 = new a08.s(16, new h0(new BreadcrumbException(), 9));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar8 = new pfm.a(bVarFlatMapCompletable2, sVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new a08.r(21, sVar), new ea9.c(17, h.f147623a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar2, hVarW7);
    }

    public final efm.b Q() {
        Mode mode = this.k.f64530a;
        Mode.SingleCard singleCard = mode instanceof Mode.SingleCard ? (Mode.SingleCard) mode : null;
        return ((cx2.f) this.f147629n).f109888a.a(new FeatureCommand(new RetailCardsScreenFeatureConfig.ResetContactlessLimit(singleCard != null ? singleCard.f64513a : null, 0)));
    }
}
