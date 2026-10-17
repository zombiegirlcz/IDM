package com.revolut.feature.credit.application.plugins.impl.ui.expired.popup;

import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupController;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.ExpiredPopupControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import d8j.b;
import db4.c;
import db4.f;
import dw3.c1;
import dw3.c3;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/expired/popup/ExpiredPopupController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ldb4/f;", "Lcli/w;", "Lcli/l;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpiredPopupController extends PluginScreenController<f> implements w {
    public static final /* synthetic */ int R = 0;
    public final ExpiredPopupControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ExpiredPopupController(ExpiredPopupControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: db4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredPopupController f112663b;

            {
                this.f112663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ExpiredPopupController expiredPopupController = this.f112663b;
                        phm.a aVar = (phm.a) ue0.e.j(expiredPopupController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ExpiredPopupControllerContract$InputData expiredPopupControllerContract$InputData = expiredPopupController.L;
                        expiredPopupControllerContract$InputData.getClass();
                        return new c3(c1Var, expiredPopupController, expiredPopupControllerContract$InputData);
                    case 1:
                        return (c) ((c3) this.f112663b.N.getValue()).f118502l.get();
                    default:
                        ExpiredPopupController expiredPopupController2 = this.f112663b;
                        return n14.e.a(expiredPopupController2, (c) expiredPopupController2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: db4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredPopupController f112663b;

            {
                this.f112663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ExpiredPopupController expiredPopupController = this.f112663b;
                        phm.a aVar = (phm.a) ue0.e.j(expiredPopupController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ExpiredPopupControllerContract$InputData expiredPopupControllerContract$InputData = expiredPopupController.L;
                        expiredPopupControllerContract$InputData.getClass();
                        return new c3(c1Var, expiredPopupController, expiredPopupControllerContract$InputData);
                    case 1:
                        return (c) ((c3) this.f112663b.N.getValue()).f118502l.get();
                    default:
                        ExpiredPopupController expiredPopupController2 = this.f112663b;
                        return n14.e.a(expiredPopupController2, (c) expiredPopupController2.O.getValue());
                }
            }
        });
        this.P = te0.w.y0(new b(8));
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: db4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredPopupController f112663b;

            {
                this.f112663b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ExpiredPopupController expiredPopupController = this.f112663b;
                        phm.a aVar = (phm.a) ue0.e.j(expiredPopupController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        ExpiredPopupControllerContract$InputData expiredPopupControllerContract$InputData = expiredPopupController.L;
                        expiredPopupControllerContract$InputData.getClass();
                        return new c3(c1Var, expiredPopupController, expiredPopupControllerContract$InputData);
                    case 1:
                        return (c) ((c3) this.f112663b.N.getValue()).f118502l.get();
                    default:
                        ExpiredPopupController expiredPopupController2 = this.f112663b;
                        return n14.e.a(expiredPopupController2, (c) expiredPopupController2.O.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((c3) this.N.getValue()).f118500h.get()).d(u.c((LargeActionButtonDelegate) this.P.getValue()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), null, new db4.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
