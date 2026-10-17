package com.revolut.feature.apm.spin.impl.ui.deregister;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreen;
import com.revolut.feature.apm.spin.impl.ui.deregister.SpinDeregisterPromptScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qd2.g;
import te0.w;
import u9a.b;
import ud2.c;
import ud2.d;
import ud2.i;
import ud2.j;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/spin/impl/ui/deregister/SpinDeregisterPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lud2/i;", "Ldli/a;", "Lud2/j;", "feature_apm_spin_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SpinDeregisterPromptScreen extends ViewController<i> implements a {
    public static final /* synthetic */ int R = 0;
    public final SpinDeregisterPromptScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SpinDeregisterPromptScreen(SpinDeregisterPromptScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ud2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinDeregisterPromptScreen f279073b;

            {
                this.f279073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SpinDeregisterPromptScreen spinDeregisterPromptScreen = this.f279073b;
                switch (i2) {
                    case 0:
                        qji.b bVarU2 = spinDeregisterPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.deregister.di.SpinDeregisterPromptScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        SpinDeregisterPromptScreenContract$InputData spinDeregisterPromptScreenContract$InputData = spinDeregisterPromptScreen.K;
                        spinDeregisterPromptScreenContract$InputData.getClass();
                        return new qd2.g(fVar, hVar2, spinDeregisterPromptScreenContract$InputData);
                    case 1:
                        return (q) ((qd2.g) spinDeregisterPromptScreen.M.getValue()).f244846c.get();
                    default:
                        SpinDeregisterPromptScreen spinDeregisterPromptScreen2 = this.f279073b;
                        return dli.f.a(spinDeregisterPromptScreen2, spinDeregisterPromptScreen2.d(), v.k((PromptMarketingContentDelegate) spinDeregisterPromptScreen2.O.getValue(), (PromptMarketingContentLoadingDelegate) spinDeregisterPromptScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ud2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinDeregisterPromptScreen f279073b;

            {
                this.f279073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SpinDeregisterPromptScreen spinDeregisterPromptScreen = this.f279073b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = spinDeregisterPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.deregister.di.SpinDeregisterPromptScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        SpinDeregisterPromptScreenContract$InputData spinDeregisterPromptScreenContract$InputData = spinDeregisterPromptScreen.K;
                        spinDeregisterPromptScreenContract$InputData.getClass();
                        return new qd2.g(fVar, hVar2, spinDeregisterPromptScreenContract$InputData);
                    case 1:
                        return (q) ((qd2.g) spinDeregisterPromptScreen.M.getValue()).f244846c.get();
                    default:
                        SpinDeregisterPromptScreen spinDeregisterPromptScreen2 = this.f279073b;
                        return dli.f.a(spinDeregisterPromptScreen2, spinDeregisterPromptScreen2.d(), v.k((PromptMarketingContentDelegate) spinDeregisterPromptScreen2.O.getValue(), (PromptMarketingContentLoadingDelegate) spinDeregisterPromptScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new b(8));
        this.P = w.y0(new b(9));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ud2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpinDeregisterPromptScreen f279073b;

            {
                this.f279073b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SpinDeregisterPromptScreen spinDeregisterPromptScreen = this.f279073b;
                switch (i22) {
                    case 0:
                        qji.b bVarU2 = spinDeregisterPromptScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.spin.impl.ui.deregister.di.SpinDeregisterPromptScreenInjector");
                        qd2.h hVar = (qd2.h) bVarU2;
                        qd2.f fVar = hVar.f244848b;
                        qd2.h hVar2 = hVar.f244849c;
                        SpinDeregisterPromptScreenContract$InputData spinDeregisterPromptScreenContract$InputData = spinDeregisterPromptScreen.K;
                        spinDeregisterPromptScreenContract$InputData.getClass();
                        return new qd2.g(fVar, hVar2, spinDeregisterPromptScreenContract$InputData);
                    case 1:
                        return (q) ((qd2.g) spinDeregisterPromptScreen.M.getValue()).f244846c.get();
                    default:
                        SpinDeregisterPromptScreen spinDeregisterPromptScreen2 = this.f279073b;
                        return dli.f.a(spinDeregisterPromptScreen2, spinDeregisterPromptScreen2.d(), v.k((PromptMarketingContentDelegate) spinDeregisterPromptScreen2.O.getValue(), (PromptMarketingContentLoadingDelegate) spinDeregisterPromptScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), null, new ud2.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptMarketingContentLoadingDelegate) this.P.getValue()).p()), null, new u07.b(this, null, 25), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final ud2.q d() {
        return (ud2.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
