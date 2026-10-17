package chj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f24303a;

    public t(dj0.d lackingMoney) {
        Intrinsics.checkNotNullParameter(lackingMoney, "lackingMoney");
        this.f24303a = lackingMoney;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f24303a, ((t) obj2).f24303a);
    }

    public final int hashCode() {
        return this.f24303a.hashCode();
    }
}
