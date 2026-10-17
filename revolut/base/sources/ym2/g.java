package ym2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f314841b;

    public g(aim.e items, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314840a = items;
        this.f314841b = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f314840a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f314840a, gVar.f314840a) && Intrinsics.f(this.f314841b, gVar.f314841b);
    }

    public final int hashCode() {
        int iHashCode = this.f314840a.hashCode() * 31;
        Integer num = this.f314841b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
