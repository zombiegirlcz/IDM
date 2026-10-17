package ek4;

import com.revolut.feature.credit.autopay.models.AccountDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountDetails.LinkedAccount f126955a;

    public b(AccountDetails.LinkedAccount externalLinkedAccount) {
        Intrinsics.checkNotNullParameter(externalLinkedAccount, "externalLinkedAccount");
        this.f126955a = externalLinkedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f126955a, ((b) obj2).f126955a);
    }

    public final int hashCode() {
        return this.f126955a.hashCode();
    }
}
