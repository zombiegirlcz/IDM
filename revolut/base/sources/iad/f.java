package iad;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f159992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f159993b;

    public f(e header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159992a = header;
        this.f159993b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f159993b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159992a, fVar.f159992a) && Intrinsics.f(this.f159993b, fVar.f159993b);
    }

    public final int hashCode() {
        return this.f159993b.hashCode() + (this.f159992a.f159991a.hashCode() * 31);
    }
}
