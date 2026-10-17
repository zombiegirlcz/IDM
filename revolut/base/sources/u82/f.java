package u82;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f278085b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f278084a = items;
        this.f278085b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f278084a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f278084a, fVar.f278084a) && this.f278085b == fVar.f278085b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f278085b) + (this.f278084a.hashCode() * 31);
    }
}
