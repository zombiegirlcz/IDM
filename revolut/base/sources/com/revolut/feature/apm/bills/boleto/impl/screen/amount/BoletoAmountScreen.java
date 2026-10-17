package com.revolut.feature.apm.bills.boleto.impl.screen.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import aw0.j8;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.bills.boleto.impl.R$id;
import com.revolut.feature.apm.bills.boleto.impl.R$layout;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import ibg.g;
import il9.p;
import in1.c;
import in1.d;
import in1.f;
import in1.h;
import in1.i;
import in1.j;
import in1.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/screen/amount/BoletoAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lin1/i;", "Ldli/a;", "Lin1/k;", "Lno/d1;", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BoletoAmountScreen extends ViewController<i> implements a, d1 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(BoletoAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/bills/boleto/impl/databinding/ScreenBoletoAmountBinding;", 0))};
    public final h K;
    public final boolean L;
    public final int M;
    public final Object N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public BoletoAmountScreen(h inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_boleto_amount;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: in1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoAmountScreen f162581b;

            {
                this.f162581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                BoletoAmountScreen boletoAmountScreen = this.f162581b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoAmountScreen.W;
                        return (j) ((sm1.c) boletoAmountScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                        BoletoAmountScreen boletoAmountScreen2 = this.f162581b;
                        return dli.f.a(boletoAmountScreen2, boletoAmountScreen2.R2(), v.k((CenteredAmountDelegate) boletoAmountScreen2.U.getValue(), (RowLoadingDelegate) boletoAmountScreen2.V.getValue(), (TextDelegate) boletoAmountScreen2.T.getValue(), (LargeActionButtonDelegate) boletoAmountScreen2.S.getValue()), R$id.boletoAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                        qji.b bVarU2 = boletoAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.amount.di.BoletoAmountScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        h hVar = boletoAmountScreen.K;
                        hVar.getClass();
                        return new sm1.c(dVar, iVar2, hVar);
                    case 3:
                        KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                        qd0.b bVarN = ((sm1.c) boletoAmountScreen.Q.getValue()).f264307b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = BoletoAmountScreen.W;
                        return new CenteredAmountDelegate(new a(boletoAmountScreen, i3));
                }
            }
        });
        this.O = s.t(this, c.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: in1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoAmountScreen f162581b;

            {
                this.f162581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                BoletoAmountScreen boletoAmountScreen = this.f162581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoAmountScreen.W;
                        return (j) ((sm1.c) boletoAmountScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                        BoletoAmountScreen boletoAmountScreen2 = this.f162581b;
                        return dli.f.a(boletoAmountScreen2, boletoAmountScreen2.R2(), v.k((CenteredAmountDelegate) boletoAmountScreen2.U.getValue(), (RowLoadingDelegate) boletoAmountScreen2.V.getValue(), (TextDelegate) boletoAmountScreen2.T.getValue(), (LargeActionButtonDelegate) boletoAmountScreen2.S.getValue()), R$id.boletoAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                        qji.b bVarU2 = boletoAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.amount.di.BoletoAmountScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        h hVar = boletoAmountScreen.K;
                        hVar.getClass();
                        return new sm1.c(dVar, iVar2, hVar);
                    case 3:
                        KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                        qd0.b bVarN = ((sm1.c) boletoAmountScreen.Q.getValue()).f264307b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = BoletoAmountScreen.W;
                        return new CenteredAmountDelegate(new a(boletoAmountScreen, i3));
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: in1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoAmountScreen f162581b;

            {
                this.f162581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                BoletoAmountScreen boletoAmountScreen = this.f162581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoAmountScreen.W;
                        return (j) ((sm1.c) boletoAmountScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                        BoletoAmountScreen boletoAmountScreen2 = this.f162581b;
                        return dli.f.a(boletoAmountScreen2, boletoAmountScreen2.R2(), v.k((CenteredAmountDelegate) boletoAmountScreen2.U.getValue(), (RowLoadingDelegate) boletoAmountScreen2.V.getValue(), (TextDelegate) boletoAmountScreen2.T.getValue(), (LargeActionButtonDelegate) boletoAmountScreen2.S.getValue()), R$id.boletoAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                        qji.b bVarU2 = boletoAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.amount.di.BoletoAmountScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        h hVar = boletoAmountScreen.K;
                        hVar.getClass();
                        return new sm1.c(dVar, iVar2, hVar);
                    case 3:
                        KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                        qd0.b bVarN = ((sm1.c) boletoAmountScreen.Q.getValue()).f264307b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = BoletoAmountScreen.W;
                        return new CenteredAmountDelegate(new a(boletoAmountScreen, i32));
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: in1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoAmountScreen f162581b;

            {
                this.f162581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 0;
                BoletoAmountScreen boletoAmountScreen = this.f162581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoAmountScreen.W;
                        return (j) ((sm1.c) boletoAmountScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                        BoletoAmountScreen boletoAmountScreen2 = this.f162581b;
                        return dli.f.a(boletoAmountScreen2, boletoAmountScreen2.R2(), v.k((CenteredAmountDelegate) boletoAmountScreen2.U.getValue(), (RowLoadingDelegate) boletoAmountScreen2.V.getValue(), (TextDelegate) boletoAmountScreen2.T.getValue(), (LargeActionButtonDelegate) boletoAmountScreen2.S.getValue()), R$id.boletoAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                        qji.b bVarU2 = boletoAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.amount.di.BoletoAmountScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        h hVar = boletoAmountScreen.K;
                        hVar.getClass();
                        return new sm1.c(dVar, iVar2, hVar);
                    case 3:
                        KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                        qd0.b bVarN = ((sm1.c) boletoAmountScreen.Q.getValue()).f264307b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = BoletoAmountScreen.W;
                        return new CenteredAmountDelegate(new a(boletoAmountScreen, i32));
                }
            }
        });
        this.S = w.y0(new p(5));
        this.T = w.y0(new p(6));
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: in1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BoletoAmountScreen f162581b;

            {
                this.f162581b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                int i32 = 0;
                BoletoAmountScreen boletoAmountScreen = this.f162581b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BoletoAmountScreen.W;
                        return (j) ((sm1.c) boletoAmountScreen.Q.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BoletoAmountScreen.W;
                        BoletoAmountScreen boletoAmountScreen2 = this.f162581b;
                        return dli.f.a(boletoAmountScreen2, boletoAmountScreen2.R2(), v.k((CenteredAmountDelegate) boletoAmountScreen2.U.getValue(), (RowLoadingDelegate) boletoAmountScreen2.V.getValue(), (TextDelegate) boletoAmountScreen2.T.getValue(), (LargeActionButtonDelegate) boletoAmountScreen2.S.getValue()), R$id.boletoAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BoletoAmountScreen.W;
                        qji.b bVarU2 = boletoAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.screen.amount.di.BoletoAmountScreenInjector");
                        sm1.i iVar = (sm1.i) bVarU2;
                        sm1.d dVar = iVar.f264330b;
                        sm1.i iVar2 = iVar.f264331c;
                        h hVar = boletoAmountScreen.K;
                        hVar.getClass();
                        return new sm1.c(dVar, iVar2, hVar);
                    case 3:
                        KProperty[] kPropertyArr4 = BoletoAmountScreen.W;
                        qd0.b bVarN = ((sm1.c) boletoAmountScreen.Q.getValue()).f264307b.i.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = BoletoAmountScreen.W;
                        return new CenteredAmountDelegate(new a(boletoAmountScreen, i32));
                }
            }
        });
        this.V = w.y0(new p(7));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().d;
        j8 j8Var = uiState.f162598b;
        Clause clause = uiState.d;
        navBarWithAvatar.setModel(j8Var);
        LegacyButtonContainerConstraintLayout boletoAmountScreenFooterContainer = d3().f255176b;
        Intrinsics.checkNotNullExpressionValue(boletoAmountScreenFooterContainer, "boletoAmountScreenFooterContainer");
        f fVar = uiState.f162599c;
        boletoAmountScreenFooterContainer.setVisibility(0);
        FooterTextView footerTextView = d3().f255177c;
        footerTextView.setVisibility(clause == null ? 8 : 0);
        footerTextView.setTextClause(clause);
        d3().e.setEnabled(fVar.f162583b);
        d3().f.setEnabled(fVar.f162582a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sm1.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().d;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59338a), null, new d(this, continuation, 0), 3);
        LargeActionButton largeActionButton = d3().f;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButton.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new d(this, continuation, 2), 3);
        ?? r132 = this.U;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r132.getValue()).d.f121375b), null, new g(this, continuation, 18), 3);
        l.A(R.string.common_action_continue, null, null, 14, d3().f);
        d3().e.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
        ViewController.P2(this, l.y(((CenteredAmountDelegate) r132.getValue()).e.f121375b, ((CenteredAmountDelegate) r132.getValue()).f51966j.f121375b, "merge(...)"), new in1.e(this, null), 3);
    }

    public final rm1.a d3() {
        ViewBinding value = this.O.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rm1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
