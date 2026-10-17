package com.revolut.feature.credit.application.plugins.impl.ui.preapplication;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksPromptScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$InputData;
import com.revolut.feature.full_screen_prompt.R$id;
import com.revolut.feature.full_screen_prompt.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dw3.b1;
import dw3.c1;
import dw3.e5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import re3.d;
import rg4.h;
import rg4.r;
import rg4.s;
import rg4.t;
import te0.w;
import tki.c;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/preapplication/PreApplicationChecksPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrg4/r;", "Ltki/c;", "Lrg4/t;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PreApplicationChecksPromptScreen extends ViewController<r> implements c {
    public static final /* synthetic */ int R = 0;
    public final PreApplicationChecksScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PreApplicationChecksPromptScreen(PreApplicationChecksScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new d(3));
        this.M = w.y0(new d(4));
        this.N = R$layout.screen_full_screen_prompt;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rg4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksPromptScreen f254024b;

            {
                this.f254024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PreApplicationChecksPromptScreen preApplicationChecksPromptScreen = this.f254024b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = preApplicationChecksPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksPromptScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksPromptScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        return (s) ((e5) preApplicationChecksPromptScreen.O.getValue()).f118648c.get();
                    default:
                        PreApplicationChecksPromptScreen preApplicationChecksPromptScreen2 = this.f254024b;
                        return tki.g.a(preApplicationChecksPromptScreen2, (s) preApplicationChecksPromptScreen2.P.getValue(), zhm.v.k((PromptContentDelegate) preApplicationChecksPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) preApplicationChecksPromptScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: rg4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksPromptScreen f254024b;

            {
                this.f254024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PreApplicationChecksPromptScreen preApplicationChecksPromptScreen = this.f254024b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = preApplicationChecksPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksPromptScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksPromptScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        return (s) ((e5) preApplicationChecksPromptScreen.O.getValue()).f118648c.get();
                    default:
                        PreApplicationChecksPromptScreen preApplicationChecksPromptScreen2 = this.f254024b;
                        return tki.g.a(preApplicationChecksPromptScreen2, (s) preApplicationChecksPromptScreen2.P.getValue(), zhm.v.k((PromptContentDelegate) preApplicationChecksPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) preApplicationChecksPromptScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: rg4.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreApplicationChecksPromptScreen f254024b;

            {
                this.f254024b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PreApplicationChecksPromptScreen preApplicationChecksPromptScreen = this.f254024b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = preApplicationChecksPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.preapplication.di.PreApplicationChecksScreenComponentInjector");
                        b1 b1Var = (b1) ((i54.a) bVarU2);
                        c1 c1Var = b1Var.f118318b;
                        b1 b1Var2 = b1Var.f118319c;
                        PreApplicationChecksScreenContract$InputData preApplicationChecksScreenContract$InputData = preApplicationChecksPromptScreen.K;
                        preApplicationChecksScreenContract$InputData.getClass();
                        mki.b bVarQ2 = preApplicationChecksPromptScreen.q2();
                        bVarQ2.getClass();
                        return new e5(c1Var, b1Var2, preApplicationChecksScreenContract$InputData, bVarQ2);
                    case 1:
                        return (s) ((e5) preApplicationChecksPromptScreen.O.getValue()).f118648c.get();
                    default:
                        PreApplicationChecksPromptScreen preApplicationChecksPromptScreen2 = this.f254024b;
                        return tki.g.a(preApplicationChecksPromptScreen2, (s) preApplicationChecksPromptScreen2.P.getValue(), zhm.v.k((PromptContentDelegate) preApplicationChecksPromptScreen2.L.getValue(), (PromptMarketingContentDelegate) preApplicationChecksPromptScreen2.M.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((t) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e5) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (s) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r102 = this.L;
        vkm.d dVarB = rd0.e.b(((PromptContentDelegate) r102.getValue()).q());
        ?? r110 = this.M;
        ViewController.P2(this, vkm.q.J(dVarB, rd0.e.b(((PromptMarketingContentDelegate) r110.getValue()).f53079c)), new h(this, null, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((PromptContentDelegate) r102.getValue()).f53054h.f121375b), rd0.e.b(((PromptMarketingContentDelegate) r110.getValue()).f.f121375b)), new h(this, null, 1), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(((PromptContentDelegate) r102.getValue()).i.f121375b), rd0.e.b(((PromptMarketingContentDelegate) r110.getValue()).f53080g.f121375b)), new h(this, null, 2), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.Q.getValue();
    }
}
