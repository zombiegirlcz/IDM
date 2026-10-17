package krj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import efm.d0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f188877b;

    public /* synthetic */ b(d dVar, int i) {
        this.f188876a = i;
        this.f188877b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f188876a) {
            case 0:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                d0<List<jrj.c>> walletBudgets = this.f188877b.f188880a.getWalletBudgets(str);
                km2.b bVar = new km2.b(29, new kpj.a(16));
                walletBudgets.getClass();
                i iVar = new i(walletBudgets, bVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 1:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return (List) v1.c.s("BUDGETS_", str2, this.f188877b.f188882c);
            default:
                String str3 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return this.f188877b.f188881b.g().c(str3);
        }
    }
}
