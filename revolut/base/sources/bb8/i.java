package bb8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14190b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14189a = items;
        this.f14190b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f14189a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f14189a, iVar.f14189a) && this.f14190b == iVar.f14190b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14190b) + (this.f14189a.hashCode() * 31);
    }
}
