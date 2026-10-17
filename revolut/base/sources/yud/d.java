package yud;

import com.revolut.feature.staking.api.model.StakingProduct;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((StakingProduct) obj3).f88089g.f88069b, ((StakingProduct) obj2).f88089g.f88069b);
    }
}
