package com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h07.c;
import h07.d;
import h07.f;
import h07.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import us6.t;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/email_flow/check_email/FreelancerCheckEmailScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lh07/g;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerCheckEmailScreen extends ViewController<q> implements a {
    public final PromptContentDelegate K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public FreelancerCheckEmailScreen(FreelancerCheckEmailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new PromptContentDelegate();
        this.L = R$layout.screen_prompt;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCheckEmailScreen f148195b;

            {
                this.f148195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FreelancerCheckEmailScreen freelancerCheckEmailScreen = this.f148195b;
                        return dli.f.a(freelancerCheckEmailScreen, (f) freelancerCheckEmailScreen.O.getValue(), u.c(freelancerCheckEmailScreen.K), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (f) ((t) this.f148195b.N.getValue()).f282753c.get();
                }
            }
        });
        this.N = w.y0(new ghk.t(this, inputData, 28));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: h07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerCheckEmailScreen f148195b;

            {
                this.f148195b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FreelancerCheckEmailScreen freelancerCheckEmailScreen = this.f148195b;
                        return dli.f.a(freelancerCheckEmailScreen, (f) freelancerCheckEmailScreen.O.getValue(), u.c(freelancerCheckEmailScreen.K), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (f) ((t) this.f148195b.N.getValue()).f282753c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        PromptContentDelegate promptContentDelegate = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.q()), null, new h07.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.f53054h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promptContentDelegate.i.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
