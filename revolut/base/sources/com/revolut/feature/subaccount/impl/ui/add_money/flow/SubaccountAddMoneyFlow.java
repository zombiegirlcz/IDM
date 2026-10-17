package com.revolut.feature.subaccount.impl.ui.add_money.flow;

import aii.q;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mzb.e;
import r6e.n;
import te0.w;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/add_money/flow/SubaccountAddMoneyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubaccountAddMoneyFlow extends ViewController<q> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public SubaccountAddMoneyFlow(SubaccountAddMoneyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new e(this, inputData, 13));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n7e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubaccountAddMoneyFlow f213071b;

            {
                this.f213071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((n) this.f213071b.K.getValue()).f251770c.get();
                    default:
                        SubaccountAddMoneyFlow subaccountAddMoneyFlow = this.f213071b;
                        return czi.c.d(0, 6, null, subaccountAddMoneyFlow, (b) subaccountAddMoneyFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: n7e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubaccountAddMoneyFlow f213071b;

            {
                this.f213071b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((n) this.f213071b.K.getValue()).f251770c.get();
                    default:
                        SubaccountAddMoneyFlow subaccountAddMoneyFlow = this.f213071b;
                        return czi.c.d(0, 6, null, subaccountAddMoneyFlow, (b) subaccountAddMoneyFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n7e.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
