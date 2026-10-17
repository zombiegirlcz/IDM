package hzj;

import com.revolut.feature.wallets.api.module.WalletLimit;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(((WalletLimit) obj3) instanceof WalletLimit.CounterLimit), Boolean.valueOf(((WalletLimit) obj2) instanceof WalletLimit.CounterLimit));
    }
}
