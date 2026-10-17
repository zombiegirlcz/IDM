package eqj;

import akg.n;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import eqd.h;
import kotlin.jvm.internal.Intrinsics;
import w4l.k;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzi.a f128478a;

    public f(tzi.a budgetingCycleInteractor) {
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        this.f128478a = budgetingCycleInteractor;
    }

    public final n a(String str, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        isj.c cVar = (isj.c) this.f128478a;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lsj.f fVar = cVar.f168306b;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(fVar.d.e(new WalletId(str), loadingStrategy)), new h(this));
    }
}
