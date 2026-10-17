package com.revolut.feature.pockets.impl.details_v2.flow;

import a0.d;
import aii.q;
import android.app.Activity;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.flow.PocketDetailsV2Flow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oda.l;
import oda.o;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/flow/PocketDetailsV2Flow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lin0/g;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PocketDetailsV2Flow extends ViewController<q> implements f, g {
    public final PocketDetailsFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PocketDetailsV2Flow(PocketDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: aea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PocketDetailsV2Flow f3521b;

            {
                this.f3521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PocketDetailsV2Flow pocketDetailsV2Flow = this.f3521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pocketDetailsV2Flow, (b) pocketDetailsV2Flow.O.getValue());
                    case 1:
                        PocketDetailsV2Flow pocketDetailsV2Flow2 = this.f3521b;
                        Activity activityM2 = pocketDetailsV2Flow2.m2();
                        PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData = pocketDetailsV2Flow2.K;
                        phm.a aVar = (phm.a) e.j(activityM2).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) ((bea.a) aVar2.b())).P;
                        pocketDetailsFlowContract$InputData.getClass();
                        AccountId accountId = pocketDetailsFlowContract$InputData.f80772b;
                        accountId.getClass();
                        return new l(oVar, pocketDetailsFlowContract$InputData, accountId);
                    default:
                        return (b) ((l) this.f3521b.N.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: aea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PocketDetailsV2Flow f3521b;

            {
                this.f3521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PocketDetailsV2Flow pocketDetailsV2Flow = this.f3521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pocketDetailsV2Flow, (b) pocketDetailsV2Flow.O.getValue());
                    case 1:
                        PocketDetailsV2Flow pocketDetailsV2Flow2 = this.f3521b;
                        Activity activityM2 = pocketDetailsV2Flow2.m2();
                        PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData = pocketDetailsV2Flow2.K;
                        phm.a aVar = (phm.a) e.j(activityM2).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) ((bea.a) aVar2.b())).P;
                        pocketDetailsFlowContract$InputData.getClass();
                        AccountId accountId = pocketDetailsFlowContract$InputData.f80772b;
                        accountId.getClass();
                        return new l(oVar, pocketDetailsFlowContract$InputData, accountId);
                    default:
                        return (b) ((l) this.f3521b.N.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: aea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PocketDetailsV2Flow f3521b;

            {
                this.f3521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PocketDetailsV2Flow pocketDetailsV2Flow = this.f3521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, pocketDetailsV2Flow, (b) pocketDetailsV2Flow.O.getValue());
                    case 1:
                        PocketDetailsV2Flow pocketDetailsV2Flow2 = this.f3521b;
                        Activity activityM2 = pocketDetailsV2Flow2.m2();
                        PocketDetailsFlowContract$InputData pocketDetailsFlowContract$InputData = pocketDetailsV2Flow2.K;
                        phm.a aVar = (phm.a) e.j(activityM2).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) ((bea.a) aVar2.b())).P;
                        pocketDetailsFlowContract$InputData.getClass();
                        AccountId accountId = pocketDetailsFlowContract$InputData.f80772b;
                        accountId.getClass();
                        return new l(oVar, pocketDetailsFlowContract$InputData, accountId);
                    default:
                        return (b) ((l) this.f3521b.N.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (aea.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getT() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.f80777l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
