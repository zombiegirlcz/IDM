package com.revolut.feature.joint.impl.ui.close_flow;

import android.content.Intent;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlow;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$InputData;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import e48.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/close_flow/JointCloseFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JointCloseFlow extends ViewController<Object> implements f {
    public final JointCloseFlowContract$InputData K;
    public final boolean L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JointCloseFlow(JointCloseFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: p48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointCloseFlow f232840b;

            {
                this.f232840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JointCloseFlow jointCloseFlow = this.f232840b;
                        return czi.c.d(0, 6, null, jointCloseFlow, (b) jointCloseFlow.O.getValue());
                    case 1:
                        JointCloseFlow jointCloseFlow2 = this.f232840b;
                        phm.a aVar = (phm.a) ue0.e.j(jointCloseFlow2.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        JointCloseFlowContract$InputData jointCloseFlowContract$InputData = jointCloseFlow2.K;
                        jointCloseFlowContract$InputData.getClass();
                        return new e48.h(gVar, jointCloseFlowContract$InputData);
                    default:
                        return (b) ((e48.h) this.f232840b.N.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: p48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointCloseFlow f232840b;

            {
                this.f232840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JointCloseFlow jointCloseFlow = this.f232840b;
                        return czi.c.d(0, 6, null, jointCloseFlow, (b) jointCloseFlow.O.getValue());
                    case 1:
                        JointCloseFlow jointCloseFlow2 = this.f232840b;
                        phm.a aVar = (phm.a) ue0.e.j(jointCloseFlow2.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        JointCloseFlowContract$InputData jointCloseFlowContract$InputData = jointCloseFlow2.K;
                        jointCloseFlowContract$InputData.getClass();
                        return new e48.h(gVar, jointCloseFlowContract$InputData);
                    default:
                        return (b) ((e48.h) this.f232840b.N.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: p48.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JointCloseFlow f232840b;

            {
                this.f232840b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JointCloseFlow jointCloseFlow = this.f232840b;
                        return czi.c.d(0, 6, null, jointCloseFlow, (b) jointCloseFlow.O.getValue());
                    case 1:
                        JointCloseFlow jointCloseFlow2 = this.f232840b;
                        phm.a aVar = (phm.a) ue0.e.j(jointCloseFlow2.m2()).a().get(e48.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", e48.g.class, " is not found"));
                        }
                        e48.g gVar = ((e48.g) aVar2.b()).z;
                        JointCloseFlowContract$InputData jointCloseFlowContract$InputData = jointCloseFlow2.K;
                        jointCloseFlowContract$InputData.getClass();
                        return new e48.h(gVar, jointCloseFlowContract$InputData);
                    default:
                        return (b) ((e48.h) this.f232840b.N.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (p48.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        a aVar = (a) ((p48.b) this.O.getValue());
        if (i2 == -1) {
            oki.h.t2(aVar, aVar.f76520s, JointCloseFlowContract$Step.Statement.f76516a, true, null, false, 12);
        } else {
            aVar.getClass();
        }
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
