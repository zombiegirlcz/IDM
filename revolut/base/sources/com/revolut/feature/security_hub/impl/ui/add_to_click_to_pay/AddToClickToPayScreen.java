package com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dli.a;
import duc.b;
import duc.c;
import duc.d;
import duc.f;
import duc.g;
import jii.m;
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
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/add_to_click_to_pay/AddToClickToPayScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lduc/f;", "Ldli/a;", "Lduc/h;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddToClickToPayScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AddToClickToPayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final PromptMarketingContentDelegate L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;

    public AddToClickToPayScreen(AddToClickToPayScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new PromptMarketingContentDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: duc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToClickToPayScreen f117959b;

            {
                this.f117959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AddToClickToPayScreen.Q;
                        AddToClickToPayScreen addToClickToPayScreen = this.f117959b;
                        return dli.f.a(addToClickToPayScreen, (g) addToClickToPayScreen.P.getValue(), u.c(addToClickToPayScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AddToClickToPayScreen.Q;
                        return (g) ((vtc.a) this.f117959b.N.getValue()).f291947h.get();
                }
            }
        });
        this.N = w.y0(new dgg.b(this, inputData, 20));
        this.O = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: duc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddToClickToPayScreen f117959b;

            {
                this.f117959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddToClickToPayScreen.Q;
                        AddToClickToPayScreen addToClickToPayScreen = this.f117959b;
                        return dli.f.a(addToClickToPayScreen, (g) addToClickToPayScreen.P.getValue(), u.c(addToClickToPayScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AddToClickToPayScreen.Q;
                        return (g) ((vtc.a) this.f117959b.N.getValue()).f291947h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((duc.h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new v0(this, continuation, 18), 3);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.d), null, new dob.c(this, continuation, 17), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
