package com.revolut.feature.crypto_investments.impl.ui.screens.kompot_tax_report;

import aii.q;
import com.revolut.feature.crypto_investments.impl.ui.screens.kompot_tax_report.TaxReportFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kr9.m;
import ku5.k;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto_investments/impl/ui/screens/kompot_tax_report/TaxReportFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "<init>", "()V", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxReportFlow extends ViewController<q> implements f {
    public final int K = R$layout.screen_transparent;
    public final Object L;
    public final Object M;
    public final Object N;

    public TaxReportFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxReportFlow f292256b;

            {
                this.f292256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TaxReportFlow taxReportFlow = this.f292256b;
                        phm.a aVar = (phm.a) ue0.e.j(taxReportFlow.m2()).a().get(ku5.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ku5.g.class, " is not found"));
                        }
                        ku5.g gVar = ((ku5.g) aVar2.b()).u;
                        k kVar = new k();
                        kVar.f189715a = e4m.b.b(e4m.c.a(taxReportFlow));
                        int i2 = 9;
                        kVar.f189716b = e4m.b.b(new m(gVar, kVar, 2, i2));
                        kVar.f189717c = e4m.b.b(new m(gVar, kVar, 1, i2));
                        kVar.d = e4m.b.b(new m(gVar, kVar, 0, i2));
                        kVar.e = e4m.b.b(new m(gVar, kVar, 3, i2));
                        return kVar;
                    case 1:
                        return (b) ((k) this.f292256b.L.getValue()).e.get();
                    default:
                        TaxReportFlow taxReportFlow2 = this.f292256b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxReportFlow2, (b) taxReportFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxReportFlow f292256b;

            {
                this.f292256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TaxReportFlow taxReportFlow = this.f292256b;
                        phm.a aVar = (phm.a) ue0.e.j(taxReportFlow.m2()).a().get(ku5.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ku5.g.class, " is not found"));
                        }
                        ku5.g gVar = ((ku5.g) aVar2.b()).u;
                        k kVar = new k();
                        kVar.f189715a = e4m.b.b(e4m.c.a(taxReportFlow));
                        int i22 = 9;
                        kVar.f189716b = e4m.b.b(new m(gVar, kVar, 2, i22));
                        kVar.f189717c = e4m.b.b(new m(gVar, kVar, 1, i22));
                        kVar.d = e4m.b.b(new m(gVar, kVar, 0, i22));
                        kVar.e = e4m.b.b(new m(gVar, kVar, 3, i22));
                        return kVar;
                    case 1:
                        return (b) ((k) this.f292256b.L.getValue()).e.get();
                    default:
                        TaxReportFlow taxReportFlow2 = this.f292256b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxReportFlow2, (b) taxReportFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: vu5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxReportFlow f292256b;

            {
                this.f292256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TaxReportFlow taxReportFlow = this.f292256b;
                        phm.a aVar = (phm.a) ue0.e.j(taxReportFlow.m2()).a().get(ku5.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ku5.g.class, " is not found"));
                        }
                        ku5.g gVar = ((ku5.g) aVar2.b()).u;
                        k kVar = new k();
                        kVar.f189715a = e4m.b.b(e4m.c.a(taxReportFlow));
                        int i22 = 9;
                        kVar.f189716b = e4m.b.b(new m(gVar, kVar, 2, i22));
                        kVar.f189717c = e4m.b.b(new m(gVar, kVar, 1, i22));
                        kVar.d = e4m.b.b(new m(gVar, kVar, 0, i22));
                        kVar.e = e4m.b.b(new m(gVar, kVar, 3, i22));
                        return kVar;
                    case 1:
                        return (b) ((k) this.f292256b.L.getValue()).e.get();
                    default:
                        TaxReportFlow taxReportFlow2 = this.f292256b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, taxReportFlow2, (b) taxReportFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vu5.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
