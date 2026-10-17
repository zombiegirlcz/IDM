package tk7;

import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f271910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, CFACClaimExpensesScreenContract$InputData inputData) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f271910p = new d(inputData.f75133a);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f271910p;
    }
}
