package com.revolut.feature.spending_analytics.impl.ui.rev10.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.settings.SettingsController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import crd.b;
import crd.c;
import crd.f;
import crd.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.h1;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/settings/SettingsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lcrd/c;", "<init>", "()V", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SettingsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object S;
    public final int K = R$layout.screen_recycler_navbar;
    public final int L = R$style.UiKitTheme_Transparent;
    public final h M = s.t(this, a.f);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final AccountCellItemDelegate Q = new AccountCellItemDelegate();
    public final RowDelegate R = new RowDelegate(null, null, 7);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public SettingsController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: crd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsController f108353b;

            {
                this.f108353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SettingsController settingsController = this.f108353b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsController.T;
                        h1 h1Var = (h1) settingsController.O.getValue();
                        switch (h1Var.f238426a) {
                            case 0:
                                return (b) h1Var.f238430h.get();
                            default:
                                return (b) h1Var.f238430h.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsController.T;
                        qji.b bVarU2 = settingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.settings.di.SettingsControllerInjector");
                        return (h1) ((drd.a) ((drd.b) bVarU2).b().mo3808a(settingsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsController.T;
                        SettingsController settingsController2 = this.f108353b;
                        return dli.f.a(settingsController2, settingsController2.d(), v.k(new RowLoadingDelegate(), settingsController2.R, settingsController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: crd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsController f108353b;

            {
                this.f108353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SettingsController settingsController = this.f108353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsController.T;
                        h1 h1Var = (h1) settingsController.O.getValue();
                        switch (h1Var.f238426a) {
                            case 0:
                                return (b) h1Var.f238430h.get();
                            default:
                                return (b) h1Var.f238430h.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsController.T;
                        qji.b bVarU2 = settingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.settings.di.SettingsControllerInjector");
                        return (h1) ((drd.a) ((drd.b) bVarU2).b().mo3808a(settingsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsController.T;
                        SettingsController settingsController2 = this.f108353b;
                        return dli.f.a(settingsController2, settingsController2.d(), v.k(new RowLoadingDelegate(), settingsController2.R, settingsController2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: crd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsController f108353b;

            {
                this.f108353b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SettingsController settingsController = this.f108353b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsController.T;
                        h1 h1Var = (h1) settingsController.O.getValue();
                        switch (h1Var.f238426a) {
                            case 0:
                                return (b) h1Var.f238430h.get();
                            default:
                                return (b) h1Var.f238430h.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsController.T;
                        qji.b bVarU2 = settingsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.settings.di.SettingsControllerInjector");
                        return (h1) ((drd.a) ((drd.b) bVarU2).b().mo3808a(settingsController)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsController.T;
                        SettingsController settingsController2 = this.f108353b;
                        return dli.f.a(settingsController2, settingsController2.d(), v.k(new RowLoadingDelegate(), settingsController2.R, settingsController2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        h1 h1Var = (h1) this.O.getValue();
        switch (h1Var.f238426a) {
            case 0:
                aVar = (j60.a) h1Var.e.get();
                break;
            default:
                aVar = (j60.a) h1Var.e.get();
                break;
        }
        aVar.d(u.c(this.Q));
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.analytics_settings_screen_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.analytics_settings_screen_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.analytics_settings_screen_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new co7.c(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53220l), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51551c.f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new cbf.c(rd0.e.b(this.P.f52371h.f121375b), 16), null, new crd.h(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final b d() {
        return (b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
