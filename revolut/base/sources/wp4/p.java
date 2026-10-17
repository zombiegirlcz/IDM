package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t61.g f299086a;

    public p(t61.g backupCard) {
        Intrinsics.checkNotNullParameter(backupCard, "backupCard");
        this.f299086a = backupCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f299086a, ((p) obj2).f299086a);
    }

    public final int hashCode() {
        return this.f299086a.hashCode();
    }
}
