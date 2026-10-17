package com.revolut.feature.retail.salary_account.impl.switch_assistant.flow;

import aii.q;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlow;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.SwitchAssistantFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uhb.c;
import wfb.u;
import xki.e;
import yki.f;
import zpc.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/switch_assistant/flow/SwitchAssistantFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwitchAssistantFlow extends ViewController<q> implements f {
    public final SwitchAssistantFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SwitchAssistantFlow() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (wfb.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (wfb.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    public SwitchAssistantFlow(SwitchAssistantFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uhb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantFlow f280188b;

            {
                this.f280188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((wfb.q) this.f280188b.O.getValue()).e.get();
                    case 1:
                        SwitchAssistantFlow switchAssistantFlow = this.f280188b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, switchAssistantFlow, (c) switchAssistantFlow.M.getValue());
                    default:
                        SwitchAssistantFlow switchAssistantFlow2 = this.f280188b;
                        phm.a aVar = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = switchAssistantFlow2.K;
                        switchAssistantFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(k.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        wpc.b bVar = (wpc.b) ((k) aVar4.b()).D.get();
                        bVar.getClass();
                        return new wfb.q(iVar, switchAssistantFlowContract$InputData, bVar);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: uhb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantFlow f280188b;

            {
                this.f280188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((wfb.q) this.f280188b.O.getValue()).e.get();
                    case 1:
                        SwitchAssistantFlow switchAssistantFlow = this.f280188b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, switchAssistantFlow, (c) switchAssistantFlow.M.getValue());
                    default:
                        SwitchAssistantFlow switchAssistantFlow2 = this.f280188b;
                        phm.a aVar = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = switchAssistantFlow2.K;
                        switchAssistantFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(k.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        wpc.b bVar = (wpc.b) ((k) aVar4.b()).D.get();
                        bVar.getClass();
                        return new wfb.q(iVar, switchAssistantFlowContract$InputData, bVar);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: uhb.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SwitchAssistantFlow f280188b;

            {
                this.f280188b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (c) ((wfb.q) this.f280188b.O.getValue()).e.get();
                    case 1:
                        SwitchAssistantFlow switchAssistantFlow = this.f280188b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, switchAssistantFlow, (c) switchAssistantFlow.M.getValue());
                    default:
                        SwitchAssistantFlow switchAssistantFlow2 = this.f280188b;
                        phm.a aVar = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(u.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u.class, " is not found"));
                        }
                        wfb.i iVar = ((wfb.i) ((u) aVar2.b())).f297052t;
                        SwitchAssistantFlowContract$InputData switchAssistantFlowContract$InputData = switchAssistantFlow2.K;
                        switchAssistantFlowContract$InputData.getClass();
                        phm.a aVar3 = (phm.a) ue0.e.j(switchAssistantFlow2.m2()).a().get(k.class);
                        b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                        if (aVar4 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        wpc.b bVar = (wpc.b) ((k) aVar4.b()).D.get();
                        bVar.getClass();
                        return new wfb.q(iVar, switchAssistantFlowContract$InputData, bVar);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }

    public /* synthetic */ SwitchAssistantFlow(int i) {
        this(SwitchAssistantFlowContract$InputData.Empty.f83033a);
    }
}
