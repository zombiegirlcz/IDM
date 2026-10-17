package wef;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f296772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f296773b;

    public i(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296772a = z;
        this.f296773b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f296773b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f296772a == iVar.f296772a && Intrinsics.f(this.f296773b, iVar.f296773b);
    }

    public final int hashCode() {
        return this.f296773b.hashCode() + (Boolean.hashCode(this.f296772a) * 31);
    }
}
