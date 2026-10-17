package com.revolut.feature.pix.impl.flow.migrate_alias;

import com.revolut.feature.pix.impl.flow.migrate_alias.MigrateAliasContract$InputData;
import com.revolut.feature.pix.impl.flow.migrate_alias.MigrateAliasFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import faa.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p8a.d0;
import p8a.j;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/migrate_alias/MigrateAliasFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfaa/d;", "Lyki/f;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MigrateAliasFlow extends ViewController<d> implements f {
    public final MigrateAliasContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public MigrateAliasFlow(MigrateAliasContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: faa.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateAliasFlow f133272b;

            {
                this.f133272b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MigrateAliasFlow migrateAliasFlow = this.f133272b;
                        phm.a aVar = (phm.a) ue0.e.j(migrateAliasFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        MigrateAliasContract$InputData migrateAliasContract$InputData = migrateAliasFlow.K;
                        migrateAliasContract$InputData.getClass();
                        return new j(d0Var, migrateAliasContract$InputData);
                    case 1:
                        return (a) ((j) this.f133272b.M.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        MigrateAliasFlow migrateAliasFlow2 = this.f133272b;
                        return czi.c.d(i2, 4, null, migrateAliasFlow2, (a) migrateAliasFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: faa.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateAliasFlow f133272b;

            {
                this.f133272b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MigrateAliasFlow migrateAliasFlow = this.f133272b;
                        phm.a aVar = (phm.a) ue0.e.j(migrateAliasFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        MigrateAliasContract$InputData migrateAliasContract$InputData = migrateAliasFlow.K;
                        migrateAliasContract$InputData.getClass();
                        return new j(d0Var, migrateAliasContract$InputData);
                    case 1:
                        return (a) ((j) this.f133272b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        MigrateAliasFlow migrateAliasFlow2 = this.f133272b;
                        return czi.c.d(i22, 4, null, migrateAliasFlow2, (a) migrateAliasFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: faa.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MigrateAliasFlow f133272b;

            {
                this.f133272b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MigrateAliasFlow migrateAliasFlow = this.f133272b;
                        phm.a aVar = (phm.a) ue0.e.j(migrateAliasFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        d0 d0Var = ((d0) aVar2.b()).C;
                        MigrateAliasContract$InputData migrateAliasContract$InputData = migrateAliasFlow.K;
                        migrateAliasContract$InputData.getClass();
                        return new j(d0Var, migrateAliasContract$InputData);
                    case 1:
                        return (a) ((j) this.f133272b.M.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        MigrateAliasFlow migrateAliasFlow2 = this.f133272b;
                        return czi.c.d(i22, 4, null, migrateAliasFlow2, (a) migrateAliasFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (faa.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
