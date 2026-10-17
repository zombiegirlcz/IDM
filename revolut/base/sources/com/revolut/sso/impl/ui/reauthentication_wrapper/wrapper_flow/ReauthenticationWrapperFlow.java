package com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow;

import bjl.y;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.o0;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/reauthentication_wrapper/wrapper_flow/ReauthenticationWrapperFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbjl/y;", "Lyki/f;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReauthenticationWrapperFlow extends ViewController<y> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public ReauthenticationWrapperFlow(ReauthenticationWrapperFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReauthenticationWrapperFlow f324082b;

            {
                this.f324082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReauthenticationWrapperFlow reauthenticationWrapperFlow = this.f324082b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, reauthenticationWrapperFlow, (b) reauthenticationWrapperFlow.N.getValue());
                    default:
                        return (b) ((o0) this.f324082b.M.getValue()).f196046b.get();
                }
            }
        });
        this.M = w.y0(new zk7.a(this, inputData, 8));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zol.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReauthenticationWrapperFlow f324082b;

            {
                this.f324082b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReauthenticationWrapperFlow reauthenticationWrapperFlow = this.f324082b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, reauthenticationWrapperFlow, (b) reauthenticationWrapperFlow.N.getValue());
                    default:
                        return (b) ((o0) this.f324082b.M.getValue()).f196046b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (o0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zol.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
