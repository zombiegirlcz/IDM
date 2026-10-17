package vrl;

import com.revolut.feature.trading_orders.common.models.SourcePocket;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2j.v f291667a = new q2j.v(new a(), 18);

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Boolean.valueOf(((SourcePocket) obj3) instanceof SourcePocket.InvestAccountCombinedBuyingPower), Boolean.valueOf(((SourcePocket) obj2) instanceof SourcePocket.InvestAccountCombinedBuyingPower));
        }
    }
}
