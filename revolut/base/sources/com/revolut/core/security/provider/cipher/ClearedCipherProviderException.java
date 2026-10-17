package com.revolut.core.security.provider.cipher;

import hn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/security/provider/cipher/ClearedCipherProviderException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "toString", "()Ljava/lang/String;", "core_security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClearedCipherProviderException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f51456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearedCipherProviderException(k alias) {
        super(alias.c());
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f51456a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ClearedCipherProviderException) && Intrinsics.f(this.f51456a, ((ClearedCipherProviderException) obj2).f51456a);
    }

    public final int hashCode() {
        return this.f51456a.hashCode();
    }
}
