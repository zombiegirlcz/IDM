package j07;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f169985b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f169984a = items;
        this.f169985b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f169984a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f169984a, gVar.f169984a) && this.f169985b == gVar.f169985b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f169985b) + (this.f169984a.hashCode() * 31);
    }
}
