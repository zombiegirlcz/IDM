package com.revolut.feature.credit.card.impl.ui.credit_limit_cap;

import aii.r;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeSliderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.feature.credit.card.impl.R$layout;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.a3;
import jm4.e3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rq4.d;
import rq4.f;
import rq4.g;
import rq4.l;
import te0.w;
import vc.s;
import vkm.z1;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/credit_limit_cap/CreditLimitCapChangeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/r;", "Ldli/a;", "Lrq4/l;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditLimitCapChangeScreen extends ViewController<r> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditLimitCapChangeScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/card/impl/databinding/ScreenCreditCapChangeBinding;", 0))};
    public final CreditLimitCapChangeScreenContract$InputData K;
    public final LargeSliderDelegate L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final z1 P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;
    public final Object U;
    public final Object V;
    public final int W;

    public CreditLimitCapChangeScreen(CreditLimitCapChangeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new LargeSliderDelegate();
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        this.P = ta6.a.a(0);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        this.T = s.t(this, rq4.c.f);
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        final int i21 = 5;
        this.V = w.y0(new Function0(this) { // from class: rq4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditLimitCapChangeScreen f256460b;

            {
                this.f256460b = this;
            }

            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i21;
                CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256460b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditLimitCapChangeScreen.X;
                        qd0.b bVarN = ((e3) creditLimitCapChangeScreen.U.getValue()).f176058b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 1:
                        KProperty[] kPropertyArr2 = CreditLimitCapChangeScreen.X;
                        return new rl8.d(creditLimitCapChangeScreen, 9);
                    case 2:
                        return new CenteredAmountDelegate((Function2) creditLimitCapChangeScreen.Q.getValue());
                    case 3:
                        KProperty[] kPropertyArr3 = CreditLimitCapChangeScreen.X;
                        CreditLimitCapChangeScreen creditLimitCapChangeScreen2 = this.f256460b;
                        return dli.f.a(creditLimitCapChangeScreen2, creditLimitCapChangeScreen2.e3(), v.k(new RowLoadingDelegate(), creditLimitCapChangeScreen2.N, creditLimitCapChangeScreen2.L, creditLimitCapChangeScreen2.M, (CenteredAmountDelegate) creditLimitCapChangeScreen2.R.getValue()), R$id.screenCreditLimitCapChange_recyclerView, null, null, null, 56);
                    case 4:
                        KProperty[] kPropertyArr4 = CreditLimitCapChangeScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(creditLimitCapChangeScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        CreditLimitCapChangeScreenContract$InputData creditLimitCapChangeScreenContract$InputData = creditLimitCapChangeScreen.K;
                        creditLimitCapChangeScreenContract$InputData.getClass();
                        return new e3(a3Var, creditLimitCapChangeScreen, creditLimitCapChangeScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr5 = CreditLimitCapChangeScreen.X;
                        return (k) ((e3) creditLimitCapChangeScreen.U.getValue()).i.get();
                }
            }
        });
        this.W = R$layout.screen_credit_cap_change;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        im4.b bVarD3 = d3();
        i iVar = uiState.f256468a;
        if (iVar != null) {
            bVarD3.f162300b.setModel(iVar);
        }
        if (uiState.f256470c) {
            ActionFooterView screenCreditLimitCapChangeActionFooterView = bVarD3.f162300b;
            Intrinsics.checkNotNullExpressionValue(screenCreditLimitCapChangeActionFooterView, "screenCreditLimitCapChangeActionFooterView");
            k.d(screenCreditLimitCapChangeActionFooterView);
        } else {
            ActionFooterView screenCreditLimitCapChangeActionFooterView2 = bVarD3.f162300b;
            Intrinsics.checkNotNullExpressionValue(screenCreditLimitCapChangeActionFooterView2, "screenCreditLimitCapChangeActionFooterView");
            k.a(screenCreditLimitCapChangeActionFooterView2);
        }
        Clause clause = uiState.f256469b;
        if (clause != null) {
            bVarD3.f162301c.setTextClause(clause);
            FooterTextView screenCreditLimitCapChangeFooterText = bVarD3.f162301c;
            Intrinsics.checkNotNullExpressionValue(screenCreditLimitCapChangeFooterText, "screenCreditLimitCapChangeFooterText");
            k.d(screenCreditLimitCapChangeFooterText);
            return;
        }
        FooterTextView screenCreditLimitCapChangeFooterText2 = bVarD3.f162301c;
        Intrinsics.checkNotNullExpressionValue(screenCreditLimitCapChangeFooterText2, "screenCreditLimitCapChangeFooterText");
        k.a(screenCreditLimitCapChangeFooterText2);
        Unit unit = Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e3) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(d3().d.f59211b), new d(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52627c), new rq4.e(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new f(this, null), 3);
        int i2 = 1;
        ViewController.P2(this, vkm.q.J(rd0.e.b(d3().f162301c.f58608l), rd0.e.b(d3().f162300b.e)), new d(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(d3().f162300b.f), new rk9.d(view, this, continuation, 17), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) this.R.getValue()).f.f121375b), new g(this, null), 3);
        RowDelegate rowDelegate = this.M;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new rq4.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new rq4.e(this, continuation, i2), 3);
        ViewController.P2(this, this.P, new rch.o(2, e3(), rq4.k.class, "onAmountChanged", "onAmountChanged(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 3);
    }

    public final im4.b d3() {
        ViewBinding value = this.T.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (im4.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final rq4.k R2() {
        return (rq4.k) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
