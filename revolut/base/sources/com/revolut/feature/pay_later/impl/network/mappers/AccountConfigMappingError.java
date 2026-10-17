package com.revolut.feature.pay_later.impl.network.mappers;

import a10.b;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/pay_later/impl/network/mappers/AccountConfigMappingError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountConfigMappingError extends Exception {
    public AccountConfigMappingError(String str) {
        super(b.t(str, "msg", "PayLaterAccountConfigDto mapping error. ", str));
    }
}
