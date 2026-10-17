package v38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n38.a f285854a;

    public a(n38.a jointAccount) {
        Intrinsics.checkNotNullParameter(jointAccount, "jointAccount");
        this.f285854a = jointAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f285854a, ((a) obj2).f285854a);
    }

    public final int hashCode() {
        return this.f285854a.hashCode();
    }
}
