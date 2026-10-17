package krj;

import com.revolut.feature.core.model.domain.wallet.WalletId;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f188879b;

    public /* synthetic */ c(d dVar, int i) {
        this.f188878a = i;
        this.f188879b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f188878a) {
            case 0:
                String str = ((WalletId) obj2).f66106a;
                List value = (List) obj3;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f188879b.f188882c.f("BUDGETS_" + str, value);
                break;
            default:
                String str2 = ((WalletId) obj2).f66106a;
                List entities = (List) obj3;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(entities, "entities");
                this.f188879b.f188881b.g().f(str2, entities);
                break;
        }
        return Unit.f186387a;
    }
}
