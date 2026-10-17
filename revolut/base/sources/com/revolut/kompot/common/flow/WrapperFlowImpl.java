package com.revolut.kompot.common.flow;

import aii.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qii.d;
import qji.b;
import te0.w;
import xki.a;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/kompot/common/flow/WrapperFlowImpl;", "Laii/r;", "Out", "Lcom/revolut/kompot/common/flow/WrapperFlow;", "kompot_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WrapperFlowImpl<Out extends r> extends WrapperFlow<Out> {
    public final d L;
    public final Object M;
    public final a N;

    public WrapperFlowImpl(com.revolut.kompot.navigable.a controller, qii.a resultHandler) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.L = new d(controller, resultHandler);
        this.M = w.y0(new m15.a(this, 1));
        this.N = a.f306815a;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.flow.WrapperFlow, oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
