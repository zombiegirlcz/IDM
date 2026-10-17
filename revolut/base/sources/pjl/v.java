package pjl;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236857b;

    public v(Account account, String tokenType) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(tokenType, "tokenType");
        this.f236856a = account;
        this.f236857b = tokenType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f236856a, vVar.f236856a) && Intrinsics.f(this.f236857b, vVar.f236857b);
    }

    public final int hashCode() {
        return this.f236857b.hashCode() + (this.f236856a.hashCode() * 31);
    }
}
