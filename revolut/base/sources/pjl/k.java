package pjl;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236820a;

    public k(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f236820a = account;
    }

    public final String[] a() {
        return new String[]{h0.f236817b.c(h0.f236816a, this.f236820a)};
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f236820a, ((k) obj2).f236820a);
    }

    public final int hashCode() {
        return this.f236820a.hashCode();
    }
}
