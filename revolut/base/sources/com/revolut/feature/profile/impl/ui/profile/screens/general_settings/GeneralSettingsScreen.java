package com.revolut.feature.profile.impl.ui.profile.screens.general_settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.general_settings.GeneralSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import fma.d0;
import fma.x;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import wna.d;
import wna.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/general_settings/GeneralSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwna/e;", "Ldli/a;", "Lwna/q;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GeneralSettingsScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(GeneralSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final List P;
    public final Object Q;

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

    public GeneralSettingsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: wna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsScreen f298740b;

            {
                this.f298740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GeneralSettingsScreen generalSettingsScreen = this.f298740b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GeneralSettingsScreen.R;
                        qji.b bVarU2 = generalSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.general_settings.di.GeneralSettingsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new x(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = GeneralSettingsScreen.R;
                        return (d) ((x) generalSettingsScreen.M.getValue()).f136234b.get();
                    default:
                        KProperty[] kPropertyArr3 = GeneralSettingsScreen.R;
                        GeneralSettingsScreen generalSettingsScreen2 = this.f298740b;
                        return dli.f.a(generalSettingsScreen2, (d) generalSettingsScreen2.N.getValue(), generalSettingsScreen2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: wna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsScreen f298740b;

            {
                this.f298740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GeneralSettingsScreen generalSettingsScreen = this.f298740b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GeneralSettingsScreen.R;
                        qji.b bVarU2 = generalSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.general_settings.di.GeneralSettingsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new x(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = GeneralSettingsScreen.R;
                        return (d) ((x) generalSettingsScreen.M.getValue()).f136234b.get();
                    default:
                        KProperty[] kPropertyArr3 = GeneralSettingsScreen.R;
                        GeneralSettingsScreen generalSettingsScreen2 = this.f298740b;
                        return dli.f.a(generalSettingsScreen2, (d) generalSettingsScreen2.N.getValue(), generalSettingsScreen2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = u.c(rowDelegate);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wna.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GeneralSettingsScreen f298740b;

            {
                this.f298740b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GeneralSettingsScreen generalSettingsScreen = this.f298740b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GeneralSettingsScreen.R;
                        qji.b bVarU2 = generalSettingsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.general_settings.di.GeneralSettingsScreenInjector");
                        d0 d0Var = (d0) bVarU2;
                        return new x(d0Var.f136085b, d0Var.f136086c);
                    case 1:
                        KProperty[] kPropertyArr2 = GeneralSettingsScreen.R;
                        return (d) ((x) generalSettingsScreen.M.getValue()).f136234b.get();
                    default:
                        KProperty[] kPropertyArr3 = GeneralSettingsScreen.R;
                        GeneralSettingsScreen generalSettingsScreen2 = this.f298740b;
                        return dli.f.a(generalSettingsScreen2, (d) generalSettingsScreen2.N.getValue(), generalSettingsScreen2.P, R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((wna.q) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.profile_general_setting_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new wkg.e(this, null, 6), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new wna.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
