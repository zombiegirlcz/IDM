package snd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264544a;

    public l(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f264544a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f264544a, ((l) obj2).f264544a);
    }

    public final int hashCode() {
        return this.f264544a.hashCode();
    }
}
