package jpc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f177253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177254b;

    public c(dj0.d balance, dj0.d blockedForWithdrawal) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(blockedForWithdrawal, "blockedForWithdrawal");
        this.f177253a = balance;
        this.f177254b = blockedForWithdrawal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f177253a, cVar.f177253a) && Intrinsics.f(this.f177254b, cVar.f177254b);
    }

    public final int hashCode() {
        return this.f177254b.hashCode() + (this.f177253a.hashCode() * 31);
    }
}
