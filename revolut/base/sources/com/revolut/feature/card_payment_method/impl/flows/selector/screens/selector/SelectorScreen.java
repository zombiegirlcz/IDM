package com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector;

import android.os.Handler;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_payment_method.api.declaration.SelectPaymentMethodInputData;
import com.revolut.feature.card_payment_method.impl.R$id;
import com.revolut.feature.card_payment_method.impl.R$layout;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import h93.f0;
import h93.l0;
import ihm.f;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pvk.i;
import q1l.e;
import q2e.i0;
import q2j.k;
import q43.a0;
import q43.c0;
import q43.e0;
import q43.l;
import q43.q;
import s43.m;
import t60.g;
import te0.w;
import vc.s;
import yp0.y;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lq43/e0;", "Lcom/revolut/feature/card_payment_method/api/declaration/SelectPaymentMethodInputData;", "Lb43/b;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectorScreen extends BaseRecyclerViewScreen<e0, SelectPaymentMethodInputData, b43.b> {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f65290n0 = {o0.f186429a.j(new h0(SelectorScreen.class, "binding", "getBinding()Lcom/revolut/feature/card_payment_method/impl/databinding/ScreenCardPaymentMethodSelectorBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65291a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final androidx.camera.viewfinder.a f65292b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final h f65293d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65294e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f65295h0;
    public final Object i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f65296k0;
    public final db.a l0;
    public boolean m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorScreen(SelectPaymentMethodInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_card_payment_method_selector;
        this.V = R$id.cardPaymentMethodSelector_recyclerView;
        this.W = true;
        this.X = w.y0(new pt4.d(this, inputData, 20));
        final int i = 1;
        this.Y = w.y0(new Function0(this) { // from class: q43.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectorScreen f242005b;

            {
                this.f242005b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectorScreen selectorScreen = this.f242005b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                        return (j60.a) selectorScreen.S2().i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectorScreen.f65290n0;
                        return (a0) selectorScreen.S2().B.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectorScreen.f65290n0;
                        return (t60.b) selectorScreen.S2().e.get();
                }
            }
        });
        final int i2 = 2;
        this.Z = w.y0(new Function0(this) { // from class: q43.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectorScreen f242005b;

            {
                this.f242005b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectorScreen selectorScreen = this.f242005b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                        return (j60.a) selectorScreen.S2().i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectorScreen.f65290n0;
                        return (a0) selectorScreen.S2().B.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectorScreen.f65290n0;
                        return (t60.b) selectorScreen.S2().e.get();
                }
            }
        });
        final int i3 = 0;
        this.f65291a0 = w.y0(new Function0(this) { // from class: q43.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectorScreen f242005b;

            {
                this.f242005b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectorScreen selectorScreen = this.f242005b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                        return (j60.a) selectorScreen.S2().i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SelectorScreen.f65290n0;
                        return (a0) selectorScreen.S2().B.get();
                    default:
                        KProperty[] kPropertyArr3 = SelectorScreen.f65290n0;
                        return (t60.b) selectorScreen.S2().e.get();
                }
            }
        });
        q03.h block = new q03.h(this, 16);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f65292b0 = new androidx.camera.viewfinder.a(block, 28);
        this.c0 = w.y0(new e(17));
        this.f65293d0 = s.t(this, q43.d.f);
        this.f65294e0 = w.y0(new e(18));
        this.f0 = w.y0(new e(19));
        this.g0 = w.y0(new e(20));
        this.f65295h0 = w.y0(new e(21));
        this.i0 = w.y0(new e(22));
        this.j0 = w.y0(new e(23));
        this.f65296k0 = w.y0(new e(24));
        this.l0 = new db.a(this, 4);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f1189c;
        s43.a aVar = (s43.a) S2().C.get();
        SelectPaymentMethodInputData selectPaymentMethodInputData = (SelectPaymentMethodInputData) this.G;
        SelectPaymentMethodInputData.UseCase useCase = selectPaymentMethodInputData.f65244a;
        SelectPaymentMethodInputData.UseCase useCase2 = selectPaymentMethodInputData.f65244a;
        ((m) aVar).getClass();
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        navBarWithToolbar.setNavigationButtonImage(useCase instanceof SelectPaymentMethodInputData.UseCase.OrderNewCard ? new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ((m) ((s43.a) S2().C.get())).getClass();
        Continuation continuation = null;
        int i = 14;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_payment_method_spend_from_title, null, null, 14));
        ((m) ((s43.a) S2().C.get())).getClass();
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_payment_method_spend_from_title, null, null, 14), null);
        s43.a aVar2 = (s43.a) S2().C.get();
        AccountId accountId = useCase2.getF65249b();
        f0 f0VarA = d43.a.a(useCase2);
        l0 l0Var = f0VarA != null ? f0VarA.G : null;
        ((m) aVar2).getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i2 = 10;
        if (l0Var == l0.BRAZIL_LOCAL) {
            xi0.b.Companion.getClass();
            textLocalisedClause = m.b(xi0.b.D);
        } else if (l0Var == l0.BRAZIL_GLOBAL) {
            textLocalisedClause = m.a();
        } else if (l0Var == l0.INDIA_LOCAL) {
            xi0.b.Companion.getClass();
            textLocalisedClause = m.b(xi0.b.E);
        } else if (l0Var == l0.INDIA_GLOBAL || l0Var == l0.MEXICO_MCY) {
            textLocalisedClause = m.a();
        } else if (accountId instanceof AccountId.Personal) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_payment_method_spend_from_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new UnsupportedOperationException("AccountId should be Personal or Joint, but was " + accountId);
            }
            textLocalisedClause = new TextLocalisedClause(R$string.card_payment_method_spend_from_description_cash_only, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        navBarWithToolbar.setDescriptionText(textLocalisedClause);
        navBarWithToolbar.setDescriptionVisible(true);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new c(this, null), 3);
        int i3 = 0;
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(navBarWithToolbar.o.f57403b), 17), null, new q43.m(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b((f) navBarWithToolbar.f59406n.f258290b), null, new l(this, continuation, 1), 3);
        int i5 = 4;
        int i6 = 2;
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((j60.a) this.f65291a0.getValue()).C()), 18), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 27), 3);
        ?? r110 = this.f65294e0;
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((RowDelegate) r110.getValue()).f53218h), 11), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((NotificationCentreItemDelegate) this.f65296k0.getValue()).f52865c), 12), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((RowDelegate) r110.getValue()).f53226s), 13), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((ListSubheaderDelegate) this.f0.getValue()).d), i), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.g0.getValue()).f52371h.f121375b), null, new a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((LargeActionButtonDelegate) this.f65295h0.getValue()).d.f121375b), 15), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((TextDelegate) this.i0.getValue()).d), 16), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(((PermissionDelegate) this.j0.getValue()).d.f121375b), i2), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(h3().e.f58882b), 19), null, new l(this, continuation, 3), 3);
        r rVarR = ((g) ((t60.b) this.Z.getValue())).R();
        q qVar = q.f;
        r rVarThrottleLast = rVarR.filter(new k(3)).throttleLast(200L, TimeUnit.MILLISECONDS);
        q43.r rVar = q43.r.f;
        r map = rVarThrottleLast.map(new k(4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new pp4.h(i6, T2(), a0.class, "onEvent", "onEvent(Lcom/revolut/feature/card_payment_method/impl/flows/selector/screens/selector/SelectorScreenContract$Event;)V", i5, 28), 3);
        FooterActionButtonView footerActionButtonView = h3().f1188b;
        footerActionButtonView.addOnLayoutChangeListener(this.f65292b0);
        footerActionButtonView.setButtonText(new TextLocalisedClause(R$string.card_payment_method_spend_from_continue, null, null, 14));
        footerActionButtonView.setLoadingButtonTag("TAG_CONTINUE_BUTTON");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(footerActionButtonView.f0()), null, new b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(footerActionButtonView.i), null, new l(this, continuation, i3), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) this.f65291a0.getValue()).d(d0.E0(((fd6.a) S2().f21051l.get()).e, v.k((LargeActionButtonDelegate) this.f65295h0.getValue(), new ListSubheaderDelegate(), (TextDelegate) this.i0.getValue(), (PermissionDelegate) this.j0.getValue(), (RowDelegate) this.f65294e0.getValue(), (NotificationCentreItemDelegate) this.f65296k0.getValue(), new PlainTextDelegate())));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        super.Y2();
        h3().f1188b.removeOnLayoutChangeListener(this.f65292b0);
        i3().post(new q43.c(this, 1));
        i3().removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getI0() {
        return v.k((RowDelegate) this.f65294e0.getValue(), (ListSubheaderDelegate) this.f0.getValue(), (FullScreenStateDelegate) this.g0.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e0 uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        boolean z = uiState instanceof c0;
        if (z) {
            i3().post(new q43.c(this, 0));
            c0 c0Var = (c0) uiState;
            h3().e.setItems(c0Var.f, c0Var.f242011g);
        } else {
            if (!(uiState instanceof q43.d0)) {
                throw new NoWhenBranchMatchedException();
            }
            i3().post(new q43.c(this, 1));
        }
        h3().f1188b.setDescription(uiState.d());
        boolean zF = uiState.f();
        if (!this.m0 && zF) {
            this.m0 = true;
            ScreenContentRecyclerView cardPaymentMethodSelectorRecyclerView = h3().d;
            Intrinsics.checkNotNullExpressionValue(cardPaymentMethodSelectorRecyclerView, "cardPaymentMethodSelectorRecyclerView");
            y.g(cardPaymentMethodSelectorRecyclerView, m2());
            NavBarWithToolbar navBarWithToolbar = h3().f1189c;
            Continuation continuation = null;
            navBarWithToolbar.setHint(new TextLocalisedClause(R$string.card_payment_method_search, null, null, 14));
            SearchView searchView = navBarWithToolbar.f59409p;
            navBarWithToolbar.setSearchButtonActive(true);
            navBarWithToolbar.f59417v0 = false;
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.v0()), null, new i0(navBarWithToolbar, this, continuation, 4), 3);
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(searchView.f57336l), null, new au.c0(navBarWithToolbar, this, z, continuation, 22), 3);
            f fVar = searchView.f57337m;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.y(fVar, 300L)), null, new l(this, continuation, 2), 3);
        }
        boolean zE = uiState.e();
        NavBarWithToolbar navBarWithToolbar2 = h3().f1189c;
        ((m) ((s43.a) S2().C.get())).getClass();
        navBarWithToolbar2.setMenuItems(zE ? u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "NAVBAR_CRYPTO_INFO_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)) : zhm.f0.f322471a);
        h3().f1189c.setHeaderDisclaimerSticky(uiState.a());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final a43.a h3() {
        ViewBinding value = this.f65293d0.getValue(this, f65290n0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a43.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Handler i3() {
        return (Handler) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: j3, reason: merged with bridge method [inline-methods] */
    public final c43.m S2() {
        return (c43.m) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: k3, reason: merged with bridge method [inline-methods] */
    public final a0 T2() {
        return (a0) this.Y.getValue();
    }

    public final void l3() {
        h3().f.a(h3().f1189c.getExpandRatio() == BitmapDescriptorFactory.HUE_RED && h3().e.getVisibility() == 0);
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
