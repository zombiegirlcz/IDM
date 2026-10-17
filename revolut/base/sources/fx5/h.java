package fx5;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138741b;

    public h(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138740a = z;
        this.f138741b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f138741b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f138740a == hVar.f138740a && Intrinsics.f(this.f138741b, hVar.f138741b);
    }

    public final int hashCode() {
        return this.f138741b.hashCode() + (Boolean.hashCode(this.f138740a) * 31);
    }
}
