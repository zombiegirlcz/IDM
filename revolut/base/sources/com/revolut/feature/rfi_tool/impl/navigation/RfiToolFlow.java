package com.revolut.feature.rfi_tool.impl.navigation;

import aii.q;
import com.revolut.feature.rfi_tool.api.RfiToolFlowInputData;
import com.revolut.feature.rfi_tool.impl.navigation.RfiToolFlow;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rfi_tool/impl/navigation/RfiToolFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_rfi_tool_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RfiToolFlow extends ViewController<q> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public RfiToolFlow(RfiToolFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new vd1.a(this, inputData, 15));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: vkc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RfiToolFlow f289903b;

            {
                this.f289903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (e) ((skc.c) this.f289903b.K.getValue()).f263814c.get();
                    default:
                        RfiToolFlow rfiToolFlow = this.f289903b;
                        return czi.c.a(R$id.container, (e) rfiToolFlow.L.getValue(), rfiToolFlow);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: vkc.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RfiToolFlow f289903b;

            {
                this.f289903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (e) ((skc.c) this.f289903b.K.getValue()).f263814c.get();
                    default:
                        RfiToolFlow rfiToolFlow = this.f289903b;
                        return czi.c.a(R$id.container, (e) rfiToolFlow.L.getValue(), rfiToolFlow);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (skc.c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (skc.c) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (vkc.e) this.L.getValue();
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
