package gs;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146252a;

    public f(String pollToken) {
        Intrinsics.checkNotNullParameter(pollToken, "pollToken");
        this.f146252a = pollToken;
    }

    @Override // gs.j
    public final String a() {
        return this.f146252a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f146252a, ((f) obj2).f146252a);
    }

    public final int hashCode() {
        return this.f146252a.hashCode();
    }
}
