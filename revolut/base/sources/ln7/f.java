package ln7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f197112a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197112a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f197112a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f197112a.equals(((f) obj2).f197112a);
    }

    public final int hashCode() {
        return this.f197112a.hashCode();
    }
}
