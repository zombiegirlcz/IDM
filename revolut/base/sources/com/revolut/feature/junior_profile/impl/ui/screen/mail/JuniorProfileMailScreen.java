package com.revolut.feature.junior_profile.impl.ui.screen.mail;

import aii.q;
import ak8.b;
import ak8.c;
import ak8.d;
import ak8.f;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior_profile.impl.R$string;
import com.revolut.feature.junior_profile.impl.ui.screen.mail.JuniorProfileMailScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mj8.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_profile/impl/ui/screen/mail/JuniorProfileMailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lak8/h;", "feature_junior_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProfileMailScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorProfileMailScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final f K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public JuniorProfileMailScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ak8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileMailScreen f5735b;

            {
                this.f5735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorProfileMailScreen juniorProfileMailScreen = this.f5735b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileMailScreen.R;
                        JuniorProfileMailScreen juniorProfileMailScreen2 = this.f5735b;
                        return dli.f.a(juniorProfileMailScreen2, (g) juniorProfileMailScreen2.Q.getValue(), u.c(juniorProfileMailScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileMailScreen.R;
                        qji.b bVarU2 = juniorProfileMailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.mail.di.JuniorProfileMailScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        f fVar = juniorProfileMailScreen.K;
                        fVar.getClass();
                        return new mj8.g(hVar, dVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileMailScreen.R;
                        return (g) ((mj8.g) juniorProfileMailScreen.P.getValue()).f205964b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ak8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileMailScreen f5735b;

            {
                this.f5735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorProfileMailScreen juniorProfileMailScreen = this.f5735b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileMailScreen.R;
                        JuniorProfileMailScreen juniorProfileMailScreen2 = this.f5735b;
                        return dli.f.a(juniorProfileMailScreen2, (g) juniorProfileMailScreen2.Q.getValue(), u.c(juniorProfileMailScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileMailScreen.R;
                        qji.b bVarU2 = juniorProfileMailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.mail.di.JuniorProfileMailScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        f fVar = juniorProfileMailScreen.K;
                        fVar.getClass();
                        return new mj8.g(hVar, dVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileMailScreen.R;
                        return (g) ((mj8.g) juniorProfileMailScreen.P.getValue()).f205964b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ak8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProfileMailScreen f5735b;

            {
                this.f5735b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorProfileMailScreen juniorProfileMailScreen = this.f5735b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorProfileMailScreen.R;
                        JuniorProfileMailScreen juniorProfileMailScreen2 = this.f5735b;
                        return dli.f.a(juniorProfileMailScreen2, (g) juniorProfileMailScreen2.Q.getValue(), u.c(juniorProfileMailScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorProfileMailScreen.R;
                        qji.b bVarU2 = juniorProfileMailScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_profile.impl.ui.screen.mail.di.JuniorProfileMailScreenInjector");
                        mj8.d dVar = (mj8.d) bVarU2;
                        mj8.h hVar = dVar.f205956b;
                        mj8.d dVar2 = dVar.f205957c;
                        f fVar = juniorProfileMailScreen.K;
                        fVar.getClass();
                        return new mj8.g(hVar, dVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = JuniorProfileMailScreen.R;
                        return (g) ((mj8.g) juniorProfileMailScreen.P.getValue()).f205964b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ak8.h uiState = (ak8.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f5740b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ak8.g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_profile_change_email_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("UPDATE_MAIL_CTA_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, t1.g(rd0.e.b(this.N.e.f121375b), 300L), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
