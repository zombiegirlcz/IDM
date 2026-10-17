package com.revolut.feature.user_declarations.shared.flows.pep;

import com.revolut.feature.user_declarations.shared.flows.pep.PepFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$InputData;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$OutputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nng.j;
import nng.p;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/PepFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/shared/feature/user_declarations/api/navigation/PepFlowControllerDescriptor$OutputData;", "Lyki/f;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PepFlow extends ViewController<PepFlowControllerDescriptor$OutputData> implements f {
    public final PepFlowControllerDescriptor$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PepFlow(PepFlowControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: dog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFlow f116562b;

            {
                this.f116562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PepFlow pepFlow = this.f116562b;
                        phm.a aVar = (phm.a) e.j(pepFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = pepFlow.K;
                        pepFlowControllerDescriptor$InputData.getClass();
                        return new j(pVar, pepFlowControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f116562b.L.getValue()).f.get();
                    default:
                        PepFlow pepFlow2 = this.f116562b;
                        return czi.c.d(0, 6, null, pepFlow2, (b) pepFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: dog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFlow f116562b;

            {
                this.f116562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PepFlow pepFlow = this.f116562b;
                        phm.a aVar = (phm.a) e.j(pepFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = pepFlow.K;
                        pepFlowControllerDescriptor$InputData.getClass();
                        return new j(pVar, pepFlowControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f116562b.L.getValue()).f.get();
                    default:
                        PepFlow pepFlow2 = this.f116562b;
                        return czi.c.d(0, 6, null, pepFlow2, (b) pepFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: dog.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PepFlow f116562b;

            {
                this.f116562b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PepFlow pepFlow = this.f116562b;
                        phm.a aVar = (phm.a) e.j(pepFlow.m2()).a().get(p.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p.class, " is not found"));
                        }
                        p pVar = ((p) aVar2.b()).f217678j;
                        PepFlowControllerDescriptor$InputData pepFlowControllerDescriptor$InputData = pepFlow.K;
                        pepFlowControllerDescriptor$InputData.getClass();
                        return new j(pVar, pepFlowControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f116562b.L.getValue()).f.get();
                    default:
                        PepFlow pepFlow2 = this.f116562b;
                        return czi.c.d(0, 6, null, pepFlow2, (b) pepFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (dog.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
