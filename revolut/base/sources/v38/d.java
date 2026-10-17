package v38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n38.a f285857a;

    public d(n38.a jointAccount) {
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        this.f285857a = jointAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f285857a, ((d) obj2).f285857a);
    }

    public final int hashCode() {
        return this.f285857a.hashCode();
    }
}
