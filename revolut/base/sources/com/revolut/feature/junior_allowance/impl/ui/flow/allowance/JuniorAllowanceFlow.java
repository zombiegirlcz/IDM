package com.revolut.feature.junior_allowance.impl.ui.flow.allowance;

import aii.q;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlow;
import com.revolut.feature.junior_allowance.impl.ui.flow.allowance.JuniorAllowanceFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rb8.b;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorAllowanceFlow extends ViewController<q> implements c {
    public final JuniorAllowanceFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JuniorAllowanceFlow(JuniorAllowanceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ac8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowanceFlow f3096b;

            {
                this.f3096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JuniorAllowanceFlow juniorAllowanceFlow = this.f3096b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorAllowanceFlow.O.getValue(), juniorAllowanceFlow);
                    case 1:
                        JuniorAllowanceFlow juniorAllowanceFlow2 = this.f3096b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowanceFlow2.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData = juniorAllowanceFlow2.K;
                        juniorAllowanceFlowContract$InputData.getClass();
                        return new rb8.b(aVar3, juniorAllowanceFlowContract$InputData);
                    default:
                        return (b) ((rb8.b) this.f3096b.N.getValue()).f252988c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ac8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowanceFlow f3096b;

            {
                this.f3096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JuniorAllowanceFlow juniorAllowanceFlow = this.f3096b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorAllowanceFlow.O.getValue(), juniorAllowanceFlow);
                    case 1:
                        JuniorAllowanceFlow juniorAllowanceFlow2 = this.f3096b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowanceFlow2.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData = juniorAllowanceFlow2.K;
                        juniorAllowanceFlowContract$InputData.getClass();
                        return new rb8.b(aVar3, juniorAllowanceFlowContract$InputData);
                    default:
                        return (b) ((rb8.b) this.f3096b.N.getValue()).f252988c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ac8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorAllowanceFlow f3096b;

            {
                this.f3096b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JuniorAllowanceFlow juniorAllowanceFlow = this.f3096b;
                        return czi.c.a(R$id.screen_transparent_container, (b) juniorAllowanceFlow.O.getValue(), juniorAllowanceFlow);
                    case 1:
                        JuniorAllowanceFlow juniorAllowanceFlow2 = this.f3096b;
                        phm.a aVar = (phm.a) ue0.e.j(juniorAllowanceFlow2.m2()).a().get(rb8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rb8.e.class, " is not found"));
                        }
                        rb8.a aVar3 = ((rb8.a) ((rb8.e) aVar2.b())).f252981m;
                        JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData = juniorAllowanceFlow2.K;
                        juniorAllowanceFlowContract$InputData.getClass();
                        return new rb8.b(aVar3, juniorAllowanceFlowContract$InputData);
                    default:
                        return (b) ((rb8.b) this.f3096b.N.getValue()).f252988c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ac8.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.M.getValue();
    }
}
