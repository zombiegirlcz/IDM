package ag8;

import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sf8.g;
import sf8.h;
import sf8.n;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes4.dex */
public final class f {
    public static Set a(h accountUiState, psg.a walletProfile, dj0.d balance) {
        Intrinsics.checkNotNullParameter(accountUiState, "accountUiState");
        Intrinsics.checkNotNullParameter(walletProfile, "walletProfile");
        Intrinsics.checkNotNullParameter(balance, "balance");
        n nVar = (!ta6.a.A(walletProfile) || balance.f115082a <= 0) ? null : n.WITHDRAW_MONEY;
        if (Intrinsics.f(accountUiState, sf8.a.f262350a)) {
            return z0.i(n.SHOW_PROFILE, n.SHOW_STATEMENT, n.ADD_MONEY, n.SHOW_QR_CODE, n.MOVE_MONEY, n.PARTNERSHIPS, nVar);
        }
        if (Intrinsics.f(accountUiState, sf8.b.f262351a)) {
            return h0.f322473a;
        }
        if (Intrinsics.f(accountUiState, sf8.e.f262354a) || Intrinsics.f(accountUiState, sf8.f.f262355a) || (accountUiState instanceof g) || Intrinsics.f(accountUiState, sf8.c.f262352a)) {
            return z0.i(n.SHOW_PROFILE, n.SHOW_STATEMENT, n.SHOW_QR_CODE, nVar);
        }
        if (!Intrinsics.f(accountUiState, sf8.d.f262353a)) {
            throw new NoWhenBranchMatchedException();
        }
        n[] elements = {n.SHOW_PROFILE, n.SHOW_STATEMENT, n.SHOW_QR_CODE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }
}
