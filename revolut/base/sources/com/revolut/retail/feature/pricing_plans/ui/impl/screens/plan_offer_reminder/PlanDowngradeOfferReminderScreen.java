package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_reminder.PlanDowngradeOfferReminderScreen;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.c;
import pki.b;
import qgk.i0;
import qgk.m2;
import te0.w;
import vc.s;
import wmk.i;
import wmk.l;
import wmk.m;
import wmk.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_reminder/PlanDowngradeOfferReminderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwmk/l;", "Ldli/a;", "Lwmk/n;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanDowngradeOfferReminderScreen extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanDowngradeOfferReminderScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanDowngradeOfferReminderScreenContract$InputData K;
    public final int L;
    public final LargeActionButtonDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public PlanDowngradeOfferReminderScreen(PlanDowngradeOfferReminderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = new LargeActionButtonDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wmk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeOfferReminderScreen f298693b;

            {
                this.f298693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen = this.f298693b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeOfferReminderScreen.R;
                        PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen2 = this.f298693b;
                        return dli.f.a(planDowngradeOfferReminderScreen2, (m) planDowngradeOfferReminderScreen2.Q.getValue(), v.k(planDowngradeOfferReminderScreen2.M, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (m2) ((xmk.a) ((xmk.b) aVar2.b()).j().mo3808a(planDowngradeOfferReminderScreen)).e(planDowngradeOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeOfferReminderScreen.R;
                        m2 m2Var = (m2) planDowngradeOfferReminderScreen.P.getValue();
                        switch (m2Var.f246138a) {
                            case 0:
                                return (m) m2Var.d.get();
                            default:
                                return (m) m2Var.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, wmk.h.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wmk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeOfferReminderScreen f298693b;

            {
                this.f298693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen = this.f298693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeOfferReminderScreen.R;
                        PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen2 = this.f298693b;
                        return dli.f.a(planDowngradeOfferReminderScreen2, (m) planDowngradeOfferReminderScreen2.Q.getValue(), v.k(planDowngradeOfferReminderScreen2.M, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (m2) ((xmk.a) ((xmk.b) aVar2.b()).j().mo3808a(planDowngradeOfferReminderScreen)).e(planDowngradeOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeOfferReminderScreen.R;
                        m2 m2Var = (m2) planDowngradeOfferReminderScreen.P.getValue();
                        switch (m2Var.f246138a) {
                            case 0:
                                return (m) m2Var.d.get();
                            default:
                                return (m) m2Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wmk.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanDowngradeOfferReminderScreen f298693b;

            {
                this.f298693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen = this.f298693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanDowngradeOfferReminderScreen.R;
                        PlanDowngradeOfferReminderScreen planDowngradeOfferReminderScreen2 = this.f298693b;
                        return dli.f.a(planDowngradeOfferReminderScreen2, (m) planDowngradeOfferReminderScreen2.Q.getValue(), v.k(planDowngradeOfferReminderScreen2.M, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanDowngradeOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planDowngradeOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (m2) ((xmk.a) ((xmk.b) aVar2.b()).j().mo3808a(planDowngradeOfferReminderScreen)).e(planDowngradeOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanDowngradeOfferReminderScreen.R;
                        m2 m2Var = (m2) planDowngradeOfferReminderScreen.P.getValue();
                        switch (m2Var.f246138a) {
                            case 0:
                                return (m) m2Var.d.get();
                            default:
                                return (m) m2Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(new lw0.a(uiState.f298700b, uiState.f298701c, new c(uiState.f298699a), null, false, 24));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m2) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (m) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.d.f121375b), new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
