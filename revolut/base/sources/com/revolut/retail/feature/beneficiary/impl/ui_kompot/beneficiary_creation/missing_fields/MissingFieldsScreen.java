package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b3j.w;
import buf.u;
import c5j.b;
import c5j.c;
import c5j.d;
import c5j.f;
import c5j.g;
import c5j.k;
import c5j.l;
import c5j.m;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.MissingFieldsScreen;
import efm.r;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/missing_fields/MissingFieldsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc5j/k;", "Ldli/a;", "Lc5j/m;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MissingFieldsScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(MissingFieldsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final FullScreenStateDelegate K;
    public final Lazy L;
    public final LargeActionButtonDelegate M;
    public final Object N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final h R;

    public MissingFieldsScreen(MissingFieldsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new FullScreenStateDelegate();
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: c5j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissingFieldsScreen f21565b;

            {
                this.f21565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MissingFieldsScreen missingFieldsScreen = this.f21565b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MissingFieldsScreen.S;
                        return new InputTextDelegate(new bwd.a(missingFieldsScreen, 20));
                    case 1:
                        KProperty[] kPropertyArr2 = MissingFieldsScreen.S;
                        MissingFieldsScreen missingFieldsScreen2 = this.f21565b;
                        return dli.f.a(missingFieldsScreen2, missingFieldsScreen2.d(), v.k((InputTextDelegate) missingFieldsScreen2.L.getValue(), missingFieldsScreen2.M, missingFieldsScreen2.K), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MissingFieldsScreen.S;
                        return (l) ((w) missingFieldsScreen.P.getValue()).i.get();
                }
            }
        });
        this.M = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: c5j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissingFieldsScreen f21565b;

            {
                this.f21565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MissingFieldsScreen missingFieldsScreen = this.f21565b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MissingFieldsScreen.S;
                        return new InputTextDelegate(new bwd.a(missingFieldsScreen, 20));
                    case 1:
                        KProperty[] kPropertyArr2 = MissingFieldsScreen.S;
                        MissingFieldsScreen missingFieldsScreen2 = this.f21565b;
                        return dli.f.a(missingFieldsScreen2, missingFieldsScreen2.d(), v.k((InputTextDelegate) missingFieldsScreen2.L.getValue(), missingFieldsScreen2.M, missingFieldsScreen2.K), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MissingFieldsScreen.S;
                        return (l) ((w) missingFieldsScreen.P.getValue()).i.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.P = te0.w.y0(new u(this, inputData, 19));
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: c5j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MissingFieldsScreen f21565b;

            {
                this.f21565b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MissingFieldsScreen missingFieldsScreen = this.f21565b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MissingFieldsScreen.S;
                        return new InputTextDelegate(new bwd.a(missingFieldsScreen, 20));
                    case 1:
                        KProperty[] kPropertyArr2 = MissingFieldsScreen.S;
                        MissingFieldsScreen missingFieldsScreen2 = this.f21565b;
                        return dli.f.a(missingFieldsScreen2, missingFieldsScreen2.d(), v.k((InputTextDelegate) missingFieldsScreen2.L.getValue(), missingFieldsScreen2.M, missingFieldsScreen2.K), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = MissingFieldsScreen.S;
                        return (l) ((w) missingFieldsScreen.P.getValue()).i.get();
                }
            }
        });
        this.R = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174551b.setEnabled(uiState.f21573b.f21567a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transfer_bank_accounts_new_missing_fields_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_bank_accounts_new_missing_fields_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transfer_bank_accounts_new_missing_fields_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(R$string.beneficiary_creation_cta_title, null, null, 14));
        collapsingActionButton.setLoadingButtonTag("MissingFieldsScreenContract_BUTTON_TAG");
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new c(this, continuation, 0), 3);
        Lazy lazy = this.L;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f52575g.f121375b), new d(this, null), 3);
        r rVarHide = ((r4j.c) ((r4j.a) ((w) this.P.getValue()).f12119j.get())).f251468b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        ViewController.P2(this, rd0.e.b(rVarHide), new c5j.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f.f121375b), new c5j.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).i.f121375b), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new c5j.h(this, null), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
