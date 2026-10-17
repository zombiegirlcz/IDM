package av5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9920b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f9919a = items;
        this.f9920b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f9919a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f9919a, jVar.f9919a) && this.f9920b == jVar.f9920b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9920b) + (this.f9919a.hashCode() * 31);
    }
}
