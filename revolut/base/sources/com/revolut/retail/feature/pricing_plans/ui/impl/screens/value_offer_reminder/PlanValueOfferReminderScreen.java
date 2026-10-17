package com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aok.e;
import aok.f;
import aok.h;
import aok.j;
import aok.k;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.value_offer_reminder.PlanValueOfferReminderScreen;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lw0.c;
import pki.b;
import qgk.c3;
import qgk.i0;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/value_offer_reminder/PlanValueOfferReminderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laok/h;", "Ldli/a;", "Laok/k;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanValueOfferReminderScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanValueOfferReminderScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final PlanValueOfferReminderScreenContract$InputData K;
    public final LargeActionButtonDelegate L;
    public final ao.h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PlanValueOfferReminderScreen(PlanValueOfferReminderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new LargeActionButtonDelegate();
        this.M = s.t(this, e.f);
        this.N = R$layout.screen_recycler_navbar_bottomsheet;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: aok.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanValueOfferReminderScreen f8007b;

            {
                this.f8007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanValueOfferReminderScreen planValueOfferReminderScreen = this.f8007b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanValueOfferReminderScreen.R;
                        PlanValueOfferReminderScreen planValueOfferReminderScreen2 = this.f8007b;
                        return dli.f.a(planValueOfferReminderScreen2, (j) planValueOfferReminderScreen2.Q.getValue(), v.k(planValueOfferReminderScreen2.L, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanValueOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planValueOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c3) ((bok.a) ((bok.b) aVar2.b()).b().mo3808a(planValueOfferReminderScreen)).n0(planValueOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanValueOfferReminderScreen.R;
                        c3 c3Var = (c3) planValueOfferReminderScreen.P.getValue();
                        switch (c3Var.f245908a) {
                            case 0:
                                return (j) c3Var.e.get();
                            default:
                                return (j) c3Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: aok.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanValueOfferReminderScreen f8007b;

            {
                this.f8007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanValueOfferReminderScreen planValueOfferReminderScreen = this.f8007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanValueOfferReminderScreen.R;
                        PlanValueOfferReminderScreen planValueOfferReminderScreen2 = this.f8007b;
                        return dli.f.a(planValueOfferReminderScreen2, (j) planValueOfferReminderScreen2.Q.getValue(), v.k(planValueOfferReminderScreen2.L, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanValueOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planValueOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c3) ((bok.a) ((bok.b) aVar2.b()).b().mo3808a(planValueOfferReminderScreen)).n0(planValueOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanValueOfferReminderScreen.R;
                        c3 c3Var = (c3) planValueOfferReminderScreen.P.getValue();
                        switch (c3Var.f245908a) {
                            case 0:
                                return (j) c3Var.e.get();
                            default:
                                return (j) c3Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: aok.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanValueOfferReminderScreen f8007b;

            {
                this.f8007b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanValueOfferReminderScreen planValueOfferReminderScreen = this.f8007b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanValueOfferReminderScreen.R;
                        PlanValueOfferReminderScreen planValueOfferReminderScreen2 = this.f8007b;
                        return dli.f.a(planValueOfferReminderScreen2, (j) planValueOfferReminderScreen2.Q.getValue(), v.k(planValueOfferReminderScreen2.L, new CounterTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanValueOfferReminderScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(planValueOfferReminderScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (c3) ((bok.a) ((bok.b) aVar2.b()).b().mo3808a(planValueOfferReminderScreen)).n0(planValueOfferReminderScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PlanValueOfferReminderScreen.R;
                        c3 c3Var = (c3) planValueOfferReminderScreen.P.getValue();
                        switch (c3Var.f245908a) {
                            case 0:
                                return (j) c3Var.e.get();
                            default:
                                return (j) c3Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((n) value).f174542b;
        TextClause textClause = uiState.f8013b;
        TextClause textClause2 = uiState.f8014c;
        GlyphImage glyphImage = uiState.f8012a;
        navBarBottomSheet.setHeaderModel(new lw0.a(textClause, textClause2, glyphImage != null ? new c(glyphImage) : null, null, false, 24));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c3) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.d.f121375b), new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
