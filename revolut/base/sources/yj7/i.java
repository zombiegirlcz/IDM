package yj7;

import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import yed.g0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mj7.b f314431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f314432q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, CFACInsuranceManageExpensesScreenContract$InputData inputData, mj7.b claimCacheRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(claimCacheRepository, "claimCacheRepository");
        this.f314431p = claimCacheRepository;
        this.f314432q = new e(inputData.f75089a, claimCacheRepository.b());
    }

    @Override // yji.l
    public final void T1(long j2) {
        x2(new g0(this, 17));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f314432q;
    }
}
