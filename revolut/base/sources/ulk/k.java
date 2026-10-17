package ulk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f281039a;

    public k(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f281039a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f281039a, ((k) obj2).f281039a);
    }

    public final int hashCode() {
        return this.f281039a.hashCode();
    }
}
