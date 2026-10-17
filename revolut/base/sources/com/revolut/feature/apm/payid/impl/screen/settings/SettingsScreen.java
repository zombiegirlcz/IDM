package com.revolut.feature.apm.payid.impl.screen.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import bb2.g;
import bb2.l;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ea2.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/settings/SettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbb2/l;", "Ldli/a;", "Lbb2/s;", "<init>", "()V", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SettingsScreen extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final RowLoadingDelegate N = new RowLoadingDelegate();
    public final ListSubheaderDelegate O = new ListSubheaderDelegate();
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public SettingsScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bb2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsScreen f14144b;

            {
                this.f14144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SettingsScreen settingsScreen = this.f14144b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsScreen.T;
                        ea2.r rVar = (ea2.r) settingsScreen.R.getValue();
                        switch (rVar.f124111a) {
                            case 0:
                                return (m) rVar.f.get();
                            default:
                                return (m) rVar.f.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsScreen.T;
                        qji.b bVarU2 = settingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.di.SettingsScreenInjector");
                        return (ea2.r) ((ea2.q) ((gb2.a) bVarU2).j().mo3808a(settingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsScreen.T;
                        SettingsScreen settingsScreen2 = this.f14144b;
                        return dli.f.a(settingsScreen2, settingsScreen2.R2(), zhm.v.k(settingsScreen2.N, settingsScreen2.M, settingsScreen2.O, settingsScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bb2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsScreen f14144b;

            {
                this.f14144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SettingsScreen settingsScreen = this.f14144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsScreen.T;
                        ea2.r rVar = (ea2.r) settingsScreen.R.getValue();
                        switch (rVar.f124111a) {
                            case 0:
                                return (m) rVar.f.get();
                            default:
                                return (m) rVar.f.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsScreen.T;
                        qji.b bVarU2 = settingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.di.SettingsScreenInjector");
                        return (ea2.r) ((ea2.q) ((gb2.a) bVarU2).j().mo3808a(settingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsScreen.T;
                        SettingsScreen settingsScreen2 = this.f14144b;
                        return dli.f.a(settingsScreen2, settingsScreen2.R2(), zhm.v.k(settingsScreen2.N, settingsScreen2.M, settingsScreen2.O, settingsScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bb2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsScreen f14144b;

            {
                this.f14144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SettingsScreen settingsScreen = this.f14144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SettingsScreen.T;
                        ea2.r rVar = (ea2.r) settingsScreen.R.getValue();
                        switch (rVar.f124111a) {
                            case 0:
                                return (m) rVar.f.get();
                            default:
                                return (m) rVar.f.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = SettingsScreen.T;
                        qji.b bVarU2 = settingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.settings.di.SettingsScreenInjector");
                        return (ea2.r) ((ea2.q) ((gb2.a) bVarU2).j().mo3808a(settingsScreen)).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = SettingsScreen.T;
                        SettingsScreen settingsScreen2 = this.f14144b;
                        return dli.f.a(settingsScreen2, settingsScreen2.R2(), zhm.v.k(settingsScreen2.N, settingsScreen2.M, settingsScreen2.O, settingsScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((bb2.s) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payid_settings_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new bb2.h(this, null), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value2).f174539b.f59410q), null, new i(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new bb2.i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final bb2.m R2() {
        return (bb2.m) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
