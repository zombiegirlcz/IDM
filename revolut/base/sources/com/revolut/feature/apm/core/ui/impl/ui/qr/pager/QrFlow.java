package com.revolut.feature.apm.core.ui.impl.ui.qr.pager;

import ali.g;
import android.content.Context;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrFlowInputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.qr.pager.QrFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.youTransactor.uCube.rpc.Constants;
import g12.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rvc.k;
import s32.b;
import s32.c;
import s32.d;
import s32.f;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg12/j;", "Lali/g;", "Ls32/f;", "Lcom/revolut/feature/apm/core/ui/impl/ui/qr/pager/QrFlowContract$Page;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrFlow extends ViewController<j> implements g {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(QrFlow.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrContainerBinding;", 0))};
    public final QrFlowInputData K;
    public final boolean L;
    public final int M;
    public final int N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public QrFlow(QrFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = R$layout.screen_qr_container;
        this.N = R$style.UiKitTheme_Mono;
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: s32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrFlow f259396b;

            {
                this.f259396b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QrFlow qrFlow = this.f259396b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QrFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(qrFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrFlowInputData qrFlowInputData = qrFlow.K;
                        qrFlowInputData.getClass();
                        return new p12.f(dVar, qrFlow, qrFlowInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrFlow.S;
                        return (d) ((p12.f) qrFlow.P.getValue()).f231652p.get();
                    default:
                        KProperty[] kPropertyArr3 = QrFlow.S;
                        return mif.a.a(qrFlow, 0, R$id.qrContainer_viewPager, qrFlow.R2(), 5);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: s32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrFlow f259396b;

            {
                this.f259396b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QrFlow qrFlow = this.f259396b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(qrFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrFlowInputData qrFlowInputData = qrFlow.K;
                        qrFlowInputData.getClass();
                        return new p12.f(dVar, qrFlow, qrFlowInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrFlow.S;
                        return (d) ((p12.f) qrFlow.P.getValue()).f231652p.get();
                    default:
                        KProperty[] kPropertyArr3 = QrFlow.S;
                        return mif.a.a(qrFlow, 0, R$id.qrContainer_viewPager, qrFlow.R2(), 5);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: s32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrFlow f259396b;

            {
                this.f259396b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QrFlow qrFlow = this.f259396b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrFlow.S;
                        phm.a aVar = (phm.a) ue0.e.j(qrFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrFlowInputData qrFlowInputData = qrFlow.K;
                        qrFlowInputData.getClass();
                        return new p12.f(dVar, qrFlow, qrFlowInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrFlow.S;
                        return (d) ((p12.f) qrFlow.P.getValue()).f231652p.get();
                    default:
                        KProperty[] kPropertyArr3 = QrFlow.S;
                        return mif.a.a(qrFlow, 0, R$id.qrContainer_viewPager, qrFlow.R2(), 5);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.N);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f201208c.setItems(uiState.f259401a, uiState.f259402b);
        d3().f201207b.setMenuItems(uiState.f259403c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) R2()).C2(g12.h.f139522a);
        return true;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        QrFlowContract$Page page = (QrFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        a aVar = (a) R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        String id10 = page.f62371a.getId();
        Intrinsics.checkNotNullParameter(id10, "id");
        aVar.H2(aVar.f62375q, new k(id10, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p12.f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p12.f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f201207b;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        navBarWithToolbar.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, new ContextThemeWrapper(view.getContext(), R$style.UiKitTheme_TransparentNight))), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        navBarWithToolbar.setToolbarTitle(this.K.f62332b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201208c.f58424a), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201207b.f59410q), null, new s1k.b(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201207b.o.f57403b), null, new c(this, null, 1), 3);
    }

    public final m12.g d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m12.g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
