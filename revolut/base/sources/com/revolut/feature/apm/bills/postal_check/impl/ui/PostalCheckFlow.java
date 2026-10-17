package com.revolut.feature.apm.bills.postal_check.impl.ui;

import aii.q;
import com.revolut.feature.apm.bills.postal_check.api.navigation.PostalCheckNavigation$InputData;
import com.revolut.feature.apm.bills.postal_check.impl.ui.PostalCheckFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/postal_check/impl/ui/PostalCheckFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_apm_bills_postal_check_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PostalCheckFlow extends ViewController<q> implements f {
    public final PostalCheckNavigation$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PostalCheckFlow(PostalCheckNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostalCheckFlow f199367b;

            {
                this.f199367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PostalCheckFlow postalCheckFlow = this.f199367b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, postalCheckFlow, (b) postalCheckFlow.O.getValue());
                    case 1:
                        PostalCheckFlow postalCheckFlow2 = this.f199367b;
                        phm.a aVar = (phm.a) ue0.e.j(postalCheckFlow2.m2()).a().get(ir1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ir1.i.class, " is not found"));
                        }
                        ir1.e eVar = ((ir1.e) ((ir1.i) aVar2.b())).i;
                        PostalCheckNavigation$InputData postalCheckNavigation$InputData = postalCheckFlow2.K;
                        postalCheckNavigation$InputData.getClass();
                        return new ir1.f(eVar, postalCheckNavigation$InputData);
                    default:
                        return (b) ((ir1.f) this.f199367b.N.getValue()).f167972b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostalCheckFlow f199367b;

            {
                this.f199367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PostalCheckFlow postalCheckFlow = this.f199367b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, postalCheckFlow, (b) postalCheckFlow.O.getValue());
                    case 1:
                        PostalCheckFlow postalCheckFlow2 = this.f199367b;
                        phm.a aVar = (phm.a) ue0.e.j(postalCheckFlow2.m2()).a().get(ir1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ir1.i.class, " is not found"));
                        }
                        ir1.e eVar = ((ir1.e) ((ir1.i) aVar2.b())).i;
                        PostalCheckNavigation$InputData postalCheckNavigation$InputData = postalCheckFlow2.K;
                        postalCheckNavigation$InputData.getClass();
                        return new ir1.f(eVar, postalCheckNavigation$InputData);
                    default:
                        return (b) ((ir1.f) this.f199367b.N.getValue()).f167972b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lr1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostalCheckFlow f199367b;

            {
                this.f199367b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PostalCheckFlow postalCheckFlow = this.f199367b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, postalCheckFlow, (b) postalCheckFlow.O.getValue());
                    case 1:
                        PostalCheckFlow postalCheckFlow2 = this.f199367b;
                        phm.a aVar = (phm.a) ue0.e.j(postalCheckFlow2.m2()).a().get(ir1.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ir1.i.class, " is not found"));
                        }
                        ir1.e eVar = ((ir1.e) ((ir1.i) aVar2.b())).i;
                        PostalCheckNavigation$InputData postalCheckNavigation$InputData = postalCheckFlow2.K;
                        postalCheckNavigation$InputData.getClass();
                        return new ir1.f(eVar, postalCheckNavigation$InputData);
                    default:
                        return (b) ((ir1.f) this.f199367b.N.getValue()).f167972b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ir1.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ir1.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lr1.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
