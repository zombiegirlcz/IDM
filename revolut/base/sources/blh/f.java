package blh;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface f {
    static efm.r a(i iVar, d searchParams, Function1 calculateAccountsEligibility, zsc.c searchFilter) {
        Intrinsics.checkNotNullParameter(searchParams, "searchParams");
        Intrinsics.checkNotNullParameter(calculateAccountsEligibility, "calculateAccountsEligibility");
        Intrinsics.checkNotNullParameter(searchFilter, "searchFilter");
        zsc.d.Companion.getClass();
        efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return iVar.d(searchParams, calculateAccountsEligibility, zsc.b.f324866a, searchFilter, rVarJust);
    }
}
