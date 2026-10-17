package ukh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280754a;

    public e(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f280754a = accountId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f280754a, ((e) obj2).f280754a);
    }

    public final int hashCode() {
        return this.f280754a.hashCode();
    }
}
