package com.revolut.feature.transfer.models.transfer;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final boolean a(RecipientTrustState recipientTrustState) {
        RecipientTrustState[] elements = {RecipientTrustState.Unknown.f92302a, RecipientTrustState.Untrusted.f92303a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.T(d.y0(elements), recipientTrustState);
    }

    public static final TransferTrustData b(TransferTrustData transferTrustData) {
        Intrinsics.checkNotNullParameter(transferTrustData, "<this>");
        return new TransferTrustData(transferTrustData.f92304a, transferTrustData.f92305b, !transferTrustData.f92306c);
    }
}
