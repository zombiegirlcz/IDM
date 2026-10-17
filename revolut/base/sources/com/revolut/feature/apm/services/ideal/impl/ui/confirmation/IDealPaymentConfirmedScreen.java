package com.revolut.feature.apm.services.ideal.impl.ui.confirmation;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.confirmation.IDealPaymentConfirmedScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import fd2.k;
import id2.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/confirmation/IDealPaymentConfirmedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lid2/f;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IDealPaymentConfirmedScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ int P = 0;
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public IDealPaymentConfirmedScreen(IDealPaymentConfirmedScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new i83.b(21));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: id2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealPaymentConfirmedScreen f160411b;

            {
                this.f160411b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IDealPaymentConfirmedScreen iDealPaymentConfirmedScreen = this.f160411b;
                        return dli.f.a(iDealPaymentConfirmedScreen, (e) iDealPaymentConfirmedScreen.O.getValue(), u.c((PromptContentDelegate) iDealPaymentConfirmedScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (e) ((k) this.f160411b.N.getValue()).f133882c.get();
                }
            }
        });
        this.M = R$layout.screen_recycler_view;
        this.N = w.y0(new i1d.b(this, inputData, 16));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: id2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealPaymentConfirmedScreen f160411b;

            {
                this.f160411b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IDealPaymentConfirmedScreen iDealPaymentConfirmedScreen = this.f160411b;
                        return dli.f.a(iDealPaymentConfirmedScreen, (e) iDealPaymentConfirmedScreen.O.getValue(), u.c((PromptContentDelegate) iDealPaymentConfirmedScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (e) ((k) this.f160411b.N.getValue()).f133882c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (id2.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), null, new id2.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), null, new id2.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
