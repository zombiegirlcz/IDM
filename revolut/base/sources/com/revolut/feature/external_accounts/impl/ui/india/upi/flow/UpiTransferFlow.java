package com.revolut.feature.external_accounts.impl.ui.india.upi.flow;

import a0.d;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import je6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import we6.e0;
import xf6.p0;
import xf6.t;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/india/upi/flow/UpiTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/e0;", "Lyki/f;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiTransferFlow extends ViewController<e0> implements f {
    public final UpiTransferFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public UpiTransferFlow(UpiTransferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: rm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f255207b;

            {
                this.f255207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f255207b;
                        phm.a aVar = (phm.a) e.j(upiTransferFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new p0(tVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((p0) this.f255207b.M.getValue()).d.get();
                    default:
                        UpiTransferFlow upiTransferFlow2 = this.f255207b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: rm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f255207b;

            {
                this.f255207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f255207b;
                        phm.a aVar = (phm.a) e.j(upiTransferFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new p0(tVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((p0) this.f255207b.M.getValue()).d.get();
                    default:
                        UpiTransferFlow upiTransferFlow2 = this.f255207b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: rm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiTransferFlow f255207b;

            {
                this.f255207b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        UpiTransferFlow upiTransferFlow = this.f255207b;
                        phm.a aVar = (phm.a) e.j(upiTransferFlow.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = upiTransferFlow.K;
                        upiTransferFlowContract$InputData.getClass();
                        return new p0(tVar, upiTransferFlowContract$InputData);
                    case 1:
                        return (b) ((p0) this.f255207b.M.getValue()).d.get();
                    default:
                        UpiTransferFlow upiTransferFlow2 = this.f255207b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, upiTransferFlow2, (b) upiTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (p0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (rm6.b) this.N.getValue();
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
