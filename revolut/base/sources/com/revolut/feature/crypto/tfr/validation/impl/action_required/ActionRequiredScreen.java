package com.revolut.feature.crypto.tfr.validation.impl.action_required;

import android.content.Intent;
import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.crypto.tfr.validation.impl.R$layout;
import com.revolut.feature.crypto.tfr.validation.impl.action_required.ActionRequiredScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mhd.b;
import mm5.c;
import mm5.d;
import mm5.j;
import mm5.k;
import mm5.l;
import skm.a2;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/action_required/ActionRequiredScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmm5/j;", "Ldli/a;", "Lmm5/l;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionRequiredScreen extends ViewController<j> implements a {
    public final int K;
    public final PromptMarketingContentDelegate L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ActionRequiredScreen(ActionRequiredScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_crypto_action_required;
        this.L = new PromptMarketingContentDelegate();
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionRequiredScreen f207145b;

            {
                this.f207145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ActionRequiredScreen actionRequiredScreen = this.f207145b;
                        return dli.f.a(actionRequiredScreen, actionRequiredScreen.d(), u.c(actionRequiredScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (k) ((um5.a) this.f207145b.N.getValue()).f281230c.get();
                }
            }
        });
        this.N = w.y0(new b(this, inputData, 6));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mm5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActionRequiredScreen f207145b;

            {
                this.f207145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ActionRequiredScreen actionRequiredScreen = this.f207145b;
                        return dli.f.a(actionRequiredScreen, actionRequiredScreen.d(), u.c(actionRequiredScreen.L), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (k) ((um5.a) this.f207145b.N.getValue()).f281230c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (um5.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        mm5.o oVar = (mm5.o) d();
        if (i != 54332) {
            oVar.getClass();
            return;
        }
        a2 a2Var = oVar.f207158t;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new mm5.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
