package zlg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f323260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323261b;

    public n(int i, List usernames) {
        Intrinsics.checkNotNullParameter(usernames, "usernames");
        this.f323260a = i;
        this.f323261b = usernames;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f323260a == nVar.f323260a && Intrinsics.f(this.f323261b, nVar.f323261b);
    }

    public final int hashCode() {
        return this.f323261b.hashCode() + (Integer.hashCode(this.f323260a) * 31);
    }
}
