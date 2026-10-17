package g1k;

import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x {
    public static final Set a(WealthNewsFilter wealthNewsFilter) {
        Intrinsics.checkNotNullParameter(wealthNewsFilter, "<this>");
        if (wealthNewsFilter instanceof WealthNewsFilter.ByAssetFilter) {
            return ((WealthNewsFilter.ByAssetFilter) wealthNewsFilter).f101809a;
        }
        if ((wealthNewsFilter instanceof WealthNewsFilter.ByRef) || (wealthNewsFilter instanceof WealthNewsFilter.ByMarket)) {
            return h0.f322473a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
