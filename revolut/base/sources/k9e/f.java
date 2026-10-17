package k9e;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f182322a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182322a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f182322a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f182322a.equals(((f) obj2).f182322a);
    }

    public final int hashCode() {
        return this.f182322a.hashCode();
    }
}
