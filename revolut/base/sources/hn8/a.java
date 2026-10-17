package hn8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154073a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return Intrinsics.f(this.f154073a, ((a) obj2).f154073a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f154073a.hashCode();
    }

    public final String toString() {
        return p.a.p("JuniorId(id=", this.f154073a, ")");
    }
}
