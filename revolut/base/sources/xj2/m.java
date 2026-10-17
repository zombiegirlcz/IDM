package xj2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.atm.impl.ui.redesign.limits.AtmWithdrawalLimitsBottomSheetScreenContract$InputData;
import java.util.Set;
import xf6.t1;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtmWithdrawalLimitsBottomSheetScreenContract$InputData f306474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f306475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f306476c;

    public m(n nVar, AtmWithdrawalLimitsBottomSheetScreenContract$InputData atmWithdrawalLimitsBottomSheetScreenContract$InputData) {
        this.f306474a = atmWithdrawalLimitsBottomSheetScreenContract$InputData;
        int i = 20;
        this.f306475b = e4m.b.b(new t1(nVar, this, 1, i));
        this.f306476c = e4m.b.b(new t1(nVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
