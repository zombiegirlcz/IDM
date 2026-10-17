package com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt.JuniorProgressionPromptScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jk8.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pk8.g;
import pk8.h;
import pk8.i;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_progression/impl/ui/prompt/steps/prompt/JuniorProgressionPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lpk8/g;", "Ldli/a;", "Lpk8/h;", "<init>", "()V", "feature_junior_progression_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorProgressionPromptScreen extends ViewController<g> implements a {
    public final Object K;
    public final Object L;
    public final PromptMarketingContentDelegate M = new PromptMarketingContentDelegate();
    public final int N = R$layout.screen_prompt;
    public final Object O;

    public JuniorProgressionPromptScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: pk8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionPromptScreen f236937b;

            {
                this.f236937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        qji.b bVarU2 = this.f236937b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt.di.JuniorProgressionPromptScreenComponent.Injector");
                        jk8.a aVar = ((jk8.b) bVarU2).f175130a;
                        jk8.c cVar = new jk8.c();
                        int i2 = 13;
                        cVar.f175132a = e4m.b.b(new jdi.i(aVar, cVar, 1, i2));
                        cVar.f175133b = e4m.b.b(new jdi.i(aVar, cVar, 0, i2));
                        return cVar;
                    case 1:
                        return (i) ((jk8.c) this.f236937b.K.getValue()).f175133b.get();
                    default:
                        JuniorProgressionPromptScreen juniorProgressionPromptScreen = this.f236937b;
                        return dli.f.a(juniorProgressionPromptScreen, (i) juniorProgressionPromptScreen.L.getValue(), u.c(juniorProgressionPromptScreen.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: pk8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionPromptScreen f236937b;

            {
                this.f236937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = this.f236937b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt.di.JuniorProgressionPromptScreenComponent.Injector");
                        jk8.a aVar = ((jk8.b) bVarU2).f175130a;
                        jk8.c cVar = new jk8.c();
                        int i22 = 13;
                        cVar.f175132a = e4m.b.b(new jdi.i(aVar, cVar, 1, i22));
                        cVar.f175133b = e4m.b.b(new jdi.i(aVar, cVar, 0, i22));
                        return cVar;
                    case 1:
                        return (i) ((jk8.c) this.f236937b.K.getValue()).f175133b.get();
                    default:
                        JuniorProgressionPromptScreen juniorProgressionPromptScreen = this.f236937b;
                        return dli.f.a(juniorProgressionPromptScreen, (i) juniorProgressionPromptScreen.L.getValue(), u.c(juniorProgressionPromptScreen.M), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: pk8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorProgressionPromptScreen f236937b;

            {
                this.f236937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        qji.b bVarU2 = this.f236937b.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.junior_progression.impl.ui.prompt.steps.prompt.di.JuniorProgressionPromptScreenComponent.Injector");
                        jk8.a aVar = ((jk8.b) bVarU2).f175130a;
                        jk8.c cVar = new jk8.c();
                        int i22 = 13;
                        cVar.f175132a = e4m.b.b(new jdi.i(aVar, cVar, 1, i22));
                        cVar.f175133b = e4m.b.b(new jdi.i(aVar, cVar, 0, i22));
                        return cVar;
                    case 1:
                        return (i) ((jk8.c) this.f236937b.K.getValue()).f175133b.get();
                    default:
                        JuniorProgressionPromptScreen juniorProgressionPromptScreen = this.f236937b;
                        return dli.f.a(juniorProgressionPromptScreen, (i) juniorProgressionPromptScreen.L.getValue(), u.c(juniorProgressionPromptScreen.M), R$id.recyclerView, null, null, null, 56);
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
        return (c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new pk8.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new pk8.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
