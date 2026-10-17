package com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow;

import aii.q;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlow;
import com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.ReferralsFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eya.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.d1;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referrals_flow/ReferralsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/d1;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralsFlow extends ViewController<q> implements f, d1 {
    public final ReferralsFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ReferralsFlow(ReferralsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: aza.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsFlow f11410b;

            {
                this.f11410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReferralsFlow referralsFlow = this.f11410b;
                        phm.a aVar = (phm.a) ue0.e.j(referralsFlow.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).f130644n;
                        ReferralsFlowContract$InputData referralsFlowContract$InputData = referralsFlow.K;
                        referralsFlowContract$InputData.getClass();
                        return new eya.f(jVar, referralsFlow, referralsFlowContract$InputData);
                    case 1:
                        return (b) ((eya.f) this.f11410b.M.getValue()).f.get();
                    default:
                        ReferralsFlow referralsFlow2 = this.f11410b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, referralsFlow2, (b) referralsFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: aza.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsFlow f11410b;

            {
                this.f11410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReferralsFlow referralsFlow = this.f11410b;
                        phm.a aVar = (phm.a) ue0.e.j(referralsFlow.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).f130644n;
                        ReferralsFlowContract$InputData referralsFlowContract$InputData = referralsFlow.K;
                        referralsFlowContract$InputData.getClass();
                        return new eya.f(jVar, referralsFlow, referralsFlowContract$InputData);
                    case 1:
                        return (b) ((eya.f) this.f11410b.M.getValue()).f.get();
                    default:
                        ReferralsFlow referralsFlow2 = this.f11410b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, referralsFlow2, (b) referralsFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: aza.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsFlow f11410b;

            {
                this.f11410b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ReferralsFlow referralsFlow = this.f11410b;
                        phm.a aVar = (phm.a) ue0.e.j(referralsFlow.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).f130644n;
                        ReferralsFlowContract$InputData referralsFlowContract$InputData = referralsFlow.K;
                        referralsFlowContract$InputData.getClass();
                        return new eya.f(jVar, referralsFlow, referralsFlowContract$InputData);
                    case 1:
                        return (b) ((eya.f) this.f11410b.M.getValue()).f.get();
                    default:
                        ReferralsFlow referralsFlow2 = this.f11410b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, referralsFlow2, (b) referralsFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (eya.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (eya.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (aza.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
