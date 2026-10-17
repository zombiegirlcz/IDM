package com.revolut.feature_move_money.impl.automation.flow;

import a7i.d;
import com.revolut.feature_move_money.impl.automation.flow.MoveMoneyAutomationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import te0.w;
import u7i.h;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/flow/MoveMoneyAutomationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La7i/d;", "Lyki/f;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyAutomationFlow extends ViewController<d> implements f {
    public final i K;
    public final i L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public MoveMoneyAutomationFlow(MoveMoneyAutomationFlowContract$InputData inputData, i pickerBalancesFilterInteractor, i moveMoneyPairFilterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyPairFilterInteractor, "moveMoneyPairFilterInteractor");
        this.K = pickerBalancesFilterInteractor;
        this.L = moveMoneyPairFilterInteractor;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: a7i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationFlow f1908b;

            {
                this.f1908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MoveMoneyAutomationFlow moveMoneyAutomationFlow = this.f1908b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, moveMoneyAutomationFlow, (b) moveMoneyAutomationFlow.P.getValue());
                    default:
                        return (b) ((h) this.f1908b.O.getValue()).e.get();
                }
            }
        });
        this.O = w.y0(new a07.b(this, inputData, 12));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: a7i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyAutomationFlow f1908b;

            {
                this.f1908b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MoveMoneyAutomationFlow moveMoneyAutomationFlow = this.f1908b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, moveMoneyAutomationFlow, (b) moveMoneyAutomationFlow.P.getValue());
                    default:
                        return (b) ((h) this.f1908b.O.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (a7i.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
