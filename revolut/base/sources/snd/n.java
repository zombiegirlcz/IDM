package snd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f264549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f264550c;

    public n(String accountId, String accountName, int i) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        this.f264548a = accountId;
        this.f264549b = accountName;
        this.f264550c = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f264548a, nVar.f264548a) && Intrinsics.f(this.f264549b, nVar.f264549b) && this.f264550c == nVar.f264550c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264550c) + p.a.c(this.f264548a.hashCode() * 31, 31, this.f264549b);
    }
}
