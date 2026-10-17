package com.revolut.feature.onboarding.impl.user_migration;

import aii.q;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlow;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/user_migration/UserMigrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserMigrationFlow extends ViewController<q> implements f {
    public final UserMigrationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public UserMigrationFlow(UserMigrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ad9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationFlow f3293b;

            {
                this.f3293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UserMigrationFlow userMigrationFlow = this.f3293b;
                        phm.a aVar = (phm.a) ue0.e.j(userMigrationFlow.m2()).a().get(a99.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a99.e.class, " is not found"));
                        }
                        dd9.e eVar = ((dd9.e) aVar2.b()).f113136l;
                        UserMigrationFlowContract$InputData userMigrationFlowContract$InputData = userMigrationFlow.K;
                        userMigrationFlowContract$InputData.getClass();
                        return new dd9.f(eVar, userMigrationFlowContract$InputData);
                    case 1:
                        return (d) ((dd9.f) this.f3293b.L.getValue()).d.get();
                    default:
                        UserMigrationFlow userMigrationFlow2 = this.f3293b;
                        return czi.c.d(0, 6, null, userMigrationFlow2, (d) userMigrationFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ad9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationFlow f3293b;

            {
                this.f3293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UserMigrationFlow userMigrationFlow = this.f3293b;
                        phm.a aVar = (phm.a) ue0.e.j(userMigrationFlow.m2()).a().get(a99.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a99.e.class, " is not found"));
                        }
                        dd9.e eVar = ((dd9.e) aVar2.b()).f113136l;
                        UserMigrationFlowContract$InputData userMigrationFlowContract$InputData = userMigrationFlow.K;
                        userMigrationFlowContract$InputData.getClass();
                        return new dd9.f(eVar, userMigrationFlowContract$InputData);
                    case 1:
                        return (d) ((dd9.f) this.f3293b.L.getValue()).d.get();
                    default:
                        UserMigrationFlow userMigrationFlow2 = this.f3293b;
                        return czi.c.d(0, 6, null, userMigrationFlow2, (d) userMigrationFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ad9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserMigrationFlow f3293b;

            {
                this.f3293b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        UserMigrationFlow userMigrationFlow = this.f3293b;
                        phm.a aVar = (phm.a) ue0.e.j(userMigrationFlow.m2()).a().get(a99.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a99.e.class, " is not found"));
                        }
                        dd9.e eVar = ((dd9.e) aVar2.b()).f113136l;
                        UserMigrationFlowContract$InputData userMigrationFlowContract$InputData = userMigrationFlow.K;
                        userMigrationFlowContract$InputData.getClass();
                        return new dd9.f(eVar, userMigrationFlowContract$InputData);
                    case 1:
                        return (d) ((dd9.f) this.f3293b.L.getValue()).d.get();
                    default:
                        UserMigrationFlow userMigrationFlow2 = this.f3293b;
                        return czi.c.d(0, 6, null, userMigrationFlow2, (d) userMigrationFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (dd9.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (dd9.f) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (ad9.d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
