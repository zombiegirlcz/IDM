package com.revolut.feature.retail.savings.impl.ui.info.protection;

import aii.q;
import anb.k;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreen;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import iaf.d;
import ipb.b;
import ipb.c;
import ipb.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/info/protection/ProtectionAndSafetyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lipb/h;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProtectionAndSafetyScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ProtectionAndSafetyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ProtectionAndSafetyScreenContract$InputData K;
    public final RowDelegate L;
    public final CellDetailsBarRatingDelegate M;
    public final LargeActionButtonDelegate N;
    public final PlainTextDelegate O;
    public final h P;
    public final Object Q;
    public final boolean R;
    public final int S;
    public final Object T;
    public final Object U;
    public final Object V;

    public ProtectionAndSafetyScreen(ProtectionAndSafetyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new CellDetailsBarRatingDelegate();
        this.N = new LargeActionButtonDelegate();
        this.O = new PlainTextDelegate();
        this.P = s.t(this, b.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ipb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionAndSafetyScreen f167713b;

            {
                this.f167713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProtectionAndSafetyScreen protectionAndSafetyScreen = this.f167713b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProtectionAndSafetyScreen.W;
                        return (j60.a) ((anb.k) protectionAndSafetyScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProtectionAndSafetyScreen.W;
                        return (f) ((anb.k) protectionAndSafetyScreen.U.getValue()).f6656h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProtectionAndSafetyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(protectionAndSafetyScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProtectionAndSafetyScreenContract$InputData protectionAndSafetyScreenContract$InputData = protectionAndSafetyScreen.K;
                        protectionAndSafetyScreenContract$InputData.getClass();
                        return new anb.k(nVar, protectionAndSafetyScreen, protectionAndSafetyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ProtectionAndSafetyScreen.W;
                        ProtectionAndSafetyScreen protectionAndSafetyScreen2 = this.f167713b;
                        return dli.f.a(protectionAndSafetyScreen2, protectionAndSafetyScreen2.R2(), v.k(protectionAndSafetyScreen2.L, protectionAndSafetyScreen2.M, protectionAndSafetyScreen2.O, new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.R = true;
        this.S = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: ipb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionAndSafetyScreen f167713b;

            {
                this.f167713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProtectionAndSafetyScreen protectionAndSafetyScreen = this.f167713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProtectionAndSafetyScreen.W;
                        return (j60.a) ((anb.k) protectionAndSafetyScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProtectionAndSafetyScreen.W;
                        return (f) ((anb.k) protectionAndSafetyScreen.U.getValue()).f6656h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProtectionAndSafetyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(protectionAndSafetyScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProtectionAndSafetyScreenContract$InputData protectionAndSafetyScreenContract$InputData = protectionAndSafetyScreen.K;
                        protectionAndSafetyScreenContract$InputData.getClass();
                        return new anb.k(nVar, protectionAndSafetyScreen, protectionAndSafetyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ProtectionAndSafetyScreen.W;
                        ProtectionAndSafetyScreen protectionAndSafetyScreen2 = this.f167713b;
                        return dli.f.a(protectionAndSafetyScreen2, protectionAndSafetyScreen2.R2(), v.k(protectionAndSafetyScreen2.L, protectionAndSafetyScreen2.M, protectionAndSafetyScreen2.O, new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: ipb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionAndSafetyScreen f167713b;

            {
                this.f167713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProtectionAndSafetyScreen protectionAndSafetyScreen = this.f167713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProtectionAndSafetyScreen.W;
                        return (j60.a) ((anb.k) protectionAndSafetyScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProtectionAndSafetyScreen.W;
                        return (f) ((anb.k) protectionAndSafetyScreen.U.getValue()).f6656h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProtectionAndSafetyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(protectionAndSafetyScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProtectionAndSafetyScreenContract$InputData protectionAndSafetyScreenContract$InputData = protectionAndSafetyScreen.K;
                        protectionAndSafetyScreenContract$InputData.getClass();
                        return new anb.k(nVar, protectionAndSafetyScreen, protectionAndSafetyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ProtectionAndSafetyScreen.W;
                        ProtectionAndSafetyScreen protectionAndSafetyScreen2 = this.f167713b;
                        return dli.f.a(protectionAndSafetyScreen2, protectionAndSafetyScreen2.R2(), v.k(protectionAndSafetyScreen2.L, protectionAndSafetyScreen2.M, protectionAndSafetyScreen2.O, new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: ipb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProtectionAndSafetyScreen f167713b;

            {
                this.f167713b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ProtectionAndSafetyScreen protectionAndSafetyScreen = this.f167713b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProtectionAndSafetyScreen.W;
                        return (j60.a) ((anb.k) protectionAndSafetyScreen.U.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ProtectionAndSafetyScreen.W;
                        return (f) ((anb.k) protectionAndSafetyScreen.U.getValue()).f6656h.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProtectionAndSafetyScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(protectionAndSafetyScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProtectionAndSafetyScreenContract$InputData protectionAndSafetyScreenContract$InputData = protectionAndSafetyScreen.K;
                        protectionAndSafetyScreenContract$InputData.getClass();
                        return new anb.k(nVar, protectionAndSafetyScreen, protectionAndSafetyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = ProtectionAndSafetyScreen.W;
                        ProtectionAndSafetyScreen protectionAndSafetyScreen2 = this.f167713b;
                        return dli.f.a(protectionAndSafetyScreen2, protectionAndSafetyScreen2.R2(), v.k(protectionAndSafetyScreen2.L, protectionAndSafetyScreen2.M, protectionAndSafetyScreen2.O, new CellDetailsDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((ipb.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174538a.setBackground(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vaults_mmf_information_protection_and_safety_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        ((j60.a) this.Q.getValue()).d(u.c(this.N));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, null, 17), 3);
        int i = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new c(2, 4, f.class, R2(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f51820c), null, new hp4.e(i, R2(), f.class, "onCellDetailsClick", "onCellDetailsClick(Lcom/revolut/core/ui_kit/delegates/CellDetailsBarRatingDelegate$Model;)V", 4, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new ipb.d(2, 4, f.class, R2(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new hp4.e(i, R2(), f.class, "onClauseClick", "onClauseClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 20), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
