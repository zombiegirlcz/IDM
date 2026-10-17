package hee;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f151699b;

    public p(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f151698a = items;
        this.f151699b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f151698a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f151698a, pVar.f151698a) && this.f151699b == pVar.f151699b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151699b) + (this.f151698a.hashCode() * 31);
    }
}
