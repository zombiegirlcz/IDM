package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.amount.PixQrCodeTransactionAmountScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import p8a.j0;
import q2e.i0;
import q5g.f0;
import qba.b;
import qba.c;
import qba.d;
import qba.f;
import qba.g;
import qba.i;
import qba.j;
import qba.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/amount/PixQrCodeTransactionAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqba/i;", "Ldli/a;", "Lqba/k;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeTransactionAmountScreen extends ViewController<i> implements a, d1 {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PixQrCodeTransactionAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixQrCodeTransactionAmountBinding;", 0))};
    public final boolean K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public PixQrCodeTransactionAmountScreen(PixQrCodeTransactionAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = R$layout.screen_pix_qr_code_transaction_amount;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionAmountScreen f244146b;

            {
                this.f244146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen = this.f244146b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                        return (j) ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeTransactionAmountScreen.W;
                        PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen2 = this.f244146b;
                        return dli.f.a(pixQrCodeTransactionAmountScreen2, pixQrCodeTransactionAmountScreen2.R2(), v.k((CenteredAmountDelegate) pixQrCodeTransactionAmountScreen2.U.getValue(), (InputTextDelegate) pixQrCodeTransactionAmountScreen2.T.getValue(), (RowLoadingDelegate) pixQrCodeTransactionAmountScreen2.V.getValue(), (TextDelegate) pixQrCodeTransactionAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionAmountScreen2.R.getValue()), R$id.pixQrCodeTransactionAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeTransactionAmountScreen.W;
                        qd0.b bVarN = ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f233995b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = PixQrCodeTransactionAmountScreen.W;
                        return new CenteredAmountDelegate(new f0(pixQrCodeTransactionAmountScreen, 11));
                }
            }
        });
        this.N = s.t(this, d.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: qba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionAmountScreen f244146b;

            {
                this.f244146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen = this.f244146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                        return (j) ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeTransactionAmountScreen.W;
                        PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen2 = this.f244146b;
                        return dli.f.a(pixQrCodeTransactionAmountScreen2, pixQrCodeTransactionAmountScreen2.R2(), v.k((CenteredAmountDelegate) pixQrCodeTransactionAmountScreen2.U.getValue(), (InputTextDelegate) pixQrCodeTransactionAmountScreen2.T.getValue(), (RowLoadingDelegate) pixQrCodeTransactionAmountScreen2.V.getValue(), (TextDelegate) pixQrCodeTransactionAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionAmountScreen2.R.getValue()), R$id.pixQrCodeTransactionAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeTransactionAmountScreen.W;
                        qd0.b bVarN = ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f233995b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = PixQrCodeTransactionAmountScreen.W;
                        return new CenteredAmountDelegate(new f0(pixQrCodeTransactionAmountScreen, 11));
                }
            }
        });
        this.P = w.y0(new b(this, inputData, 0));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionAmountScreen f244146b;

            {
                this.f244146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen = this.f244146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                        return (j) ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeTransactionAmountScreen.W;
                        PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen2 = this.f244146b;
                        return dli.f.a(pixQrCodeTransactionAmountScreen2, pixQrCodeTransactionAmountScreen2.R2(), v.k((CenteredAmountDelegate) pixQrCodeTransactionAmountScreen2.U.getValue(), (InputTextDelegate) pixQrCodeTransactionAmountScreen2.T.getValue(), (RowLoadingDelegate) pixQrCodeTransactionAmountScreen2.V.getValue(), (TextDelegate) pixQrCodeTransactionAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionAmountScreen2.R.getValue()), R$id.pixQrCodeTransactionAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeTransactionAmountScreen.W;
                        qd0.b bVarN = ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f233995b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = PixQrCodeTransactionAmountScreen.W;
                        return new CenteredAmountDelegate(new f0(pixQrCodeTransactionAmountScreen, 11));
                }
            }
        });
        this.R = w.y0(new q50.w(27));
        this.S = w.y0(new q50.w(28));
        this.T = w.y0(new q50.w(29));
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: qba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeTransactionAmountScreen f244146b;

            {
                this.f244146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen = this.f244146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeTransactionAmountScreen.W;
                        return (j) ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeTransactionAmountScreen.W;
                        PixQrCodeTransactionAmountScreen pixQrCodeTransactionAmountScreen2 = this.f244146b;
                        return dli.f.a(pixQrCodeTransactionAmountScreen2, pixQrCodeTransactionAmountScreen2.R2(), v.k((CenteredAmountDelegate) pixQrCodeTransactionAmountScreen2.U.getValue(), (InputTextDelegate) pixQrCodeTransactionAmountScreen2.T.getValue(), (RowLoadingDelegate) pixQrCodeTransactionAmountScreen2.V.getValue(), (TextDelegate) pixQrCodeTransactionAmountScreen2.S.getValue(), (LargeActionButtonDelegate) pixQrCodeTransactionAmountScreen2.R.getValue()), R$id.pixQrCodeTransactionAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = PixQrCodeTransactionAmountScreen.W;
                        qd0.b bVarN = ((j0) pixQrCodeTransactionAmountScreen.P.getValue()).f233995b.f233933h.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr4 = PixQrCodeTransactionAmountScreen.W;
                        return new CenteredAmountDelegate(new f0(pixQrCodeTransactionAmountScreen, 11));
                }
            }
        });
        this.V = w.y0(new c(0));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().d.setModel(uiState.f244163b);
        LegacyButtonContainerConstraintLayout pixQrCodeTransactionAmountScreenFooterContainer = d3().f222973b;
        Intrinsics.checkNotNullExpressionValue(pixQrCodeTransactionAmountScreenFooterContainer, "pixQrCodeTransactionAmountScreenFooterContainer");
        g gVar = uiState.f244164c;
        pixQrCodeTransactionAmountScreenFooterContainer.setVisibility(0);
        Clause clause = gVar.d;
        LargeActionButton largeActionButton = d3().e;
        largeActionButton.setVisibility(gVar.f244153c ? 0 : 8);
        largeActionButton.setEnabled(gVar.f244152b);
        d3().f.setEnabled(gVar.f244151a);
        FooterTextView footerTextView = d3().f222974c;
        footerTextView.setVisibility(clause == null ? 8 : 0);
        footerTextView.setTextClause(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().d;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59338a), null, new qba.e(this, continuation, 0), 3);
        LargeActionButton largeActionButton = d3().f;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButton.o), null, new qba.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new qba.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) this.U.getValue()).d.f121375b), null, new i0(this, continuation, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.T.getValue()).e.f121375b), null, new f(this, null), 3);
        d3().f.setText(new TextLocalisedClause(R$string.pix_transaction_review_cta_button, null, null, 14));
        d3().e.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    public final o8a.d d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o8a.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
