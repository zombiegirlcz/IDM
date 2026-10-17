package com.revolut.feature_move_money.impl.flow;

import com.revolut.feature_move_money.impl.flow.MoveMoneyFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import te0.w;
import u7i.l;
import u7i.m;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/MoveMoneyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly5i/b;", "Lyki/f;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MoveMoneyFlow extends ViewController<y5i.b> implements f {
    public final MoveMoneyInputData K;
    public final i L;
    public final i M;
    public final i N;
    public final Object O;
    public final boolean P;
    public final int Q;
    public final Object R;
    public final Object S;

    public MoveMoneyFlow(MoveMoneyInputData inputData, i pickerBalancesFilterInteractor, i newCurrenciesFilterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pickerBalancesFilterInteractor, "pickerBalancesFilterInteractor");
        i moveMoneyPairFilterInteractor = i.f224256b;
        Intrinsics.checkNotNullParameter(moveMoneyPairFilterInteractor, "moveMoneyPairFilterInteractor");
        Intrinsics.checkNotNullParameter(newCurrenciesFilterInteractor, "newCurrenciesFilterInteractor");
        this.K = inputData;
        this.L = pickerBalancesFilterInteractor;
        this.M = moveMoneyPairFilterInteractor;
        this.N = newCurrenciesFilterInteractor;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: y7i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyFlow f311521b;

            {
                this.f311521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MoveMoneyFlow moveMoneyFlow = this.f311521b;
                        phm.a aVar = (phm.a) ue0.e.j(moveMoneyFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f277829h0;
                        MoveMoneyInputData moveMoneyInputData = moveMoneyFlow.K;
                        moveMoneyInputData.getClass();
                        i iVar = moveMoneyFlow.L;
                        iVar.getClass();
                        i iVar2 = moveMoneyFlow.M;
                        iVar2.getClass();
                        i iVar3 = moveMoneyFlow.N;
                        iVar3.getClass();
                        return new m(lVar, moveMoneyFlow, moveMoneyInputData, iVar, iVar2, iVar3);
                    case 1:
                        return (b) ((m) this.f311521b.O.getValue()).f277855q.get();
                    default:
                        MoveMoneyFlow moveMoneyFlow2 = this.f311521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, moveMoneyFlow2, (b) moveMoneyFlow2.R.getValue());
                }
            }
        });
        this.P = true;
        this.Q = R$layout.screen_transparent;
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: y7i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyFlow f311521b;

            {
                this.f311521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MoveMoneyFlow moveMoneyFlow = this.f311521b;
                        phm.a aVar = (phm.a) ue0.e.j(moveMoneyFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f277829h0;
                        MoveMoneyInputData moveMoneyInputData = moveMoneyFlow.K;
                        moveMoneyInputData.getClass();
                        i iVar = moveMoneyFlow.L;
                        iVar.getClass();
                        i iVar2 = moveMoneyFlow.M;
                        iVar2.getClass();
                        i iVar3 = moveMoneyFlow.N;
                        iVar3.getClass();
                        return new m(lVar, moveMoneyFlow, moveMoneyInputData, iVar, iVar2, iVar3);
                    case 1:
                        return (b) ((m) this.f311521b.O.getValue()).f277855q.get();
                    default:
                        MoveMoneyFlow moveMoneyFlow2 = this.f311521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, moveMoneyFlow2, (b) moveMoneyFlow2.R.getValue());
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: y7i.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MoveMoneyFlow f311521b;

            {
                this.f311521b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MoveMoneyFlow moveMoneyFlow = this.f311521b;
                        phm.a aVar = (phm.a) ue0.e.j(moveMoneyFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f277829h0;
                        MoveMoneyInputData moveMoneyInputData = moveMoneyFlow.K;
                        moveMoneyInputData.getClass();
                        i iVar = moveMoneyFlow.L;
                        iVar.getClass();
                        i iVar2 = moveMoneyFlow.M;
                        iVar2.getClass();
                        i iVar3 = moveMoneyFlow.N;
                        iVar3.getClass();
                        return new m(lVar, moveMoneyFlow, moveMoneyInputData, iVar, iVar2, iVar3);
                    case 1:
                        return (b) ((m) this.f311521b.O.getValue()).f277855q.get();
                    default:
                        MoveMoneyFlow moveMoneyFlow2 = this.f311521b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, moveMoneyFlow2, (b) moveMoneyFlow2.R.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (y7i.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.P);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.S.getValue();
    }
}
