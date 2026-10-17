package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.push_to_card.impl.R$string;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.additional_fields.AdditionalFieldsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
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
import pe2.c;
import pqa.b;
import pqa.d;
import pqa.f;
import pqa.g;
import pqa.j;
import pqa.k;
import pqa.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/additional_fields/AdditionalFieldsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpqa/j;", "Ldli/a;", "Lpqa/l;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalFieldsScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AdditionalFieldsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final Lazy K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;

    public AdditionalFieldsScreen(AdditionalFieldsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = yhm.j.b(new Function0(this) { // from class: pqa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalFieldsScreen f238706b;

            {
                this.f238706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalFieldsScreen additionalFieldsScreen = this.f238706b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalFieldsScreen.Q;
                        return new InputTextDelegate(new plb.g(additionalFieldsScreen, 15));
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalFieldsScreen.Q;
                        AdditionalFieldsScreen additionalFieldsScreen2 = this.f238706b;
                        return dli.f.a(additionalFieldsScreen2, additionalFieldsScreen2.d(), u.c((InputTextDelegate) additionalFieldsScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalFieldsScreen.Q;
                        return (k) ((jqa.a) additionalFieldsScreen.N.getValue()).f177530c.get();
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: pqa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalFieldsScreen f238706b;

            {
                this.f238706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalFieldsScreen additionalFieldsScreen = this.f238706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalFieldsScreen.Q;
                        return new InputTextDelegate(new plb.g(additionalFieldsScreen, 15));
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalFieldsScreen.Q;
                        AdditionalFieldsScreen additionalFieldsScreen2 = this.f238706b;
                        return dli.f.a(additionalFieldsScreen2, additionalFieldsScreen2.d(), u.c((InputTextDelegate) additionalFieldsScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalFieldsScreen.Q;
                        return (k) ((jqa.a) additionalFieldsScreen.N.getValue()).f177530c.get();
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        this.N = w.y0(new c(this, inputData, 24));
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pqa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalFieldsScreen f238706b;

            {
                this.f238706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AdditionalFieldsScreen additionalFieldsScreen = this.f238706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AdditionalFieldsScreen.Q;
                        return new InputTextDelegate(new plb.g(additionalFieldsScreen, 15));
                    case 1:
                        KProperty[] kPropertyArr2 = AdditionalFieldsScreen.Q;
                        AdditionalFieldsScreen additionalFieldsScreen2 = this.f238706b;
                        return dli.f.a(additionalFieldsScreen2, additionalFieldsScreen2.d(), u.c((InputTextDelegate) additionalFieldsScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = AdditionalFieldsScreen.Q;
                        return (k) ((jqa.a) additionalFieldsScreen.N.getValue()).f177530c.get();
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174551b.setLargeButtonEnabled(uiState.f238713b.f238708a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jqa.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.push2card_new_recipient_additional_info_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.push2card_new_recipient_additional_info_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.push2card_new_recipient_additional_info_description, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        collapsingActionButton.setLoadingButtonTag("AdditionalFieldsScreenContract_BUTTON_TAG");
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new pqa.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new d(this, continuation, 0), 3);
        Lazy lazy = this.K;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f52575g.f121375b), new pqa.e(this, null), 3);
        r rVarHide = ((tqa.b) ((tqa.a) ((jqa.a) this.N.getValue()).d.get())).f273542b.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        ViewController.P2(this, rd0.e.b(rVarHide), new f(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), new g(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f.f121375b), new f(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new d(this, continuation, i), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
