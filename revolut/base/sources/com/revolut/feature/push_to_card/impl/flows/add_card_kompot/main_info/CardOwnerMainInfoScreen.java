package com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info;

import ald.l;
import android.app.Activity;
import android.content.Intent;
import android.nfc.Tag;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.view.ComponentActivity;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ara.b;
import ara.c;
import ara.f;
import ara.n;
import ara.p;
import ara.r;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.CollapsingActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.main_info.CardOwnerMainInfoScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import f63.d;
import in0.g;
import java.util.List;
import jqa.k;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/flows/add_card_kompot/main_info/CardOwnerMainInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lara/p;", "Lin0/g;", "Ldli/a;", "Lara/r;", "Landroidx/core/util/Consumer;", "Landroid/content/Intent;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardOwnerMainInfoScreen extends ViewController<p> implements g, dli.a, Consumer<Intent> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CardOwnerMainInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarCollapsingNextbuttonBinding;", 0))};
    public final CardOwnerMainInfoScreenContract$InputData K;
    public final FixedTabsDelegate L;
    public final Lazy M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final c T;

    public CardOwnerMainInfoScreen(CardOwnerMainInfoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FixedTabsDelegate();
        final int i = 0;
        this.M = j.b(new Function0(this) { // from class: ara.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerMainInfoScreen f8595b;

            {
                this.f8595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.f8595b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardOwnerMainInfoScreen.U;
                        return new InputTextDelegate(new anc.b(cardOwnerMainInfoScreen, 9));
                    case 1:
                        KProperty[] kPropertyArr2 = CardOwnerMainInfoScreen.U;
                        CardOwnerMainInfoScreen cardOwnerMainInfoScreen2 = this.f8595b;
                        return dli.f.a(cardOwnerMainInfoScreen2, cardOwnerMainInfoScreen2.d(), v.k(cardOwnerMainInfoScreen2.L, (InputTextDelegate) cardOwnerMainInfoScreen2.M.getValue(), cardOwnerMainInfoScreen2.N, new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CardOwnerMainInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardOwnerMainInfoScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (jqa.k) ((dra.a) ((dra.b) aVar2.b()).q().mo3808a(cardOwnerMainInfoScreen)).o(cardOwnerMainInfoScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = CardOwnerMainInfoScreen.U;
                        jqa.k kVar = (jqa.k) cardOwnerMainInfoScreen.Q.getValue();
                        switch (kVar.f177600a) {
                            case 0:
                                return (q) kVar.f177605j.get();
                            default:
                                return (q) kVar.f177605j.get();
                        }
                }
            }
        });
        this.N = new LargeActionButtonDelegate();
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ara.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerMainInfoScreen f8595b;

            {
                this.f8595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.f8595b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardOwnerMainInfoScreen.U;
                        return new InputTextDelegate(new anc.b(cardOwnerMainInfoScreen, 9));
                    case 1:
                        KProperty[] kPropertyArr2 = CardOwnerMainInfoScreen.U;
                        CardOwnerMainInfoScreen cardOwnerMainInfoScreen2 = this.f8595b;
                        return dli.f.a(cardOwnerMainInfoScreen2, cardOwnerMainInfoScreen2.d(), v.k(cardOwnerMainInfoScreen2.L, (InputTextDelegate) cardOwnerMainInfoScreen2.M.getValue(), cardOwnerMainInfoScreen2.N, new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CardOwnerMainInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardOwnerMainInfoScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (jqa.k) ((dra.a) ((dra.b) aVar2.b()).q().mo3808a(cardOwnerMainInfoScreen)).o(cardOwnerMainInfoScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = CardOwnerMainInfoScreen.U;
                        jqa.k kVar = (jqa.k) cardOwnerMainInfoScreen.Q.getValue();
                        switch (kVar.f177600a) {
                            case 0:
                                return (q) kVar.f177605j.get();
                            default:
                                return (q) kVar.f177605j.get();
                        }
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_collapsing_nextbutton;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ara.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerMainInfoScreen f8595b;

            {
                this.f8595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.f8595b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardOwnerMainInfoScreen.U;
                        return new InputTextDelegate(new anc.b(cardOwnerMainInfoScreen, 9));
                    case 1:
                        KProperty[] kPropertyArr2 = CardOwnerMainInfoScreen.U;
                        CardOwnerMainInfoScreen cardOwnerMainInfoScreen2 = this.f8595b;
                        return dli.f.a(cardOwnerMainInfoScreen2, cardOwnerMainInfoScreen2.d(), v.k(cardOwnerMainInfoScreen2.L, (InputTextDelegate) cardOwnerMainInfoScreen2.M.getValue(), cardOwnerMainInfoScreen2.N, new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CardOwnerMainInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardOwnerMainInfoScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (jqa.k) ((dra.a) ((dra.b) aVar2.b()).q().mo3808a(cardOwnerMainInfoScreen)).o(cardOwnerMainInfoScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = CardOwnerMainInfoScreen.U;
                        jqa.k kVar = (jqa.k) cardOwnerMainInfoScreen.Q.getValue();
                        switch (kVar.f177600a) {
                            case 0:
                                return (q) kVar.f177605j.get();
                            default:
                                return (q) kVar.f177605j.get();
                        }
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ara.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardOwnerMainInfoScreen f8595b;

            {
                this.f8595b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CardOwnerMainInfoScreen cardOwnerMainInfoScreen = this.f8595b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardOwnerMainInfoScreen.U;
                        return new InputTextDelegate(new anc.b(cardOwnerMainInfoScreen, 9));
                    case 1:
                        KProperty[] kPropertyArr2 = CardOwnerMainInfoScreen.U;
                        CardOwnerMainInfoScreen cardOwnerMainInfoScreen2 = this.f8595b;
                        return dli.f.a(cardOwnerMainInfoScreen2, cardOwnerMainInfoScreen2.d(), v.k(cardOwnerMainInfoScreen2.L, (InputTextDelegate) cardOwnerMainInfoScreen2.M.getValue(), cardOwnerMainInfoScreen2.N, new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CardOwnerMainInfoScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(cardOwnerMainInfoScreen.m2()).a().get(vpa.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (jqa.k) ((dra.a) ((dra.b) aVar2.b()).q().mo3808a(cardOwnerMainInfoScreen)).o(cardOwnerMainInfoScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vpa.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr4 = CardOwnerMainInfoScreen.U;
                        jqa.k kVar = (jqa.k) cardOwnerMainInfoScreen.Q.getValue();
                        switch (kVar.f177600a) {
                            case 0:
                                return (q) kVar.f177605j.get();
                            default:
                                return (q) kVar.f177605j.get();
                        }
                }
            }
        });
        this.S = s.t(this, b.f);
        this.T = new c(this, 0);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174552c;
        n nVar = uiState.f8616b;
        TextLocalisedClause textLocalisedClause = nVar.f8608a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(nVar.f8609b);
        navBarWithToolbar.setMenuItems(nVar.f8610c);
        ara.h hVar = uiState.f8617c;
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLargeButtonText(hVar.f8599a);
        collapsingActionButton.setLargeButtonEnabled(hVar.f8600b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
        d3().f174552c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        CollapsingActionButton collapsingActionButton = d3().f174551b;
        collapsingActionButton.setLoadingButtonTag("CardOwnerMainInfoScreenContract_BUTTON_TAG");
        collapsingActionButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        Activity activityM2 = m2();
        AppCompatActivity appCompatActivity = activityM2 instanceof AppCompatActivity ? (AppCompatActivity) activityM2 : null;
        if (appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this.T);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        Lifecycle lifecycle;
        Activity activityM2 = m2();
        AppCompatActivity appCompatActivity = activityM2 instanceof AppCompatActivity ? (AppCompatActivity) activityM2 : null;
        if (appCompatActivity == null || (lifecycle = appCompatActivity.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this.T);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        Activity activityM2 = m2();
        ComponentActivity componentActivity = activityM2 instanceof ComponentActivity ? (ComponentActivity) activityM2 : null;
        if (componentActivity != null) {
            componentActivity.removeOnNewIntentListener(this);
        }
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Intent intent) {
        Intent value = intent;
        Intrinsics.checkNotNullParameter(value, "value");
        w53.b.Companion.getClass();
        Tag tag2 = w53.a.a(value);
        if (tag2 != null) {
            a aVar = (a) d();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(tag2, "tag");
            aVar.n2(new l(aVar, tag2, null, 5), new whi.b(6));
        }
    }

    /* JADX WARN: Type inference failed for: r9v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Lifecycle lifecycle;
        Lifecycle.State state;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Activity activityM2 = m2();
        Continuation continuation = null;
        ComponentActivity componentActivity = activityM2 instanceof ComponentActivity ? (ComponentActivity) activityM2 : null;
        if (componentActivity != null) {
            componentActivity.addOnNewIntentListener(this);
        }
        Activity activityM22 = m2();
        AppCompatActivity appCompatActivity = activityM22 instanceof AppCompatActivity ? (AppCompatActivity) activityM22 : null;
        boolean z = false;
        if (appCompatActivity != null && (lifecycle = appCompatActivity.getLifecycle()) != null && (state = lifecycle.getState()) != null && state.isAtLeast(Lifecycle.State.RESUMED)) {
            z = true;
        }
        a aVar = (a) d();
        d dVar = (d) ((w53.b) aVar.f81581r.f222639b);
        boolean zB = dVar.b();
        boolean zA = dVar.a();
        aVar.H2(aVar.f81586y, new ar1.c(new ara.o(zB, zA), 1));
        if (zB && zA) {
            o7.b bVar = aVar.f81581r;
            if (z) {
                ((d) ((w53.b) bVar.f222639b)).c();
            } else {
                bVar.getClass();
            }
        }
        ViewController.P2(this, rd0.e.b(d3().f174551b.d()), new ara.d(this, null), 3);
        int i = 0;
        ViewController.P2(this, rd0.e.b(d3().f174552c.f59410q), new ara.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174552c.o.f57403b), new f(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52339c.f121375b), new f(this, continuation, 1), 3);
        Lazy lazy = this.M;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).e.f121375b), new ara.g(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) lazy.getValue()).f.f121375b), new f(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f174551b.c()), new ara.e(this, continuation, 1), 3);
        efm.r rVarHide = ((gra.b) ((k) this.Q.getValue()).b()).f145955a.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        ViewController.P2(this, rd0.e.b(rVarHide), new f(this, continuation, 3), 3);
    }

    public final jii.q d3() {
        ViewBinding value = this.S.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.q) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ara.q d() {
        return (ara.q) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void u(boolean z) {
        super.u(z);
        Window window = m2().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        rv0.h.a(window);
    }
}
