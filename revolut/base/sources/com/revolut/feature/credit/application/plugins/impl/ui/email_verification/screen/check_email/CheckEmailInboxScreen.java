package com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dw3.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import pt4.d;
import qa4.c;
import qa4.f;
import qa4.g;
import qa4.h;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/email_verification/screen/check_email/CheckEmailInboxScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lqa4/f;", "Ldli/a;", "Lqa4/h;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckEmailInboxScreen extends PluginScreenController<f> implements a {
    public static final /* synthetic */ int R = 0;
    public final int L;
    public final Object M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CheckEmailInboxScreen(CheckEmailInboxScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_check_email;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qa4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckEmailInboxScreen f243949b;

            {
                this.f243949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CheckEmailInboxScreen checkEmailInboxScreen = this.f243949b;
                        return dli.f.a(checkEmailInboxScreen, (g) checkEmailInboxScreen.Q.getValue(), u.c((PromptContentDelegate) checkEmailInboxScreen.O.getValue()), R$id.checkEmailScreen_recyclerView, null, null, null, 56);
                    default:
                        return (g) ((f0) this.f243949b.P.getValue()).f118699h.get();
                }
            }
        });
        this.N = true;
        this.O = w.y0(new q50.w(19));
        this.P = w.y0(new d(this, inputData, 26));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: qa4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckEmailInboxScreen f243949b;

            {
                this.f243949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CheckEmailInboxScreen checkEmailInboxScreen = this.f243949b;
                        return dli.f.a(checkEmailInboxScreen, (g) checkEmailInboxScreen.Q.getValue(), u.c((PromptContentDelegate) checkEmailInboxScreen.O.getValue()), R$id.checkEmailScreen_recyclerView, null, null, null, 56);
                    default:
                        return (g) ((f0) this.f243949b.P.getValue()).f118699h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        ViewController.P2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), new qa4.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).i.f121375b), new qa4.d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
