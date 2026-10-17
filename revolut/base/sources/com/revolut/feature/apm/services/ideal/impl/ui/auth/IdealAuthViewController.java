package com.revolut.feature.apm.services.ideal.impl.ui.auth;

import aii.q;
import android.view.View;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.apm.services.ideal.impl.ui.auth.IdealAuthViewController;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import fd2.m;
import h43.b;
import hd2.c;
import hd2.e;
import hd2.h;
import hd2.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/auth/IdealAuthViewController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhd2/e;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdealAuthViewController extends ViewController<q> implements a {
    public static final /* synthetic */ int P = 0;
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public IdealAuthViewController(IdealAuthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new b(27));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hd2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdealAuthViewController f151382b;

            {
                this.f151382b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        IdealAuthViewController idealAuthViewController = this.f151382b;
                        return dli.f.a(idealAuthViewController, (c) idealAuthViewController.O.getValue(), u.c((PromptContentDelegate) idealAuthViewController.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (c) ((m) this.f151382b.N.getValue()).f133888c.get();
                }
            }
        });
        this.M = R$layout.screen_recycler_view;
        this.N = w.y0(new h1k.a(this, inputData, 17));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hd2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdealAuthViewController f151382b;

            {
                this.f151382b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        IdealAuthViewController idealAuthViewController = this.f151382b;
                        return dli.f.a(idealAuthViewController, (c) idealAuthViewController.O.getValue(), u.c((PromptContentDelegate) idealAuthViewController.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        return (c) ((m) this.f151382b.N.getValue()).f133888c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.K;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).f53054h.f121375b), null, new h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PromptContentDelegate) r56.getValue()).q()), null, new i(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
