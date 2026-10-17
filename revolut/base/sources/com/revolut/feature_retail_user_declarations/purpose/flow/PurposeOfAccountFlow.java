package com.revolut.feature_retail_user_declarations.purpose.flow;

import a0.d;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.flow.PurposeOfAccountFlow;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountTilesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import fci.d0;
import fci.x0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import oai.y;
import te0.w;
import ue0.e;
import ybi.b;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/flow/PurposeOfAccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lybi/b;", "Lyki/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurposeOfAccountFlow extends ViewController<b> implements f {
    public final PurposeOfAccountFlowInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PurposeOfAccountFlow(PurposeOfAccountFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountFlow f320889b;

            {
                this.f320889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PurposeOfAccountFlow purposeOfAccountFlow = this.f320889b;
                        phm.a aVar = (phm.a) e.j(purposeOfAccountFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = purposeOfAccountFlow.K;
                        purposeOfAccountFlowInputData.getClass();
                        return new y(i0Var, purposeOfAccountFlowInputData);
                    case 1:
                        return (b) ((y) this.f320889b.L.getValue()).d.get();
                    default:
                        PurposeOfAccountFlow purposeOfAccountFlow2 = this.f320889b;
                        return czi.c.d(0, 6, null, purposeOfAccountFlow2, (b) purposeOfAccountFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountFlow f320889b;

            {
                this.f320889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PurposeOfAccountFlow purposeOfAccountFlow = this.f320889b;
                        phm.a aVar = (phm.a) e.j(purposeOfAccountFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = purposeOfAccountFlow.K;
                        purposeOfAccountFlowInputData.getClass();
                        return new y(i0Var, purposeOfAccountFlowInputData);
                    case 1:
                        return (b) ((y) this.f320889b.L.getValue()).d.get();
                    default:
                        PurposeOfAccountFlow purposeOfAccountFlow2 = this.f320889b;
                        return czi.c.d(0, 6, null, purposeOfAccountFlow2, (b) purposeOfAccountFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: zbi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountFlow f320889b;

            {
                this.f320889b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PurposeOfAccountFlow purposeOfAccountFlow = this.f320889b;
                        phm.a aVar = (phm.a) e.j(purposeOfAccountFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = purposeOfAccountFlow.K;
                        purposeOfAccountFlowInputData.getClass();
                        return new y(i0Var, purposeOfAccountFlowInputData);
                    case 1:
                        return (b) ((y) this.f320889b.L.getValue()).d.get();
                    default:
                        PurposeOfAccountFlow purposeOfAccountFlow2 = this.f320889b;
                        return czi.c.d(0, 6, null, purposeOfAccountFlow2, (b) purposeOfAccountFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (y) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zbi.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void d3() {
        PurposeOfAccountTilesScreen purposeOfAccountTilesScreen = ((a) ((zbi.b) ((y) this.L.getValue()).d.get())).f97714r;
        if (purposeOfAccountTilesScreen == null || !purposeOfAccountTilesScreen.f97722a0) {
            return;
        }
        purposeOfAccountTilesScreen.f97722a0 = false;
        ((d0) purposeOfAccountTilesScreen.Y.getValue()).c();
        x0 x0Var = purposeOfAccountTilesScreen.Z;
        if (x0Var != null) {
            purposeOfAccountTilesScreen.i3(x0Var.f133824b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
