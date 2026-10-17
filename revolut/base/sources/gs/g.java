package gs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146253a;

    public g(String pollToken) {
        Intrinsics.checkNotNullParameter(pollToken, "pollToken");
        this.f146253a = pollToken;
    }

    @Override // gs.j
    public final String a() {
        return this.f146253a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f146253a, ((g) obj2).f146253a);
    }

    public final int hashCode() {
        return this.f146253a.hashCode();
    }
}
