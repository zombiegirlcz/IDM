package epg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f128186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128187b;

    public p(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f128186a = items;
        this.f128187b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f128186a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f128186a, pVar.f128186a) && this.f128187b == pVar.f128187b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128187b) + (this.f128186a.hashCode() * 31);
    }
}
