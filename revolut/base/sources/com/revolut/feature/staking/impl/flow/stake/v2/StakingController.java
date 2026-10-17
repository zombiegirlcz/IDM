package com.revolut.feature.staking.impl.flow.stake.v2;

import a0.d;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingController;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;
import ytd.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/staking/impl/flow/stake/v2/StakingController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lytd/b;", "Lyki/f;", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakingController extends ViewController<b> implements f {
    public final String K;
    public final StakingProduct L;
    public final StakingPocket M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public StakingController(String str, StakingProduct stakingProduct, StakingPocket stakingPocket) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        this.K = str;
        this.L = stakingProduct;
        this.M = stakingPocket;
        this.N = R$layout.screen_transparent;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingController f292342b;

            {
                this.f292342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        StakingController stakingController = this.f292342b;
                        phm.a aVar = (phm.a) e.j(stakingController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.e(((qud.c) objB).f249379y, new StakingControllerContract$InputData(stakingController.K, stakingController.L, stakingController.M));
                    case 1:
                        return (b) ((qud.e) this.f292342b.O.getValue()).f249393c.get();
                    default:
                        StakingController stakingController2 = this.f292342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, stakingController2, (b) stakingController2.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingController f292342b;

            {
                this.f292342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        StakingController stakingController = this.f292342b;
                        phm.a aVar = (phm.a) e.j(stakingController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.e(((qud.c) objB).f249379y, new StakingControllerContract$InputData(stakingController.K, stakingController.L, stakingController.M));
                    case 1:
                        return (b) ((qud.e) this.f292342b.O.getValue()).f249393c.get();
                    default:
                        StakingController stakingController2 = this.f292342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, stakingController2, (b) stakingController2.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingController f292342b;

            {
                this.f292342b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        StakingController stakingController = this.f292342b;
                        phm.a aVar = (phm.a) e.j(stakingController.m2()).a().get(qud.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", qud.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.staking.impl.declaration.di.StakingApiComponent");
                        return new qud.e(((qud.c) objB).f249379y, new StakingControllerContract$InputData(stakingController.K, stakingController.L, stakingController.M));
                    case 1:
                        return (b) ((qud.e) this.f292342b.O.getValue()).f249393c.get();
                    default:
                        StakingController stakingController2 = this.f292342b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, stakingController2, (b) stakingController2.P.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qud.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qud.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vud.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.Q.getValue();
    }
}
