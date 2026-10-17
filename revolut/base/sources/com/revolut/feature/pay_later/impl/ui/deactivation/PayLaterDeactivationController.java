package com.revolut.feature.pay_later.impl.ui.deactivation;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.feature.pay_later.impl.ui.deactivation.PayLaterDeactivationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ij9.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import no.m;
import oi9.g;
import pgk.d;
import pj9.c;
import pj9.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/deactivation/PayLaterDeactivationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpj9/h;", "Lno/m;", "<init>", "()V", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterDeactivationController extends ViewController<q> implements a, m {
    public static final /* synthetic */ int R = 0;
    public final Object M;
    public final Object N;
    public final Object Q;
    public final /* synthetic */ b K = b.f161739a;
    public final int L = R$layout.screen_prompt;
    public final Object O = w.y0(new d(23));
    public final Object P = w.y0(new d(24));

    public PayLaterDeactivationController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterDeactivationController f236703b;

            {
                this.f236703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayLaterDeactivationController payLaterDeactivationController = this.f236703b;
                int i3 = 2;
                int i5 = 1;
                int i6 = 0;
                int i21 = 3;
                switch (i2) {
                    case 0:
                        oi9.f fVar = s.n(payLaterDeactivationController.m2()).v;
                        oi9.g gVar = new oi9.g();
                        gVar.f225516a = e4m.b.b(new oi9.a(fVar, gVar, i5, i21));
                        gVar.f225517b = e4m.g.a(new oi9.a(fVar, gVar, i3, i21));
                        gVar.f225518c = e4m.b.b(new oi9.a(fVar, gVar, i6, i21));
                        return gVar;
                    case 1:
                        return (g) ((oi9.g) payLaterDeactivationController.M.getValue()).f225518c.get();
                    default:
                        PayLaterDeactivationController payLaterDeactivationController2 = this.f236703b;
                        return dli.f.a(payLaterDeactivationController2, payLaterDeactivationController2.d(), v.k((PromptMarketingContentDelegate) payLaterDeactivationController2.O.getValue(), (FullScreenStateDelegate) payLaterDeactivationController2.P.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: pj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterDeactivationController f236703b;

            {
                this.f236703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayLaterDeactivationController payLaterDeactivationController = this.f236703b;
                int i3 = 2;
                int i5 = 1;
                int i6 = 0;
                int i21 = 3;
                switch (i22) {
                    case 0:
                        oi9.f fVar = s.n(payLaterDeactivationController.m2()).v;
                        oi9.g gVar = new oi9.g();
                        gVar.f225516a = e4m.b.b(new oi9.a(fVar, gVar, i5, i21));
                        gVar.f225517b = e4m.g.a(new oi9.a(fVar, gVar, i3, i21));
                        gVar.f225518c = e4m.b.b(new oi9.a(fVar, gVar, i6, i21));
                        return gVar;
                    case 1:
                        return (g) ((oi9.g) payLaterDeactivationController.M.getValue()).f225518c.get();
                    default:
                        PayLaterDeactivationController payLaterDeactivationController2 = this.f236703b;
                        return dli.f.a(payLaterDeactivationController2, payLaterDeactivationController2.d(), v.k((PromptMarketingContentDelegate) payLaterDeactivationController2.O.getValue(), (FullScreenStateDelegate) payLaterDeactivationController2.P.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: pj9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayLaterDeactivationController f236703b;

            {
                this.f236703b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayLaterDeactivationController payLaterDeactivationController = this.f236703b;
                int i32 = 2;
                int i5 = 1;
                int i6 = 0;
                int i21 = 3;
                switch (i22) {
                    case 0:
                        oi9.f fVar = s.n(payLaterDeactivationController.m2()).v;
                        oi9.g gVar = new oi9.g();
                        gVar.f225516a = e4m.b.b(new oi9.a(fVar, gVar, i5, i21));
                        gVar.f225517b = e4m.g.a(new oi9.a(fVar, gVar, i32, i21));
                        gVar.f225518c = e4m.b.b(new oi9.a(fVar, gVar, i6, i21));
                        return gVar;
                    case 1:
                        return (g) ((oi9.g) payLaterDeactivationController.M.getValue()).f225518c.get();
                    default:
                        PayLaterDeactivationController payLaterDeactivationController2 = this.f236703b;
                        return dli.f.a(payLaterDeactivationController2, payLaterDeactivationController2.d(), v.k((PromptMarketingContentDelegate) payLaterDeactivationController2.O.getValue(), (FullScreenStateDelegate) payLaterDeactivationController2.P.getValue(), new PromptMarketingContentLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((h) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        this.K.getClass();
        return b.f161740b;
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
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new pj9.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53079c), new pj9.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new pj9.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final pj9.g d() {
        return (pj9.g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
