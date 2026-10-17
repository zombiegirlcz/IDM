package pjl;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Account f236801a;

    public d0(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f236801a = account;
    }

    public final String a() {
        return h0.f236817b.c(h0.f236816a, this.f236801a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f236801a, ((d0) obj2).f236801a);
    }

    public final int hashCode() {
        return this.f236801a.hashCode();
    }
}
