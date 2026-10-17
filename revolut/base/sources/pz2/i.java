package pz2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f240875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f240876b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240875a = items;
        this.f240876b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f240875a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f240875a, iVar.f240875a) && this.f240876b == iVar.f240876b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f240876b) + (this.f240875a.hashCode() * 31);
    }
}
