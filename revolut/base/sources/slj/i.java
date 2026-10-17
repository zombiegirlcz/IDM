package slj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f264215b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f264214a = items;
        this.f264215b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f264214a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f264214a, iVar.f264214a) && this.f264215b == iVar.f264215b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264215b) + (this.f264214a.hashCode() * 31);
    }
}
