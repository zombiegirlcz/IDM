package i9a;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f159617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f159618b;

    public f(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159617a = z;
        this.f159618b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f159618b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f159617a == fVar.f159617a && Intrinsics.f(this.f159618b, fVar.f159618b);
    }

    public final int hashCode() {
        return this.f159618b.hashCode() + (Boolean.hashCode(this.f159617a) * 31);
    }
}
