package amd;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f6348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId.Joint f6349b;

    public u(io3.d pocket, AccountId.Joint jointAccount) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        this.f6348a = pocket;
        this.f6349b = jointAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f6348a, uVar.f6348a) && Intrinsics.f(this.f6349b, uVar.f6349b);
    }

    public final int hashCode() {
        return this.f6349b.hashCode() + (this.f6348a.hashCode() * 31);
    }
}
