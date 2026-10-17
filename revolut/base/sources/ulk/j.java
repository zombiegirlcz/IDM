package ulk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281038a;

    public j(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f281038a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f281038a, ((j) obj2).f281038a);
    }

    public final int hashCode() {
        return this.f281038a.hashCode();
    }
}
