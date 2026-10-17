package com.revolut.feature.workflow.engine.onboarding.impl.workflow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlowContract$InputData;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cuc.c0;
import in0.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import pth.d;
import pth.f;
import qji.b;
import te0.w;
import til.i;
import til.r;
import uki.c;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/workflow/engine/onboarding/impl/workflow/WorkflowFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltil/r;", "Luki/c;", "Lno/m;", "Lno/k;", "Lin0/g;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkflowFlow extends ViewController<r> implements c, m, k, g {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(WorkflowFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowAnimatedBackgroundBinding;", 0))};
    public final WorkflowFlowContract$InputData K;
    public final AnalyticsProduct L;
    public AnalyticsContext M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Integer R;
    public final h S;

    public WorkflowFlow(WorkflowFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct e = inputData.f96479b.getE();
        this.L = e == null ? iuh.a.f168605a : e;
        this.M = inputData.f;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: pth.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowFlow f239689b;

            {
                this.f239689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WorkflowFlow workflowFlow = this.f239689b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(workflowFlow.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) aVar2.b()).f249144s;
                        WorkflowFlowContract$InputData workflowFlowContract$InputData = workflowFlow.K;
                        workflowFlowContract$InputData.getClass();
                        return new qth.i(gVar, workflowFlow, workflowFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowFlow.T;
                        return (f) ((qth.i) workflowFlow.N.getValue()).f249156l.get();
                    default:
                        KProperty[] kPropertyArr3 = WorkflowFlow.T;
                        return czi.c.a(R$id.container, (f) workflowFlow.O.getValue(), workflowFlow);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: pth.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowFlow f239689b;

            {
                this.f239689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WorkflowFlow workflowFlow = this.f239689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(workflowFlow.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) aVar2.b()).f249144s;
                        WorkflowFlowContract$InputData workflowFlowContract$InputData = workflowFlow.K;
                        workflowFlowContract$InputData.getClass();
                        return new qth.i(gVar, workflowFlow, workflowFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowFlow.T;
                        return (f) ((qth.i) workflowFlow.N.getValue()).f249156l.get();
                    default:
                        KProperty[] kPropertyArr3 = WorkflowFlow.T;
                        return czi.c.a(R$id.container, (f) workflowFlow.O.getValue(), workflowFlow);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: pth.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkflowFlow f239689b;

            {
                this.f239689b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WorkflowFlow workflowFlow = this.f239689b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WorkflowFlow.T;
                        phm.a aVar = (phm.a) ue0.e.j(workflowFlow.m2()).a().get(qth.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qth.g.class, " is not found"));
                        }
                        qth.g gVar = ((qth.g) aVar2.b()).f249144s;
                        WorkflowFlowContract$InputData workflowFlowContract$InputData = workflowFlow.K;
                        workflowFlowContract$InputData.getClass();
                        return new qth.i(gVar, workflowFlow, workflowFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = WorkflowFlow.T;
                        return (f) ((qth.i) workflowFlow.N.getValue()).f249156l.get();
                    default:
                        KProperty[] kPropertyArr3 = WorkflowFlow.T;
                        return czi.c.a(R$id.container, (f) workflowFlow.O.getValue(), workflowFlow);
                }
            }
        });
        this.Q = R$layout.flow_animated_background;
        this.R = inputData.d == i.ANIMATED ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.S = s.t(this, d.f);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.R;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qth.i) this.N.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (qth.i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        Set<String> setKeySet;
        Bundle extras;
        f fVar = (f) this.O.getValue();
        if (intent == null || (extras = intent.getExtras()) == null || (setKeySet = extras.keySet()) == null) {
            setKeySet = zhm.h0.f322473a;
        }
        Set<String> resultKeys = setKeySet;
        a aVar = (a) fVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(resultKeys, "resultKeys");
        aVar.l2(new c0(i2, aVar, i, resultKeys, (Continuation) null), new yi5.b(26));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K.d == i.ANIMATED) {
            kji.k.Companion.getClass();
            Intrinsics.checkNotNullParameter(this, "controller");
            this.F.addObserver(new esi.c(this));
            ViewBinding value = this.S.getValue(this, T[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((jii.a) value).f174492b.setBackgroundType(AnimatedBackgroundType.DEFAULT.f51471a);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.P.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return this.K.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.P.getValue();
    }
}
