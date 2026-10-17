package isj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lnk.o;
import lsj.f;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f168304b;

    public /* synthetic */ b(c cVar, int i) {
        this.f168303a = i;
        this.f168304b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f168303a) {
            case 0:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-it$0");
                f fVar = this.f168304b.f168306b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return m70.a.g(fVar.d.f(new WalletId(str), false), null, new o(7), 1);
            default:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-it$0");
                f fVar2 = this.f168304b.f168306b;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return fVar2.d.g(new WalletId(str2), false);
        }
    }
}
