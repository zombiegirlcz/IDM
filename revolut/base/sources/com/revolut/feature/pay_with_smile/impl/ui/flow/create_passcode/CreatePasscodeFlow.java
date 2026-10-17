package com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode;

import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlow;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tl9.g;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/create_passcode/CreatePasscodeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzl9/c;", "Luki/c;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreatePasscodeFlow extends ViewController<zl9.c> implements uki.c {
    public final CreatePasscodeFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreatePasscodeFlow(CreatePasscodeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePasscodeFlow f323198b;

            {
                this.f323198b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreatePasscodeFlow createPasscodeFlow = this.f323198b;
                        return czi.c.a(R$id.container, (b) createPasscodeFlow.N.getValue(), createPasscodeFlow);
                    case 1:
                        CreatePasscodeFlow createPasscodeFlow2 = this.f323198b;
                        phm.a aVar = (phm.a) ue0.e.j(createPasscodeFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = createPasscodeFlow2.K;
                        createPasscodeFlowContract$InputData.getClass();
                        return new tl9.a(cVar, createPasscodeFlowContract$InputData);
                    default:
                        return (b) ((tl9.a) this.f323198b.M.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePasscodeFlow f323198b;

            {
                this.f323198b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreatePasscodeFlow createPasscodeFlow = this.f323198b;
                        return czi.c.a(R$id.container, (b) createPasscodeFlow.N.getValue(), createPasscodeFlow);
                    case 1:
                        CreatePasscodeFlow createPasscodeFlow2 = this.f323198b;
                        phm.a aVar = (phm.a) ue0.e.j(createPasscodeFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = createPasscodeFlow2.K;
                        createPasscodeFlowContract$InputData.getClass();
                        return new tl9.a(cVar, createPasscodeFlowContract$InputData);
                    default:
                        return (b) ((tl9.a) this.f323198b.M.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: zl9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreatePasscodeFlow f323198b;

            {
                this.f323198b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreatePasscodeFlow createPasscodeFlow = this.f323198b;
                        return czi.c.a(R$id.container, (b) createPasscodeFlow.N.getValue(), createPasscodeFlow);
                    case 1:
                        CreatePasscodeFlow createPasscodeFlow2 = this.f323198b;
                        phm.a aVar = (phm.a) ue0.e.j(createPasscodeFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        CreatePasscodeFlowContract$InputData createPasscodeFlowContract$InputData = createPasscodeFlow2.K;
                        createPasscodeFlowContract$InputData.getClass();
                        return new tl9.a(cVar, createPasscodeFlowContract$InputData);
                    default:
                        return (b) ((tl9.a) this.f323198b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tl9.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (tl9.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zl9.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.L.getValue();
    }
}
