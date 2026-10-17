package xib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306318a;

    public a(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f306318a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f306318a, ((a) obj2).f306318a);
    }

    public final int hashCode() {
        return this.f306318a.hashCode();
    }
}
