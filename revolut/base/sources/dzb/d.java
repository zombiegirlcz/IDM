package dzb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121302a;

    public d(String reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f121302a = reward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f121302a, ((d) obj2).f121302a);
    }

    public final int hashCode() {
        return this.f121302a.hashCode();
    }
}
