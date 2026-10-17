package y2k;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f310676b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f310675a = items;
        this.f310676b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f310675a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f310675a, iVar.f310675a) && this.f310676b == iVar.f310676b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f310676b) + (this.f310675a.hashCode() * 31);
    }
}
