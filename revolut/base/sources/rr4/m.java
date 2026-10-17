package rr4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256690b;

    public m(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256689a = items;
        this.f256690b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f256689a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f256689a, mVar.f256689a) && this.f256690b == mVar.f256690b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256690b) + (this.f256689a.hashCode() * 31);
    }
}
