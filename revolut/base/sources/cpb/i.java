package cpb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f107918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f107919b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f107918a = items;
        this.f107919b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f107918a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f107918a, iVar.f107918a) && this.f107919b == iVar.f107919b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107919b) + (this.f107918a.hashCode() * 31);
    }
}
