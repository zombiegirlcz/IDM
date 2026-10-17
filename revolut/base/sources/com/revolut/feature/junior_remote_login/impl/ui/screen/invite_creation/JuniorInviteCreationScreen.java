package com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import cm8.b;
import cm8.c;
import cm8.g;
import cm8.i;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_remote_login.impl.R$string;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.JuniorInviteCreationScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import il8.j;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_remote_login/impl/ui/screen/invite_creation/JuniorInviteCreationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcm8/g;", "Ldli/a;", "Lcm8/i;", "feature_junior_remote_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorInviteCreationScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorInviteCreationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final JuniorInviteCreationScreenContract$InputData K;
    public final ProductSelectionDelegate L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public final h Q;

    public JuniorInviteCreationScreen(JuniorInviteCreationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new ProductSelectionDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: cm8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorInviteCreationScreen f25159b;

            {
                this.f25159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorInviteCreationScreen juniorInviteCreationScreen = this.f25159b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorInviteCreationScreen.R;
                        JuniorInviteCreationScreen juniorInviteCreationScreen2 = this.f25159b;
                        return dli.f.a(juniorInviteCreationScreen2, (h) juniorInviteCreationScreen2.P.getValue(), u.c(juniorInviteCreationScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorInviteCreationScreen.R;
                        qji.b bVarU2 = juniorInviteCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.di.JuniorInviteCreationScreenInjector");
                        }
                        il8.i iVar = (il8.i) bVarU2;
                        il8.k kVar = iVar.f162159b;
                        il8.i iVar2 = iVar.f162160c;
                        JuniorInviteCreationScreenContract$InputData juniorInviteCreationScreenContract$InputData = juniorInviteCreationScreen.K;
                        juniorInviteCreationScreenContract$InputData.getClass();
                        return new il8.j(kVar, iVar2, juniorInviteCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorInviteCreationScreen.R;
                        return (h) ((il8.j) juniorInviteCreationScreen.N.getValue()).f162163c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: cm8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorInviteCreationScreen f25159b;

            {
                this.f25159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorInviteCreationScreen juniorInviteCreationScreen = this.f25159b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorInviteCreationScreen.R;
                        JuniorInviteCreationScreen juniorInviteCreationScreen2 = this.f25159b;
                        return dli.f.a(juniorInviteCreationScreen2, (h) juniorInviteCreationScreen2.P.getValue(), u.c(juniorInviteCreationScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorInviteCreationScreen.R;
                        qji.b bVarU2 = juniorInviteCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.di.JuniorInviteCreationScreenInjector");
                        }
                        il8.i iVar = (il8.i) bVarU2;
                        il8.k kVar = iVar.f162159b;
                        il8.i iVar2 = iVar.f162160c;
                        JuniorInviteCreationScreenContract$InputData juniorInviteCreationScreenContract$InputData = juniorInviteCreationScreen.K;
                        juniorInviteCreationScreenContract$InputData.getClass();
                        return new il8.j(kVar, iVar2, juniorInviteCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorInviteCreationScreen.R;
                        return (h) ((il8.j) juniorInviteCreationScreen.N.getValue()).f162163c.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: cm8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorInviteCreationScreen f25159b;

            {
                this.f25159b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorInviteCreationScreen juniorInviteCreationScreen = this.f25159b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorInviteCreationScreen.R;
                        JuniorInviteCreationScreen juniorInviteCreationScreen2 = this.f25159b;
                        return dli.f.a(juniorInviteCreationScreen2, (h) juniorInviteCreationScreen2.P.getValue(), u.c(juniorInviteCreationScreen2.L), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorInviteCreationScreen.R;
                        qji.b bVarU2 = juniorInviteCreationScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.junior_remote_login.impl.ui.screen.invite_creation.di.JuniorInviteCreationScreenInjector");
                        }
                        il8.i iVar = (il8.i) bVarU2;
                        il8.k kVar = iVar.f162159b;
                        il8.i iVar2 = iVar.f162160c;
                        JuniorInviteCreationScreenContract$InputData juniorInviteCreationScreenContract$InputData = juniorInviteCreationScreen.K;
                        juniorInviteCreationScreenContract$InputData.getClass();
                        return new il8.j(kVar, iVar2, juniorInviteCreationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = JuniorInviteCreationScreen.R;
                        return (h) ((il8.j) juniorInviteCreationScreen.N.getValue()).f162163c.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (cm8.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_app_invitation_header_title, u.c(this.K.f77224b), null, 12);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.p()), null, new c(this, null), 3);
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new c65.i(this, null, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
