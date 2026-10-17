package com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow;

import aii.q;
import ak5.d;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.CommonRemittanceFieldDialogFlow;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.flow.CommonRemittanceFieldDialogFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/commonfields/flow/CommonRemittanceFieldDialogFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonRemittanceFieldDialogFlow extends ViewController<q> implements f {
    public final CommonRemittanceFieldDialogFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CommonRemittanceFieldDialogFlow(CommonRemittanceFieldDialogFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogFlow f196219b;

            {
                this.f196219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow = this.f196219b;
                        phm.a aVar = (phm.a) ue0.e.j(commonRemittanceFieldDialogFlow.m2()).a().get(ak5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.a.class, " is not found"));
                        }
                        ak5.i iVar = ((ak5.i) ((ak5.a) aVar2.b())).f5692g;
                        CommonRemittanceFieldDialogFlowContract$InputData commonRemittanceFieldDialogFlowContract$InputData = commonRemittanceFieldDialogFlow.K;
                        commonRemittanceFieldDialogFlowContract$InputData.getClass();
                        return new ak5.d(iVar, commonRemittanceFieldDialogFlowContract$InputData);
                    case 1:
                        return (b) ((ak5.d) this.f196219b.M.getValue()).d.get();
                    default:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow2 = this.f196219b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, commonRemittanceFieldDialogFlow2, (b) commonRemittanceFieldDialogFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogFlow f196219b;

            {
                this.f196219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow = this.f196219b;
                        phm.a aVar = (phm.a) ue0.e.j(commonRemittanceFieldDialogFlow.m2()).a().get(ak5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.a.class, " is not found"));
                        }
                        ak5.i iVar = ((ak5.i) ((ak5.a) aVar2.b())).f5692g;
                        CommonRemittanceFieldDialogFlowContract$InputData commonRemittanceFieldDialogFlowContract$InputData = commonRemittanceFieldDialogFlow.K;
                        commonRemittanceFieldDialogFlowContract$InputData.getClass();
                        return new ak5.d(iVar, commonRemittanceFieldDialogFlowContract$InputData);
                    case 1:
                        return (b) ((ak5.d) this.f196219b.M.getValue()).d.get();
                    default:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow2 = this.f196219b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, commonRemittanceFieldDialogFlow2, (b) commonRemittanceFieldDialogFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lk5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogFlow f196219b;

            {
                this.f196219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow = this.f196219b;
                        phm.a aVar = (phm.a) ue0.e.j(commonRemittanceFieldDialogFlow.m2()).a().get(ak5.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ak5.a.class, " is not found"));
                        }
                        ak5.i iVar = ((ak5.i) ((ak5.a) aVar2.b())).f5692g;
                        CommonRemittanceFieldDialogFlowContract$InputData commonRemittanceFieldDialogFlowContract$InputData = commonRemittanceFieldDialogFlow.K;
                        commonRemittanceFieldDialogFlowContract$InputData.getClass();
                        return new ak5.d(iVar, commonRemittanceFieldDialogFlowContract$InputData);
                    case 1:
                        return (b) ((ak5.d) this.f196219b.M.getValue()).d.get();
                    default:
                        CommonRemittanceFieldDialogFlow commonRemittanceFieldDialogFlow2 = this.f196219b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, commonRemittanceFieldDialogFlow2, (b) commonRemittanceFieldDialogFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (d) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lk5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
