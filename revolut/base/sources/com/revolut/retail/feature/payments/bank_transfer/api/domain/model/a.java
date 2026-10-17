package com.revolut.retail.feature.payments.bank_transfer.api.domain.model;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final String a(RemittanceRouteId remittanceRouteId) {
        Intrinsics.checkNotNullParameter(remittanceRouteId, "<this>");
        if (remittanceRouteId.equals(RemittanceRouteId.BANK.f101914b) || remittanceRouteId.equals(RemittanceRouteId.CARD.f101915b) || remittanceRouteId.equals(RemittanceRouteId.Internal.f101916b)) {
            return RemittanceRouteId.class.getName().concat(remittanceRouteId.f101913a);
        }
        if (remittanceRouteId instanceof RemittanceRouteId.MobileWallet) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(RemittanceRouteId.class.getName(), remittanceRouteId.f101913a, ((RemittanceRouteId.MobileWallet) remittanceRouteId).f101917b);
        }
        if (remittanceRouteId.equals(RemittanceRouteId.UNKNOWN.f101919b)) {
            throw new IllegalStateException("Unknown type is not supported");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String b(RemittanceRouteId remittanceRouteId) {
        Intrinsics.checkNotNullParameter(remittanceRouteId, "<this>");
        if (!Intrinsics.f(remittanceRouteId, RemittanceRouteId.BANK.f101914b) && !Intrinsics.f(remittanceRouteId, RemittanceRouteId.CARD.f101915b) && !Intrinsics.f(remittanceRouteId, RemittanceRouteId.Internal.f101916b)) {
            if (remittanceRouteId instanceof RemittanceRouteId.MobileWallet) {
                return ((RemittanceRouteId.MobileWallet) remittanceRouteId).f101917b;
            }
            if (Intrinsics.f(remittanceRouteId, RemittanceRouteId.UNKNOWN.f101919b)) {
                throw new IllegalStateException("Unknown type is not supported");
            }
            throw new NoWhenBranchMatchedException();
        }
        return remittanceRouteId.f101913a;
    }
}
