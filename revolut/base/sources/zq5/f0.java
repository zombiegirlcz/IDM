package zq5;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f324378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jq9.k f324379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324380c;

    public f0(CryptoAddress cryptoAddress, jq9.k kVar, boolean z) {
        Intrinsics.checkNotNullParameter(cryptoAddress, "cryptoAddress");
        this.f324378a = cryptoAddress;
        this.f324379b = kVar;
        this.f324380c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f324378a, f0Var.f324378a) && Intrinsics.f(this.f324379b, f0Var.f324379b) && this.f324380c == f0Var.f324380c;
    }

    public final int hashCode() {
        int iHashCode = this.f324378a.hashCode() * 31;
        jq9.k kVar = this.f324379b;
        return Boolean.hashCode(this.f324380c) + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }
}
