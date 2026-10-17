package com.revolut.feature.check_topup.impl.ui_kompot.flow;

import aii.q;
import com.revolut.feature.check_topup.impl.ui_kompot.flow.CheckTopUpFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import dg3.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/check_topup/impl/ui_kompot/flow/CheckTopUpFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_check_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckTopUpFlow extends ViewController<q> implements f {
    public final c K;
    public final Object L;
    public final Object M;

    public CheckTopUpFlow(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dg3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpFlow f114572b;

            {
                this.f114572b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CheckTopUpFlow checkTopUpFlow = this.f114572b;
                        phm.a aVar = (phm.a) ue0.e.j(checkTopUpFlow.m2()).a().get(vf3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vf3.a.class, " is not found"));
                        }
                        yf3.c cVar = ((yf3.c) aVar2.b()).d;
                        c cVar2 = checkTopUpFlow.K;
                        cVar2.getClass();
                        return new yf3.e(cVar, cVar2);
                    default:
                        CheckTopUpFlow checkTopUpFlow2 = this.f114572b;
                        return czi.c.d(0, 6, null, checkTopUpFlow2, (b) ((yf3.e) checkTopUpFlow2.L.getValue()).d.get());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dg3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckTopUpFlow f114572b;

            {
                this.f114572b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CheckTopUpFlow checkTopUpFlow = this.f114572b;
                        phm.a aVar = (phm.a) ue0.e.j(checkTopUpFlow.m2()).a().get(vf3.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vf3.a.class, " is not found"));
                        }
                        yf3.c cVar = ((yf3.c) aVar2.b()).d;
                        c cVar2 = checkTopUpFlow.K;
                        cVar2.getClass();
                        return new yf3.e(cVar, cVar2);
                    default:
                        CheckTopUpFlow checkTopUpFlow2 = this.f114572b;
                        return czi.c.d(0, 6, null, checkTopUpFlow2, (b) ((yf3.e) checkTopUpFlow2.L.getValue()).d.get());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (yf3.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (yf3.e) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (dg3.b) ((yf3.e) this.L.getValue()).d.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
