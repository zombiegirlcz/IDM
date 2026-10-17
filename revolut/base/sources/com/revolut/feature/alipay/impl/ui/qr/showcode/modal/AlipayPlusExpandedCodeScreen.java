package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreen;
import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/alipay/impl/ui/qr/showcode/modal/AlipayPlusExpandedCodeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbl1/e;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AlipayPlusExpandedCodeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AlipayPlusExpandedCodeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final AlipayPlusExpandedCodeScreenContract$InputData K;
    public final h L;
    public final ErrorDelegate M;
    public final ContainerDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AlipayPlusExpandedCodeScreen(AlipayPlusExpandedCodeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, bl1.b.f);
        ErrorDelegate errorDelegate = new ErrorDelegate();
        this.M = errorDelegate;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.N = new ContainerDelegate(v.k(new SimpleMediaDelegate(), new TextDelegate(), errorDelegate, new RowLoadingDelegate()), null, 6);
        this.O = R$layout.screen_recycler_basic_navbar;
        this.P = w.y0(new Function0(this) { // from class: bl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusExpandedCodeScreen f16457b;

            {
                this.f16457b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen = this.f16457b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusExpandedCodeScreen.S;
                        qji.b bVarU2 = alipayPlusExpandedCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.modal.di.AlipayPlusExpandedCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        ok1.d dVar = fVar.f225872a;
                        ok1.f fVar2 = fVar.f225873b;
                        AlipayPlusExpandedCodeScreenContract$InputData alipayPlusExpandedCodeScreenContract$InputData = alipayPlusExpandedCodeScreen.K;
                        alipayPlusExpandedCodeScreenContract$InputData.getClass();
                        return new ok1.e(dVar, fVar2, alipayPlusExpandedCodeScreen, alipayPlusExpandedCodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusExpandedCodeScreen.S;
                        return (d) ((ok1.e) alipayPlusExpandedCodeScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusExpandedCodeScreen.S;
                        AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen2 = this.f16457b;
                        return dli.f.a(alipayPlusExpandedCodeScreen2, (d) alipayPlusExpandedCodeScreen2.Q.getValue(), u.c(alipayPlusExpandedCodeScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new Function0(this) { // from class: bl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusExpandedCodeScreen f16457b;

            {
                this.f16457b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen = this.f16457b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusExpandedCodeScreen.S;
                        qji.b bVarU2 = alipayPlusExpandedCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.modal.di.AlipayPlusExpandedCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        ok1.d dVar = fVar.f225872a;
                        ok1.f fVar2 = fVar.f225873b;
                        AlipayPlusExpandedCodeScreenContract$InputData alipayPlusExpandedCodeScreenContract$InputData = alipayPlusExpandedCodeScreen.K;
                        alipayPlusExpandedCodeScreenContract$InputData.getClass();
                        return new ok1.e(dVar, fVar2, alipayPlusExpandedCodeScreen, alipayPlusExpandedCodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusExpandedCodeScreen.S;
                        return (d) ((ok1.e) alipayPlusExpandedCodeScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusExpandedCodeScreen.S;
                        AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen2 = this.f16457b;
                        return dli.f.a(alipayPlusExpandedCodeScreen2, (d) alipayPlusExpandedCodeScreen2.Q.getValue(), u.c(alipayPlusExpandedCodeScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new Function0(this) { // from class: bl1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlipayPlusExpandedCodeScreen f16457b;

            {
                this.f16457b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen = this.f16457b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AlipayPlusExpandedCodeScreen.S;
                        qji.b bVarU2 = alipayPlusExpandedCodeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.alipay.impl.ui.qr.showcode.modal.di.AlipayPlusExpandedCodeScreenInjector");
                        ok1.f fVar = (ok1.f) bVarU2;
                        ok1.d dVar = fVar.f225872a;
                        ok1.f fVar2 = fVar.f225873b;
                        AlipayPlusExpandedCodeScreenContract$InputData alipayPlusExpandedCodeScreenContract$InputData = alipayPlusExpandedCodeScreen.K;
                        alipayPlusExpandedCodeScreenContract$InputData.getClass();
                        return new ok1.e(dVar, fVar2, alipayPlusExpandedCodeScreen, alipayPlusExpandedCodeScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = AlipayPlusExpandedCodeScreen.S;
                        return (d) ((ok1.e) alipayPlusExpandedCodeScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = AlipayPlusExpandedCodeScreen.S;
                        AlipayPlusExpandedCodeScreen alipayPlusExpandedCodeScreen2 = this.f16457b;
                        return dli.f.a(alipayPlusExpandedCodeScreen2, (d) alipayPlusExpandedCodeScreen2.Q.getValue(), u.c(alipayPlusExpandedCodeScreen2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        bl1.e uiState = (bl1.e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174530b.setTitle(uiState.f16458a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ok1.e) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (bl1.d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f174530b;
        basicNavBar.setTitleCentered(true);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174530b.f59211b), null, new bl1.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52226c), null, new bl1.c(this, null, 1), 3);
    }

    public final j d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
