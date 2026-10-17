package com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmed.ApmConfirmedScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import j1f.q0;
import j32.c;
import j32.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p12.t;
import p12.v;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/pending_payments/consent/confirmed/ApmConfirmedScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj32/f;", "<init>", "()V", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmConfirmedScreen extends ViewController<q> implements a {
    public static final /* synthetic */ int P = 0;
    public final Object L;
    public final Object N;
    public final Object O;
    public final Object K = w.y0(new q0(9));
    public final int M = R$layout.screen_recycler_view;

    public ApmConfirmedScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: j32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConfirmedScreen f170934b;

            {
                this.f170934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ApmConfirmedScreen apmConfirmedScreen = this.f170934b;
                        return dli.f.a(apmConfirmedScreen, (e) apmConfirmedScreen.O.getValue(), u.c((PromptContentDelegate) apmConfirmedScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f170934b.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        t tVar = new t();
                        int i2 = 24;
                        tVar.f231766a = e4m.b.b(new ove.w(vVar, tVar, 1, i2));
                        tVar.f231767b = e4m.b.b(new ove.w(vVar, tVar, 0, i2));
                        return tVar;
                    default:
                        return (e) ((t) this.f170934b.N.getValue()).f231767b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: j32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConfirmedScreen f170934b;

            {
                this.f170934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ApmConfirmedScreen apmConfirmedScreen = this.f170934b;
                        return dli.f.a(apmConfirmedScreen, (e) apmConfirmedScreen.O.getValue(), u.c((PromptContentDelegate) apmConfirmedScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f170934b.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        t tVar = new t();
                        int i22 = 24;
                        tVar.f231766a = e4m.b.b(new ove.w(vVar, tVar, 1, i22));
                        tVar.f231767b = e4m.b.b(new ove.w(vVar, tVar, 0, i22));
                        return tVar;
                    default:
                        return (e) ((t) this.f170934b.N.getValue()).f231767b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: j32.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmConfirmedScreen f170934b;

            {
                this.f170934b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ApmConfirmedScreen apmConfirmedScreen = this.f170934b;
                        return dli.f.a(apmConfirmedScreen, (e) apmConfirmedScreen.O.getValue(), u.c((PromptContentDelegate) apmConfirmedScreen.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        phm.a aVar = (phm.a) ue0.e.j(this.f170934b.m2()).a().get(v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v.class, " is not found"));
                        }
                        v vVar = ((v) aVar2.b()).K;
                        t tVar = new t();
                        int i22 = 24;
                        tVar.f231766a = e4m.b.b(new ove.w(vVar, tVar, 1, i22));
                        tVar.f231767b = e4m.b.b(new ove.w(vVar, tVar, 0, i22));
                        return tVar;
                    default:
                        return (e) ((t) this.f170934b.N.getValue()).f231767b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (j32.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), null, new j32.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
