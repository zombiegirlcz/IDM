package bec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u6c.s f14768a;

    public e(u6c.s identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f14768a = identifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f14768a, ((e) obj2).f14768a);
    }

    public final int hashCode() {
        return this.f14768a.hashCode();
    }
}
