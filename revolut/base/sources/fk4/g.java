package fk4;

import com.revolut.feature.credit.autopay.models.AccountDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountDetails.LinkedAccount f135709a;

    public g(AccountDetails.LinkedAccount linkedAccount) {
        Intrinsics.checkNotNullParameter(linkedAccount, "linkedAccount");
        this.f135709a = linkedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f135709a, ((g) obj2).f135709a);
    }

    public final int hashCode() {
        return this.f135709a.hashCode();
    }
}
