package r6d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251666a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof e) {
            return Intrinsics.f(this.f251666a, ((e) obj2).f251666a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f251666a.hashCode();
    }

    public final String toString() {
        return p.a.p("PreviewUrl(url=", this.f251666a, ")");
    }
}
