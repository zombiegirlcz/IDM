package qfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245296a;

    public k(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f245296a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f245296a, ((k) obj2).f245296a);
    }

    public final int hashCode() {
        return this.f245296a.hashCode();
    }
}
