package ewh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1c.x f130273a;

    public l(m1c.x account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f130273a = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f130273a, ((l) obj2).f130273a);
    }

    public final int hashCode() {
        return this.f130273a.hashCode();
    }
}
