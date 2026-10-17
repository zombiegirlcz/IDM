package ovk;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f230249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f230250b;

    public h(g toolbar, ArrayList items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230249a = toolbar;
        this.f230250b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f230250b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f230249a.equals(hVar.f230249a) && this.f230250b.equals(hVar.f230250b);
    }

    public final int hashCode() {
        return this.f230250b.hashCode() + (this.f230249a.hashCode() * 31);
    }
}
