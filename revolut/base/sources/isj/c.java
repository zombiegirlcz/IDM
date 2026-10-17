package isj;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import lsj.f;
import ufm.i;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements tzi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f168305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f168306b;

    public c(n walletInteractor, f analyticsCycleRepository) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsCycleRepository, "analyticsCycleRepository");
        this.f168305a = walletInteractor;
        this.f168306b = analyticsCycleRepository;
    }

    public final d0 b(String str) {
        if (str != null) {
            ufm.b bVarM = d0.m(new WalletId(str));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        i iVarE = this.f168305a.E(AccountId.Personal.f51414a);
        a function = a.f168302a;
        Intrinsics.checkNotNullParameter(function, "function");
        i iVar = new i(iVarE, new by5.a(19), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
