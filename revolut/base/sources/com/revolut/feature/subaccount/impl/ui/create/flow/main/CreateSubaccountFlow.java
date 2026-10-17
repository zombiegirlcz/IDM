package com.revolut.feature.subaccount.impl.ui.create.flow.main;

import android.app.Activity;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r6e.f;
import r6e.o;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/impl/ui/create/flow/main/CreateSubaccountFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj6e/a;", "Luki/c;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreateSubaccountFlow extends ViewController<j6e.a> implements uki.c {
    public final CreateSubaccountFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreateSubaccountFlow(CreateSubaccountFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.K = flowInputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: t7e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSubaccountFlow f268634b;

            {
                this.f268634b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreateSubaccountFlow createSubaccountFlow = this.f268634b;
                        phm.a aVar = (phm.a) ue0.e.j(createSubaccountFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData = createSubaccountFlow.K;
                        createSubaccountFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = createSubaccountFlow.m2();
                        dVar.getClass();
                        return new r6e.f(oVar, createSubaccountFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        CreateSubaccountFlow createSubaccountFlow2 = this.f268634b;
                        return czi.c.a(R$id.screen_transparent_container, (b) createSubaccountFlow2.O.getValue(), createSubaccountFlow2);
                    default:
                        return (b) ((r6e.f) this.f268634b.M.getValue()).f251731g.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: t7e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSubaccountFlow f268634b;

            {
                this.f268634b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreateSubaccountFlow createSubaccountFlow = this.f268634b;
                        phm.a aVar = (phm.a) ue0.e.j(createSubaccountFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData = createSubaccountFlow.K;
                        createSubaccountFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = createSubaccountFlow.m2();
                        dVar.getClass();
                        return new r6e.f(oVar, createSubaccountFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        CreateSubaccountFlow createSubaccountFlow2 = this.f268634b;
                        return czi.c.a(R$id.screen_transparent_container, (b) createSubaccountFlow2.O.getValue(), createSubaccountFlow2);
                    default:
                        return (b) ((r6e.f) this.f268634b.M.getValue()).f251731g.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: t7e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreateSubaccountFlow f268634b;

            {
                this.f268634b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreateSubaccountFlow createSubaccountFlow = this.f268634b;
                        phm.a aVar = (phm.a) ue0.e.j(createSubaccountFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).K;
                        CreateSubaccountFlowContract$InputData createSubaccountFlowContract$InputData = createSubaccountFlow.K;
                        createSubaccountFlowContract$InputData.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = createSubaccountFlow.m2();
                        dVar.getClass();
                        return new r6e.f(oVar, createSubaccountFlowContract$InputData, zfe.d.a(activityM2));
                    case 1:
                        CreateSubaccountFlow createSubaccountFlow2 = this.f268634b;
                        return czi.c.a(R$id.screen_transparent_container, (b) createSubaccountFlow2.O.getValue(), createSubaccountFlow2);
                    default:
                        return (b) ((r6e.f) this.f268634b.M.getValue()).f251731g.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (t7e.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.N.getValue();
    }
}
