package le3;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f194450b;

    public /* synthetic */ a0(b0 b0Var, int i) {
        this.f194449a = i;
        this.f194450b = b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f194449a) {
            case 0:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                return this.f194450b.d.b(str, false);
            case 1:
                String str2 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                return this.f194450b.d.c(str2, false);
            default:
                String str3 = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                g31.h hVar = this.f194450b.d;
                Intrinsics.checkNotNullParameter(str3, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                return hVar.e.g(new WalletId(str3), false);
        }
    }
}
