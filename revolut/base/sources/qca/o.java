package qca;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244679b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244678a = items;
        this.f244679b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f244678a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f244678a, oVar.f244678a) && this.f244679b == oVar.f244679b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244679b) + (this.f244678a.hashCode() * 31);
    }
}
