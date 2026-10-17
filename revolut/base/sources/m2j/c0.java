package m2j;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f202018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsAccountDetails f202019b;

    public c0(a0 profileWithExtra, SavingsAccountDetails account) {
        Intrinsics.checkNotNullParameter(profileWithExtra, "profileWithExtra");
        Intrinsics.checkNotNullParameter(account, "account");
        this.f202018a = profileWithExtra;
        this.f202019b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f202018a, c0Var.f202018a) && Intrinsics.f(this.f202019b, c0Var.f202019b);
    }

    public final int hashCode() {
        return this.f202019b.hashCode() + (this.f202018a.hashCode() * 31);
    }
}
