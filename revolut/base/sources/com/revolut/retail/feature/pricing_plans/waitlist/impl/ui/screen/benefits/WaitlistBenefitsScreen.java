package com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.WaitlistBenefitsScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import rok.c;
import rok.e;
import rok.f;
import rok.g;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/ui/screen/benefits/WaitlistBenefitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrok/e;", "Lcli/w;", "Lrok/g;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistBenefitsScreen extends ViewController<e> implements w {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(WaitlistBenefitsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/databinding/WaitlistBenefitsBinding;", 0))};
    public final WaitlistBenefitsScreenContract$InputData K;
    public final int L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public WaitlistBenefitsScreen(WaitlistBenefitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.waitlist_benefits;
        this.M = R$style.UiKitTheme_Night;
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: rok.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistBenefitsScreen f256029b;

            {
                this.f256029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WaitlistBenefitsScreen waitlistBenefitsScreen = this.f256029b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistBenefitsScreen.R;
                        return n14.e.a(waitlistBenefitsScreen, (f) waitlistBenefitsScreen.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistBenefitsScreen.R;
                        qji.b bVarU2 = waitlistBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.di.WaitlistBenefitsScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistBenefitsScreenContract$InputData waitlistBenefitsScreenContract$InputData = waitlistBenefitsScreen.K;
                        waitlistBenefitsScreenContract$InputData.getClass();
                        return new jok.a(cVar, dVar2, waitlistBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistBenefitsScreen.R;
                        return (f) ((jok.a) waitlistBenefitsScreen.P.getValue()).f177148c.get();
                }
            }
        });
        this.O = s.t(this, c.f);
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: rok.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistBenefitsScreen f256029b;

            {
                this.f256029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WaitlistBenefitsScreen waitlistBenefitsScreen = this.f256029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistBenefitsScreen.R;
                        return n14.e.a(waitlistBenefitsScreen, (f) waitlistBenefitsScreen.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistBenefitsScreen.R;
                        qji.b bVarU2 = waitlistBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.di.WaitlistBenefitsScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistBenefitsScreenContract$InputData waitlistBenefitsScreenContract$InputData = waitlistBenefitsScreen.K;
                        waitlistBenefitsScreenContract$InputData.getClass();
                        return new jok.a(cVar, dVar2, waitlistBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistBenefitsScreen.R;
                        return (f) ((jok.a) waitlistBenefitsScreen.P.getValue()).f177148c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: rok.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaitlistBenefitsScreen f256029b;

            {
                this.f256029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WaitlistBenefitsScreen waitlistBenefitsScreen = this.f256029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WaitlistBenefitsScreen.R;
                        return n14.e.a(waitlistBenefitsScreen, (f) waitlistBenefitsScreen.Q.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = WaitlistBenefitsScreen.R;
                        qji.b bVarU2 = waitlistBenefitsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.benefits.di.WaitlistBenefitsScreenInjector");
                        jok.d dVar = (jok.d) bVarU2;
                        jok.c cVar = dVar.f177157b;
                        jok.d dVar2 = dVar.f177158c;
                        WaitlistBenefitsScreenContract$InputData waitlistBenefitsScreenContract$InputData = waitlistBenefitsScreen.K;
                        waitlistBenefitsScreenContract$InputData.getClass();
                        return new jok.a(cVar, dVar2, waitlistBenefitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = WaitlistBenefitsScreen.R;
                        return (f) ((jok.a) waitlistBenefitsScreen.P.getValue()).f177148c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) throws Throwable {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((iok.a) value).f163341b.setModel(uiState.f256032a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (jok.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((iok.a) value).f163341b.v), new rlh.c(this, null, 6), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
