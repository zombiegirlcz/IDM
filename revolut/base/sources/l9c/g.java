package l9c;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f193126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f193127b;

    public g(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193126a = items;
        this.f193127b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f193126a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f193126a.equals(gVar.f193126a) && this.f193127b == gVar.f193127b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193127b) + (this.f193126a.hashCode() * 31);
    }
}
