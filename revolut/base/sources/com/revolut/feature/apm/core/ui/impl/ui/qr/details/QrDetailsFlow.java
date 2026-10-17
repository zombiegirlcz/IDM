package com.revolut.feature.apm.core.ui.impl.ui.qr.details;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrData;
import com.revolut.feature.apm.core.ui.api.navigation.qr.QrDetailsInputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.qr.details.QrDetailsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import g12.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuh.j;
import o32.b;
import o32.c;
import o32.d;
import te0.w;
import vc.s;
import yki.f;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/qr/details/QrDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg12/e;", "Lyki/f;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QrDetailsFlow extends ViewController<e> implements f {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(QrDetailsFlow.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenQrDetailsContainerBinding;", 0))};
    public final QrDetailsInputData K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;

    public QrDetailsFlow(QrDetailsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_qr_details_container;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDetailsFlow f221682b;

            {
                this.f221682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QrDetailsFlow qrDetailsFlow = this.f221682b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QrDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(qrDetailsFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrDetailsInputData qrDetailsInputData = qrDetailsFlow.K;
                        qrDetailsInputData.getClass();
                        return new p12.e(dVar, qrDetailsInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDetailsFlow.R;
                        return (d) ((p12.e) qrDetailsFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = QrDetailsFlow.R;
                        return czi.c.d(R$id.qrDetailsContainer_container, 4, null, qrDetailsFlow, (d) qrDetailsFlow.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDetailsFlow f221682b;

            {
                this.f221682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QrDetailsFlow qrDetailsFlow = this.f221682b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(qrDetailsFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrDetailsInputData qrDetailsInputData = qrDetailsFlow.K;
                        qrDetailsInputData.getClass();
                        return new p12.e(dVar, qrDetailsInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDetailsFlow.R;
                        return (d) ((p12.e) qrDetailsFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = QrDetailsFlow.R;
                        return czi.c.d(R$id.qrDetailsContainer_container, 4, null, qrDetailsFlow, (d) qrDetailsFlow.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: o32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QrDetailsFlow f221682b;

            {
                this.f221682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QrDetailsFlow qrDetailsFlow = this.f221682b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QrDetailsFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(qrDetailsFlow.m2()).a().get(p12.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.d.class, " is not found"));
                        }
                        p12.d dVar = ((p12.d) aVar2.b()).f;
                        QrDetailsInputData qrDetailsInputData = qrDetailsFlow.K;
                        qrDetailsInputData.getClass();
                        return new p12.e(dVar, qrDetailsInputData);
                    case 1:
                        KProperty[] kPropertyArr2 = QrDetailsFlow.R;
                        return (d) ((p12.e) qrDetailsFlow.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = QrDetailsFlow.R;
                        return czi.c.d(R$id.qrDetailsContainer_container, 4, null, qrDetailsFlow, (d) qrDetailsFlow.O.getValue());
                }
            }
        });
        this.Q = s.t(this, b.f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p12.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p12.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        CircleActionButtonsBarDelegate.CircleActionButton circleActionButton;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f201211c;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        navBarWithAvatar.setBackgroundColor(kli.a.s(R$attr.uikit_colorTransparent, context));
        navBarWithAvatar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, new ContextThemeWrapper(view.getContext(), R$style.UiKitTheme_TransparentNight))), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        QrDetailsInputData qrDetailsInputData = this.K;
        navBarWithAvatar.setToolbarTitle(qrDetailsInputData.f62329a);
        CircleActionButtonsBarView circleActionButtonsBarView = d3().f201210b;
        QrData qrData = qrDetailsInputData.f62330b;
        QrData.Button button = qrData.i;
        if (button != null) {
            String str = qrData.f62318a;
            circleActionButton = new CircleActionButtonsBarDelegate.CircleActionButton(str, button.f62324b, button.f62323a, (CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle) CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.PrimaryNeutral.f52095a, (v3) null, str, false, (Object) null, 464);
        } else {
            circleActionButton = null;
        }
        List<CircleActionButtonsBarDelegate.CircleActionButton> listL = v.l(circleActionButton);
        circleActionButtonsBarView.setVisibility(!listL.isEmpty() ? 0 : 8);
        circleActionButtonsBarView.setActions(listL);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201211c.f59338a), null, new j(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201210b.a()), null, new c(this, null), 3);
    }

    public final m12.h d3() {
        ViewBinding value = this.Q.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m12.h) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.P.getValue();
    }
}
