package com.revolut.feature.tax_residency.impl.ui.sole;

import android.view.View;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreen;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreenContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ff4.z;
import fpe.c;
import fpe.g;
import fpe.h;
import fpe.i;
import grl.k9;
import ine.o;
import ine.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/ui/sole/TaxResidencySoleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfpe/g;", "Ldli/a;", "Lfpe/i;", "Lno/m;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxResidencySoleScreen extends ViewController<g> implements dli.a, m {
    public final TaxResidencySoleScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final k9 N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TaxResidencySoleScreen(TaxResidencySoleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new fnk.a(6));
        this.M = R$layout.screen_recycler_view;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.N = k9Var;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencySoleScreen f137090b;

            {
                this.f137090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TaxResidencySoleScreen taxResidencySoleScreen = this.f137090b;
                        return dli.f.a(taxResidencySoleScreen, (h) taxResidencySoleScreen.Q.getValue(), u.c((PromptMarketingContentDelegate) taxResidencySoleScreen.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        TaxResidencySoleScreen taxResidencySoleScreen2 = this.f137090b;
                        qji.b bVarU2 = taxResidencySoleScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.ui.sole.di.TaxResidencySoleScreenInjector");
                        ine.b bVar = (ine.b) bVarU2;
                        o oVar = bVar.f162841b;
                        ine.b bVar2 = bVar.f162842c;
                        TaxResidencySoleScreenContract$InputData taxResidencySoleScreenContract$InputData = taxResidencySoleScreen2.K;
                        taxResidencySoleScreenContract$InputData.getClass();
                        return new r(oVar, bVar2, taxResidencySoleScreen2, taxResidencySoleScreenContract$InputData);
                    default:
                        return (h) ((r) this.f137090b.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencySoleScreen f137090b;

            {
                this.f137090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TaxResidencySoleScreen taxResidencySoleScreen = this.f137090b;
                        return dli.f.a(taxResidencySoleScreen, (h) taxResidencySoleScreen.Q.getValue(), u.c((PromptMarketingContentDelegate) taxResidencySoleScreen.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        TaxResidencySoleScreen taxResidencySoleScreen2 = this.f137090b;
                        qji.b bVarU2 = taxResidencySoleScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.ui.sole.di.TaxResidencySoleScreenInjector");
                        ine.b bVar = (ine.b) bVarU2;
                        o oVar = bVar.f162841b;
                        ine.b bVar2 = bVar.f162842c;
                        TaxResidencySoleScreenContract$InputData taxResidencySoleScreenContract$InputData = taxResidencySoleScreen2.K;
                        taxResidencySoleScreenContract$InputData.getClass();
                        return new r(oVar, bVar2, taxResidencySoleScreen2, taxResidencySoleScreenContract$InputData);
                    default:
                        return (h) ((r) this.f137090b.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: fpe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxResidencySoleScreen f137090b;

            {
                this.f137090b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TaxResidencySoleScreen taxResidencySoleScreen = this.f137090b;
                        return dli.f.a(taxResidencySoleScreen, (h) taxResidencySoleScreen.Q.getValue(), u.c((PromptMarketingContentDelegate) taxResidencySoleScreen.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        TaxResidencySoleScreen taxResidencySoleScreen2 = this.f137090b;
                        qji.b bVarU2 = taxResidencySoleScreen2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.tax_residency.impl.ui.sole.di.TaxResidencySoleScreenInjector");
                        ine.b bVar = (ine.b) bVarU2;
                        o oVar = bVar.f162841b;
                        ine.b bVar2 = bVar.f162842c;
                        TaxResidencySoleScreenContract$InputData taxResidencySoleScreenContract$InputData = taxResidencySoleScreen2.K;
                        taxResidencySoleScreenContract$InputData.getClass();
                        return new r(oVar, bVar2, taxResidencySoleScreen2, taxResidencySoleScreenContract$InputData);
                    default:
                        return (h) ((r) this.f137090b.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.N);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.L;
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).d), new z(this, null, 25), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f.f121375b), new fpe.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(((PromptMarketingContentDelegate) r56.getValue()).f53080g.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
