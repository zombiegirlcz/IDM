package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterActionButtonView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.R$layout;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreen;
import com.revolut.feature.security_hub.impl.ui.views.LocationCircleOverlay;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import vq5.x;
import vrl.i0;
import vvc.e;
import vvc.f;
import vvc.l;
import vvc.r;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvvc/l;", "Lcli/w;", "Lvvc/r;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SetTrustedLocationScreen extends ViewController<l> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(SetTrustedLocationScreen.class, "binding", "getBinding()Lcom/revolut/feature/security_hub/impl/databinding/SetTrustedLocationScreenBinding;", 0))};
    public final h K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public SetTrustedLocationScreen(SetTrustedLocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, vvc.b.f);
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: vvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetTrustedLocationScreen f292503b;

            {
                this.f292503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SetTrustedLocationScreen setTrustedLocationScreen = this.f292503b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SetTrustedLocationScreen.P;
                        return (q) ((vtc.w) setTrustedLocationScreen.M.getValue()).f292091c.get();
                    default:
                        KProperty[] kPropertyArr2 = SetTrustedLocationScreen.P;
                        return n14.e.a(setTrustedLocationScreen, setTrustedLocationScreen.d());
                }
            }
        });
        this.M = te0.w.y0(new vqd.b(this, inputData, 15));
        this.N = R$layout.set_trusted_location_screen;
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: vvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetTrustedLocationScreen f292503b;

            {
                this.f292503b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SetTrustedLocationScreen setTrustedLocationScreen = this.f292503b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SetTrustedLocationScreen.P;
                        return (q) ((vtc.w) setTrustedLocationScreen.M.getValue()).f292091c.get();
                    default:
                        KProperty[] kPropertyArr2 = SetTrustedLocationScreen.P;
                        return n14.e.a(setTrustedLocationScreen, setTrustedLocationScreen.d());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbarG3 = g3();
        TextLocalisedClause textLocalisedClause = uiState.f292519a;
        boolean z = uiState.f292521c;
        navBarWithToolbarG3.setToolbarTitle(textLocalisedClause);
        if (uiState.e) {
            f fVar = uiState.f292520b;
            if (fVar instanceof vvc.d) {
                MapView mapViewF3 = f3();
                GmsLatLngBounds gmsLatLngBounds = ((vvc.d) fVar).f292504a;
                int i = MapView.f58767w;
                mapViewF3.i0(gmsLatLngBounds, true);
            } else if (fVar instanceof e) {
                f3().g0(((e) fVar).f292506a, 17.0f, true);
            }
            d dVar = (d) d();
            dVar.H2(dVar.f85693w, new i0(25));
        }
        FooterActionButtonView setTrustedLocationControllerFooter = d3().f283095c;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerFooter, "setTrustedLocationControllerFooter");
        setTrustedLocationControllerFooter.setButtonText(uiState.f292519a);
        setTrustedLocationControllerFooter.setDescription(uiState.d);
        setTrustedLocationControllerFooter.setButtonEnabled(z);
        LocationCircleOverlay setTrustedLocationControllerLocationOverlay = d3().d;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerLocationOverlay, "setTrustedLocationControllerLocationOverlay");
        setTrustedLocationControllerLocationOverlay.setState(z ? mwc.a.ACCEPTABLE : mwc.a.WARNING);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (vtc.w) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarG3 = g3();
        navBarWithToolbarG3.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbarG3.f59417v0 = false;
        navBarWithToolbarG3.setSearchButtonActive(true);
        navBarWithToolbarG3.j0(true);
        navBarWithToolbarG3.setHints(u.c(new TextLocalisedClause(R$string.security_hub_street_mode_set_trusted_location_search_placeholder, null, null, 14)));
        navBarWithToolbarG3.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "SET_TRUSTED_LOCATION_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        FooterActionButtonView setTrustedLocationControllerFooter = d3().f283095c;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerFooter, "setTrustedLocationControllerFooter");
        setTrustedLocationControllerFooter.setBackgroundColorAttr(R$attr.uikit_colorTransparent);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(g3().f59410q), new vvc.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(f3().k), new vrl.d(this, null, 9), 3);
        FloatingActionButton setTrustedLocationControllerFab = d3().f283094b;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerFab, "setTrustedLocationControllerFab");
        edl.a.s(setTrustedLocationControllerFab, new x(this, 21));
        ViewController.P2(this, rd0.e.b(g3().v0()), new vvc.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(g3().o.f57403b), new vvc.c(this, null, 2), 3);
        FooterActionButtonView setTrustedLocationControllerFooter = d3().f283095c;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerFooter, "setTrustedLocationControllerFooter");
        ViewController.P2(this, rd0.e.b(setTrustedLocationControllerFooter.f0()), new vvc.c(this, null, 3), 3);
    }

    public final utc.h d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (utc.h) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vvc.q d() {
        return (vvc.q) this.L.getValue();
    }

    public final MapView f3() {
        MapView setTrustedLocationControllerMap = d3().e;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerMap, "setTrustedLocationControllerMap");
        return setTrustedLocationControllerMap;
    }

    public final NavBarWithToolbar g3() {
        NavBarWithToolbar setTrustedLocationControllerNavbarWithToolbar = d3().f;
        Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerNavbarWithToolbar, "setTrustedLocationControllerNavbarWithToolbar");
        return setTrustedLocationControllerNavbarWithToolbar;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
