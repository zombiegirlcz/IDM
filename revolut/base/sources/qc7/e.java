package qc7;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.navigation.CardSelectionNavigationData$InputData;
import com.revolut.feature.card_screen.impl.card_selection.screen.CardSelectionScreen;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.kompot.common.ModalDestination;
import com.youTransactor.uCube.rpc.Constants;
import d73.u;
import dfj.v;
import dsh.j;
import dsh.n;
import efm.r;
import g48.r0;
import grl.r2;
import ha3.k;
import ha3.x;
import ip0.c2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.m4;
import op0.q;
import pv7.t;
import q97.q2;
import qc0.l0;
import te0.w;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f244588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f244589c;
    public final mt8.d d;
    public final wif.a e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f244590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zf8.k f244591h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bm4.a f244592j;
    public final m4 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jla.h f244593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final al4.b f244594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qe7.a f244595n;

    public e(l93.f revolutCardsInteractor, u cardsScreenInteractor, mt8.d kycInteractor, wif.a userFeaturesChecker, f73.a cardSelectionScreenProvider, r0 jointAccountsInteractor, k cardsTypeInfoInteractor, zf8.k juniorAccountInfoProvider, i cardsWidgetsMapper, bm4.a creditCardEntryUiInteractor, m4 familyCreditCardWalletInteractor, jla.h productCatalogueInteractor, al4.b comboCardInteractor, qe7.a incentiveExperimentInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardsScreenInteractor, "cardsScreenInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(cardSelectionScreenProvider, "cardSelectionScreenProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(cardsTypeInfoInteractor, "cardsTypeInfoInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(cardsWidgetsMapper, "cardsWidgetsMapper");
        Intrinsics.checkNotNullParameter(creditCardEntryUiInteractor, "creditCardEntryUiInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(incentiveExperimentInteractor, "incentiveExperimentInteractor");
        this.f244588b = revolutCardsInteractor;
        this.f244589c = cardsScreenInteractor;
        this.d = kycInteractor;
        this.e = userFeaturesChecker;
        this.f = jointAccountsInteractor;
        this.f244590g = cardsTypeInfoInteractor;
        this.f244591h = juniorAccountInfoProvider;
        this.i = cardsWidgetsMapper;
        this.f244592j = creditCardEntryUiInteractor;
        this.k = familyCreditCardWalletInteractor;
        this.f244593l = productCatalogueInteractor;
        this.f244594m = comboCardInteractor;
        this.f244595n = incentiveExperimentInteractor;
    }

    public static ErrorWidgetDelegate.Model i(String str, q qVar) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(R$string.card_design_error_cant_load_cards, null, null, 14), new TextLocalisedClause(R$string.cards_widget_action_try_again, null, null, 14), qVar, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "CardsMedium") && !Intrinsics.f(str, "CardsSmall")) {
            throw new IllegalArgumentException();
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return vkm.q.x(rd0.e.b(this.e.d(wog.a.CARDS)), continuation);
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "CardsMedium")) {
            Intrinsics.checkNotNullParameter(id10, "id");
            return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.widgets_catalogue_cards_title, null, null, 14), c2.CARD);
        }
        if (!Intrinsics.f(widgetType, "CardsSmall")) {
            throw new IllegalArgumentException();
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        return new CardWidgetLoadingDelegate.Model(id10);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        return vkm.q.x(j((CardsWidgetContext) widgetContext, str, str2, eVar), fVar);
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        CardsWidgetContext widgetContext2 = (CardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        return vkm.q.Q(rd0.e.b(this.e.d(wog.a.CARDS)), new v(2, config, this, widgetContext2, id10, widgetType, null));
    }

    @Override // csh.e
    public final j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        CardsWidgetContext widgetContext2 = (CardsWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Intrinsics.f(widgetType, "CardsSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.home_feed.api.R$string.home_feed_widget_cards_select_card, null, null, 14);
        CardSelectionNavigationData$InputData inputData = new CardSelectionNavigationData$InputData(null, widgetContext2.getCardScope(), null, 99);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new j(textLocalisedClause, new n(new CardSelectionScreen(inputData), new dsh.q(inputConfig, 6)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final vkm.d j(CardsWidgetContext cardsWidgetContext, String str, String str2, dsh.e eVar) {
        boolean zF = Intrinsics.f(str2, "CardsMedium");
        al4.b bVar = this.f244594m;
        k kVar = this.f244590g;
        mt8.d dVar = this.d;
        if (zF) {
            r rVarK = k(cardsWidgetContext.getCardScope());
            r rVarB = dVar.b();
            r rVarX = kVar.a().x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            it4.b bVar2 = (it4.b) this.f244592j;
            akg.n nVarV = ((jte.d) bVar2.f168340a).c(CreditCardApi$Toggles$CreditCardBackendDrivenEntryPoints.f68674c) ? nim.a.v(((om4.b) bVar2.f168341b).e(r2.CARDS_WIDGET), new it4.a(bVar2, 0)) : nim.a.v(al4.j.b(bVar2.f168342c, ll4.c.CARDS_WIDGET), new isd.a(bVar2, 11));
            kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
            r rVarC = rd0.e.c(nVarV, gVar);
            r rVarL = l();
            r rVarC2 = rd0.e.c(((om4.f) bVar).b(), gVar);
            qe7.a aVar = this.f244595n;
            r map = w.r(rVarK, rVarB, rVarX, rVarC, rVarL, rVarC2, rd0.e.c(qe7.a.b(aVar), gVar), rd0.e.c(qe7.a.a(aVar), gVar)).distinctUntilChanged().map(new d(0, new b(this, str, str2, eVar, 2)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            return rd0.e.b(map);
        }
        if (!Intrinsics.f(str2, "CardsSmall")) {
            throw new IllegalArgumentException();
        }
        b93.d cardScope = cardsWidgetContext.getCardScope();
        String strA = eVar != null ? eVar.a("cardId") : null;
        boolean z = Boolean.parseBoolean(eVar != null ? eVar.a("SMALL_WIDGET_IS_DISPOSABLE_KEY") : null);
        r rVarW = nim.a.w(k(cardScope), new ocb.u(z, 19));
        if (strA != null && !z) {
            rVarW = nim.a.w(((x) this.f244588b).v(strA), new qb5.a(26)).flatMap(new l0(28, new pbi.h(rVarW, 1)));
        }
        Intrinsics.h(rVarW);
        r rVarB2 = dVar.b();
        r rVarX2 = kVar.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        r map2 = w.o(rVarW, rVarB2, rVarX2, l(), rd0.e.c(((om4.f) bVar).b(), kotlin.coroutines.g.f186406a)).distinctUntilChanged().map(new l0(29, new b(this, str, str2, eVar, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return rd0.e.b(ue0.e.H(map2, h0.f322473a, new qc0.w(this, str)));
    }

    public final r k(b93.d dVar) {
        r rVarDistinctUntilChanged;
        r rVarFlatMap;
        if (dVar == b93.d.JOINT || dVar == b93.d.RETAIL || dVar == b93.d.ALL) {
            rVarDistinctUntilChanged = rd0.e.c(this.f.c(), kotlin.coroutines.g.f186406a).filter(new l0(22, new qb5.a(28))).map(new l0(23, new qb5.a(29))).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        } else {
            od0.i.Companion.getClass();
            rVarDistinctUntilChanged = w.h(od0.i.f224256b);
        }
        if (dVar == b93.d.YOUTH || dVar == b93.d.RETAIL || dVar == b93.d.ALL) {
            rVarFlatMap = rd0.e.c(bla.b.b(this.f244593l, "YOUTH"), kotlin.coroutines.g.f186406a).map(new l0(24, new c(0))).flatMap(new l0(25, new qa9.r(this, 16)));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        } else {
            rVarFlatMap = w.h(f0.f322471a);
        }
        r map = w.m(rVarDistinctUntilChanged, rVarFlatMap, (dVar == b93.d.CREDIT || dVar == b93.d.RETAIL || dVar == b93.d.ALL) ? rd0.e.c(mo3.a.g(this.k.a(), null, null, 3), kotlin.coroutines.g.f186406a) : w.h(f0.f322471a)).map(new l0(21, new qb5.a(27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFlatMap2 = map.flatMap(new l0(20, new q2g.h(this, dVar, 27)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        return nim.a.w(rVarFlatMap2, new qb5.a(25));
    }

    public final r l() {
        return m70.a.h(n14.k.r(rd0.e.c(this.f244591h.e(), kotlin.coroutines.g.f186406a), f0.f322471a), new t(23), null, new q2(29), 2);
    }
}
