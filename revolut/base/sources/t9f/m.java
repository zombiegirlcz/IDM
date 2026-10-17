package t9f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f269023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f269025c;

    public m(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f269023a = z;
        this.f269024b = z3;
        this.f269025c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f269025c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f269023a == mVar.f269023a && this.f269024b == mVar.f269024b && Intrinsics.f(this.f269025c, mVar.f269025c);
    }

    public final int hashCode() {
        return this.f269025c.hashCode() + j6.a.c(Boolean.hashCode(this.f269023a) * 31, 31, this.f269024b);
    }
}
