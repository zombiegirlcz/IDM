package com.revolut.feature.credit.card.impl.ui.additional_cards.management;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.additional_cards.management.AdditionalCardsManagementScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import java.util.List;
import jm4.a0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import p73.d;
import pe2.c;
import pp4.e;
import pp4.m;
import pp4.n;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/management/AdditionalCardsManagementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpp4/m;", "Ldli/a;", "Lpp4/o;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalCardsManagementScreen extends ViewController<m> implements dli.a, no.m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AdditionalCardsManagementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final Object L;
    public final LargeActionButtonDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final int T;

    public AdditionalCardsManagementScreen(AdditionalCardsManagementScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = w.y0(new pni.a(3));
        this.M = new LargeActionButtonDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: pp4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsManagementScreen f238256b;

            {
                this.f238256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalCardsManagementScreen additionalCardsManagementScreen = this.f238256b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsManagementScreen.U;
                        AdditionalCardsManagementScreen additionalCardsManagementScreen2 = this.f238256b;
                        return dli.f.a(additionalCardsManagementScreen2, (n) additionalCardsManagementScreen2.S.getValue(), v.k(new RowLoadingDelegate(), additionalCardsManagementScreen2.N, new ListSubheaderDelegate(), new ActionsDelegate(), (RowDelegate) additionalCardsManagementScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsManagementScreen.U;
                        return (j60.a) ((a0) additionalCardsManagementScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsManagementScreen.U;
                        return (n) ((a0) additionalCardsManagementScreen.R.getValue()).f175956g.get();
                }
            }
        });
        this.P = s.t(this, e.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: pp4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsManagementScreen f238256b;

            {
                this.f238256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalCardsManagementScreen additionalCardsManagementScreen = this.f238256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsManagementScreen.U;
                        AdditionalCardsManagementScreen additionalCardsManagementScreen2 = this.f238256b;
                        return dli.f.a(additionalCardsManagementScreen2, (n) additionalCardsManagementScreen2.S.getValue(), v.k(new RowLoadingDelegate(), additionalCardsManagementScreen2.N, new ListSubheaderDelegate(), new ActionsDelegate(), (RowDelegate) additionalCardsManagementScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsManagementScreen.U;
                        return (j60.a) ((a0) additionalCardsManagementScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsManagementScreen.U;
                        return (n) ((a0) additionalCardsManagementScreen.R.getValue()).f175956g.get();
                }
            }
        });
        this.R = w.y0(new c(this, inputData, 21));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: pp4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalCardsManagementScreen f238256b;

            {
                this.f238256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalCardsManagementScreen additionalCardsManagementScreen = this.f238256b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalCardsManagementScreen.U;
                        AdditionalCardsManagementScreen additionalCardsManagementScreen2 = this.f238256b;
                        return dli.f.a(additionalCardsManagementScreen2, (n) additionalCardsManagementScreen2.S.getValue(), v.k(new RowLoadingDelegate(), additionalCardsManagementScreen2.N, new ListSubheaderDelegate(), new ActionsDelegate(), (RowDelegate) additionalCardsManagementScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalCardsManagementScreen.U;
                        return (j60.a) ((a0) additionalCardsManagementScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AdditionalCardsManagementScreen.U;
                        return (n) ((a0) additionalCardsManagementScreen.R.getValue()).f175956g.get();
                }
            }
        });
        this.T = R$layout.screen_recycler_navbar;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        pp4.o uiState = (pp4.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(uiState.f238265a, null);
        navBarWithToolbar.setMenuItems(u.c(uiState.f238267c));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a0) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ((j60.a) this.Q.getValue()).d(u.c(this.M));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r132 = this.L;
        ViewController.P2(this, new f(vkm.q.J(rd0.e.b(((RowDelegate) r132.getValue()).f53218h), rd0.e.b(((RowDelegate) r132.getValue()).f53220l), rd0.e.b(this.M.d.f121375b), rd0.e.b(d3().f174539b.o.f57403b), new d(rd0.e.b(d3().f174539b.f59410q), 20), rd0.e.b(this.N.f52371h.f121375b)), yx4.b.Companion, 24), new pp4.h(2, (n) this.S.getValue(), n.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
