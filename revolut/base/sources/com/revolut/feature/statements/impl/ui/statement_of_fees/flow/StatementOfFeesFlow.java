package com.revolut.feature.statements.impl.ui.statement_of_fees.flow;

import a0.d;
import aii.q;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlow;
import com.revolut.feature.statements.impl.ui.statement_of_fees.flow.StatementOfFeesFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import eyd.b0;
import eyd.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/statement_of_fees/flow/StatementOfFeesFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StatementOfFeesFlow extends ViewController<q> implements f {
    public final StatementOfFeesFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public StatementOfFeesFlow(StatementOfFeesFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: o0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementOfFeesFlow f221205b;

            {
                this.f221205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        int i2 = R$id.screen_transparent_container;
                        StatementOfFeesFlow statementOfFeesFlow = this.f221205b;
                        return c.d(i2, 4, null, statementOfFeesFlow, (b) statementOfFeesFlow.O.getValue());
                    case 1:
                        StatementOfFeesFlow statementOfFeesFlow2 = this.f221205b;
                        phm.a aVar = (phm.a) e.j(statementOfFeesFlow2.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.statement_of_fees.flow.di.StatementOfFeesFlowInjector");
                        b0 b0Var = ((b0) objB).o;
                        StatementOfFeesFlowContract$InputData statementOfFeesFlowContract$InputData = statementOfFeesFlow2.K;
                        statementOfFeesFlowContract$InputData.getClass();
                        return new x(b0Var, statementOfFeesFlowContract$InputData);
                    default:
                        return (b) ((x) this.f221205b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: o0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementOfFeesFlow f221205b;

            {
                this.f221205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        StatementOfFeesFlow statementOfFeesFlow = this.f221205b;
                        return c.d(i22, 4, null, statementOfFeesFlow, (b) statementOfFeesFlow.O.getValue());
                    case 1:
                        StatementOfFeesFlow statementOfFeesFlow2 = this.f221205b;
                        phm.a aVar = (phm.a) e.j(statementOfFeesFlow2.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.statement_of_fees.flow.di.StatementOfFeesFlowInjector");
                        b0 b0Var = ((b0) objB).o;
                        StatementOfFeesFlowContract$InputData statementOfFeesFlowContract$InputData = statementOfFeesFlow2.K;
                        statementOfFeesFlowContract$InputData.getClass();
                        return new x(b0Var, statementOfFeesFlowContract$InputData);
                    default:
                        return (b) ((x) this.f221205b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: o0e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StatementOfFeesFlow f221205b;

            {
                this.f221205b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        int i22 = R$id.screen_transparent_container;
                        StatementOfFeesFlow statementOfFeesFlow = this.f221205b;
                        return c.d(i22, 4, null, statementOfFeesFlow, (b) statementOfFeesFlow.O.getValue());
                    case 1:
                        StatementOfFeesFlow statementOfFeesFlow2 = this.f221205b;
                        phm.a aVar = (phm.a) e.j(statementOfFeesFlow2.m2()).a().get(b0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", b0.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.statement_of_fees.flow.di.StatementOfFeesFlowInjector");
                        b0 b0Var = ((b0) objB).o;
                        StatementOfFeesFlowContract$InputData statementOfFeesFlowContract$InputData = statementOfFeesFlow2.K;
                        statementOfFeesFlowContract$InputData.getClass();
                        return new x(b0Var, statementOfFeesFlowContract$InputData);
                    default:
                        return (b) ((x) this.f221205b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (x) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (o0e.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
