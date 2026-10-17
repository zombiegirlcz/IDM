package com.revolut.feature.tab.accounts.impl.total_wealth.category_list;

import ahe.t;
import ahe.u;
import ahe.w0;
import bec.n0;
import com.revolut.core.ui_kit.R$id;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.tab.accounts.impl.total_wealth.category_list.TotalWealthCategoryListContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.api.Toggles;
import dy0.c0;
import dy0.m0;
import i4b.f;
import iyg.b0;
import java.util.concurrent.CopyOnWriteArrayList;
import k3k.k;
import k50.b2;
import khe.p;
import khe.s;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import she.g;
import skm.a2;
import u29.c;
import uge.e;
import vge.s0;
import vge.t0;
import vge.t3;
import vge.z2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements khe.b {

    @NotNull
    public static final p Companion = new p();
    public final e A;
    public final rfe.a B;
    public final g C;
    public boolean D;
    public a2 E;
    public final cli.h F;
    public final com.revolut.kompot.navigable.vc.modal.a G;
    public final TotalWealthCategoryListContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f89594p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f89595q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vfg.p f89596r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z2 f89597s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f89598t;
    public final the.a u;
    public final fhe.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f89599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ghe.a f89600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final oa7.a f89601y;
    public final mie.a z;

    public a(TotalWealthCategoryListContract$InputData inputData, b mapper, t interactor, vfg.p hiddenAccountEntryPointItemProvider, z2 accountsInteractor, l0 popupDisplayer, the.a eventDispatcher, fhe.a discoverItemsMapper, f legalEntityContextProvider, ghe.a spaceContentToAccountProductsPickerMapper, oa7.a hiddenAccountsActionsExtension, mie.a zoomSourceTargetUpdater, e addNewProductDestinationFactory, rfe.a accountVisibilityFilter, g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(hiddenAccountEntryPointItemProvider, "hiddenAccountEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        Intrinsics.checkNotNullParameter(popupDisplayer, "popupDisplayer");
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        Intrinsics.checkNotNullParameter(discoverItemsMapper, "discoverItemsMapper");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(spaceContentToAccountProductsPickerMapper, "spaceContentToAccountProductsPickerMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(zoomSourceTargetUpdater, "zoomSourceTargetUpdater");
        Intrinsics.checkNotNullParameter(addNewProductDestinationFactory, "addNewProductDestinationFactory");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.o = inputData;
        this.f89594p = mapper;
        this.f89595q = interactor;
        this.f89596r = hiddenAccountEntryPointItemProvider;
        this.f89597s = accountsInteractor;
        this.f89598t = popupDisplayer;
        this.u = eventDispatcher;
        this.v = discoverItemsMapper;
        this.f89599w = legalEntityContextProvider;
        this.f89600x = spaceContentToAccountProductsPickerMapper;
        this.f89601y = hiddenAccountsActionsExtension;
        this.z = zoomSourceTargetUpdater;
        this.A = addNewProductDestinationFactory;
        this.B = accountVisibilityFilter;
        this.C = productAccountDestinationResolver;
        TotalWealthCategoryListContract$State totalWealthCategoryListContract$State = new TotalWealthCategoryListContract$State(inputData.f89587a, null, 62);
        khe.f.Companion.getClass();
        this.F = d.e(this, "TotalWealthCategoryListScreenModel", totalWealthCategoryListContract$State, mapper, null, 24);
        this.G = hx7.e.a(this, new k(this, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a r9, com.revolut.core.ui_kit.models.popup.PopupMenuItem r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a.I2(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a, com.revolut.core.ui_kit.models.popup.PopupMenuItem, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        TotalWealthCategoryKey categoryKey = this.o.f89587a;
        w0 w0Var = (w0) this.f89595q;
        w0Var.getClass();
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Flow originFlow = q.q(nim.a.v(w0Var.f5042c.f4984a, new afa.q(w0Var, categoryKey, 6)));
        s0 s0Var = w0Var.f5051r;
        sfe.a dataLoadingMode = sfe.a.FULL;
        t0 t0Var = (t0) s0Var;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Intrinsics.checkNotNullParameter(originFlow, "originFlow");
        Continuation continuation = null;
        l.a1(this, c6d.b.i(xam.a.h(new c(t0Var, dataLoadingMode, continuation, 16), originFlow), new u(w0Var, 3)), null, null, new khe.q(this, continuation, 1), 3);
        ymk.u uVarG = this.f89596r.g();
        kh4.b bVar = new kh4.b(7);
        cli.h hVar = this.F;
        l.a1(this, q.q(new t38.e(uVarG, 24, hVar.B(bVar), new n0(3, 3, null))), null, null, new khe.q(this, continuation, 0), 3);
        l.a1(this, q.Q(q.q(new kh4.f(new b0(hVar.B(new h0() { // from class: khe.y
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((TotalWealthCategoryListContract$State) obj2).f89589b;
            }
        }), 17), this, 2)), new jy6.l(continuation, this, 13)), null, null, new khe.q(this, continuation, 2), 3);
    }

    public final void J2(ProductAccountDescriptor$Value productAccountDescriptor$Value) throws Throwable {
        Continuation continuation = null;
        if (!this.B.a(productAccountDescriptor$Value.getF89727a(), productAccountDescriptor$Value.getF89728b().f89730b)) {
            n2(new khe.u(this, productAccountDescriptor$Value, null), new whi.b(6));
            return;
        }
        ((t3) this.f89597s).t(productAccountDescriptor$Value, tge.b.ACCOUNT_PICKER);
        mie.b bVar = (mie.b) this.z;
        mki.b bVarQ2 = bVar.f205786a.q2();
        c0 c0Var = m0.Companion;
        gte.a featureToggleInteractor = bVar.f205787b;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        ZoomTarget.ViewId target = new ZoomTarget.ViewId(((jte.d) featureToggleInteractor).c(Toggles.AccountDetailsSurfacing.f98561c) ? R$id.uikit_accountSwitcherPagerIndicatorButton : R$id.navbarContentCenter_smallActionButton);
        Intrinsics.checkNotNullParameter(bVarQ2, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        TransitionAnimation transitionAnimation = bVarQ2.f206461b;
        ZoomTransitionAnimation zoomTransitionAnimation = transitionAnimation instanceof ZoomTransitionAnimation ? (ZoomTransitionAnimation) transitionAnimation : null;
        if (zoomTransitionAnimation == null) {
            TransitionAnimation transitionAnimation2 = bVarQ2.f206461b;
            IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Cannot replace zoom source target for non-zoom transition: ", transitionAnimation2 != null ? transitionAnimation2.getClass().getName() : null));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        } else {
            zoomTransitionAnimation.q9(target);
        }
        n2(new s(this, continuation, 1), new whi.b(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.G;
    }

    @Override // yji.l
    public final void P1() {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f89598t.a();
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new s(this, null, 0), new whi.b(6));
        l.b1(this, rd0.e.b(this.f89598t.f256113c), null, new b2(2, this, a.class, "onPopupMenuItemClicked", "onPopupMenuItemClicked(Lcom/revolut/core/ui_kit/models/popup/PopupMenuItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.F;
    }
}
