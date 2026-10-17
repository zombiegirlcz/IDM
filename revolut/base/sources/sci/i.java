package sci;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f261755b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261754a = items;
        this.f261755b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f261754a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f261754a, iVar.f261754a) && this.f261755b == iVar.f261755b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261755b) + (this.f261754a.hashCode() * 31);
    }
}
