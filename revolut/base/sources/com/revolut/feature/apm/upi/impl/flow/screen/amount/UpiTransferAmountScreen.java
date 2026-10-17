package com.revolut.feature.apm.upi.impl.flow.screen.amount;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bg2.b;
import bg2.f;
import bg2.j;
import bg2.k;
import bg2.l;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.legacy.LegacyButtonContainerConstraintLayout;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.impl.R$id;
import com.revolut.feature.apm.upi.impl.R$layout;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreen;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import gf2.c;
import if2.m;
import java.util.List;
import jh.d;
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

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/screen/amount/UpiTransferAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbg2/j;", "Ldli/a;", "Lbg2/l;", "Lno/d1;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiTransferAmountScreen extends ViewController<j> implements a, d1 {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(UpiTransferAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/upi/impl/databinding/ScreenUpiTransferAmountBinding;", 0))};
    public final UpiTransferAmountScreenContract$InputData K;
    public final boolean L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public UpiTransferAmountScreen(UpiTransferAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_upi_transfer_amount;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferAmountScreen f15048b;

            {
                this.f15048b = this;
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
                UpiTransferAmountScreen upiTransferAmountScreen = this.f15048b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
                        return (k) ((if2.m) upiTransferAmountScreen.Q.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferAmountScreen.X;
                        UpiTransferAmountScreen upiTransferAmountScreen2 = this.f15048b;
                        return dli.f.a(upiTransferAmountScreen2, upiTransferAmountScreen2.R2(), zhm.v.k((CenteredAmountDelegate) upiTransferAmountScreen2.V.getValue(), (InputTextDelegate) upiTransferAmountScreen2.U.getValue(), (RowLoadingDelegate) upiTransferAmountScreen2.W.getValue(), (TextDelegate) upiTransferAmountScreen2.T.getValue(), (LargeActionButtonDelegate) upiTransferAmountScreen2.S.getValue()), R$id.upiTransferAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = UpiTransferAmountScreen.X;
                        qji.b bVarU2 = upiTransferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.amount.di.UpiTransferAmountScreenInjector");
                        if2.n nVar = (if2.n) bVarU2;
                        if2.f fVar = nVar.f160891b;
                        if2.n nVar2 = nVar.f160892c;
                        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = upiTransferAmountScreen.K;
                        upiTransferAmountScreenContract$InputData.getClass();
                        return new if2.m(fVar, nVar2, upiTransferAmountScreen, upiTransferAmountScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = UpiTransferAmountScreen.X;
                        qd0.b bVarN = ((if2.m) upiTransferAmountScreen.Q.getValue()).f160886b.f160851a.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = UpiTransferAmountScreen.X;
                        return new CenteredAmountDelegate(new b7d.c(upiTransferAmountScreen, 24));
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferAmountScreen f15048b;

            {
                this.f15048b = this;
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
                UpiTransferAmountScreen upiTransferAmountScreen = this.f15048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
                        return (k) ((if2.m) upiTransferAmountScreen.Q.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferAmountScreen.X;
                        UpiTransferAmountScreen upiTransferAmountScreen2 = this.f15048b;
                        return dli.f.a(upiTransferAmountScreen2, upiTransferAmountScreen2.R2(), zhm.v.k((CenteredAmountDelegate) upiTransferAmountScreen2.V.getValue(), (InputTextDelegate) upiTransferAmountScreen2.U.getValue(), (RowLoadingDelegate) upiTransferAmountScreen2.W.getValue(), (TextDelegate) upiTransferAmountScreen2.T.getValue(), (LargeActionButtonDelegate) upiTransferAmountScreen2.S.getValue()), R$id.upiTransferAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = UpiTransferAmountScreen.X;
                        qji.b bVarU2 = upiTransferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.amount.di.UpiTransferAmountScreenInjector");
                        if2.n nVar = (if2.n) bVarU2;
                        if2.f fVar = nVar.f160891b;
                        if2.n nVar2 = nVar.f160892c;
                        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = upiTransferAmountScreen.K;
                        upiTransferAmountScreenContract$InputData.getClass();
                        return new if2.m(fVar, nVar2, upiTransferAmountScreen, upiTransferAmountScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = UpiTransferAmountScreen.X;
                        qd0.b bVarN = ((if2.m) upiTransferAmountScreen.Q.getValue()).f160886b.f160851a.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = UpiTransferAmountScreen.X;
                        return new CenteredAmountDelegate(new b7d.c(upiTransferAmountScreen, 24));
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferAmountScreen f15048b;

            {
                this.f15048b = this;
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
                UpiTransferAmountScreen upiTransferAmountScreen = this.f15048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
                        return (k) ((if2.m) upiTransferAmountScreen.Q.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferAmountScreen.X;
                        UpiTransferAmountScreen upiTransferAmountScreen2 = this.f15048b;
                        return dli.f.a(upiTransferAmountScreen2, upiTransferAmountScreen2.R2(), zhm.v.k((CenteredAmountDelegate) upiTransferAmountScreen2.V.getValue(), (InputTextDelegate) upiTransferAmountScreen2.U.getValue(), (RowLoadingDelegate) upiTransferAmountScreen2.W.getValue(), (TextDelegate) upiTransferAmountScreen2.T.getValue(), (LargeActionButtonDelegate) upiTransferAmountScreen2.S.getValue()), R$id.upiTransferAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = UpiTransferAmountScreen.X;
                        qji.b bVarU2 = upiTransferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.amount.di.UpiTransferAmountScreenInjector");
                        if2.n nVar = (if2.n) bVarU2;
                        if2.f fVar = nVar.f160891b;
                        if2.n nVar2 = nVar.f160892c;
                        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = upiTransferAmountScreen.K;
                        upiTransferAmountScreenContract$InputData.getClass();
                        return new if2.m(fVar, nVar2, upiTransferAmountScreen, upiTransferAmountScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = UpiTransferAmountScreen.X;
                        qd0.b bVarN = ((if2.m) upiTransferAmountScreen.Q.getValue()).f160886b.f160851a.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = UpiTransferAmountScreen.X;
                        return new CenteredAmountDelegate(new b7d.c(upiTransferAmountScreen, 24));
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: bg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferAmountScreen f15048b;

            {
                this.f15048b = this;
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
                UpiTransferAmountScreen upiTransferAmountScreen = this.f15048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
                        return (k) ((if2.m) upiTransferAmountScreen.Q.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferAmountScreen.X;
                        UpiTransferAmountScreen upiTransferAmountScreen2 = this.f15048b;
                        return dli.f.a(upiTransferAmountScreen2, upiTransferAmountScreen2.R2(), zhm.v.k((CenteredAmountDelegate) upiTransferAmountScreen2.V.getValue(), (InputTextDelegate) upiTransferAmountScreen2.U.getValue(), (RowLoadingDelegate) upiTransferAmountScreen2.W.getValue(), (TextDelegate) upiTransferAmountScreen2.T.getValue(), (LargeActionButtonDelegate) upiTransferAmountScreen2.S.getValue()), R$id.upiTransferAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = UpiTransferAmountScreen.X;
                        qji.b bVarU2 = upiTransferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.amount.di.UpiTransferAmountScreenInjector");
                        if2.n nVar = (if2.n) bVarU2;
                        if2.f fVar = nVar.f160891b;
                        if2.n nVar2 = nVar.f160892c;
                        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = upiTransferAmountScreen.K;
                        upiTransferAmountScreenContract$InputData.getClass();
                        return new if2.m(fVar, nVar2, upiTransferAmountScreen, upiTransferAmountScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = UpiTransferAmountScreen.X;
                        qd0.b bVarN = ((if2.m) upiTransferAmountScreen.Q.getValue()).f160886b.f160851a.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = UpiTransferAmountScreen.X;
                        return new CenteredAmountDelegate(new b7d.c(upiTransferAmountScreen, 24));
                }
            }
        });
        this.S = w.y0(new b8g.a(17));
        this.T = w.y0(new b8g.a(18));
        this.U = w.y0(new b8g.a(19));
        final int i6 = 4;
        this.V = w.y0(new Function0(this) { // from class: bg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferAmountScreen f15048b;

            {
                this.f15048b = this;
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
                int i22 = i6;
                UpiTransferAmountScreen upiTransferAmountScreen = this.f15048b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiTransferAmountScreen.X;
                        return (k) ((if2.m) upiTransferAmountScreen.Q.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiTransferAmountScreen.X;
                        UpiTransferAmountScreen upiTransferAmountScreen2 = this.f15048b;
                        return dli.f.a(upiTransferAmountScreen2, upiTransferAmountScreen2.R2(), zhm.v.k((CenteredAmountDelegate) upiTransferAmountScreen2.V.getValue(), (InputTextDelegate) upiTransferAmountScreen2.U.getValue(), (RowLoadingDelegate) upiTransferAmountScreen2.W.getValue(), (TextDelegate) upiTransferAmountScreen2.T.getValue(), (LargeActionButtonDelegate) upiTransferAmountScreen2.S.getValue()), R$id.upiTransferAmountScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = UpiTransferAmountScreen.X;
                        qji.b bVarU2 = upiTransferAmountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.screen.amount.di.UpiTransferAmountScreenInjector");
                        if2.n nVar = (if2.n) bVarU2;
                        if2.f fVar = nVar.f160891b;
                        if2.n nVar2 = nVar.f160892c;
                        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = upiTransferAmountScreen.K;
                        upiTransferAmountScreenContract$InputData.getClass();
                        return new if2.m(fVar, nVar2, upiTransferAmountScreen, upiTransferAmountScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = UpiTransferAmountScreen.X;
                        qd0.b bVarN = ((if2.m) upiTransferAmountScreen.Q.getValue()).f160886b.f160851a.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    default:
                        KProperty[] kPropertyArr5 = UpiTransferAmountScreen.X;
                        return new CenteredAmountDelegate(new b7d.c(upiTransferAmountScreen, 24));
                }
            }
        });
        this.W = w.y0(new b8g.a(20));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        c cVarD3 = d3();
        NavBarWithAvatar navBarWithAvatar = cVarD3.e;
        CutoutImageView upiTransferAmountScreenLogoView = cVarD3.d;
        navBarWithAvatar.setModel(uiState.f15065b);
        LegacyButtonContainerConstraintLayout upiTransferAmountScreenFooterContainer = cVarD3.f143338b;
        Intrinsics.checkNotNullExpressionValue(upiTransferAmountScreenFooterContainer, "upiTransferAmountScreenFooterContainer");
        f fVar = uiState.f15066c;
        upiTransferAmountScreenFooterContainer.setVisibility(0);
        if (uiState.e) {
            Context context = upiTransferAmountScreenLogoView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yy0.f fVarQ = d.f(context).Q();
            Image image = uiState.d;
            Intrinsics.checkNotNullExpressionValue(upiTransferAmountScreenLogoView, "upiTransferAmountScreenLogoView");
            yy0.f.e(fVarQ, image, upiTransferAmountScreenLogoView, null, null, 12);
            CutoutImageView upiTransferAmountScreenLogoView2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(upiTransferAmountScreenLogoView2, "upiTransferAmountScreenLogoView");
            upiTransferAmountScreenLogoView2.setVisibility(0);
        } else {
            CutoutImageView upiTransferAmountScreenLogoView3 = d3().d;
            Intrinsics.checkNotNullExpressionValue(upiTransferAmountScreenLogoView3, "upiTransferAmountScreenLogoView");
            upiTransferAmountScreenLogoView3.setVisibility(8);
        }
        Clause clause = fVar.d;
        LargeActionButton largeActionButton = cVarD3.f;
        largeActionButton.setVisibility(fVar.f15051c ? 0 : 8);
        largeActionButton.setEnabled(fVar.f15050b);
        cVarD3.f143340g.setEnabled(fVar.f15049a);
        FooterTextView footerTextView = cVarD3.f143339c;
        footerTextView.setVisibility(clause == null ? 8 : 0);
        footerTextView.setTextClause(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().e;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithAvatar.f59338a), null, new bg2.c(this, continuation, 0), 3);
        LargeActionButton largeActionButton = d3().f143340g;
        h30.l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setLoadingButtonTag("TRANSFER_AMOUNT_CTA_BUTTON_TAG");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(largeActionButton.o), null, new bg2.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.o), null, new bg2.c(this, continuation, 2), 3);
        ?? r102 = this.V;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CenteredAmountDelegate) r102.getValue()).d.f121375b), null, new b74.e(this, continuation, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, h30.l.y(((CenteredAmountDelegate) r102.getValue()).e.f121375b, ((CenteredAmountDelegate) r102.getValue()).f51966j.f121375b, "merge(...)"), null, new bg2.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.U.getValue()).e.f121375b), null, new bg2.e(this, null), 3);
        h30.l.A(R.string.common_action_continue, null, null, 14, d3().f143340g);
        d3().f.setIcon(new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    public final c d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
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
