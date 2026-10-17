package com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.blank_card_delivery.JuniorBlankCardDeliveryConsentScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jd8.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nd8.b;
import nd8.d;
import nd8.g;
import nd8.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/ui/screen/blank_card_delivery/JuniorBlankCardDeliveryConsentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnd8/h;", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorBlankCardDeliveryConsentScreen extends ViewController<q> implements a {
    public final g K;
    public final FullScreenStateDelegate L;
    public final PromptMarketingContentDelegate M;
    public final PromptMarketingContentLoadingDelegate N;
    public final int O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public JuniorBlankCardDeliveryConsentScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new FullScreenStateDelegate();
        this.M = new PromptMarketingContentDelegate();
        this.N = new PromptMarketingContentLoadingDelegate();
        this.O = R$layout.screen_prompt;
        this.P = R$style.UiKitTheme_Night;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: nd8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorBlankCardDeliveryConsentScreen f214335b;

            {
                this.f214335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen = this.f214335b;
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(juniorBlankCardDeliveryConsentScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) aVar2.b()).f;
                        g gVar = juniorBlankCardDeliveryConsentScreen.K;
                        gVar.getClass();
                        return new jd8.c(eVar, gVar);
                    case 1:
                        return (q) ((jd8.c) juniorBlankCardDeliveryConsentScreen.Q.getValue()).f173018b.get();
                    default:
                        JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen2 = this.f214335b;
                        return dli.f.a(juniorBlankCardDeliveryConsentScreen2, juniorBlankCardDeliveryConsentScreen2.d(), v.k(juniorBlankCardDeliveryConsentScreen2.N, juniorBlankCardDeliveryConsentScreen2.M, juniorBlankCardDeliveryConsentScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: nd8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorBlankCardDeliveryConsentScreen f214335b;

            {
                this.f214335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen = this.f214335b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(juniorBlankCardDeliveryConsentScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) aVar2.b()).f;
                        g gVar = juniorBlankCardDeliveryConsentScreen.K;
                        gVar.getClass();
                        return new jd8.c(eVar, gVar);
                    case 1:
                        return (q) ((jd8.c) juniorBlankCardDeliveryConsentScreen.Q.getValue()).f173018b.get();
                    default:
                        JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen2 = this.f214335b;
                        return dli.f.a(juniorBlankCardDeliveryConsentScreen2, juniorBlankCardDeliveryConsentScreen2.d(), v.k(juniorBlankCardDeliveryConsentScreen2.N, juniorBlankCardDeliveryConsentScreen2.M, juniorBlankCardDeliveryConsentScreen2.L), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nd8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorBlankCardDeliveryConsentScreen f214335b;

            {
                this.f214335b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen = this.f214335b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(juniorBlankCardDeliveryConsentScreen.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) aVar2.b()).f;
                        g gVar = juniorBlankCardDeliveryConsentScreen.K;
                        gVar.getClass();
                        return new jd8.c(eVar, gVar);
                    case 1:
                        return (q) ((jd8.c) juniorBlankCardDeliveryConsentScreen.Q.getValue()).f173018b.get();
                    default:
                        JuniorBlankCardDeliveryConsentScreen juniorBlankCardDeliveryConsentScreen2 = this.f214335b;
                        return dli.f.a(juniorBlankCardDeliveryConsentScreen2, juniorBlankCardDeliveryConsentScreen2.d(), v.k(juniorBlankCardDeliveryConsentScreen2.N, juniorBlankCardDeliveryConsentScreen2.M, juniorBlankCardDeliveryConsentScreen2.L), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getL() {
        return Integer.valueOf(this.P);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.p()), new mta.c(this, null, 25), 3);
        PromptMarketingContentDelegate promptMarketingContentDelegate = this.M;
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53079c), new nd8.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(promptMarketingContentDelegate.f53080g.f121375b), new nd8.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final nd8.q d() {
        return (nd8.q) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
