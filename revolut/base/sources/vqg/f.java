package vqg;

import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends oki.h implements e {
    public final WithdrawMoneyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f291395p;

    public f(WithdrawMoneyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        vh9.b bVar = new vh9.b(this, 19);
        this.f291395p = cp5.d.a(this, WithdrawMoneyFlowContract$Step.f94789a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f291395p;
    }
}
