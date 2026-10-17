package com.revolut.feature.apm.wero.impl.ui.pay.create;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.R$id;
import com.revolut.feature.apm.core.ui.api.R$layout;
import com.revolut.feature.apm.wero.impl.ui.pay.create.CreateRequestLinkScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import h30.l;
import hi2.c;
import hi2.d;
import hi2.i;
import hi2.j;
import hi2.n;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nh2.p;
import qd0.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/wero/impl/ui/pay/create/CreateRequestLinkScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhi2/i;", "Ldli/a;", "Lhi2/j;", "<init>", "()V", "feature_apm_wero_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateRequestLinkScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreateRequestLinkScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0))};
    public b N;
    public final Object O;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final int K = R$layout.screen_transfer_amount;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final InputTextDelegate P = new InputTextDelegate(null);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, w02.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/apm/core/ui/api/databinding/ScreenTransferAmountBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return w02.b.a(p0);
        }
    }

    public CreateRequestLinkScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateRequestLinkScreen f152450b;

            {
                this.f152450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreateRequestLinkScreen createRequestLinkScreen = this.f152450b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                        qd0.b bVar = createRequestLinkScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = CreateRequestLinkScreen.U;
                        return new CenteredAmountDelegate(new hfb.d(createRequestLinkScreen, 6));
                    case 2:
                        KProperty[] kPropertyArr3 = CreateRequestLinkScreen.U;
                        CreateRequestLinkScreen createRequestLinkScreen2 = this.f152450b;
                        return dli.f.a(createRequestLinkScreen2, createRequestLinkScreen2.d(), v.k((CenteredAmountDelegate) createRequestLinkScreen2.Q.getValue(), createRequestLinkScreen2.P, new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreateRequestLinkScreen.U;
                        qji.b bVarU2 = createRequestLinkScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.pay.create.di.CreateLinkAmountScreenInjector");
                        nh2.v vVar = (nh2.v) bVarU2;
                        return new p(vVar.f215356b, vVar.f215357c, createRequestLinkScreen);
                    default:
                        KProperty[] kPropertyArr5 = CreateRequestLinkScreen.U;
                        return (n) ((p) createRequestLinkScreen.S.getValue()).f215336l.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateRequestLinkScreen f152450b;

            {
                this.f152450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreateRequestLinkScreen createRequestLinkScreen = this.f152450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                        qd0.b bVar = createRequestLinkScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = CreateRequestLinkScreen.U;
                        return new CenteredAmountDelegate(new hfb.d(createRequestLinkScreen, 6));
                    case 2:
                        KProperty[] kPropertyArr3 = CreateRequestLinkScreen.U;
                        CreateRequestLinkScreen createRequestLinkScreen2 = this.f152450b;
                        return dli.f.a(createRequestLinkScreen2, createRequestLinkScreen2.d(), v.k((CenteredAmountDelegate) createRequestLinkScreen2.Q.getValue(), createRequestLinkScreen2.P, new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreateRequestLinkScreen.U;
                        qji.b bVarU2 = createRequestLinkScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.pay.create.di.CreateLinkAmountScreenInjector");
                        nh2.v vVar = (nh2.v) bVarU2;
                        return new p(vVar.f215356b, vVar.f215357c, createRequestLinkScreen);
                    default:
                        KProperty[] kPropertyArr5 = CreateRequestLinkScreen.U;
                        return (n) ((p) createRequestLinkScreen.S.getValue()).f215336l.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateRequestLinkScreen f152450b;

            {
                this.f152450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreateRequestLinkScreen createRequestLinkScreen = this.f152450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                        qd0.b bVar = createRequestLinkScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = CreateRequestLinkScreen.U;
                        return new CenteredAmountDelegate(new hfb.d(createRequestLinkScreen, 6));
                    case 2:
                        KProperty[] kPropertyArr3 = CreateRequestLinkScreen.U;
                        CreateRequestLinkScreen createRequestLinkScreen2 = this.f152450b;
                        return dli.f.a(createRequestLinkScreen2, createRequestLinkScreen2.d(), v.k((CenteredAmountDelegate) createRequestLinkScreen2.Q.getValue(), createRequestLinkScreen2.P, new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreateRequestLinkScreen.U;
                        qji.b bVarU2 = createRequestLinkScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.pay.create.di.CreateLinkAmountScreenInjector");
                        nh2.v vVar = (nh2.v) bVarU2;
                        return new p(vVar.f215356b, vVar.f215357c, createRequestLinkScreen);
                    default:
                        KProperty[] kPropertyArr5 = CreateRequestLinkScreen.U;
                        return (n) ((p) createRequestLinkScreen.S.getValue()).f215336l.get();
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: hi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateRequestLinkScreen f152450b;

            {
                this.f152450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreateRequestLinkScreen createRequestLinkScreen = this.f152450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                        qd0.b bVar = createRequestLinkScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = CreateRequestLinkScreen.U;
                        return new CenteredAmountDelegate(new hfb.d(createRequestLinkScreen, 6));
                    case 2:
                        KProperty[] kPropertyArr3 = CreateRequestLinkScreen.U;
                        CreateRequestLinkScreen createRequestLinkScreen2 = this.f152450b;
                        return dli.f.a(createRequestLinkScreen2, createRequestLinkScreen2.d(), v.k((CenteredAmountDelegate) createRequestLinkScreen2.Q.getValue(), createRequestLinkScreen2.P, new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreateRequestLinkScreen.U;
                        qji.b bVarU2 = createRequestLinkScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.pay.create.di.CreateLinkAmountScreenInjector");
                        nh2.v vVar = (nh2.v) bVarU2;
                        return new p(vVar.f215356b, vVar.f215357c, createRequestLinkScreen);
                    default:
                        KProperty[] kPropertyArr5 = CreateRequestLinkScreen.U;
                        return (n) ((p) createRequestLinkScreen.S.getValue()).f215336l.get();
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: hi2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateRequestLinkScreen f152450b;

            {
                this.f152450b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreateRequestLinkScreen createRequestLinkScreen = this.f152450b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreateRequestLinkScreen.U;
                        qd0.b bVar = createRequestLinkScreen.N;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    case 1:
                        KProperty[] kPropertyArr2 = CreateRequestLinkScreen.U;
                        return new CenteredAmountDelegate(new hfb.d(createRequestLinkScreen, 6));
                    case 2:
                        KProperty[] kPropertyArr3 = CreateRequestLinkScreen.U;
                        CreateRequestLinkScreen createRequestLinkScreen2 = this.f152450b;
                        return dli.f.a(createRequestLinkScreen2, createRequestLinkScreen2.d(), v.k((CenteredAmountDelegate) createRequestLinkScreen2.Q.getValue(), createRequestLinkScreen2.P, new RowLoadingDelegate()), R$id.transferScreenAmount_recyclerView, null, null, null, 56);
                    case 3:
                        KProperty[] kPropertyArr4 = CreateRequestLinkScreen.U;
                        qji.b bVarU2 = createRequestLinkScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.wero.impl.ui.pay.create.di.CreateLinkAmountScreenInjector");
                        nh2.v vVar = (nh2.v) bVarU2;
                        return new p(vVar.f215356b, vVar.f215357c, createRequestLinkScreen);
                    default:
                        KProperty[] kPropertyArr5 = CreateRequestLinkScreen.U;
                        return (n) ((p) createRequestLinkScreen.S.getValue()).f215336l.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f293623g;
        Clause clause = uiState.f152459b;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setEnabled(uiState.f152460c);
        largeActionButton.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        b bVarN = ((p) this.S.getValue()).f215330a.i.n();
        s.j(bVarN);
        this.N = bVarN;
        pd.b.p(view, new TextLocalisedClause(R$string.apm_product_wero_title, null, null, 14));
        NavBarWithAvatar navBarWithAvatar = d3().d;
        navBarWithAvatar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_back, null, null, 14), 126));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(com.revolut.feature.apm.wero.api.R$string.wero_qr_link_title, null, null, 14));
        LargeActionButton largeActionButton = d3().f293623g;
        largeActionButton.setLoadingButtonTag("WERO_QR_AMOUNT_CTA_BUTTON_TAG");
        largeActionButton.setVisibility(8);
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59338a), null, new hi2.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f293623g.o), null, new hi2.b(this, continuation, 1), 3);
        ?? r62 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).d.f121375b), null, new c(this, continuation, 0), 3);
        f fVar = ((CenteredAmountDelegate) r62.getValue()).f51967l.f121375b;
        InputTextDelegate inputTextDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, l.y(fVar, inputTextDelegate.f.f121375b, "merge(...)"), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new d(this, null), 3);
    }

    public final w02.b d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w02.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
