package com.revolut.feature.crypto.withdraw.api.models;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressDestinationTag;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import wk5.k;
import wk5.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final String a(CryptoAddress cryptoAddress) {
        String str;
        Intrinsics.checkNotNullParameter(cryptoAddress, "<this>");
        k.Companion.getClass();
        if (!k.tagAddressTypes.contains(m.a(cryptoAddress.f71063h))) {
            return null;
        }
        CryptoAddressDestinationTag cryptoAddressDestinationTag = cryptoAddress.d;
        CryptoAddressDestinationTag.Optional optional = cryptoAddressDestinationTag instanceof CryptoAddressDestinationTag.Optional ? (CryptoAddressDestinationTag.Optional) cryptoAddressDestinationTag : null;
        if (optional == null || (str = optional.f71071a) == null || d0.W(str)) {
            return null;
        }
        return str;
    }
}
