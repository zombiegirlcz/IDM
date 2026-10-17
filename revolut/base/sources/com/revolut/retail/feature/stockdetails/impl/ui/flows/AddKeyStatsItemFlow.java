package com.revolut.retail.feature.stockdetails.impl.ui.flows;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.AddKeyStatsItemFlow;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mtk.b;
import mtk.c;
import mtk.d;
import prk.g0;
import prk.n0;
import xki.e;
import yhm.j;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/AddKeyStatsItemFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmtk/d;", "Lyki/f;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddKeyStatsItemFlow extends ViewController<d> implements f {
    public final b K;
    public final Lazy L;
    public final Lazy M;
    public final Lazy N;

    public AddKeyStatsItemFlow(b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: mtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsItemFlow f208903b;

            {
                this.f208903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AddKeyStatsItemFlow addKeyStatsItemFlow = this.f208903b;
                        phm.a aVar = (phm.a) ue0.e.j(addKeyStatsItemFlow.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        b bVar = addKeyStatsItemFlow.K;
                        bVar.getClass();
                        return new prk.b(g0Var, bVar);
                    case 1:
                        return (c) ((prk.b) this.f208903b.L.getValue()).d.get();
                    default:
                        AddKeyStatsItemFlow addKeyStatsItemFlow2 = this.f208903b;
                        return czi.c.d(0, 6, null, addKeyStatsItemFlow2, (c) addKeyStatsItemFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = j.b(new Function0(this) { // from class: mtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsItemFlow f208903b;

            {
                this.f208903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AddKeyStatsItemFlow addKeyStatsItemFlow = this.f208903b;
                        phm.a aVar = (phm.a) ue0.e.j(addKeyStatsItemFlow.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        b bVar = addKeyStatsItemFlow.K;
                        bVar.getClass();
                        return new prk.b(g0Var, bVar);
                    case 1:
                        return (c) ((prk.b) this.f208903b.L.getValue()).d.get();
                    default:
                        AddKeyStatsItemFlow addKeyStatsItemFlow2 = this.f208903b;
                        return czi.c.d(0, 6, null, addKeyStatsItemFlow2, (c) addKeyStatsItemFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = j.b(new Function0(this) { // from class: mtk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddKeyStatsItemFlow f208903b;

            {
                this.f208903b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AddKeyStatsItemFlow addKeyStatsItemFlow = this.f208903b;
                        phm.a aVar = (phm.a) ue0.e.j(addKeyStatsItemFlow.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                        }
                        g0 g0Var = ((g0) ((n0) aVar2.b())).N;
                        b bVar = addKeyStatsItemFlow.K;
                        bVar.getClass();
                        return new prk.b(g0Var, bVar);
                    case 1:
                        return (c) ((prk.b) this.f208903b.L.getValue()).d.get();
                    default:
                        AddKeyStatsItemFlow addKeyStatsItemFlow2 = this.f208903b;
                        return czi.c.d(0, 6, null, addKeyStatsItemFlow2, (c) addKeyStatsItemFlow2.M.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (prk.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (prk.b) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (c) this.M.getValue();
    }

    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
