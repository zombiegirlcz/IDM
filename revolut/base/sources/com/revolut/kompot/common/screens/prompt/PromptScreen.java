package com.revolut.kompot.common.screens.prompt;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.prompt.PromptScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import exe.k;
import fji.b;
import fji.c;
import fji.d;
import fji.h;
import fji.n;
import fji.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import lti.u;
import te0.w;
import vkm.j2;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/kompot/common/screens/prompt/PromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfji/n;", "Ldli/a;", "Lfji/p;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptScreen extends ViewController<n> implements a {
    public final h K;
    public final StateFlow L;
    public final int M;
    public final Object N;
    public final Object O;
    public final PromptMarketingContentDelegate P;
    public final Object Q;

    public PromptScreen(j2 inputDataFlow) {
        Intrinsics.checkNotNullParameter(inputDataFlow, "inputDataFlow");
        h inputData = (h) inputDataFlow.getValue();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = R$layout.screen_prompt;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: fji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromptScreen f135639b;

            {
                this.f135639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PromptScreen promptScreen = this.f135639b;
                        qji.b bVarU2 = promptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.kompot.common.screens.prompt.di.PromptScreenInjector");
                        return (u) ((gji.a) ((gji.b) bVarU2).b().mo3808a(promptScreen)).l0(promptScreen.K).mo3783build();
                    case 1:
                        u uVar = (u) this.f135639b.N.getValue();
                        switch (uVar.f199958a) {
                            case 0:
                                return (o) uVar.d.get();
                            default:
                                return (o) uVar.d.get();
                        }
                    default:
                        PromptScreen promptScreen2 = this.f135639b;
                        return dli.f.a(promptScreen2, promptScreen2.d(), zhm.u.c(promptScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromptScreen f135639b;

            {
                this.f135639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PromptScreen promptScreen = this.f135639b;
                        qji.b bVarU2 = promptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.kompot.common.screens.prompt.di.PromptScreenInjector");
                        return (u) ((gji.a) ((gji.b) bVarU2).b().mo3808a(promptScreen)).l0(promptScreen.K).mo3783build();
                    case 1:
                        u uVar = (u) this.f135639b.N.getValue();
                        switch (uVar.f199958a) {
                            case 0:
                                return (o) uVar.d.get();
                            default:
                                return (o) uVar.d.get();
                        }
                    default:
                        PromptScreen promptScreen2 = this.f135639b;
                        return dli.f.a(promptScreen2, promptScreen2.d(), zhm.u.c(promptScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new PromptMarketingContentDelegate();
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fji.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PromptScreen f135639b;

            {
                this.f135639b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PromptScreen promptScreen = this.f135639b;
                        qji.b bVarU2 = promptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.kompot.common.screens.prompt.di.PromptScreenInjector");
                        return (u) ((gji.a) ((gji.b) bVarU2).b().mo3808a(promptScreen)).l0(promptScreen.K).mo3783build();
                    case 1:
                        u uVar = (u) this.f135639b.N.getValue();
                        switch (uVar.f199958a) {
                            case 0:
                                return (o) uVar.d.get();
                            default:
                                return (o) uVar.d.get();
                        }
                    default:
                        PromptScreen promptScreen2 = this.f135639b;
                        return dli.f.a(promptScreen2, promptScreen2.d(), zhm.u.c(promptScreen2.P), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.L = inputDataFlow;
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((p) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (u) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        StateFlow stateFlow = this.L;
        if (stateFlow != null) {
            ViewController.P2(this, stateFlow, new k(2, d(), fji.o.class, "updateContent", "updateContent(Lcom/revolut/kompot/common/screens/prompt/PromptScreenContract$InputData;)V", 4, 6), 3);
        }
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.P;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new b(2, 4, fji.o.class, d(), "onCloseClicked", "onCloseClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(2, 4, fji.o.class, d(), "onPrimaryActionClicked", "onPrimaryActionClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new d(2, 4, fji.o.class, d(), "onSecondaryActionClicked", "onSecondaryActionClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.d), new k(2, d(), fji.o.class, "onClauseClicked", "onClauseClicked(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 7), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new fji.e(2, 4, fji.o.class, d(), "onLinkClicked", "onLinkClicked(Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentDelegate$Model;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final fji.o d() {
        return (fji.o) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
