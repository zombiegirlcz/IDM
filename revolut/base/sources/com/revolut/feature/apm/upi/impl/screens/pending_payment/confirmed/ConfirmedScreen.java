package com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.ConfirmedScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import if2.b;
import if2.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qba.c;
import qg2.e;
import qg2.f;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/screens/pending_payment/confirmed/ConfirmedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqg2/e;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmedScreen extends ViewController<q> implements a {
    public static final /* synthetic */ int P = 0;
    public final ConfirmedScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ConfirmedScreen(ConfirmedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new c(19));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmedScreen f245639b;

            {
                this.f245639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (f) ((if2.b) this.f245639b.N.getValue()).f160841c.get();
                    case 1:
                        ConfirmedScreen confirmedScreen = this.f245639b;
                        qji.b bVarU2 = confirmedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.di.ConfirmedScreenInjector");
                        k kVar = (k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        k kVar2 = kVar.f160881c;
                        ConfirmedScreenContract$InputData confirmedScreenContract$InputData = confirmedScreen.K;
                        confirmedScreenContract$InputData.getClass();
                        return new if2.b(fVar, kVar2, confirmedScreenContract$InputData);
                    default:
                        ConfirmedScreen confirmedScreen2 = this.f245639b;
                        return dli.f.a(confirmedScreen2, (f) confirmedScreen2.M.getValue(), u.c((PromptContentDelegate) confirmedScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmedScreen f245639b;

            {
                this.f245639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (f) ((if2.b) this.f245639b.N.getValue()).f160841c.get();
                    case 1:
                        ConfirmedScreen confirmedScreen = this.f245639b;
                        qji.b bVarU2 = confirmedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.di.ConfirmedScreenInjector");
                        k kVar = (k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        k kVar2 = kVar.f160881c;
                        ConfirmedScreenContract$InputData confirmedScreenContract$InputData = confirmedScreen.K;
                        confirmedScreenContract$InputData.getClass();
                        return new if2.b(fVar, kVar2, confirmedScreenContract$InputData);
                    default:
                        ConfirmedScreen confirmedScreen2 = this.f245639b;
                        return dli.f.a(confirmedScreen2, (f) confirmedScreen2.M.getValue(), u.c((PromptContentDelegate) confirmedScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmedScreen f245639b;

            {
                this.f245639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (f) ((if2.b) this.f245639b.N.getValue()).f160841c.get();
                    case 1:
                        ConfirmedScreen confirmedScreen = this.f245639b;
                        qji.b bVarU2 = confirmedScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmed.di.ConfirmedScreenInjector");
                        k kVar = (k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        k kVar2 = kVar.f160881c;
                        ConfirmedScreenContract$InputData confirmedScreenContract$InputData = confirmedScreen.K;
                        confirmedScreenContract$InputData.getClass();
                        return new if2.b(fVar, kVar2, confirmedScreenContract$InputData);
                    default:
                        ConfirmedScreen confirmedScreen2 = this.f245639b;
                        return dli.f.a(confirmedScreen2, (f) confirmedScreen2.M.getValue(), u.c((PromptContentDelegate) confirmedScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), null, new qg2.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), null, new qg2.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM() {
        return R$layout.screen_recycler_view;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
