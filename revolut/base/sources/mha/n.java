package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f205461a;

    public n(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f205461a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f205461a, ((n) obj2).f205461a);
    }

    public final int hashCode() {
        return this.f205461a.hashCode();
    }
}
