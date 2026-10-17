package gs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146254a;

    public h(String pollToken) {
        Intrinsics.checkNotNullParameter(pollToken, "pollToken");
        this.f146254a = pollToken;
    }

    @Override // gs.j
    public final String a() {
        return this.f146254a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f146254a, ((h) obj2).f146254a);
    }

    public final int hashCode() {
        return this.f146254a.hashCode();
    }
}
