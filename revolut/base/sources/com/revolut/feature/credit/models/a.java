package com.revolut.feature.credit.models;

import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ft3.g1;
import ft3.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final ProductAccountId a(String str, q0 product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return new ProductAccountId("application-credit-".concat(g1.i(product.getF137852c())), new CreditAccountType.Application(str, product));
    }

    public static final ProductAccountId b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        return new ProductAccountId(facilityId, new CreditAccountType.CreditCard(facilityId));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.feature.tab.accounts.models.ProductAccountId c(ft3.q0 r4) {
        /*
            java.lang.String r0 = "product"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            it3.k r0 = r4.getF137851b()
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.name()
            if (r0 == 0) goto L25
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            if (r0 == 0) goto L25
            java.lang.String r1 = "-"
            java.lang.String r0 = r1.concat(r0)
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 != 0) goto L2a
            java.lang.String r0 = ""
        L2a:
            com.revolut.feature.tab.accounts.models.ProductAccountId r1 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            ft3.j1 r2 = r4.getF137852c()
            java.lang.String r2 = ft3.g1.i(r2)
            java.lang.String r3 = "discover-credit-"
            java.lang.String r0 = p.a.p(r3, r2, r0)
            com.revolut.feature.credit.models.CreditAccountType$EmptyState r2 = new com.revolut.feature.credit.models.CreditAccountType$EmptyState
            r2.<init>(r4)
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.models.a.c(ft3.q0):com.revolut.feature.tab.accounts.models.ProductAccountId");
    }
}
