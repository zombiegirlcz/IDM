package tk0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271829a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f271829a, ((f) obj2).f271829a);
        }
        return false;
    }

    @Override // tk0.g
    public final String getId() {
        return this.f271829a;
    }

    public final int hashCode() {
        return this.f271829a.hashCode();
    }

    public final String toString() {
        return p.a.p("StringMap(id=", this.f271829a, ")");
    }
}
