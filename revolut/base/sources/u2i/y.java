package u2i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_exchange.impl.R$string;
import efm.d0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tx0.g4;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f276701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f276702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t2i.j f276703c;
    public final t d;
    public final h5i.g e;
    public final opi.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f276704g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mre.c f276705h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sh5.d f276706j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q2i.d f276707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r2i.a f276708m;

    public y(r presentationModel, t mapper, t2i.j orderDetailsUiMapper, t cryptoCommodityMapper, h5i.g quoteMapper, gte.a featureToggleInteractor, opi.d expandableDialogView, d cryptoOrderPriceDialogFactory, mre.c termsNavigationFactory, s router, sh5.d cryptoFcaDisclaimerWidget, k bannerManager, q2i.d takeProfitStopLossMapper, r2i.a settlementDelayBannerMapper) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(orderDetailsUiMapper, "orderDetailsUiMapper");
        Intrinsics.checkNotNullParameter(cryptoCommodityMapper, "cryptoCommodityMapper");
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(cryptoOrderPriceDialogFactory, "cryptoOrderPriceDialogFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(bannerManager, "bannerManager");
        Intrinsics.checkNotNullParameter(takeProfitStopLossMapper, "takeProfitStopLossMapper");
        Intrinsics.checkNotNullParameter(settlementDelayBannerMapper, "settlementDelayBannerMapper");
        this.f276701a = presentationModel;
        this.f276702b = mapper;
        this.f276703c = orderDetailsUiMapper;
        this.d = cryptoCommodityMapper;
        this.e = quoteMapper;
        this.f = expandableDialogView;
        this.f276704g = cryptoOrderPriceDialogFactory;
        this.f276705h = termsNavigationFactory;
        this.i = router;
        this.f276706j = cryptoFcaDisclaimerWidget;
        this.k = bannerManager;
        this.f276707l = takeProfitStopLossMapper;
        this.f276708m = settlementDelayBannerMapper;
    }

    public final CellDetailsActionDelegate.Model a(b2i.b bVar, n9l.a price) {
        if (price == null) {
            return null;
        }
        wd6.h orderType = bVar.f11942a;
        wd6.e exchangeMode = bVar.f11943b;
        ((b0) this.f276702b).getClass();
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        return new CellDetailsActionDelegate.Model("CURRENT_PRICE_ID", new TextLocalisedClause(R$string.fx_orders_current_price_explanation_dialog_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), com.revolut.core.ui_kit.models.b.b(price.f213661a, price.f213662b, price.f213663c, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254)), false, false, null, new n0i.a(orderType, exchangeMode, true, null), 0, 0, 32224);
    }

    public final efm.r b(p screen) {
        efm.r bVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        boolean z = screen instanceof n;
        r rVar = this.f276701a;
        efm.r rVarSwitchMap = (z ? rVar.c() : rVar.d()).switchMap(new u21.a(20, new w(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarR2 = rVar.R2();
        efm.r rVarX = rVar.k().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r rVarS0 = rVar.S0();
        efm.r rVarX2 = rVar.V0().x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        boolean z3 = screen instanceof o;
        if (z3) {
            d0 d0VarFirstOrError = rVar.d().firstOrError();
            u21.a aVar = new u21.a(18, new v(screen, this));
            d0VarFirstOrError.getClass();
            bVar = new sfm.b(d0VarFirstOrError, aVar, 2);
        } else {
            bVar = rVar.o2();
        }
        efm.r rVarH = m70.a.h(bVar, new sr8.a(29), null, new tw8.g(23), 2);
        efm.r rVarX3 = ((gi5.d) this.f276706j).c(null).x();
        Intrinsics.checkNotNullExpressionValue(rVarX3, "toObservable(...)");
        efm.r rVarFlatMap = te0.w.r(rVarSwitchMap, rVarR2, rVarX, rVarS0, rVarX2, rVarH, rVarX3, z3 ? rVar.H1() : zi0.c.j(new i(null, null, null))).flatMap(new u21.a(21, new v(this, screen)));
        o oVar = z3 ? (o) screen : null;
        if (oVar != null && oVar.f276685a) {
            rVarFlatMap = rVarFlatMap.startWith((efm.w) rVar.d().take(1L).map(new u21.a(22, new w(this, 1))));
        }
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "run(...)");
        return rVarFlatMap;
    }

    public final pfm.a c(m product) {
        TermsScope termsScope;
        Intrinsics.checkNotNullParameter(product, "product");
        int i = x.f276700c[product.ordinal()];
        if (i == 1) {
            TermsScope.INSTANCE.getClass();
            termsScope = TermsScope.o;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TermsScope.INSTANCE.getClass();
            termsScope = TermsScope.f90371l;
        }
        pfm.a aVar = new pfm.a(((rre.d) this.f276705h).c(termsScope, null), new u21.a(19, new g4(1, this.i, s.class, "dispatchCommand", "dispatchCommand(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 3)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
