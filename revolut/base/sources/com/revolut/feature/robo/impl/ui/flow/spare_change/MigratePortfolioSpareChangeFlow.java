package com.revolut.feature.robo.impl.ui.flow.spare_change;

import aii.q;
import com.revolut.feature.robo.impl.ui.flow.spare_change.MigratePortfolioSpareChangeFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import dmc.h;
import dmc.r;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mmc.b;
import mmc.d;
import te0.w;
import ue0.e;
import yhm.j;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/robo/impl/ui/flow/spare_change/MigratePortfolioSpareChangeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MigratePortfolioSpareChangeFlow extends ViewController<q> implements f {
    public final b K;
    public final Lazy L;
    public final Object M;
    public final Object N;

    public MigratePortfolioSpareChangeFlow(b input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: mmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigratePortfolioSpareChangeFlow f207187b;

            {
                this.f207187b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow = this.f207187b;
                        phm.a aVar = (phm.a) e.j(migratePortfolioSpareChangeFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = migratePortfolioSpareChangeFlow.K;
                        bVar.getClass();
                        return new h(rVar, bVar);
                    case 1:
                        return (d) ((h) this.f207187b.L.getValue()).f115953c.get();
                    default:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow2 = this.f207187b;
                        return czi.c.d(0, 6, null, migratePortfolioSpareChangeFlow2, (d) migratePortfolioSpareChangeFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: mmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigratePortfolioSpareChangeFlow f207187b;

            {
                this.f207187b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow = this.f207187b;
                        phm.a aVar = (phm.a) e.j(migratePortfolioSpareChangeFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = migratePortfolioSpareChangeFlow.K;
                        bVar.getClass();
                        return new h(rVar, bVar);
                    case 1:
                        return (d) ((h) this.f207187b.L.getValue()).f115953c.get();
                    default:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow2 = this.f207187b;
                        return czi.c.d(0, 6, null, migratePortfolioSpareChangeFlow2, (d) migratePortfolioSpareChangeFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: mmc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigratePortfolioSpareChangeFlow f207187b;

            {
                this.f207187b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow = this.f207187b;
                        phm.a aVar = (phm.a) e.j(migratePortfolioSpareChangeFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).f116039s;
                        b bVar = migratePortfolioSpareChangeFlow.K;
                        bVar.getClass();
                        return new h(rVar, bVar);
                    case 1:
                        return (d) ((h) this.f207187b.L.getValue()).f115953c.get();
                    default:
                        MigratePortfolioSpareChangeFlow migratePortfolioSpareChangeFlow2 = this.f207187b;
                        return czi.c.d(0, 6, null, migratePortfolioSpareChangeFlow2, (d) migratePortfolioSpareChangeFlow2.M.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (h) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
