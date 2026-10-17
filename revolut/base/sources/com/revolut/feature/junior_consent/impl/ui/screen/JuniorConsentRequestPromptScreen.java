package com.revolut.feature.junior_consent.impl.ui.screen;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m75.i;
import md8.d;
import md8.f;
import md8.x;
import md8.y;
import te0.w;
import xki.e;
import zc8.c;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/ui/screen/JuniorConsentRequestPromptScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzc8/c;", "Ldli/a;", "Lmd8/f;", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorConsentRequestPromptScreen extends ViewController<c> implements a {
    public final d K;
    public final int L;
    public final PromptContentDelegate M;
    public final PromptMarketingContentDelegate N;
    public final PromptContentLoadingDelegate O;
    public final FullScreenStateDelegate P;
    public final LargeActionButtonDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public JuniorConsentRequestPromptScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        this.M = new PromptContentDelegate();
        this.N = new PromptMarketingContentDelegate();
        this.O = new PromptContentLoadingDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new LargeActionButtonDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: md8.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorConsentRequestPromptScreen f204530b;

            {
                this.f204530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen = this.f204530b;
                switch (i2) {
                    case 0:
                        JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen2 = this.f204530b;
                        return dli.f.a(juniorConsentRequestPromptScreen2, juniorConsentRequestPromptScreen2.d(), zhm.v.k(juniorConsentRequestPromptScreen2.M, juniorConsentRequestPromptScreen2.N, juniorConsentRequestPromptScreen2.P, juniorConsentRequestPromptScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(juniorConsentRequestPromptScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) ((pd8.a) aVar2.b())).f;
                        d dVar = juniorConsentRequestPromptScreen.K;
                        dVar.getClass();
                        return new jd8.d(eVar, juniorConsentRequestPromptScreen, dVar);
                    default:
                        return (e) ((jd8.d) juniorConsentRequestPromptScreen.S.getValue()).f173023h.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: md8.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorConsentRequestPromptScreen f204530b;

            {
                this.f204530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen = this.f204530b;
                switch (i22) {
                    case 0:
                        JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen2 = this.f204530b;
                        return dli.f.a(juniorConsentRequestPromptScreen2, juniorConsentRequestPromptScreen2.d(), zhm.v.k(juniorConsentRequestPromptScreen2.M, juniorConsentRequestPromptScreen2.N, juniorConsentRequestPromptScreen2.P, juniorConsentRequestPromptScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(juniorConsentRequestPromptScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) ((pd8.a) aVar2.b())).f;
                        d dVar = juniorConsentRequestPromptScreen.K;
                        dVar.getClass();
                        return new jd8.d(eVar, juniorConsentRequestPromptScreen, dVar);
                    default:
                        return (e) ((jd8.d) juniorConsentRequestPromptScreen.S.getValue()).f173023h.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: md8.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorConsentRequestPromptScreen f204530b;

            {
                this.f204530b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen = this.f204530b;
                switch (i22) {
                    case 0:
                        JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen2 = this.f204530b;
                        return dli.f.a(juniorConsentRequestPromptScreen2, juniorConsentRequestPromptScreen2.d(), zhm.v.k(juniorConsentRequestPromptScreen2.M, juniorConsentRequestPromptScreen2.N, juniorConsentRequestPromptScreen2.P, juniorConsentRequestPromptScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(juniorConsentRequestPromptScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) ((pd8.a) aVar2.b())).f;
                        d dVar = juniorConsentRequestPromptScreen.K;
                        dVar.getClass();
                        return new jd8.d(eVar, juniorConsentRequestPromptScreen, dVar);
                    default:
                        return (e) ((jd8.d) juniorConsentRequestPromptScreen.S.getValue()).f173023h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jd8.d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((jd8.d) this.S.getValue()).d.get()).d(v.k(new RowDelegate(null, null, 7), this.Q));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptContentDelegate promptContentDelegate = this.M;
        vkm.d dVarB = rd0.e.b(promptContentDelegate.q());
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.N;
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(dVarB, rd0.e.b(promptMarketingContentDelegate.f53079c), rd0.e.b(this.O.f53078c.f121375b)), new md8.v(this, continuation, 0), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptContentDelegate.f53054h.f121375b), rd0.e.b(promptMarketingContentDelegate.f.f121375b)), new md8.v(this, continuation, 1), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(promptContentDelegate.i.f121375b), rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b)), new md8.v(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(promptContentDelegate.r()), new md8.w(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptMarketingContentDelegate.d), null, new i(this, continuation, 17), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new x(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new y(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final md8.e d() {
        return (md8.e) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
