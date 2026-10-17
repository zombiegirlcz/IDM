package w0h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import xzg.n0;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f293761b;

    public e(List assets, n0 filter) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f293760a = assets;
        this.f293761b = filter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f293760a, eVar.f293760a) && this.f293761b == eVar.f293761b;
    }

    public final int hashCode() {
        return this.f293761b.hashCode() + (this.f293760a.hashCode() * 31);
    }
}
