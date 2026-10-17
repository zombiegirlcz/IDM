package jb7;

import com.revolut.feature.hidden_accounts.api.domain.HiddenAccountsConfig;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m2j.j;
import qfe.l;
import r10.v;
import wa7.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f172602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1j.e f172603b;

    public c(v filterBalancesInteractor, n1j.e accountsOrderInfoProvider) {
        Intrinsics.checkNotNullParameter(filterBalancesInteractor, "filterBalancesInteractor");
        Intrinsics.checkNotNullParameter(accountsOrderInfoProvider, "accountsOrderInfoProvider");
        this.f172602a = filterBalancesInteractor;
        this.f172603b = accountsOrderInfoProvider;
    }

    @Override // jb7.d
    public final Flow a(HiddenAccountsConfig config, na7.b accountType, l filterType) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        if (!(config instanceof HiddenAccountsConfig.Balance)) {
            throw new IllegalStateException("Unexpected config type: ".concat(config.getClass().getSimpleName()).toString());
        }
        BalancesInteractor$InputData inputData = ((HiddenAccountsConfig.Balance) config).f74648b;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        v vVar = this.f172602a;
        return new t38.e(mo3.a.g(new t38.e(rd0.e.b(((j) vVar.f250863b).e(inputData, null)), 24, ((m) vVar.f250864c).i(accountType), new j40.d(vVar, null, 3)), null, null, 3), 24, this.f172603b.b(inputData.f99395c), new hwi.b(3, 13, (Continuation) null));
    }
}
