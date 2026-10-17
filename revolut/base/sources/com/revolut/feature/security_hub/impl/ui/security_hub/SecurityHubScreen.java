package com.revolut.feature.security_hub.impl.ui.security_hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.s0;
import au0.u0;
import aw0.o9;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_core.displayers.video.models.VideoShutter;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ihm.f;
import ip0.yc0;
import java.util.List;
import jkc.g;
import jvc.a0;
import jvc.b0;
import jvc.d;
import jvc.e;
import jvc.z;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tw0.x;
import vc.s;
import vtc.v;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/security_hub/SecurityHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljvc/z;", "Ldli/a;", "Ljvc/b0;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityHubScreen extends ViewController<z> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SecurityHubScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/ScreenSecurityHubBinding;", 0))};
    public final h K;
    public final int L;
    public final f M;
    public final RowDelegate N;
    public final RowDelegate O;
    public final ActionWidgetDelegate P;
    public final fmf.o0 Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SecurityHubScreen(SecurityHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, e.f);
        this.L = R$layout.screen_security_hub;
        f fVarD = v0.a.d("create(...)");
        this.M = fVarD;
        this.N = new RowDelegate(null, null, 7);
        this.O = new RowDelegate(null, null, 7);
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.P = actionWidgetDelegate;
        this.Q = new fmf.o0(fVarD, new ScrollerDelegate(u.c(actionWidgetDelegate), false), new d(this, 0));
        this.R = w.y0(new jnf.a(this, inputData, 10));
        this.S = w.y0(new d(this, 1));
        this.T = w.y0(new d(this, 2));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f283086b.setActions(uiState.f178811b);
        if (uiState.f178812c) {
            ScreenContentRecyclerView securityHubRecyclerView = d3().f283087c;
            Intrinsics.checkNotNullExpressionValue(securityHubRecyclerView, "securityHubRecyclerView");
            x.d(securityHubRecyclerView);
            c cVar = (c) R2();
            cVar.H2(cVar.K, new jt2.d(17));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f283086b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_HORIZONTALLY);
        c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.VideoBackground(new UrlVideo("https://assets.revolut.com/mobile/retail/security_hub/light.mp4", "https://assets.revolut.com/mobile/retail/security_hub/dark.mp4", false, oz0.b.CENTER_CROP, false, (oz0.c) null, 116), (Image) null, (VideoShutter) null, (s8) null, 30), null, null, null)), null, null, 6);
        int i = R$drawable.uikit_icn_24_secure_seal;
        Float fValueOf = Float.valueOf(32.0f);
        navBarWithBigTile.setTitle(yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(R$string.security_hub_title, null, null, 14))));
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
        ((j60.a) ((v) this.R.getValue()).f.get()).d(zhm.v.k(this.O, new ListSubheaderDelegate()));
        xv0.w wVar = new xv0.w(new yc0(1, this.M, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 18), null);
        ScreenContentRecyclerView securityHubRecyclerView = d3().f283087c;
        Intrinsics.checkNotNullExpressionValue(securityHubRecyclerView, "securityHubRecyclerView");
        wVar.b(securityHubRecyclerView);
        pd.b.p(view, new TextLocalisedClause(R$string.security_hub_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        utc.e eVarD3 = d3();
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(eVarD3.f283086b.K()), new jvc.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(eVarD3.f283086b.f59357t), new g(this, continuation, 20), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, vkm.q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.k)), new jvc.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new jvc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51589c.f121375b), new jv.o(this, continuation, 1), 3);
    }

    public final utc.e d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final a0 R2() {
        return (a0) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
