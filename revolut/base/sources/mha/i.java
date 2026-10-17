package mha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f205453a;

    public i(dj0.d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f205453a = money;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f205453a, ((i) obj2).f205453a);
    }

    public final int hashCode() {
        return this.f205453a.hashCode();
    }
}
