package mtc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f208809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f208810b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f208809a = items;
        this.f208810b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f208809a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f208809a, iVar.f208809a) && this.f208810b == iVar.f208810b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f208810b) + (this.f208809a.hashCode() * 31);
    }
}
