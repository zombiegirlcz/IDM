package com.revolut.feature.credit.application.plugins.impl.ui.rejected;

import android.view.View;
import cli.a0;
import cli.l;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedController;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import dw3.c1;
import dw3.s5;
import j60.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o95.c;
import ofa.n;
import oh4.d;
import oh4.f;
import pki.b;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/rejected/RejectedController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Loh4/f;", "Lcli/w;", "Lcli/l;", "Lin0/g;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RejectedController extends PluginScreenController<f> implements w {
    public static final /* synthetic */ int S = 0;
    public final RejectedControllerContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public RejectedController(RejectedControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = te0.w.y0(new Function0(this) { // from class: oh4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedController f225288b;

            {
                this.f225288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RejectedController rejectedController = this.f225288b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedControllerContract$InputData rejectedControllerContract$InputData = rejectedController.L;
                        rejectedControllerContract$InputData.getClass();
                        return new s5(c1Var, rejectedController, rejectedControllerContract$InputData);
                    case 1:
                        RejectedController rejectedController2 = this.f225288b;
                        return n14.e.a(rejectedController2, (e) rejectedController2.R.getValue());
                    default:
                        return (e) ((s5) this.f225288b.N.getValue()).f119772m.get();
                }
            }
        });
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: oh4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedController f225288b;

            {
                this.f225288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RejectedController rejectedController = this.f225288b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedControllerContract$InputData rejectedControllerContract$InputData = rejectedController.L;
                        rejectedControllerContract$InputData.getClass();
                        return new s5(c1Var, rejectedController, rejectedControllerContract$InputData);
                    case 1:
                        RejectedController rejectedController2 = this.f225288b;
                        return n14.e.a(rejectedController2, (e) rejectedController2.R.getValue());
                    default:
                        return (e) ((s5) this.f225288b.N.getValue()).f119772m.get();
                }
            }
        });
        this.P = te0.w.y0(new n(14));
        this.Q = te0.w.y0(new n(15));
        final int i3 = 2;
        this.R = te0.w.y0(new Function0(this) { // from class: oh4.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RejectedController f225288b;

            {
                this.f225288b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        RejectedController rejectedController = this.f225288b;
                        phm.a aVar = (phm.a) ue0.e.j(rejectedController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        RejectedControllerContract$InputData rejectedControllerContract$InputData = rejectedController.L;
                        rejectedControllerContract$InputData.getClass();
                        return new s5(c1Var, rejectedController, rejectedControllerContract$InputData);
                    case 1:
                        RejectedController rejectedController2 = this.f225288b;
                        return n14.e.a(rejectedController2, (e) rejectedController2.R.getValue());
                    default:
                        return (e) ((s5) this.f225288b.N.getValue()).f119772m.get();
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
        return (s5) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (oh4.e) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((a) ((s5) this.N.getValue()).f119769h.get()).d(v.k((RowDelegate) this.P.getValue(), (LargeActionButtonDelegate) this.Q.getValue()));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(te0.w.a0(((RowDelegate) this.P.getValue()).f53218h, new oh3.a(3))), null, new c(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }
}
