package bk4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16251b;

    public c(String accountNumber, String bankIdentifier) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(bankIdentifier, "bankIdentifier");
        this.f16250a = accountNumber;
        this.f16251b = bankIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f16250a, cVar.f16250a) && Intrinsics.f(this.f16251b, cVar.f16251b);
    }

    public final int hashCode() {
        return this.f16251b.hashCode() + (this.f16250a.hashCode() * 31);
    }
}
