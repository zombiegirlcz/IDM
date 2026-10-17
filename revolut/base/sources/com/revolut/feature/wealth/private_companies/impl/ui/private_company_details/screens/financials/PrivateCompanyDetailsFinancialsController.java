package com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.PrivateCompanyDetailsFinancialsController;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import d1h.j;
import dli.a;
import dli.c;
import hfh.b;
import hfh.e;
import i7d.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/wealth/private_companies/impl/ui/private_company_details/screens/financials/PrivateCompanyDetailsFinancialsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhfh/e;", "Ld1h/j;", "Li7d/i;", "Companion", "a", "feature_wealth_private_companies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCompanyDetailsFinancialsController extends ViewController<q> implements a, j, i {
    public final PrivateCompanyDetailsFinancialsControllerContract$InputData K;
    public final h L;
    public final int M;
    public final FooterTextDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PrivateCompanyDetailsFinancialsController.class, "binding", "getBinding()Lcom/revolut/kompot/databinding/ScreenRecyclerViewBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.PrivateCompanyDetailsFinancialsController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PrivateCompanyDetailsFinancialsController(PrivateCompanyDetailsFinancialsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_view;
        this.N = new FooterTextDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: hfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFinancialsController f151911b;

            {
                this.f151911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController = this.f151911b;
                switch (i2) {
                    case 0:
                        PrivateCompanyDetailsFinancialsController.Companion companion = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.di.PrivateCompanyDetailsFinancialsControllerComponentInjector");
                        afh.c cVar = (afh.c) ((efh.a) bVarU2);
                        afh.e eVar = cVar.f4074c;
                        afh.c cVar2 = cVar.d;
                        privateCompanyDetailsFinancialsController.K.getClass();
                        return new afh.b(eVar, cVar2, privateCompanyDetailsFinancialsController, privateCompanyDetailsFinancialsController);
                    case 1:
                        PrivateCompanyDetailsFinancialsController.Companion companion2 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        return (h) ((afh.b) privateCompanyDetailsFinancialsController.P.getValue()).f4071h.get();
                    default:
                        PrivateCompanyDetailsFinancialsController.Companion companion3 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController2 = this.f151911b;
                        return dli.f.a(privateCompanyDetailsFinancialsController2, (h) privateCompanyDetailsFinancialsController2.Q.getValue(), v.k(privateCompanyDetailsFinancialsController2.N, new FooterTextLoadingDelegate(), privateCompanyDetailsFinancialsController2.O, new FullScreenStateLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFinancialsController f151911b;

            {
                this.f151911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController = this.f151911b;
                switch (i22) {
                    case 0:
                        PrivateCompanyDetailsFinancialsController.Companion companion = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.di.PrivateCompanyDetailsFinancialsControllerComponentInjector");
                        afh.c cVar = (afh.c) ((efh.a) bVarU2);
                        afh.e eVar = cVar.f4074c;
                        afh.c cVar2 = cVar.d;
                        privateCompanyDetailsFinancialsController.K.getClass();
                        return new afh.b(eVar, cVar2, privateCompanyDetailsFinancialsController, privateCompanyDetailsFinancialsController);
                    case 1:
                        PrivateCompanyDetailsFinancialsController.Companion companion2 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        return (h) ((afh.b) privateCompanyDetailsFinancialsController.P.getValue()).f4071h.get();
                    default:
                        PrivateCompanyDetailsFinancialsController.Companion companion3 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController2 = this.f151911b;
                        return dli.f.a(privateCompanyDetailsFinancialsController2, (h) privateCompanyDetailsFinancialsController2.Q.getValue(), v.k(privateCompanyDetailsFinancialsController2.N, new FooterTextLoadingDelegate(), privateCompanyDetailsFinancialsController2.O, new FullScreenStateLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hfh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFinancialsController f151911b;

            {
                this.f151911b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController = this.f151911b;
                switch (i22) {
                    case 0:
                        PrivateCompanyDetailsFinancialsController.Companion companion = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        qji.b bVarU2 = privateCompanyDetailsFinancialsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.screens.financials.di.PrivateCompanyDetailsFinancialsControllerComponentInjector");
                        afh.c cVar = (afh.c) ((efh.a) bVarU2);
                        afh.e eVar = cVar.f4074c;
                        afh.c cVar2 = cVar.d;
                        privateCompanyDetailsFinancialsController.K.getClass();
                        return new afh.b(eVar, cVar2, privateCompanyDetailsFinancialsController, privateCompanyDetailsFinancialsController);
                    case 1:
                        PrivateCompanyDetailsFinancialsController.Companion companion2 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        return (h) ((afh.b) privateCompanyDetailsFinancialsController.P.getValue()).f4071h.get();
                    default:
                        PrivateCompanyDetailsFinancialsController.Companion companion3 = PrivateCompanyDetailsFinancialsController.INSTANCE;
                        PrivateCompanyDetailsFinancialsController privateCompanyDetailsFinancialsController2 = this.f151911b;
                        return dli.f.a(privateCompanyDetailsFinancialsController2, (h) privateCompanyDetailsFinancialsController2.Q.getValue(), v.k(privateCompanyDetailsFinancialsController2.N, new FooterTextLoadingDelegate(), privateCompanyDetailsFinancialsController2.O, new FullScreenStateLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getR() {
        return this.N;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getS() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (afh.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (hfh.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.L;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((pji.a) value).f236787b.setClipToPadding(false);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView recyclerView = ((pji.a) value2).f236787b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(kli.a.k(m2(), 134.0f), recyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((c) this.R.getValue()).w();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
