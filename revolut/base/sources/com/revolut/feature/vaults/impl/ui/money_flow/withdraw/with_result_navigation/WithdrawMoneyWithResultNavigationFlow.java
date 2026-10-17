package com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation;

import aii.q;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation.WithdrawMoneyWithResultNavigationFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import wpg.n;
import xfj.a;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/vaults/impl/ui/money_flow/withdraw/with_result_navigation/WithdrawMoneyWithResultNavigationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WithdrawMoneyWithResultNavigationFlow extends ViewController<q> implements f {
    public final int K;
    public final boolean L;
    public final Object M;
    public final Object N;
    public final Object O;

    public WithdrawMoneyWithResultNavigationFlow(WithdrawMoneyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        this.L = true;
        this.M = w.y0(new a(this, inputData, 14));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawMoneyWithResultNavigationFlow f308169b;

            {
                this.f308169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((n) this.f308169b.M.getValue()).d.get();
                    default:
                        WithdrawMoneyWithResultNavigationFlow withdrawMoneyWithResultNavigationFlow = this.f308169b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, withdrawMoneyWithResultNavigationFlow, (b) withdrawMoneyWithResultNavigationFlow.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xqg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawMoneyWithResultNavigationFlow f308169b;

            {
                this.f308169b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((n) this.f308169b.M.getValue()).d.get();
                    default:
                        WithdrawMoneyWithResultNavigationFlow withdrawMoneyWithResultNavigationFlow = this.f308169b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, withdrawMoneyWithResultNavigationFlow, (b) withdrawMoneyWithResultNavigationFlow.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xqg.b) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.L);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: r2 */
    public final Boolean getN() {
        return Boolean.FALSE;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
