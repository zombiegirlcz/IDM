package zv6;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f325580b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325579a = items;
        this.f325580b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f325579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f325579a, gVar.f325579a) && this.f325580b == gVar.f325580b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f325580b) + (this.f325579a.hashCode() * 31);
    }
}
