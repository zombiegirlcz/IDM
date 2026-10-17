package com.revolut.oauth.impl.ui.consent.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.r0;
import au0.s0;
import au0.z0;
import aw0.i;
import ck7.j;
import cli.o;
import cli.q;
import cni.d;
import cni.l;
import cni.n;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreen;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreenContract$InputData;
import com.revolut.oauth.impl.ui.consent.screen.a;
import java.util.List;
import jii.c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.p2;
import vc.s;
import xki.e;
import xmi.c;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/oauth/impl/ui/consent/screen/ConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcni/l;", "Ldli/a;", "Lcni/n;", "Lno/m;", "revolut_oauth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConsentScreen extends ViewController<l> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ConsentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileActionfooterBinding;", 0))};
    public final ConsentScreenContract$InputData K;
    public final AnalyticsProduct.Shared L;
    public final h M;
    public final RowDelegate N;
    public final RowLoadingDelegate O;
    public final TextDelegate P;
    public final FullScreenStateDelegate Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ConsentScreen(ConsentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = dni.a.f116348a;
        this.M = s.t(this, cni.b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new RowLoadingDelegate();
        this.P = new TextDelegate();
        this.Q = new FullScreenStateDelegate();
        this.R = R$layout.screen_recycler_navbarwithbigtile_actionfooter;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f25433b;

            {
                this.f25433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConsentScreen consentScreen = this.f25433b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.V;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.oauth.impl.ui.consent.screen.di.ConsentScreenInjector");
                        xmi.b bVar = (xmi.b) ((bni.a) bVarU2);
                        xmi.e eVar = bVar.f307266b;
                        xmi.b bVar2 = bVar.f307267c;
                        ConsentScreenContract$InputData consentScreenContract$InputData = consentScreen.K;
                        consentScreenContract$InputData.getClass();
                        return new xmi.c(eVar, bVar2, consentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentScreen.V;
                        return (m) ((xmi.c) consentScreen.S.getValue()).f307269b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConsentScreen.V;
                        ConsentScreen consentScreen2 = this.f25433b;
                        return dli.f.a(consentScreen2, consentScreen2.d(), v.k(consentScreen2.N, consentScreen2.O, consentScreen2.P, consentScreen2.Q), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f25433b;

            {
                this.f25433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConsentScreen consentScreen = this.f25433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.V;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.oauth.impl.ui.consent.screen.di.ConsentScreenInjector");
                        xmi.b bVar = (xmi.b) ((bni.a) bVarU2);
                        xmi.e eVar = bVar.f307266b;
                        xmi.b bVar2 = bVar.f307267c;
                        ConsentScreenContract$InputData consentScreenContract$InputData = consentScreen.K;
                        consentScreenContract$InputData.getClass();
                        return new xmi.c(eVar, bVar2, consentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentScreen.V;
                        return (m) ((xmi.c) consentScreen.S.getValue()).f307269b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConsentScreen.V;
                        ConsentScreen consentScreen2 = this.f25433b;
                        return dli.f.a(consentScreen2, consentScreen2.d(), v.k(consentScreen2.N, consentScreen2.O, consentScreen2.P, consentScreen2.Q), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: cni.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConsentScreen f25433b;

            {
                this.f25433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ConsentScreen consentScreen = this.f25433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ConsentScreen.V;
                        qji.b bVarU2 = consentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.oauth.impl.ui.consent.screen.di.ConsentScreenInjector");
                        xmi.b bVar = (xmi.b) ((bni.a) bVarU2);
                        xmi.e eVar = bVar.f307266b;
                        xmi.b bVar2 = bVar.f307267c;
                        ConsentScreenContract$InputData consentScreenContract$InputData = consentScreen.K;
                        consentScreenContract$InputData.getClass();
                        return new xmi.c(eVar, bVar2, consentScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ConsentScreen.V;
                        return (m) ((xmi.c) consentScreen.S.getValue()).f307269b.get();
                    default:
                        KProperty[] kPropertyArr3 = ConsentScreen.V;
                        ConsentScreen consentScreen2 = this.f25433b;
                        return dli.f.a(consentScreen2, consentScreen2.d(), v.k(consentScreen2.N, consentScreen2.O, consentScreen2.P, consentScreen2.Q), R$id.screenRecyclerNavBarWithBigTileActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        a aVar = uiState.f25443a;
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.M;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((c0) value).f174505c;
        Intrinsics.checkNotNullExpressionValue(navBarWithBigTile, "screenRecyclerNavBarWith…onFooterNavBarWithBigTile");
        if (aVar.equals(a.b.f98494a)) {
            navBarWithBigTile.setLoadingState(true);
        } else if (aVar instanceof cni.h) {
            navBarWithBigTile.setLoadingState(false);
            cni.h hVar2 = (cni.h) aVar;
            TextLocalisedClause textLocalisedClause = hVar2.f25438a;
            navBarWithBigTile.setTitle(new z0(textLocalisedClause, false));
            navBarWithBigTile.setToolbarTitle(textLocalisedClause);
            navBarWithBigTile.setDuoAvatar(hVar2.f25439b, r0.DEFAULT);
        } else {
            if (!aVar.equals(a.C0599a.f98493a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLoadingState(false);
        }
        i iVar = uiState.f25445c;
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ActionFooterView actionFooterView = ((c0) value2).f174504b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerNavBarWith…ionFooterActionFooterView");
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ViewBinding value3 = hVar.getValue(this, kPropertyArr[0]);
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ActionFooterView actionFooterView2 = ((c0) value3).f174504b;
            Intrinsics.checkNotNullExpressionValue(actionFooterView2, "screenRecyclerNavBarWith…ionFooterActionFooterView");
            actionFooterView2.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((c0) value).f174505c;
        Intrinsics.checkNotNullExpressionValue(navBarWithBigTile, "screenRecyclerNavBarWith…onFooterNavBarWithBigTile");
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        navBarWithBigTile.setHeightMode(p2.f275222a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = V;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.M;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithBigTile navBarWithBigTile = ((c0) value).f174505c;
        Intrinsics.checkNotNullExpressionValue(navBarWithBigTile, "screenRecyclerNavBarWith…onFooterNavBarWithBigTile");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithBigTile.f59357t), new cni.c(this, continuation, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ActionFooterView actionFooterView = ((c0) value2).f174504b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView, "screenRecyclerNavBarWith…ionFooterActionFooterView");
        ViewController.P2(this, rd0.e.b(actionFooterView.f), new cni.c(this, continuation, 1), 3);
        ViewBinding value3 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ActionFooterView actionFooterView2 = ((c0) value3).f174504b;
        Intrinsics.checkNotNullExpressionValue(actionFooterView2, "screenRecyclerNavBarWith…ionFooterActionFooterView");
        ViewController.P2(this, rd0.e.b(actionFooterView2.f58955g), new cni.c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53225r), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new j(this, continuation, 6), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new cni.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final cni.m d() {
        return (cni.m) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
