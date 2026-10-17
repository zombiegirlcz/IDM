package com.revolut.feature.topup_screen.impl.google_pay.flow;

import android.content.Intent;
import com.revolut.feature.topup_screen.api.descriptor.GooglePayFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.google_pay.flow.GooglePayFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ove.n;
import ove.t;
import ste.o;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/google_pay/flow/GooglePayFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lste/o;", "Lyki/f;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GooglePayFlow extends ViewController<o> implements f {
    public final GooglePayFlowDescriptor$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public GooglePayFlow(GooglePayFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: zze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayFlow f326705b;

            {
                this.f326705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        GooglePayFlow googlePayFlow = this.f326705b;
                        phm.a aVar = (phm.a) ue0.e.j(googlePayFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = googlePayFlow.K;
                        googlePayFlowDescriptor$InputData.getClass();
                        return new n(tVar, googlePayFlow, googlePayFlowDescriptor$InputData);
                    case 1:
                        return (b) ((n) this.f326705b.M.getValue()).f230101j.get();
                    case 2:
                        GooglePayFlow googlePayFlow2 = this.f326705b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, googlePayFlow2, (b) googlePayFlow2.N.getValue());
                    default:
                        return (c0f.b) ((n) this.f326705b.M.getValue()).f230098c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: zze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayFlow f326705b;

            {
                this.f326705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        GooglePayFlow googlePayFlow = this.f326705b;
                        phm.a aVar = (phm.a) ue0.e.j(googlePayFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = googlePayFlow.K;
                        googlePayFlowDescriptor$InputData.getClass();
                        return new n(tVar, googlePayFlow, googlePayFlowDescriptor$InputData);
                    case 1:
                        return (b) ((n) this.f326705b.M.getValue()).f230101j.get();
                    case 2:
                        GooglePayFlow googlePayFlow2 = this.f326705b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, googlePayFlow2, (b) googlePayFlow2.N.getValue());
                    default:
                        return (c0f.b) ((n) this.f326705b.M.getValue()).f230098c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: zze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayFlow f326705b;

            {
                this.f326705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        GooglePayFlow googlePayFlow = this.f326705b;
                        phm.a aVar = (phm.a) ue0.e.j(googlePayFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = googlePayFlow.K;
                        googlePayFlowDescriptor$InputData.getClass();
                        return new n(tVar, googlePayFlow, googlePayFlowDescriptor$InputData);
                    case 1:
                        return (b) ((n) this.f326705b.M.getValue()).f230101j.get();
                    case 2:
                        GooglePayFlow googlePayFlow2 = this.f326705b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, googlePayFlow2, (b) googlePayFlow2.N.getValue());
                    default:
                        return (c0f.b) ((n) this.f326705b.M.getValue()).f230098c.get();
                }
            }
        });
        final int i5 = 3;
        this.P = w.y0(new Function0(this) { // from class: zze.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GooglePayFlow f326705b;

            {
                this.f326705b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        GooglePayFlow googlePayFlow = this.f326705b;
                        phm.a aVar = (phm.a) ue0.e.j(googlePayFlow.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).H;
                        GooglePayFlowDescriptor$InputData googlePayFlowDescriptor$InputData = googlePayFlow.K;
                        googlePayFlowDescriptor$InputData.getClass();
                        return new n(tVar, googlePayFlow, googlePayFlowDescriptor$InputData);
                    case 1:
                        return (b) ((n) this.f326705b.M.getValue()).f230101j.get();
                    case 2:
                        GooglePayFlow googlePayFlow2 = this.f326705b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, googlePayFlow2, (b) googlePayFlow2.N.getValue());
                    default:
                        return (c0f.b) ((n) this.f326705b.M.getValue()).f230098c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zze.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        c0f.a result = new c0f.a(i, i2, intent);
        c0f.b bVar = (c0f.b) this.P.getValue();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        bVar.f20251a.k(result);
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
