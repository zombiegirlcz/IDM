package zsg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lzsg/d;", "", "", "toString", "()Ljava/lang/String;", "Lzsg/a;", "a", "Lzsg/a;", "b", "()Lzsg/a;", "wallet", "Ljava/lang/String;", "role", "feature_wallets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("wallet")
    @NotNull
    private final a wallet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("role")
    @NotNull
    private final String role;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getWallet() {
        return this.wallet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.wallet, dVar.wallet) && Intrinsics.f(this.role, dVar.role);
    }

    public final int hashCode() {
        return this.role.hashCode() + (this.wallet.hashCode() * 31);
    }
}
