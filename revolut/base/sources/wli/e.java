package wli;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f298511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f298512b;

    public e(f condition, n resolver) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.f298511a = condition;
        this.f298512b = resolver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f298511a, eVar.f298511a) && Intrinsics.f(this.f298512b, eVar.f298512b);
    }

    public final int hashCode() {
        return this.f298512b.hashCode() + (this.f298511a.hashCode() * 31);
    }
}
