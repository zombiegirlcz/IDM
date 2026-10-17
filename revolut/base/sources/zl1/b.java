package zl1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323158b;

    public b(List aliases, boolean z) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f323157a = aliases;
        this.f323158b = z;
    }

    public static b a(b bVar, boolean z) {
        List aliases = bVar.f323157a;
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        return new b(aliases, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323157a, bVar.f323157a) && this.f323158b == bVar.f323158b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f323158b) + (this.f323157a.hashCode() * 31);
    }
}
