package com.revolut.feature.tab.accounts.api.model;

import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nie.b;
import nie.c;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final d a(ProductAccount.ValueItem.Main main) {
        Intrinsics.checkNotNullParameter(main, "<this>");
        if (main == null) {
            throw new NoWhenBranchMatchedException();
        }
        ProductAccountBalance productAccountBalance = main.f89505g.f89515a;
        ProductAccountBalance.WithAmount withAmount = productAccountBalance instanceof ProductAccountBalance.WithAmount ? (ProductAccountBalance.WithAmount) productAccountBalance : null;
        if (withAmount != null) {
            return withAmount.f89509a;
        }
        return null;
    }

    public static final c b(ProductAccount productAccount, ProductId productId) {
        Intrinsics.checkNotNullParameter(productAccount, "<this>");
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (productAccount instanceof ProductAccount.ValueItem.Discover) {
            return new ProductAccountDescriptor$Value.Discover(((ProductAccount.ValueItem.Discover) productAccount).f89501c, productId);
        }
        if (productAccount instanceof ProductAccount.ValueItem.Main) {
            return new ProductAccountDescriptor$Value.Main(((ProductAccount.ValueItem.Main) productAccount).f89504c, productId);
        }
        if (!(productAccount instanceof ProductAccount.PendingItem)) {
            throw new NoWhenBranchMatchedException();
        }
        ProductAccount.PendingItem pendingItem = (ProductAccount.PendingItem) productAccount;
        return new b(productId, pendingItem.f89495a, pendingItem.f);
    }

    public static final ProductAccountDescriptor$Value c(ProductAccount.ValueItem valueItem, ProductId productId, ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(valueItem, "<this>");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (valueItem instanceof ProductAccount.ValueItem.Discover) {
            return new ProductAccountDescriptor$Value.Discover(accountId, productId);
        }
        if (valueItem instanceof ProductAccount.ValueItem.Main) {
            return new ProductAccountDescriptor$Value.Main(accountId, productId);
        }
        throw new NoWhenBranchMatchedException();
    }
}
