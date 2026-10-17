package wbj;

import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f296232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk5.a f296233b;

    public c(a3 transaction, yk5.a cryptoActionRequiredDeposit) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposit, "cryptoActionRequiredDeposit");
        this.f296232a = transaction;
        this.f296233b = cryptoActionRequiredDeposit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f296232a, cVar.f296232a) && Intrinsics.f(this.f296233b, cVar.f296233b);
    }

    public final int hashCode() {
        return this.f296233b.hashCode() + (this.f296232a.hashCode() * 31);
    }
}
