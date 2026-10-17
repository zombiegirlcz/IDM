package pzd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f240974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f240975b;

    public r(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240974a = z;
        this.f240975b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f240975b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f240974a == rVar.f240974a && Intrinsics.f(this.f240975b, rVar.f240975b);
    }

    public final int hashCode() {
        return this.f240975b.hashCode() + (Boolean.hashCode(this.f240974a) * 31);
    }
}
