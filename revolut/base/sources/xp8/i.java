package xp8;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307907a;

    public i(dj0.d reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f307907a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f307907a, ((i) obj2).f307907a);
    }

    public final int hashCode() {
        return this.f307907a.hashCode();
    }
}
