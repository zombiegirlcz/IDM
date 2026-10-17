package gs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146255a;

    public i(String pollToken) {
        Intrinsics.checkNotNullParameter(pollToken, "pollToken");
        this.f146255a = pollToken;
    }

    @Override // gs.j
    public final String a() {
        return this.f146255a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f146255a, ((i) obj2).f146255a);
    }

    public final int hashCode() {
        return this.f146255a.hashCode();
    }
}
