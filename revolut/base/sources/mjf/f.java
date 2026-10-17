package mjf;

import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.ec;
import tof.i7;
import tof.q7;
import tof.ua;
import tof.va;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f205997a;

    static {
        ProductId[] elements = {ProductId.CURRENCY, ProductId.SUBACCOUNT, ProductId.SAVINGS, ProductId.JOINT, ProductId.PRO, ProductId.YOUTH};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f205997a = kotlin.collections.d.y0(elements);
    }

    public f(aif.a calculatedBalanceFeatureChecker) {
        Intrinsics.checkNotNullParameter(calculatedBalanceFeatureChecker, "calculatedBalanceFeatureChecker");
    }

    public static boolean b(i7 i7Var) {
        if (i7Var instanceof ua) {
            return true;
        }
        if (i7Var instanceof va) {
            if (((va) i7Var).f273121a.size() != 1) {
                return false;
            }
        } else {
            if (!(i7Var instanceof ec)) {
                if (!(i7Var instanceof q7)) {
                    return false;
                }
                List list = ((q7) i7Var).f273011a;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (b((i7) it8.next())) {
                    }
                }
                return false;
            }
            if (((ec) i7Var).f272741a == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType.ConfigurableFilter.AccountFilters r5) {
        /*
            java.util.Set r0 = r5.f92012a
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7a
            java.util.Set r0 = r5.f92013b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L1c
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1c
            goto L40
        L1c:
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L40
            java.lang.Object r5 = r0.next()
            com.revolut.feature.tab.accounts.models.NonProductAccountFilter r5 = (com.revolut.feature.tab.accounts.models.NonProductAccountFilter) r5
            com.revolut.feature.tab.accounts.models.NonProductAccountFilter$Crypto r0 = com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Crypto.f89715a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r0 == 0) goto L35
            goto L7a
        L35:
            boolean r5 = r5 instanceof com.revolut.feature.tab.accounts.models.NonProductAccountFilter.Invest
            if (r5 == 0) goto L3a
            goto L7a
        L3a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L40:
            java.util.Set r5 = r5.f92012a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L52
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L52
            goto L79
        L52:
            java.util.Iterator r5 = r5.iterator()
        L56:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r5.next()
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r0 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r0
            java.util.Set r3 = mjf.f.f205997a
            com.revolut.feature.tab.accounts.models.ProductId r4 = r0.f89727a
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L7a
            com.revolut.feature.tab.accounts.models.ProductAccountId r0 = r0.f89728b
            java.lang.String r0 = r0.f89729a
            java.lang.String r3 = "Total-"
            boolean r0 = kotlin.text.a0.H(r0, r3, r1)
            if (r0 != 0) goto L7a
            goto L56
        L79:
            return r2
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mjf.f.c(com.revolut.feature.transactions.api.navigation.TransactionsListFilterType$ConfigurableFilter$AccountFilters):boolean");
    }

    public final boolean a(TransactionsListFilterType filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        if (filterType instanceof TransactionsListFilterType.ByAccounts) {
            return c(((TransactionsListFilterType.ByAccounts) filterType).f92007a);
        }
        if (filterType instanceof TransactionsListFilterType.ByTransactionsFilter) {
            return b(((TransactionsListFilterType.ByTransactionsFilter) filterType).f92009a);
        }
        return false;
    }

    public final boolean d(TransactionsListFilterType.ConfigurableFilter configurableFilter, TransactionsListFilterType filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return configurableFilter instanceof TransactionsListFilterType.ConfigurableFilter.AccountFilters ? c((TransactionsListFilterType.ConfigurableFilter.AccountFilters) configurableFilter) : (filterType instanceof TransactionsListFilterType.ByTransactionsFilter) && b(((TransactionsListFilterType.ByTransactionsFilter) filterType).f92009a);
    }
}
