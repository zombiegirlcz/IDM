package com.revolut.feature.apm.bills.bpay.impl.screen.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ao1.c;
import aw0.j8;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.bpay.api.R$string;
import com.revolut.feature.apm.bills.bpay.impl.R$id;
import com.revolut.feature.apm.bills.bpay.impl.R$layout;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import fna.f;
import fo1.d;
import fo1.k;
import fo1.u;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qd0.b;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/screen/amount/AmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfo1/k;", "Ldli/a;", "Lfo1/u;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(AmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bills/bpay/impl/databinding/ScreenBpayAmountBinding;", 0))};
    public final AmountScreenContract$InputData K;
    public final boolean L;
    public final int M;
    public final h N;
    public b O;
    public final Object P;
    public final Object Q;
    public final InputTextDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public AmountScreen(AmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_bpay_amount;
        this.N = s.t(this, fo1.b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: fo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountScreen f136737b;

            {
                this.f136737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AmountScreen amountScreen = this.f136737b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AmountScreen.V;
                        qd0.b bVar = amountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = AmountScreen.V;
                        return new CenteredAmountDelegate(new fgj.g(amountScreen, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = AmountScreen.V;
                        return (l) ((ao1.c) amountScreen.T.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AmountScreen.V;
                        qji.b bVarU2 = amountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.amount.di.AmountScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        AmountScreenContract$InputData amountScreenContract$InputData = amountScreen.K;
                        amountScreenContract$InputData.getClass();
                        return new ao1.c(dVar, eVar2, amountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AmountScreen.V;
                        AmountScreen amountScreen2 = this.f136737b;
                        return dli.f.a(amountScreen2, amountScreen2.d(), zhm.v.k((CenteredAmountDelegate) amountScreen2.Q.getValue(), amountScreen2.R), R$id.bpayAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountScreen f136737b;

            {
                this.f136737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AmountScreen amountScreen = this.f136737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountScreen.V;
                        qd0.b bVar = amountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = AmountScreen.V;
                        return new CenteredAmountDelegate(new fgj.g(amountScreen, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = AmountScreen.V;
                        return (l) ((ao1.c) amountScreen.T.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AmountScreen.V;
                        qji.b bVarU2 = amountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.amount.di.AmountScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        AmountScreenContract$InputData amountScreenContract$InputData = amountScreen.K;
                        amountScreenContract$InputData.getClass();
                        return new ao1.c(dVar, eVar2, amountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AmountScreen.V;
                        AmountScreen amountScreen2 = this.f136737b;
                        return dli.f.a(amountScreen2, amountScreen2.d(), zhm.v.k((CenteredAmountDelegate) amountScreen2.Q.getValue(), amountScreen2.R), R$id.bpayAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new InputTextDelegate(null);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: fo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountScreen f136737b;

            {
                this.f136737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AmountScreen amountScreen = this.f136737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountScreen.V;
                        qd0.b bVar = amountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = AmountScreen.V;
                        return new CenteredAmountDelegate(new fgj.g(amountScreen, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = AmountScreen.V;
                        return (l) ((ao1.c) amountScreen.T.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AmountScreen.V;
                        qji.b bVarU2 = amountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.amount.di.AmountScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        AmountScreenContract$InputData amountScreenContract$InputData = amountScreen.K;
                        amountScreenContract$InputData.getClass();
                        return new ao1.c(dVar, eVar2, amountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AmountScreen.V;
                        AmountScreen amountScreen2 = this.f136737b;
                        return dli.f.a(amountScreen2, amountScreen2.d(), zhm.v.k((CenteredAmountDelegate) amountScreen2.Q.getValue(), amountScreen2.R), R$id.bpayAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: fo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountScreen f136737b;

            {
                this.f136737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                AmountScreen amountScreen = this.f136737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountScreen.V;
                        qd0.b bVar = amountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = AmountScreen.V;
                        return new CenteredAmountDelegate(new fgj.g(amountScreen, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = AmountScreen.V;
                        return (l) ((ao1.c) amountScreen.T.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AmountScreen.V;
                        qji.b bVarU2 = amountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.amount.di.AmountScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        AmountScreenContract$InputData amountScreenContract$InputData = amountScreen.K;
                        amountScreenContract$InputData.getClass();
                        return new ao1.c(dVar, eVar2, amountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AmountScreen.V;
                        AmountScreen amountScreen2 = this.f136737b;
                        return dli.f.a(amountScreen2, amountScreen2.d(), zhm.v.k((CenteredAmountDelegate) amountScreen2.Q.getValue(), amountScreen2.R), R$id.bpayAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: fo1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AmountScreen f136737b;

            {
                this.f136737b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                AmountScreen amountScreen = this.f136737b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AmountScreen.V;
                        qd0.b bVar = amountScreen.O;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = AmountScreen.V;
                        return new CenteredAmountDelegate(new fgj.g(amountScreen, 17));
                    case 2:
                        KProperty[] kPropertyArr3 = AmountScreen.V;
                        return (l) ((ao1.c) amountScreen.T.getValue()).e.get();
                    case 3:
                        KProperty[] kPropertyArr4 = AmountScreen.V;
                        qji.b bVarU2 = amountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.bpay.impl.screen.amount.di.AmountScreenInjector");
                        ao1.e eVar = (ao1.e) bVarU2;
                        ao1.d dVar = eVar.f7883b;
                        ao1.e eVar2 = eVar.f7884c;
                        AmountScreenContract$InputData amountScreenContract$InputData = amountScreen.K;
                        amountScreenContract$InputData.getClass();
                        return new ao1.c(dVar, eVar2, amountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = AmountScreen.V;
                        AmountScreen amountScreen2 = this.f136737b;
                        return dli.f.a(amountScreen2, amountScreen2.d(), zhm.v.k((CenteredAmountDelegate) amountScreen2.Q.getValue(), amountScreen2.R), R$id.bpayAmountScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().f315080b;
        j8 j8Var = uiState.f136772b;
        boolean z = uiState.d;
        navBarWithAvatar.setModel(j8Var);
        d3().e.setTextClause(uiState.e);
        LargeActionButton bpayAmountScreenScheduleButton = d3().f315081c;
        Intrinsics.checkNotNullExpressionValue(bpayAmountScreenScheduleButton, "bpayAmountScreenScheduleButton");
        bpayAmountScreenScheduleButton.setVisibility(uiState.f136773c ? 0 : 8);
        d3().d.setEnabled(z);
        d3().f315081c.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVarN = ((c) this.T.getValue()).f7867b.e.n();
        s.j(bVarN);
        this.O = bVarN;
        d3().f315080b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().d;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setTag("GOTO_BUTTON_TAG");
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(false);
        LargeActionButton largeActionButton2 = d3().f315081c;
        largeActionButton2.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        pd.b.p(largeActionButton2, new TextLocalisedClause(R$string.pay_bills_taxes_country_au_review_button_schedule, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r62 = this.Q;
        ViewController.P2(this, l.y(((CenteredAmountDelegate) r62.getValue()).e.f121375b, ((CenteredAmountDelegate) r62.getValue()).f51966j.f121375b, "merge(...)"), new fo1.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f315080b.f59338a), new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f315081c.o), null, new d(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), null, new f(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).f.f121375b), null, new fo1.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.e.f121375b), null, new fo1.f(this, null), 3);
    }

    public final yn1.a d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yn1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final fo1.l d() {
        return (fo1.l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
