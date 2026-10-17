package com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.q;
import cli.w;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.u2;
import no.m;
import vc.s;
import x0i.i;
import x13.r;
import x1e.g;
import x23.d;
import x23.f;
import x23.l;
import x23.n;
import x23.o;
import xki.e;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/CardPersonalisationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/card_order_new/impl/kompot/screen/card_personalisation/a;", "Lcli/w;", "Lx23/m;", "Lno/m;", "Lx23/o;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardPersonalisationController extends ViewController<a> implements w, m, o {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CardPersonalisationController.class, "binding", "getBinding()Lcom/revolut/feature/card_order_new/impl/databinding/ScreenCardPersonalisationBinding;", 0))};
    public final int K;
    public final h L;
    public final AnalyticsProduct M;
    public final Object N;
    public final Object O;
    public final Object P;
    public boolean Q;
    public final Object R;
    public final j S;

    public CardPersonalisationController(CardPersonalisationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_card_personalisation;
        this.L = s.t(this, x23.b.f);
        this.M = inputData.f65163h;
        this.N = te0.w.y0(new wrj.m(this, inputData, 13));
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: x23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationController f302465b;

            {
                this.f302465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CardPersonalisationController cardPersonalisationController = this.f302465b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardPersonalisationController.T;
                        return (i) ((x13.r) cardPersonalisationController.N.getValue()).f302194l.get();
                    default:
                        KProperty[] kPropertyArr2 = CardPersonalisationController.T;
                        return n14.e.a(cardPersonalisationController, cardPersonalisationController.R2());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: x23.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardPersonalisationController f302465b;

            {
                this.f302465b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CardPersonalisationController cardPersonalisationController = this.f302465b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CardPersonalisationController.T;
                        return (i) ((x13.r) cardPersonalisationController.N.getValue()).f302194l.get();
                    default:
                        KProperty[] kPropertyArr2 = CardPersonalisationController.T;
                        return n14.e.a(cardPersonalisationController, cardPersonalisationController.R2());
                }
            }
        });
        Lazy lazyY0 = te0.w.y0(new g(14));
        this.R = lazyY0;
        this.S = new j(7, u.c((SuggestionsBarDelegate) lazyY0.getValue()), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        x23.m uiState = (x23.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        n nVar = qVar instanceof n ? (n) qVar : null;
        if (!this.Q) {
            x23.h hVar = uiState.f302486a;
            CardPersonalisationView cardPersonalisationView = d3().f211227c;
            cardPersonalisationView.setCardImage(hVar.f302470a);
            cardPersonalisationView.setDrawingShapePoints(hVar.f302471b);
            int i = hVar.f302472c;
            cardPersonalisationView.setDrawingColor(i);
            cardPersonalisationView.setStrokeColor(i);
            cardPersonalisationView.setMovingHintLabel(hVar.d);
            cardPersonalisationView.setPinToAdjustHintLabel(hVar.e);
            cardPersonalisationView.setActionToolsEnabled(hVar.f302473g);
            cardPersonalisationView.setFontsToolsEnabled(!hVar.f302474h);
            cardPersonalisationView.setToolsConfiguration(hVar.f);
            LottieImage lottieImage = hVar.i;
            if (lottieImage != null) {
                cardPersonalisationView.setCustomisationLottieAnimation(lottieImage);
            }
            CardPersonalisationView cardPersonalisationView2 = d3().f211227c;
            cardPersonalisationView2.post(new u2(cardPersonalisationView2, 0));
            this.Q = true;
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f302490a) : null)) {
            TwinVerticalButton twinVerticalButton = d3().e;
            l lVar = uiState.f302487b;
            x23.g gVar = lVar.f302483a;
            twinVerticalButton.setMainButtonText((Clause) gVar.f302468a);
            x23.g gVar2 = lVar.f302484b;
            twinVerticalButton.setMainButtonVisible(gVar.f302469b);
            twinVerticalButton.setSecondaryButtonText((Clause) gVar2.f302468a);
            twinVerticalButton.setSecondaryButtonVisible(gVar2.f302469b);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f302491b) : null)) {
            NavBarWithToolbar navBarWithToolbar = d3().d;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            navBarWithToolbar.setTitle(uiState.f302488c, null);
            d3().d.setToolbarTitle(uiState.f302488c);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f302492c) : null)) {
            d3().d.setDescriptionVisible(true);
            d3().d.setDescriptionText(uiState.d);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.d) : null)) {
            d3().d.setMenuItems(uiState.e);
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.e) : null)) {
            if (uiState.f) {
                d3().d.setAlwaysExpanded(false);
                d3().d.j0(true);
                d3().f211227c.G0();
            } else {
                d3().d.setAlwaysExpanded(true);
                d3().d.H0(false);
                d3().f211227c.F0();
            }
        }
        if (pd.b.k(nVar != null ? Boolean.valueOf(nVar.f) : null)) {
            this.S.c(uiState.f302489g);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((c) R2()).L2();
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setAlwaysExpanded(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGreyTone50);
        CardPersonalisationView cardPersonalisationView = d3().f211227c;
        cardPersonalisationView.v0();
        cardPersonalisationView.w0();
        TwinVerticalButton twinVerticalButton = d3().e;
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setMainButtonCustomE2ETestId("card_personalisation.main_button");
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        AsyncDiffRecyclerView asyncDiffRecyclerView = d3().f211226b;
        asyncDiffRecyclerView.setAdapter(this.S);
        asyncDiffRecyclerView.setOverScrollMode(2);
        asyncDiffRecyclerView.setLayoutManager(new LinearLayoutManager(m2(), 1, false));
        ViewCompat.setOnApplyWindowInsetsListener(d3().f211226b, new i(this, 2));
    }

    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.o.f57403b), null, new x23.e(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.p0()), null, new x23.e(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o0()), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.p0()), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.u), null, new x23.e(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.f58391q), null, new x23.e(this, continuation, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.D0()), null, new d(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.E0()), null, new d(this, continuation, 5), 3);
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.C0()), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.B0()), null, new x23.e(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.f58394t), null, new x23.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f211227c.v), null, new x23.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SuggestionsBarDelegate) this.R.getValue()).p().d), null, new f(this, null), 3);
    }

    public final n13.b d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n13.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final x23.i R2() {
        return (x23.i) this.O.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof x23.c
            if (r0 == 0) goto L13
            r0 = r5
            x23.c r0 = (x23.c) r0
            int r1 = r0.f302466w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302466w = r1
            goto L18
        L13:
            x23.c r0 = new x23.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302466w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            n13.b r5 = r4.d3()
            com.revolut.core.ui_kit.views.CardPersonalisationView r5 = r5.f211227c
            efm.d0 r5 = r5.getDrawingAreaBitmap()
            r0.f302466w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_order_new.impl.kompot.screen.card_personalisation.CardPersonalisationController.f3(gim.c):java.lang.Object");
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
