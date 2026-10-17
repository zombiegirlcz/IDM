package aqg;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.core.navigation.FeatureCommand;
import ibb.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements kpg.a {
    public final FeatureCommand a(s vault) {
        Object obj2;
        Pair pair;
        Pair pair2;
        Intrinsics.checkNotNullParameter(vault, "vault");
        switch (a.f8429b[vault.e.ordinal()]) {
            case 1:
                ProductId productId = ProductId.SUBACCOUNT;
                int i = a.f8428a[vault.f234889n.ordinal()];
                if (i == 1 || i == 2) {
                    obj2 = ExtendedSubaccountType.Personal.INSTANCE;
                } else if (i == 3) {
                    obj2 = ExtendedSubaccountType.Joint.INSTANCE;
                } else if (i == 4) {
                    obj2 = ExtendedSubaccountType.Junior.INSTANCE;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj2 = ExtendedSubaccountType.Teen.INSTANCE;
                }
                pair = new Pair(productId, obj2);
                pair2 = pair;
                return jbb.a.a(c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, (ExtendedSubaccountType) pair2.f186386b), (ProductId) pair2.f186385a), null), null, null, 12);
            case 2:
                pair = new Pair(ProductId.SUBACCOUNT, ExtendedSubaccountType.Group.INSTANCE);
                pair2 = pair;
                return jbb.a.a(c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, (ExtendedSubaccountType) pair2.f186386b), (ProductId) pair2.f186385a), null), null, null, 12);
            case 3:
                pair = new Pair(ProductId.SUBACCOUNT, ExtendedSubaccountType.Pro.INSTANCE);
                pair2 = pair;
                return jbb.a.a(c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, (ExtendedSubaccountType) pair2.f186386b), (ProductId) pair2.f186385a), null), null, null, 12);
            case 4:
                pair = new Pair(ProductId.SUBACCOUNT, ExtendedSubaccountType.ProTax.INSTANCE);
                pair2 = pair;
                return jbb.a.a(c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, (ExtendedSubaccountType) pair2.f186386b), (ProductId) pair2.f186385a), null), null, null, 12);
            case 5:
            case 6:
            case 7:
                pair2 = new Pair(ProductId.SAVINGS, null);
                return jbb.a.a(c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(vault.f234881a, (ExtendedSubaccountType) pair2.f186386b), (ProductId) pair2.f186385a), null), null, null, 12);
            case 8:
                throw new IllegalArgumentException("Unsupported vault type " + vault.e);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
