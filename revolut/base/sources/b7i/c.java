package b7i;

import c7i.q;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;
import zhm.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f13042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f13043c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13044a;

    static {
        j8l.a[] elements = {j8l.a.CRYPTO, j8l.a.INVEST_CASH_HOLDING, j8l.a.JOINT_INVEST_CASH_HOLDING, j8l.a.COMMODITIES, j8l.a.CREDIT_CARD, j8l.a.PRO, j8l.a.PRO_VAULT, j8l.a.REV_POINTS_POCKET};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        f13042b = setY0;
        j8l.a[] elements2 = {j8l.a.SAVINGS, j8l.a.JOINT_SAVINGS, j8l.a.JUNIOR_SAVINGS};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f13043c = a1.l(setY0, kotlin.collections.d.y0(elements2));
    }

    public c(q position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f13044a = position;
    }

    public final boolean a(AccountWrapper account) {
        Set set;
        s sVar;
        Intrinsics.checkNotNullParameter(account, "account");
        int i = b.f13041a[this.f13044a.ordinal()];
        if (i == 1) {
            set = f13043c;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            set = f13042b;
        }
        if (!set.contains(account.f97224a)) {
            AccountSource accountSource = account.d;
            AccountSource.VaultSource vaultSource = accountSource instanceof AccountSource.VaultSource ? (AccountSource.VaultSource) accountSource : null;
            if (!((vaultSource == null || (sVar = vaultSource.f97223a) == null) ? false : opg.c.d(sVar))) {
                return true;
            }
        }
        return false;
    }
}
