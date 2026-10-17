package com.revolut.feature.apm.breb.impl.ui.register;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import nv1.u;
import qp7.g;
import qsa.p;
import qu1.d;
import qw1.b;
import qw1.c;
import qw1.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/register/BrebRegisterScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqw1/e;", "Lno/d1;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebRegisterScreen extends ViewController<q> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BrebRegisterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;

    public BrebRegisterScreen(BrebRegisterScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_two_buttons;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebRegisterScreen f249733b;

            {
                this.f249733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebRegisterScreen brebRegisterScreen = this.f249733b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebRegisterScreen.R;
                        u uVar = (u) brebRegisterScreen.N.getValue();
                        switch (uVar.f219451a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = BrebRegisterScreen.R;
                        BrebRegisterScreen brebRegisterScreen2 = this.f249733b;
                        return dli.f.a(brebRegisterScreen2, brebRegisterScreen2.d(), v.k((RowDelegate) brebRegisterScreen2.O.getValue(), (SelectableDelegate) brebRegisterScreen2.P.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BrebRegisterScreen.R;
                        return new SelectableDelegate((RowDelegate) brebRegisterScreen.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebRegisterScreen f249733b;

            {
                this.f249733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebRegisterScreen brebRegisterScreen = this.f249733b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebRegisterScreen.R;
                        u uVar = (u) brebRegisterScreen.N.getValue();
                        switch (uVar.f219451a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = BrebRegisterScreen.R;
                        BrebRegisterScreen brebRegisterScreen2 = this.f249733b;
                        return dli.f.a(brebRegisterScreen2, brebRegisterScreen2.d(), v.k((RowDelegate) brebRegisterScreen2.O.getValue(), (SelectableDelegate) brebRegisterScreen2.P.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BrebRegisterScreen.R;
                        return new SelectableDelegate((RowDelegate) brebRegisterScreen.O.getValue());
                }
            }
        });
        this.N = w.y0(new qvf.a(this, inputData, 1));
        this.O = w.y0(new d(9));
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: qw1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebRegisterScreen f249733b;

            {
                this.f249733b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebRegisterScreen brebRegisterScreen = this.f249733b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebRegisterScreen.R;
                        u uVar = (u) brebRegisterScreen.N.getValue();
                        switch (uVar.f219451a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = BrebRegisterScreen.R;
                        BrebRegisterScreen brebRegisterScreen2 = this.f249733b;
                        return dli.f.a(brebRegisterScreen2, brebRegisterScreen2.d(), v.k((RowDelegate) brebRegisterScreen2.O.getValue(), (SelectableDelegate) brebRegisterScreen2.P.getValue()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = BrebRegisterScreen.R;
                        return new SelectableDelegate((RowDelegate) brebRegisterScreen.O.getValue());
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174573b.setEnabled(uiState.f249737b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        x xVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = xVarD3.f174574c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bre_b_add_key_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = xVarD3.f174573b;
        largeActionButton.setLoadingButtonTag("ADD_KEYS_BUTTON_LOADING_TAG");
        largeActionButton.setText(new TextLocalisedClause(R$string.bre_b_add_key_add_keys, null, null, 14));
        LargeActionButton largeActionButton2 = xVarD3.e;
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setText(new TextLocalisedClause(R$string.bre_b_add_key_not_now, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        x xVarD3 = d3();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(xVarD3.f174574c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(xVarD3.f174573b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(xVarD3.e.o), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((SelectableDelegate) this.P.getValue()).r(), new p(28))), null, new g(this, null, 11), 3);
    }

    public final x d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qw1.g d() {
        return (qw1.g) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
