package com.revolut.feature.payment.counterparty.impl.screen.profile;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.c1;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.z0;
import bo9.b;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payment.counterparty.impl.R$id;
import com.revolut.feature.payment.counterparty.impl.R$layout;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import fb6.j;
import ff4.z;
import fo9.c;
import fo9.d;
import fo9.f;
import fo9.g;
import fo9.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payment/counterparty/impl/screen/profile/CounterPartyDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfo9/q;", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CounterPartyDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CounterPartyDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/payment/counterparty/impl/databinding/ScreenCounterPartyDetailsBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CounterPartyDetailsScreen(CounterPartyDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_counter_party_details;
        this.L = s.t(this, c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CounterPartyDetailsScreen f136841b;

            {
                this.f136841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CounterPartyDetailsScreen counterPartyDetailsScreen = this.f136841b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CounterPartyDetailsScreen.V;
                        return (i) ((bo9.b) counterPartyDetailsScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CounterPartyDetailsScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) counterPartyDetailsScreen.Q.getValue(), false);
                    default:
                        KProperty[] kPropertyArr3 = CounterPartyDetailsScreen.V;
                        CounterPartyDetailsScreen counterPartyDetailsScreen2 = this.f136841b;
                        return dli.f.a(counterPartyDetailsScreen2, counterPartyDetailsScreen2.d(), v.k((FixedTabsDelegate) counterPartyDetailsScreen2.N.getValue(), (CellDetailsDelegate) counterPartyDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) counterPartyDetailsScreen2.P.getValue(), (RowDelegate) counterPartyDetailsScreen2.Q.getValue(), (SwipeToActionDelegate) counterPartyDetailsScreen2.R.getValue(), (LargeActionButtonDelegate) counterPartyDetailsScreen2.S.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.counterPartyDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new fnk.a(1));
        this.O = w.y0(new fnk.a(2));
        this.P = w.y0(new fnk.a(3));
        this.Q = w.y0(new fnk.a(4));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: fo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CounterPartyDetailsScreen f136841b;

            {
                this.f136841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CounterPartyDetailsScreen counterPartyDetailsScreen = this.f136841b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CounterPartyDetailsScreen.V;
                        return (i) ((bo9.b) counterPartyDetailsScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CounterPartyDetailsScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) counterPartyDetailsScreen.Q.getValue(), false);
                    default:
                        KProperty[] kPropertyArr3 = CounterPartyDetailsScreen.V;
                        CounterPartyDetailsScreen counterPartyDetailsScreen2 = this.f136841b;
                        return dli.f.a(counterPartyDetailsScreen2, counterPartyDetailsScreen2.d(), v.k((FixedTabsDelegate) counterPartyDetailsScreen2.N.getValue(), (CellDetailsDelegate) counterPartyDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) counterPartyDetailsScreen2.P.getValue(), (RowDelegate) counterPartyDetailsScreen2.Q.getValue(), (SwipeToActionDelegate) counterPartyDetailsScreen2.R.getValue(), (LargeActionButtonDelegate) counterPartyDetailsScreen2.S.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.counterPartyDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = w.y0(new fnk.a(5));
        this.T = w.y0(new j(this, inputData, 17));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: fo9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CounterPartyDetailsScreen f136841b;

            {
                this.f136841b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CounterPartyDetailsScreen counterPartyDetailsScreen = this.f136841b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CounterPartyDetailsScreen.V;
                        return (i) ((bo9.b) counterPartyDetailsScreen.T.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CounterPartyDetailsScreen.V;
                        return new SwipeToActionDelegate((RowDelegate) counterPartyDetailsScreen.Q.getValue(), false);
                    default:
                        KProperty[] kPropertyArr3 = CounterPartyDetailsScreen.V;
                        CounterPartyDetailsScreen counterPartyDetailsScreen2 = this.f136841b;
                        return dli.f.a(counterPartyDetailsScreen2, counterPartyDetailsScreen2.d(), v.k((FixedTabsDelegate) counterPartyDetailsScreen2.N.getValue(), (CellDetailsDelegate) counterPartyDetailsScreen2.O.getValue(), (CellDetailsChevronDelegate) counterPartyDetailsScreen2.P.getValue(), (RowDelegate) counterPartyDetailsScreen2.Q.getValue(), (SwipeToActionDelegate) counterPartyDetailsScreen2.R.getValue(), (LargeActionButtonDelegate) counterPartyDetailsScreen2.S.getValue(), new TextDelegate(), new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.counterPartyDetailsScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        fo9.q uiState = (fo9.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().f323686b;
        Image image = uiState.e;
        Clause clause = uiState.f136854c;
        navBarWithBigTile.setAvatar(image != null ? new AvatarModel.Default(image, null, null, null, null, null, 126) : null, r0.DEFAULT);
        z0 z0Var = new z0(clause, false);
        Clause clause2 = uiState.d;
        c1.S(navBarWithBigTile, u.c(new u0(NavBarWithContainerBackground.TransparentBackground.f57882a, z0Var, clause2 != null ? new au0.o0(clause2) : null, null)), null, null, 6);
        navBarWithBigTile.setActions(uiState.f136853b);
        navBarWithBigTile.setTitle(clause);
        navBarWithBigTile.setToolbarTitle(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f323686b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FixedTabsDelegate) this.N.getValue()).f52339c.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b), null, new fo9.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.Q.getValue()).f53218h, new fo9.a(0))), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.P.getValue()).f51821c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f323686b.f59357t), null, new z(this, null, 21), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f323686b.K()), null, new g(this, null), 3);
    }

    public final zn9.a d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (zn9.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
