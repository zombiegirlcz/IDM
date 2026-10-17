package m7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static h7i.i a(i input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int i = f.f203407a[input.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        AccountWrapper accountWrapperA = input.f203410b.a();
        if (accountWrapperA != null ? Intrinsics.f(com.revolut.feature_move_money.api.model.b.b(accountWrapperA), Boolean.TRUE) : false) {
            return new h7i.i(accountWrapperA);
        }
        return null;
    }
}
