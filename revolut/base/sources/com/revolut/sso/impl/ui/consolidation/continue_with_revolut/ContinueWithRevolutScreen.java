package com.revolut.sso.impl.ui.consolidation.continue_with_revolut;

import android.view.View;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreen;
import com.revolut.sso.impl.ui.consolidation.continue_with_revolut.ContinueWithRevolutScreenContract$InputData;
import jml.c;
import jml.d;
import jml.h;
import jml.i;
import jml.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.m;
import ljl.o;
import ljl.q0;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consolidation/continue_with_revolut/ContinueWithRevolutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljml/h;", "Ldli/a;", "Ljml/j;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContinueWithRevolutScreen extends ViewController<h> implements dli.a {
    public final ContinueWithRevolutScreenContract$InputData K;
    public final PromptMarketingContentDelegate L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public ContinueWithRevolutScreen(ContinueWithRevolutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new PromptMarketingContentDelegate();
        this.M = R$layout.screen_prompt;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithRevolutScreen f176633b;

            {
                this.f176633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ContinueWithRevolutScreen continueWithRevolutScreen = this.f176633b;
                        return dli.f.a(continueWithRevolutScreen, continueWithRevolutScreen.d(), u.c(continueWithRevolutScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        ContinueWithRevolutScreen continueWithRevolutScreen2 = this.f176633b;
                        qji.b bVarU2 = continueWithRevolutScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.continue_with_revolut.di.ContinueWithRevolutScreenInjector");
                        m mVar = (m) bVarU2;
                        q0 q0Var = mVar.f196025a;
                        m mVar2 = mVar.f196026b;
                        ContinueWithRevolutScreenContract$InputData continueWithRevolutScreenContract$InputData = continueWithRevolutScreen2.K;
                        continueWithRevolutScreenContract$InputData.getClass();
                        return new o(q0Var, mVar2, continueWithRevolutScreenContract$InputData);
                    default:
                        return (i) ((o) this.f176633b.O.getValue()).f196044c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithRevolutScreen f176633b;

            {
                this.f176633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ContinueWithRevolutScreen continueWithRevolutScreen = this.f176633b;
                        return dli.f.a(continueWithRevolutScreen, continueWithRevolutScreen.d(), u.c(continueWithRevolutScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        ContinueWithRevolutScreen continueWithRevolutScreen2 = this.f176633b;
                        qji.b bVarU2 = continueWithRevolutScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.continue_with_revolut.di.ContinueWithRevolutScreenInjector");
                        m mVar = (m) bVarU2;
                        q0 q0Var = mVar.f196025a;
                        m mVar2 = mVar.f196026b;
                        ContinueWithRevolutScreenContract$InputData continueWithRevolutScreenContract$InputData = continueWithRevolutScreen2.K;
                        continueWithRevolutScreenContract$InputData.getClass();
                        return new o(q0Var, mVar2, continueWithRevolutScreenContract$InputData);
                    default:
                        return (i) ((o) this.f176633b.O.getValue()).f196044c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContinueWithRevolutScreen f176633b;

            {
                this.f176633b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ContinueWithRevolutScreen continueWithRevolutScreen = this.f176633b;
                        return dli.f.a(continueWithRevolutScreen, continueWithRevolutScreen.d(), u.c(continueWithRevolutScreen.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        ContinueWithRevolutScreen continueWithRevolutScreen2 = this.f176633b;
                        qji.b bVarU2 = continueWithRevolutScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.consolidation.continue_with_revolut.di.ContinueWithRevolutScreenInjector");
                        m mVar = (m) bVarU2;
                        q0 q0Var = mVar.f196025a;
                        m mVar2 = mVar.f196026b;
                        ContinueWithRevolutScreenContract$InputData continueWithRevolutScreenContract$InputData = continueWithRevolutScreen2.K;
                        continueWithRevolutScreenContract$InputData.getClass();
                        return new o(q0Var, mVar2, continueWithRevolutScreenContract$InputData);
                    default:
                        return (i) ((o) this.f176633b.O.getValue()).f196044c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.L;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.e), new jml.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new jml.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
