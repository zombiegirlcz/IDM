package com.revolut.feature.settings.preview.displayCurrency;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.DisplayCurrencyPreviewDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewDelegate;
import com.revolut.core.ui_kit.delegates.HomeScreenPreviewLoadingDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.recycler.CenterScrollableLinearLayoutManager;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.e0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tki.h;
import v4d.c;
import vc.s;
import xki.e;
import y4d.b;
import y4d.d;
import y4d.f;
import y4d.g;
import y4d.l;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/settings/preview/displayCurrency/DisplayCurrencyPreviewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/h;", "Ly4d/g;", "Companion", "a", "feature_settings_preview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DisplayCurrencyPreviewController extends ViewController<q> implements h {
    public final int K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final j P;
    public final IconSelectorDelegate Q;
    public final j R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DisplayCurrencyPreviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenSettingPreviewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DisplayCurrencyPreviewController(l interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.K = R$layout.screen_setting_preview;
        this.L = s.t(this, b.f);
        this.M = w.y0(new y1a.a(this, interactor, 4));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: y4d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisplayCurrencyPreviewController f310874b;

            {
                this.f310874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DisplayCurrencyPreviewController displayCurrencyPreviewController = this.f310874b;
                switch (i2) {
                    case 0:
                        DisplayCurrencyPreviewController.Companion companion = DisplayCurrencyPreviewController.INSTANCE;
                        return (f) ((v4d.c) displayCurrencyPreviewController.M.getValue()).f286031c.get();
                    default:
                        DisplayCurrencyPreviewController.Companion companion2 = DisplayCurrencyPreviewController.INSTANCE;
                        return tki.g.b(displayCurrencyPreviewController, (f) displayCurrencyPreviewController.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: y4d.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DisplayCurrencyPreviewController f310874b;

            {
                this.f310874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DisplayCurrencyPreviewController displayCurrencyPreviewController = this.f310874b;
                switch (i22) {
                    case 0:
                        DisplayCurrencyPreviewController.Companion companion = DisplayCurrencyPreviewController.INSTANCE;
                        return (f) ((v4d.c) displayCurrencyPreviewController.M.getValue()).f286031c.get();
                    default:
                        DisplayCurrencyPreviewController.Companion companion2 = DisplayCurrencyPreviewController.INSTANCE;
                        return tki.g.b(displayCurrencyPreviewController, (f) displayCurrencyPreviewController.N.getValue());
                }
            }
        });
        this.P = new j(7, v.k(new HomeScreenPreviewDelegate(new DisplayCurrencyPreviewDelegate()), new HomeScreenPreviewLoadingDelegate(), new FullScreenStateDelegate()), false);
        IconSelectorDelegate iconSelectorDelegate = new IconSelectorDelegate();
        this.Q = iconSelectorDelegate;
        this.R = new j(7, u.c(iconSelectorDelegate), false);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().d.setTitle(uiState.f310878a);
        d3().f174517c.setTextClause(new CompositeClause(v.k(uiState.f310879b, new ImageClause(R$drawable.uikit_icn_16_info_outline, Integer.valueOf(R$attr.uikit_colorGrey50), (Float) null, (Float) null, 28)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(14, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Object) null, "currency_changer_disclaimer_id", false), null, 8));
        this.P.c(uiState.f310880c);
        this.R.c(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().d;
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        basicNavBar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "currency_changer_light_bulb_id", new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        RecyclerView settingPreviewPreviewRecyclerView = d3().e;
        Intrinsics.checkNotNullExpressionValue(settingPreviewPreviewRecyclerView, "settingPreviewPreviewRecyclerView");
        Context context = d3().e.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        y.h(settingPreviewPreviewRecyclerView, this.P, new CenterScrollableLinearLayoutManager(context));
        RecyclerView settingPreviewBottomSectionRecyclerView = d3().f174516b;
        Intrinsics.checkNotNullExpressionValue(settingPreviewBottomSectionRecyclerView, "settingPreviewBottomSectionRecyclerView");
        y.h(settingPreviewBottomSectionRecyclerView, this.R, new LinearLayoutManager(d3().f174516b.getContext()));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59211b), null, new xni.h(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59210a.f57403b), null, new y4d.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174517c.f58608l), null, new y4d.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52489c.d), null, new d(this, null), 3);
    }

    public final e0 d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (e0) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.e) this.O.getValue();
    }
}
